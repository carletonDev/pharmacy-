/*
 * This file is generated by jOOQ.
 */
package Pharmacy.dbo.tables;


import Pharmacy.dbo.Dbo;
import Pharmacy.dbo.Keys;
import Pharmacy.dbo.tables.records.UsersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1471804310;

    /**
     * The reference instance of <code>dbo.Users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<UsersRecord, Object> USERID = createField(DSL.name("userId"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>dbo.Users.city</code>.
     */
    public final TableField<UsersRecord, String> CITY = createField(DSL.name("city"), org.jooq.impl.SQLDataType.NVARCHAR(50).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.NVARCHAR)), this, "");

    /**
     * The column <code>dbo.Users.firstName</code>.
     */
    public final TableField<UsersRecord, String> FIRSTNAME = createField(DSL.name("firstName"), org.jooq.impl.SQLDataType.NVARCHAR(50).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.NVARCHAR)), this, "");

    /**
     * The column <code>dbo.Users.lastName</code>.
     */
    public final TableField<UsersRecord, String> LASTNAME = createField(DSL.name("lastName"), org.jooq.impl.SQLDataType.NVARCHAR(50).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.NVARCHAR)), this, "");

    /**
     * The column <code>dbo.Users.state</code>.
     */
    public final TableField<UsersRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.NVARCHAR(30).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.NVARCHAR)), this, "");

    /**
     * The column <code>dbo.Users.userAddress</code>.
     */
    public final TableField<UsersRecord, String> USERADDRESS = createField(DSL.name("userAddress"), org.jooq.impl.SQLDataType.NVARCHAR(50).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.NVARCHAR)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<UsersRecord, Object> ZIP = createField(DSL.name("zip"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<UsersRecord, Object> ROLEID = createField(DSL.name("roleId"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>dbo.Users</code> table reference
     */
    public Users() {
        this(DSL.name("Users"), null);
    }

    /**
     * Create an aliased <code>dbo.Users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>dbo.Users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.PK_USERS;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.PK_USERS);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Object, String, String, String, String, String, Object, Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
