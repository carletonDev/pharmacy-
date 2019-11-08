/*
 * This file is generated by jOOQ.
 */
package Pharmacy.dbo.tables.daos;


import Pharmacy.dbo.tables.Pharmacy;
import Pharmacy.dbo.tables.records.PharmacyRecord;

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
public class PharmacyDao extends DAOImpl<PharmacyRecord, Pharmacy.dbo.tables.pojos.Pharmacy, Object> {

    /**
     * Create a new PharmacyDao without any configuration
     */
    public PharmacyDao() {
        super(Pharmacy.PHARMACY, Pharmacy.dbo.tables.pojos.Pharmacy.class);
    }

    /**
     * Create a new PharmacyDao with an attached configuration
     */
    @Autowired
    public PharmacyDao(Configuration configuration) {
        super(Pharmacy.PHARMACY, Pharmacy.dbo.tables.pojos.Pharmacy.class, configuration);
    }

    @Override
    public Object getId(Pharmacy.dbo.tables.pojos.Pharmacy object) {
        return object.getPharmacyid();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchRangeOfPharmacyid(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(Pharmacy.PHARMACY.PHARMACYID, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchByPharmacyid(Object... values) {
        return fetch(Pharmacy.PHARMACY.PHARMACYID, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Pharmacy.dbo.tables.pojos.Pharmacy fetchOneByPharmacyid(Object value) {
        return fetchOne(Pharmacy.PHARMACY.PHARMACYID, value);
    }

    /**
     * Fetch records that have <code>city BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchRangeOfCity(String lowerInclusive, String upperInclusive) {
        return fetchRange(Pharmacy.PHARMACY.CITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchByCity(String... values) {
        return fetch(Pharmacy.PHARMACY.CITY, values);
    }

    /**
     * Fetch records that have <code>pharmacyAddress BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchRangeOfPharmacyaddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(Pharmacy.PHARMACY.PHARMACYADDRESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>pharmacyAddress IN (values)</code>
     */
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchByPharmacyaddress(String... values) {
        return fetch(Pharmacy.PHARMACY.PHARMACYADDRESS, values);
    }

    /**
     * Fetch records that have <code>state BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchRangeOfState(String lowerInclusive, String upperInclusive) {
        return fetchRange(Pharmacy.PHARMACY.STATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchByState(String... values) {
        return fetch(Pharmacy.PHARMACY.STATE, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchRangeOfZip(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(Pharmacy.PHARMACY.ZIP, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<Pharmacy.dbo.tables.pojos.Pharmacy> fetchByZip(Object... values) {
        return fetch(Pharmacy.PHARMACY.ZIP, values);
    }
}
