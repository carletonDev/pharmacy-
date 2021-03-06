/*
 * This file is generated by jOOQ.
 */
package PharmacyDataAccess.tables.pojos;


import PharmacyDataAccess.tables.interfaces.ITransactions;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "Transactions", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(name = "PK_Transactions", columnNames = {"transactionId"})
})
public class Transactions implements ITransactions {

    private static final long serialVersionUID = -1539946563;

    private Object     transactionid;
    private Object     customerid;
    private Object     employeeid;
    private Object     datetrasaction;
    private BigDecimal amount;

    public Transactions() {}

    public Transactions(ITransactions value) {
        this.transactionid = value.getTransactionid();
        this.customerid = value.getCustomerid();
        this.employeeid = value.getEmployeeid();
        this.datetrasaction = value.getDatetrasaction();
        this.amount = value.getAmount();
    }

    public Transactions(
        Object     transactionid,
        Object     customerid,
        Object     employeeid,
        Object     datetrasaction,
        BigDecimal amount
    ) {
        this.transactionid = transactionid;
        this.customerid = customerid;
        this.employeeid = employeeid;
        this.datetrasaction = datetrasaction;
        this.amount = amount;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Id
    @Column(name = "transactionId")
    @Override
    public Object getTransactionid() {
        return this.transactionid;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setTransactionid(Object transactionid) {
        this.transactionid = transactionid;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Column(name = "customerId")
    @Override
    public Object getCustomerid() {
        return this.customerid;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setCustomerid(Object customerid) {
        this.customerid = customerid;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Column(name = "employeeId")
    @Override
    public Object getEmployeeid() {
        return this.employeeid;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setEmployeeid(Object employeeid) {
        this.employeeid = employeeid;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Column(name = "dateTrasaction")
    @Override
    public Object getDatetrasaction() {
        return this.datetrasaction;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setDatetrasaction(Object datetrasaction) {
        this.datetrasaction = datetrasaction;
    }

    @Column(name = "amount", precision = 10, scale = 5)
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Transactions (");

        sb.append(transactionid);
        sb.append(", ").append(customerid);
        sb.append(", ").append(employeeid);
        sb.append(", ").append(datetrasaction);
        sb.append(", ").append(amount);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITransactions from) {
        setTransactionid(from.getTransactionid());
        setCustomerid(from.getCustomerid());
        setEmployeeid(from.getEmployeeid());
        setDatetrasaction(from.getDatetrasaction());
        setAmount(from.getAmount());
    }

    @Override
    public <E extends ITransactions> E into(E into) {
        into.from(this);
        return into;
    }
}
