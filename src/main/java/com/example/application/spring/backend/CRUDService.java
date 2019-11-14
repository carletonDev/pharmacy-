package com.example.application.spring.backend;

import PharmacyDataAccess.tables.daos.*;
import PharmacyDataAccess.tables.pojos.Employee;
import com.example.application.spring.backend.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
Instantiates all DAO for cleaner code
 */
@Service //only holds methods
public class CRUDService {

    @Autowired
   private BackendService service;

    public EmployeeDao EmployeeDAO(){
        return new EmployeeDao(service.GetConfiguration());
    }

    public MedicineDao MediicineDAO(){return new MedicineDao(service.GetConfiguration());}

    public PharmacyDao PharmacyDAO(){return new PharmacyDao(service.GetConfiguration());}
    public PharmacymedicineDao PharmacyMedicine(){return new PharmacymedicineDao(service.GetConfiguration());}

    public RolesDao RolesDAO(){return new RolesDao(service.GetConfiguration());}

    public SalaryDao SalaryDAO(){return new SalaryDao(service.GetConfiguration());}

    public TransactionsDao TransactionsDAO(){return new TransactionsDao(service.GetConfiguration());}

    public UsersDao UsersDAO(){return new UsersDao(service.GetConfiguration());}

    /*
    Jooq doesn't take into account identity so the inserts need to be created besides just instantiating the dao object
     */

    public void InsertEmployee(Employee employees){
        service.DSL().insertInto(PharmacyDataAccess.tables.Employee.EMPLOYEE,
                PharmacyDataAccess.tables.Employee.EMPLOYEE.FIRSTNAME,
                PharmacyDataAccess.tables.Employee.EMPLOYEE.LASTNAME,
                PharmacyDataAccess.tables.Employee.EMPLOYEE.EMAIL,
                PharmacyDataAccess.tables.Employee.EMPLOYEE.TITLE)
                .values(employees.getFirstname(),
                        employees.getLastname(),
                        employees.getEmail(),
                        employees.getTitle()).execute();


    }


}
