package entity;

import entity.Order1;
import entity.Product;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T14:00:41")
@StaticMetamodel(OrderItem.class)
public class OrderItem_ { 

    public static volatile SingularAttribute<OrderItem, Integer> amount;
    public static volatile SingularAttribute<OrderItem, Product> productId;
    public static volatile SingularAttribute<OrderItem, Order1> orderId;
    public static volatile SingularAttribute<OrderItem, Long> id;
    public static volatile SingularAttribute<OrderItem, BigDecimal> subTotal;

}