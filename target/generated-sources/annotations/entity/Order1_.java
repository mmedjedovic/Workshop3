package entity;

import entity.Customer;
import entity.OrderItem;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T14:00:41")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Date> dateTime;
    public static volatile CollectionAttribute<Order1, OrderItem> orderItemCollection;
    public static volatile SingularAttribute<Order1, BigDecimal> totalPrice;
    public static volatile SingularAttribute<Order1, Customer> customerId;
    public static volatile SingularAttribute<Order1, Integer> orderStatus;
    public static volatile SingularAttribute<Order1, Long> id;

}