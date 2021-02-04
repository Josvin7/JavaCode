package snake;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName SnakeApp
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/04/9:30
 */
public class SnakeApp extends Application {
    // 定义需要的变量
    // 定义游戏区域的大小，宽和高各多少格子
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;

    // 绘制图形的时候，每个格子所占的像素
    private static final int GRID_SIZE = 40;

    //画布的宽和高
    private static final int CANVAS_WIDTH = WIDTH * GRID_SIZE;
    private static final int CANVAS_HEIGHT = HEIGHT * GRID_SIZE;


    // 定义游戏本身
    // 🐍的移动速度
    // speed : 每秒移动的帧数
    // 帧数越高速度越快
    private static int speed;

    // 定义食物
    private static Point food = new Point(-1, -1);

    // 定义🐍
    // 🐍的长度最长就是沾满整个画布，=长*宽
    private static Point[] snake = new Point[WIDTH * HEIGHT];
    //现在🐍的身体有多少节
    private static int snakeLength = 0;

    // 蛇现在的朝向（用枚举的方式列出四个状态）

    enum Direction {
        UP, LEFT, DOWN, RIGHT
    }

    private static Direction direction;

    // 构建一个随机生成器，用于生成食物的位置

    private static Random random = new Random();
    // 游戏结束标志位

    private static boolean gameOver;

    // 游戏得分
    private static int score;


    /// 用来初始化游戏的一些数据
    private static void newGame() {
        // 初始化移动速度
        speed = 3;
        score = 0;

        // 每次初始化，首先先将🐍回归原始状态
        Arrays.fill(snake, null);
        snakeLength = 0;

        // 🐍 初始状态有 3 节
        snake[snakeLength++] = new Point(WIDTH / 2, HEIGHT / 2);
        snake[snakeLength++] = new Point(WIDTH / 2, HEIGHT / 2);
        snake[snakeLength++] = new Point(WIDTH / 2, HEIGHT / 2);

        //  先有🐍再有食物
        newFood();


        // 方向初始化为左方向
        direction = Direction.LEFT;

        // 游戏未结束
        gameOver = false;
    }

    // 用来在画布上随机生成食物
    private static void newFood() {
        // 1、 不能生成到画布外边
        //      x of [0，WIDTH)
        //      y of [0，HEIGHT)
        // 2、不能和🐍 的身体出现碰撞

        int x;
        int y;
        do {
            x = random.nextInt(WIDTH);///x 的范围一定是 [0, WIDTH)
            y = random.nextInt(HEIGHT);///y 的范围一定是 [0，HEIGHT)
        } while (isCollision(x, y));
        // isCollision （x,y）返回true ，代表和🐍的身体有碰撞
        // 赋值
        food.x = x;
        food.y = y;
    }

    // 循环遍历是否有冲突
    private static boolean isCollision(int x, int y) {
        for (int i = 0; i < snakeLength; i++) {
            Point point = snake[i];
            if (point.x == x && point.y == y) {
                // 说明有冲突，则需要重新生成食物位置
                return true;
            }
        }
        return false;
    }

    // 下来处理每一帧，要做的事情
    private static void frame() {
        // 移动蛇 -- 移动身体
        // 注意从后往前，后边的总放在前边的一个位置
        for (int i = snakeLength - 1; i >= 1; i--) {
            snake[i].x = snake[i - 1].x;
            snake[i].y = snake[i - 1].y;
        }

        // 移动蛇 -- 移动蛇头
        Point head = snake[0];
        switch (direction) {
            case UP:
                head.y--;
                break;
            case LEFT:
                head.x--;
                break;
            case DOWN:
                head.y++;
                break;
            case RIGHT:
                head.x++;
                break;
        }

        // 判断蛇是否走出游戏边界，走出的游戏结束！
        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT) {
            gameOver = true;
            return;
        }

        // 判断蛇有没有碰到自己的身体其他位置 —— 碰到了，游戏结束
        for (int i = 1; i < snakeLength; i++) {
            Point point = snake[i];
            if (head.x == point.x && head.y == point.y) {
                gameOver = true;
                return;
            }
        }

