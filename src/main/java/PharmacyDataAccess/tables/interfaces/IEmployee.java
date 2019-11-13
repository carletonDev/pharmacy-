/*
 * This file is generated by jOOQ.
 */
package PharmacyDataAccess.tables.interfaces;


import java.io.Serializable;

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
@Table(name = "Employee", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(name = "PK_Employee", columnNames = {"employeeId"})
})
public interface IEmployee extends Serializable {

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setEmployeeid(Object value);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Id
    @Column(name = "employeeId")
    public Object getEmployeeid();

    /**
     * Setter for <code>dbo.Employee.firstname</code>.
     */
    public void setFirstname(String value);

    /**
     * Getter for <code>dbo.Employee.firstname</code>.
     */
    @Column(name = "firstname", length = 2147483647)
    public String getFirstname();

    /**
     * Setter for <code>dbo.Employee.lastname</code>.
     */
    public void setLastname(String value);

    /**
     * Getter for <code>dbo.Employee.lastname</code>.
     */
    @Column(name = "lastname", length = 2147483647)
    public String getLastname();

    /**
     * Setter for <code>dbo.Employee.title</code>.
     */
    public void setTitle(String value);

    /**
     * Getter for <code>dbo.Employee.title</code>.
     */
    @Column(name = "title", length = 2147483647)
    public String getTitle();

    /**
     * Setter for <code>dbo.Employee.email</code>.
     */
    public void setEmail(String value);

    /**
     * Getter for <code>dbo.Employee.email</code>.
     */
    @Column(name = "email", length = 2147483647)
    public String getEmail();

    /**
     * Setter for <code>dbo.Employee.notes</code>.
     */
    public void setNotes(String value);

    /**
     * Getter for <code>dbo.Employee.notes</code>.
     */
    @Column(name = "notes", length = 2147483647)
    public String getNotes();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IEmployee
     */
    public void from(PharmacyDataAccess.tables.interfaces.IEmployee from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IEmployee
     */
    public <E extends PharmacyDataAccess.tables.interfaces.IEmployee> E into(E into);
}
