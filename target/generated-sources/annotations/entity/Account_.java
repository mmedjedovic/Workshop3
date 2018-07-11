package entity;

import entity.Customer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-11T14:00:41")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> password;
    public static volatile CollectionAttribute<Account, Customer> customerCollection;
    public static volatile SingularAttribute<Account, Date> lastlogin;
    public static volatile SingularAttribute<Account, Integer> accountType;
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, Date> lastchanged;
    public static volatile SingularAttribute<Account, String> username;

}