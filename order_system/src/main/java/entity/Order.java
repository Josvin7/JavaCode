package entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName Order
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/22/22:38
 */

// 通过这个 Order 来表示一个完整的订单.
// 包括订单中都有哪些菜
// Order 类对应到两张表: order_user + order_dish
public class Order {
    private int orderId;
    private int userId;
    private Timestamp time;
    private int isDone;
    private List<Dish> dishes;  // 一个订单中包含了很多菜

}
