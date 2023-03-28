package src.pro.sky.java.course1.coursework;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int dept;
    private double salary;
    private static int counter;
    private final int id;

    public Employee(String fullName, int dept, int salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dept == employee.dept && Double.compare(employee.salary, salary) == 0 && id == employee.id
                && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dept, salary, id);
    }

    @Override
    public String toString() {
        return "id " + id + " ФИО: " + fullName + ", Отдел: " + dept + ", Зарплата: " + salary;
    }
}