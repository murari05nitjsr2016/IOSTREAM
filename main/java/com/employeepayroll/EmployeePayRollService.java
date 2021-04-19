package com.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
  private List<EmployeePayRollData> employeePayrollList;

    public EmployeePayRollService() {
    }

public EmployeePayRollService(List<EmployeePayRollData> employeePayrollList){

}

    public static void main(String[] args){
        System.out.println("Welcome in IO Stream Concept");
        ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void writeEmployeePayrollData() {
        System.out.println("\n Writing Employee payroll to console\n" +employeePayrollList);
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter  Employee ID");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter  Employee Name");
        String name =  consoleInputReader.next();
        System.out.println("Enter  Employee Salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayRollData(id,name,salary));

    }
}
