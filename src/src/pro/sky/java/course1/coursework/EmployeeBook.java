package src.pro.sky.java.course1.coursework;

import java.sql.SQLOutput;

public class EmployeeBook {
    private final Employee employee[] = new Employee[10];

    public EmployeeBook() {
        employee[0] = new Employee("Иванов Иван Иванович", 1, 15000);
        employee[1] = new Employee("Петров Михаил Степанович", 2, 18000);
        employee[2] = new Employee("Сидоров Александр Петрович", 3, 14000);
        employee[3] = new Employee("Свекольников Сергей Дмитриевич", 4, 17000);
        employee[4] = new Employee("Картошкин Алексей Артемович", 1, 20000);
        employee[5] = new Employee("Булкина Ольга Ивановна", 5, 34000);
        employee[6] = new Employee("Пончикова Екатерина Алексеевна", 2, 16000);
        employee[7] = new Employee("Беляшова Галина Петровна", 1, 28000);
        employee[8] = new Employee("Тищенко Мария Яковлевна", 2, 38000);
        employee[9] = new Employee("Бортников Виталий Иванович", 3, 27000);
    }

    public void fullInformationEmployees(){
        for (Employee e : employee){
            System.out.println(e);
        }
    }

    public void fullInformationEmployees(int dept){
        int id;
        String fullName;
        double salary;
        for (Employee e : employee){
            if (e.getDept() == dept) {
                id = e.getId();
                fullName = e.getFullName();
                salary = e.getSalary();
                System.out.println("id " + id + " ФИО: " + fullName + " Зарплата: " + salary);
            }
        }
    }

    public double sumSalaryMonth(){
        double sum = 0;
        for (Employee e : employee){
            sum += e.getSalary();
        }
        return sum;
    }

    public double sumSalaryMonth(int dept){
        double sum = 0;
        for (Employee e : employee){
            if (e.getDept() == dept){
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public Employee minSalaryEmployee(){
        Employee min = null;
        for (Employee e : employee){
            if (min == null || e.getSalary() < min.getSalary()){
                min = e;
            }
        }
        return min;
    }
    public Employee minSalaryEmployee(int dept){
        Employee min = null;
        for (Employee e : employee){
            if (e.getDept() != dept){
                continue;
            }
            if (min == null || e.getSalary() < min.getSalary()){
                min = e;
            }
        }
        return min;
    }

    public Employee maxSalaryEmployee(){
        Employee max = null;
        for (Employee e : employee){
            if (max == null || e.getSalary() > max.getSalary()){
                max = e;
            }
        }
        return max;
    }

    public Employee maxSalaryEmployee(int dept){
        Employee max = null;
        for (Employee e : employee){
            if (e.getDept() != dept){
                continue;
            }
            if (max == null || e.getSalary() > max.getSalary()){
                max = e;
            }
        }
        return max;
    }

    public double salaryAverage(){
        double averageValue = 0;
        averageValue = sumSalaryMonth() / employee.length;
        return averageValue;
    }

    public double salaryAverage(int dept){
        double sum = 0;
        int quantity = 0;
        for (Employee e : employee) {
            if (e.getDept() != dept) {
                continue;
            }
            sum += e.getSalary();
            quantity++;
        }
        return sum / quantity;
    }

    public void fullNameOfAllEmployees() {
        String fullName;
        for (Employee value : employee) {
            fullName = value.getFullName();
            System.out.println(fullName);
        }
    }

    public void salaryIndexing(double percent){
        double sum;
        for (Employee e : employee) {
            sum = (e.getSalary() * percent) / 100;
            e.setSalary(e.getSalary() + sum);
        }
    }

    public void salaryIndexing(double percent, int dept){
        double sum;
        for (Employee e : employee) {
            if (e.getDept() == dept) {
                sum = (e.getSalary() * percent) / 100;
                e.setSalary(e.getSalary() + sum);
            }
        }
    }

    public void employeesSalaryLessNumber(double index){
        for (Employee e: employee){
            if (e.getSalary() < index){
                System.out.println(e);
            }
        }
    }

    public void employeesSalaryGreaterNumber(double index){
        for (Employee e: employee){
            if (e.getSalary() > index){
                System.out.println(e);
            }
        }
    }

    public void deleteEmployee(int id){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] == null){
                continue;
            }
            if (employee[i].getId() == id){
                employee[i] = null;
            }
        }
    }

    public void deleteEmployee(String fullName){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] == null){
                continue;
            }
            if (employee[i].getFullName().equalsIgnoreCase(fullName)){
                employee[i] = null;
            }
        }
    }

    public void addEmployee(Employee employees){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] == null){
                employee[i] = employees;
                break;
            }
        }
    }

    public void changeSalaryEmployee(String fullName, double salary){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] == null){
                continue;
            }
            if (employee[i].getFullName().equalsIgnoreCase(fullName)){
                employee[i].setSalary(salary);
            }
        }
    }

    public void changeDeptEmployee(String fullName, int dept){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] == null){
                continue;
            }
            if (employee[i].getFullName().equalsIgnoreCase(fullName)){
                employee[i].setDept(dept);
            }
        }
    }

    public void printEmployeesByDept(){
        int totalDept = 5;
        int index = 1;
        for (int i = 1; i <= totalDept; i++) {
            if (i == index) {
                System.out.println("Отдел " + index);
                for (Employee e : employee) {
                    if (e == null) {
                        continue;
                    }
                    if (e.getDept() == i) {
                        System.out.println(e);
                    }
                }
            }
            ++index;
        }
    }
}