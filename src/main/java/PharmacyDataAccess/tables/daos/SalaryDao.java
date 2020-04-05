/*
 * This file is generated by jOOQ.
 */
package PharmacyDataAccess.tables.daos;


import PharmacyDataAccess.tables.Salary;
import PharmacyDataAccess.tables.records.SalaryRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class SalaryDao extends DAOImpl<SalaryRecord, PharmacyDataAccess.tables.pojos.Salary, Object> {

    /**
     * Create a new SalaryDao without any configuration
     */
    public SalaryDao() {
        super(Salary.SALARY, PharmacyDataAccess.tables.pojos.Salary.class);
    }

    /**
     * Create a new SalaryDao with an attached configuration
     */
    @Autowired
    public SalaryDao(Configuration configuration) {
        super(Salary.SALARY, PharmacyDataAccess.tables.pojos.Salary.class, configuration);
    }

    @Override
    public Object getId(PharmacyDataAccess.tables.pojos.Salary object) {
        return object.getSalaryid();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchRangeOfSalaryid(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(Salary.SALARY.SALARYID, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchBySalaryid(Object... values) {
        return fetch(Salary.SALARY.SALARYID, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public PharmacyDataAccess.tables.pojos.Salary fetchOneBySalaryid(Object value) {
        return fetchOne(Salary.SALARY.SALARYID, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchRangeOfEmployeeid(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(Salary.SALARY.EMPLOYEEID, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchByEmployeeid(Object... values) {
        return fetch(Salary.SALARY.EMPLOYEEID, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchRangeOfStatedate(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(Salary.SALARY.STATEDATE, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchByStatedate(Object... values) {
        return fetch(Salary.SALARY.STATEDATE, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchRangeOfEnddate(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(Salary.SALARY.ENDDATE, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<PharmacyDataAccess.tables.pojos.Salary> fetchByEnddate(Object... values) {
        return fetch(Salary.SALARY.ENDDATE, values);
    }
}