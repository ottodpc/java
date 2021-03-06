package com.ControlFlow;

public class Employee {
    // static member belong to Class vs Instance member belong
    // to an object which is an instance of a Class
    public static int numberOfEmployeeInstance;

    // template  Fields ( instance member )
    private int baseSalary;
    private int extrHours;
    private int hourlyRate;

    // 14- Constructor() Overloading
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    // Constructor use to initiate object creation
    // without a ReturnType
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployeeInstance++;
    }

    public static void printNumberOfEmployeeInstance() {
        System.out.println(numberOfEmployeeInstance);
    }

    // blueprint  methods
    public int calculateWage() {
        return baseSalary + (extrHours * hourlyRate);
    }
    private void setExtrHours( int extrHours) {
        if(extrHours <= 0)
            throw new IllegalArgumentException("extrHours is not négative");
        this.extrHours = extrHours;
    }
    private void setHourlyRate( int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("hourlyRate is not négative");
        this.hourlyRate = hourlyRate;
    }
    private void setBaseSalary( int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("salary is not négative");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return this.baseSalary;
    }
}
