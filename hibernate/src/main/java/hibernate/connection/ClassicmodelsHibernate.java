package hibernate.connection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "classicmodels.customers")
public class ClassicmodelsHibernate {
    @Id
    private Long customerNumber;
    @Column
    private String customerName;
    @Column
    private String country;

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int hashCode() {
        int tmp = 0;
        tmp = ( customerNumber + customerName + country ).hashCode();
        return tmp;
    }
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;

        ClassicmodelsHibernate obj2 = (ClassicmodelsHibernate) obj;
        if((this.customerNumber == obj2.getCustomerNumber()) && (this.customerName.equals(obj2.getCustomerName())))
        {
            return true;
        }
        return false;
    }

    public void listCustomers() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List customers = session.createQuery("FROM classicmodels.customers").list();
            for(Iterator iterator1 = customers.iterator(); iterator1.hasNext();) {
                ClassicmodelsHibernate classicmodels = (ClassicmodelsHibernate) iterator1.next();
                System.out.println("Customer Name: " + classicmodels.getCustomerName());
                System.out.print("    Customer Number: " + classicmodels.getCustomerNumber());
                System.out.print("    Customer Country: " + classicmodels.getCountry());
            }
            tx.commit();
        } catch (HibernateException e) {
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}