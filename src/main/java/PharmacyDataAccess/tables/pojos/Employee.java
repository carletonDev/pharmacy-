/*
 * This file is generated by jOOQ.
 */
package PharmacyDataAccess.tables.pojos;


import PharmacyDataAccess.tables.interfaces.IEmployee;

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
public class Employee implements IEmployee {

    private static final long serialVersionUID = -458431454;

    private Object employeeid;
    private String firstname;
    private String lastname;
    private String title;
    private String email;
    private String notes;

    public Employee() {}

    public Employee(IEmployee value) {
        this.employeeid = value.getEmployeeid();
        this.firstname = value.getFirstname();
        this.lastname = value.getLastname();
        this.title = value.getTitle();
        this.email = value.getEmail();
        this.notes = value.getNotes();
    }
    public Employee(
        Object employeeid,
        String firstname,
        String lastname,
        String title,
        String email,
        String notes
    ) {
        this.employeeid = employeeid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.email = email;
        this.notes = notes;
    }

    public Employee(String firstname, String lastname, String email, String title) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.email = email;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Id
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

    @Column(name = "firstname", length = 2147483647)
    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "lastname", length = 2147483647)
    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "title", length = 2147483647)
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "email", length = 2147483647)
    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "notes", length = 2147483647)
    @Override
    public String getNotes() {
        return this.notes;
    }

    @Override
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee (");

        sb.append(employeeid);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(title);
        sb.append(", ").append(email);
        sb.append(", ").append(notes);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEmployee from) {
        setEmployeeid(from.getEmployeeid());
        setFirstname(from.getFirstname());
        setLastname(from.getLastname());
        setTitle(from.getTitle());
        setEmail(from.getEmail());
        setNotes(from.getNotes());
    }

    @Override
    public <E extends IEmployee> E into(E into) {
        into.from(this);
        return into;
    }
}
