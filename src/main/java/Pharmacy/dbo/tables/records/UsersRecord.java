/*
 * This file is generated by jOOQ.
 */
package Pharmacy.dbo.tables.records;


import Pharmacy.dbo.tables.Users;
import Pharmacy.dbo.tables.interfaces.IUsers;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
@Table(name = "Users", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(name = "PK_Users", columnNames = {"userId"})
})
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record8<Object, String, String, String, String, String, Object, Object>, IUsers {

    private static final long serialVersionUID = 277224253;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setUserid(Object value) {
        set(0, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Id
    @Column(name = "userId")
    @Override
    public Object getUserid() {
        return get(0);
    }

    /**
     * Setter for <code>dbo.Users.city</code>.
     */
    @Override
    public void setCity(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dbo.Users.city</code>.
     */
    @Column(name = "city", length = 50)
    @Override
    public String getCity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dbo.Users.firstName</code>.
     */
    @Override
    public void setFirstname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dbo.Users.firstName</code>.
     */
    @Column(name = "firstName", length = 50)
    @Override
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dbo.Users.lastName</code>.
     */
    @Override
    public void setLastname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dbo.Users.lastName</code>.
     */
    @Column(name = "lastName", length = 50)
    @Override
    public String getLastname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dbo.Users.state</code>.
     */
    @Override
    public void setState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>dbo.Users.state</code>.
     */
    @Column(name = "state", length = 30)
    @Override
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dbo.Users.userAddress</code>.
     */
    @Override
    public void setUseraddress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>dbo.Users.userAddress</code>.
     */
    @Column(name = "userAddress", length = 50)
    @Override
    public String getUseraddress() {
        return (String) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setZip(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Column(name = "zip")
    @Override
    public Object getZip() {
        return get(6);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public void setRoleid(Object value) {
        set(7, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Column(name = "roleId")
    @Override
    public Object getRoleid() {
        return get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Object> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Object, String, String, String, String, String, Object, Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Object, String, String, String, String, String, Object, Object> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return Users.USERS.USERID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.CITY;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.FIRSTNAME;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.LASTNAME;
    }

    @Override
    public Field<String> field5() {
        return Users.USERS.STATE;
    }

    @Override
    public Field<String> field6() {
        return Users.USERS.USERADDRESS;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return Users.USERS.ZIP;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field8() {
        return Users.USERS.ROLEID;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component1() {
        return getUserid();
    }

    @Override
    public String component2() {
        return getCity();
    }

    @Override
    public String component3() {
        return getFirstname();
    }

    @Override
    public String component4() {
        return getLastname();
    }

    @Override
    public String component5() {
        return getState();
    }

    @Override
    public String component6() {
        return getUseraddress();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getZip();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component8() {
        return getRoleid();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value1() {
        return getUserid();
    }

    @Override
    public String value2() {
        return getCity();
    }

    @Override
    public String value3() {
        return getFirstname();
    }

    @Override
    public String value4() {
        return getLastname();
    }

    @Override
    public String value5() {
        return getState();
    }

    @Override
    public String value6() {
        return getUseraddress();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getZip();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value8() {
        return getRoleid();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public UsersRecord value1(Object value) {
        setUserid(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setCity(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public UsersRecord value5(String value) {
        setState(value);
        return this;
    }

    @Override
    public UsersRecord value6(String value) {
        setUseraddress(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public UsersRecord value7(Object value) {
        setZip(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public UsersRecord value8(Object value) {
        setRoleid(value);
        return this;
    }

    @Override
    public UsersRecord values(Object value1, String value2, String value3, String value4, String value5, String value6, Object value7, Object value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUsers from) {
        setUserid(from.getUserid());
        setCity(from.getCity());
        setFirstname(from.getFirstname());
        setLastname(from.getLastname());
        setState(from.getState());
        setUseraddress(from.getUseraddress());
        setZip(from.getZip());
        setRoleid(from.getRoleid());
    }

    @Override
    public <E extends IUsers> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Object userid, String city, String firstname, String lastname, String state, String useraddress, Object zip, Object roleid) {
        super(Users.USERS);

        set(0, userid);
        set(1, city);
        set(2, firstname);
        set(3, lastname);
        set(4, state);
        set(5, useraddress);
        set(6, zip);
        set(7, roleid);
    }
}
