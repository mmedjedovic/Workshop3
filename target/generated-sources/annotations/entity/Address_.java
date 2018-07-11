package entity;

import entity.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T14:00:41")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, Integer> number;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> streetname;
    public static volatile SingularAttribute<Address, Integer> addressType;
    public static volatile SingularAttribute<Address, String> postalcode;
    public static volatile SingularAttribute<Address, Customer> customerId;
    public static volatile SingularAttribute<Address, Long> id;
    public static volatile SingularAttribute<Address, String> addition;

}