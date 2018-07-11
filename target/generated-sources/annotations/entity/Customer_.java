package entity;

import entity.Account;
import entity.Address;
import entity.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T14:00:41")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile SingularAttribute<Customer, String> lastNamePrefix;
    public static volatile CollectionAttribute<Customer, Address> addressCollection;
    public static volatile SingularAttribute<Customer, Account> accountId;
    public static volatile CollectionAttribute<Customer, Order1> order1Collection;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile SingularAttribute<Customer, String> email;

}