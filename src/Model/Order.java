package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int orderId;
    private Table table;
    private OrderStatus status;
    private List<OrderItem> items;
    private LocalDateTime createTime;
}