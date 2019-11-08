/*
 * This file is generated by jOOQ.
 */
package Pharmacy.dbo;


import Pharmacy.DefaultCatalog;
import Pharmacy.dbo.tables.Medicine;
import Pharmacy.dbo.tables.Pharmacy;
import Pharmacy.dbo.tables.Pharmacymedicine;
import Pharmacy.dbo.tables.Roles;
import Pharmacy.dbo.tables.Salary;
import Pharmacy.dbo.tables.Transactions;
import Pharmacy.dbo.tables.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Dbo extends SchemaImpl {

    private static final long serialVersionUID = 515664452;

    /**
     * The reference instance of <code>dbo</code>
     */
    public static final Dbo DBO = new Dbo();

    /**
     * The table <code>dbo.Medicine</code>.
     */
    public final Medicine MEDICINE = Pharmacy.dbo.tables.Medicine.MEDICINE;

    /**
     * The table <code>dbo.Pharmacy</code>.
     */
    public final Pharmacy PHARMACY = Pharmacy.dbo.tables.Pharmacy.PHARMACY;

    /**
     * The table <code>dbo.PharmacyMedicine</code>.
     */
    public final Pharmacymedicine PHARMACYMEDICINE = Pharmacy.dbo.tables.Pharmacymedicine.PHARMACYMEDICINE;

    /**
     * The table <code>dbo.Roles</code>.
     */
    public final Roles ROLES = Pharmacy.dbo.tables.Roles.ROLES;

    /**
     * The table <code>dbo.Salary</code>.
     */
    public final Salary SALARY = Pharmacy.dbo.tables.Salary.SALARY;

    /**
     * The table <code>dbo.Transactions</code>.
     */
    public final Transactions TRANSACTIONS = Pharmacy.dbo.tables.Transactions.TRANSACTIONS;

    /**
     * The table <code>dbo.Users</code>.
     */
    public final Users USERS = Pharmacy.dbo.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Dbo() {
        super("dbo", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Medicine.MEDICINE,
            Pharmacy.PHARMACY,
            Pharmacymedicine.PHARMACYMEDICINE,
            Roles.ROLES,
            Salary.SALARY,
            Transactions.TRANSACTIONS,
            Users.USERS);
    }
}
