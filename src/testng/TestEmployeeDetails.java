package testng;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Testing the methods of EmpBusinessLogic class. It
 * </p>
 * tests the yearly salary of the employee.
 * </p>
 * tests the appraisal amount of the employee.
 */


public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    @Test
    public void testCalculateAppraisal() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(1500, appraisal, 0.0, "500");
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double yearlySalary = empBusinessLogic.calculateYearlySalary(employee);

        Assert.assertEquals(196000, yearlySalary, 0.0, "96000");

    }
}
