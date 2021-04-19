package com.employeepayroll;

public class EmployeePayRollData {
  public  int Id;
  public  String Name;
  public   double Salary;

    public EmployeePayRollData(int id, String name, double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayRollData{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