        // 判断有没有吃到食物
        if (head.x == food.x && head.y == food.y) {
            // 如果吃到了食物
            // 1. 蛇的身体增加一节
            // 坐标随便，只要不影响绘图，因为随着下一帧到来，蛇移动之后，坐标就正确了
            snake[snakeLength++] = new Point(-1, -1);
            // 根据速度大小得分
            score = score + speed * 2;
            // 2. 重新生成新的食物
            newFood();
            // 3. 让速度增加
            speed++;
        }
    }

    // 每一帧要做的绘制工作 -- render（渲染）
    private  static void  render(GraphicsContext gc) {
        // 1. 通过重新绘制背景，擦除游戏界面
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

        // 2. 进行蛇的绘制 —— 每一块是一个矩形
        // 蛇头单独渲染
        gc.setFill(Color.DARKVIOLET);
        // 矩形大小是 GRID_SIZE - 2；上下左右各控一个像素
        gc.fillRect(snake[0].x * GRID_SIZE + 1, snake[0].y * GRID_SIZE + 1, GRID_SIZE - 2, GRID_SIZE - 2);

        for (int i = 1; i < snakeLength; i++) {
            Point point = snake[i];
            gc.setFill(Color.GREEN);
            // 矩形大小是 GRID_SIZE - 2；上下左右各控一个像素
            gc.fillRect(point.x * GRID_SIZE + 1, point.y * GRID_SIZE + 1, GRID_SIZE - 2, GRID_SIZE - 2);
        }

        // 3. 进行食物的绘制 —— 圆形
        gc.setFill(Color.YELLOW);
        gc.fillOval(food.x * GRID_SIZE, food.y * GRID_SIZE, GRID_SIZE, GRID_SIZE);

        // 4. 进行游戏结束的绘制
        if (gameOver) {
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
            gc.setFill(Color.CORNSILK);
            // 矩形大小是 GRID_SIZE - 2；上下左右各控一个像素
            gc.fillRect(WIDTH*GRID_SIZE/2 - 30*5, HEIGHT*GRID_SIZE/4, 300, 80);
            gc.setFill(Color.RED);
            gc.setFont(new Font(20));
            gc.fillText("最终游戏得分: "+score, WIDTH * GRID_SIZE / 2 - 30 * 3, HEIGHT * GRID_SIZE / 4 + 30);
            gc.fillText("游戏结束，再接再厉！", WIDTH * GRID_SIZE / 2 - 30 * 3, HEIGHT * GRID_SIZE / 4 + 60);

        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        // 进行游戏初始化
        newGame();

        // 面板对象
        Pane pane = new Pane();
        // 画布对象
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        pane.getChildren().add(canvas);
        // 场景对象
        Scene scene = new Scene(pane);

        // 在画布上进行图形绘制

        final GraphicsContext gc = canvas.getGraphicsContext2D();
        AnimationTimer timer = new AnimationTimer() {

            long lastTick;

            @Override
            public void handle(long now) {
                // now ：以纳秒为单位，本次调用handle的时间
                if (gameOver) {
                    return;
                }
                if (lastTick == 0 || now - lastTick > 1e9 / speed) {
                    lastTick = now;
                    frame();
                    render(gc);
                }
            }
        };
        // 调用 start()，启动定时器
        timer.start();
        // 为 scene 绑定键盘按下事件
        // 每当键盘上有 键 按下时，怎么办
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case W:
                    case UP:
                        if (direction != Direction.DOWN) {
                            direction = Direction.UP;
                        }
                        break;
                    case A:
                    case LEFT:
                        if (direction != Direction.RIGHT) {
                            direction = Direction.LEFT;
                        }
                        break;
                    case S:
                    case DOWN:
                        if (direction != Direction.UP) {
                            direction = Direction.DOWN;
                        }
                        break;
                    case D:
                    case RIGHT:
                        if (direction != Direction.LEFT) {
                            direction = Direction.RIGHT;
                        }
                        break;
                    case R:
                        if (gameOver) {
                            newGame();
                        }
                        break;
                }

            }
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("贪吃蛇小游戏  by Josvin");
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        // launch: 引导；加载
        //Application.launch(SnakeApp.class, args);
        launch(args);
    }
}
