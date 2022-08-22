package testng;

/**
 * this is used to calculate the yearly salary of employee the appraisal amount
 * of employee
 * 
 */
public class EmpBusinessLogic {

    // Calculate the yearly salary of em ployee
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {

        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    // Calculate the appraisal am ount of em ployee
    public double calculateAppraisal(EmployeeDetails employeeDetails) {

        double appraisal = 0;
        if (employeeDetails.getMonthlySalary() < 10000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }
        return appraisal;
    }

}
