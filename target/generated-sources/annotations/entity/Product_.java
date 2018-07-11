package entity;

import entity.OrderItem;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T14:00:41")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile CollectionAttribute<Product, OrderItem> orderItemCollection;
    public static volatile SingularAttribute<Product, BigDecimal> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> productStatus;
    public static volatile SingularAttribute<Product, Long> id;
    public static volatile SingularAttribute<Product, Integer> stock;

}