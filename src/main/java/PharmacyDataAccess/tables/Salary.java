/*
 * This file is generated by jOOQ.
 */
package PharmacyDataAccess.tables;


import PharmacyDataAccess.Dbo;
import PharmacyDataAccess.Keys;
import PharmacyDataAccess.tables.records.SalaryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Salary extends TableImpl<SalaryRecord> {

    private static final long serialVersionUID = 2122583166;

    /**
     * The reference instance of <code>dbo.Salary</code>
     */
    public static final Salary SALARY = new Salary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalaryRecord> getRecordType() {
        return SalaryRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<SalaryRecord, Object> SALARYID = createField(DSL.name("salaryId"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<SalaryRecord, Object> EMPLOYEEID = createField(DSL.name("employeeId"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<SalaryRecord, Object> STATEDATE = createField(DSL.name("stateDate"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<SalaryRecord, Object> ENDDATE = createField(DSL.name("endDate"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>dbo.Salary</code> table reference
     */
    public Salary() {
        this(DSL.name("Salary"), null);
    }

    /**
     * Create an aliased <code>dbo.Salary</code> table reference
     */
    public Salary(String alias) {
        this(DSL.name(alias), SALARY);
    }

    /**
     * Create an aliased <code>dbo.Salary</code> table reference
     */
    public Salary(Name alias) {
        this(alias, SALARY);
    }

    private Salary(Name alias, Table<SalaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Salary(Name alias, Table<SalaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Salary(Table<O> child, ForeignKey<O, SalaryRecord> key) {
        super(child, key, SALARY);
    }

    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    @Override
    public UniqueKey<SalaryRecord> getPrimaryKey() {
        return Keys.PK_SALARY;
    }

    @Override
    public List<UniqueKey<SalaryRecord>> getKeys() {
        return Arrays.<UniqueKey<SalaryRecord>>asList(Keys.PK_SALARY);
    }

    @Override
    public Salary as(String alias) {
        return new Salary(DSL.name(alias), this);
    }

    @Override
    public Salary as(Name alias) {
        return new Salary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Salary rename(String name) {
        return new Salary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Salary rename(Name name) {
        return new Salary(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Object, Object, Object, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
