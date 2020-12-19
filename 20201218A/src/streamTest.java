import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/**
 * @ClassName streamTest
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/18/16:03
 */




public class streamTest {
    public static void main(String[] args) {

        //stream流重载了reduce方法，含三个
        // 1.T reduce(T identity,BinaryOperator<T> accumulator)
        //参数一为累加器的函数的标识，参数二为函数（+，-，*，/）
        //2.Optional<T> reduce(BinaryOperator<T> accumulator)
        //3.<U> U reduce(U identity,BiFunction<U,? super T,U> accumulator,BinaryOperator<U> combiner)

        List<BigDecimal> list = new ArrayList<>();
        BigDecimal a = new BigDecimal("10");
        list.add(a);
        BigDecimal b = new BigDecimal("20");
        list.add(b);
        BigDecimal c = new BigDecimal("30");
        list.add(c);
        BigDecimal d = new BigDecimal("-10");
        list.add(d);

        //BigDecimal.ZERO为0，以0为底数和流里的每一个元素相加
        //求和
        BigDecimal result = list.stream().reduce(BigDecimal.ZERO, BigDecimal::add);//结果为50
        System.out.println(result);
        //亦可写作
        BigDecimal result1 = list.stream().reduce(BigDecimal.ZERO, (x,y) -> x.add(y));//结果为50
        System.out.println(result1);

        //求最大值
        Optional<BigDecimal> max = list.stream().reduce(BigDecimal::max);//结果为30
        System.out.println(max.get());

        //求最小值
        Optional<BigDecimal> min = list.stream().reduce(BigDecimal::min);//结果为-10
        System.out.println(min.get());

        //各项相乘
        Optional<BigDecimal> mu = list.stream().reduce(BigDecimal::multiply);//结果为-60000
        System.out.println(mu.get());


    }
}

