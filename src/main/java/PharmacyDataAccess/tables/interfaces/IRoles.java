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
@Table(name = "Roles", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(name = "PK_Roles", columnNames = {"roleId"})
})
public interface IRoles extends Serializable {

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setRoleid(Object value);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Id
    @Column(name = "roleId")
    public Object getRoleid();

    /**
     * Setter for <code>dbo.Roles.roleType</code>.
     */
    public void setRoletype(String value);

    /**
     * Getter for <code>dbo.Roles.roleType</code>.
     */
    @Column(name = "roleType", length = 50)
    public String getRoletype();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRoles
     */
    public void from(PharmacyDataAccess.tables.interfaces.IRoles from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRoles
     */
    public <E extends PharmacyDataAccess.tables.interfaces.IRoles> E into(E into);
}
