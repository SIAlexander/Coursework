package src.pro.sky.java.course1.coursework;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        //вывод всех полей toString()
        employeeBook.fullInformationEmployees(employeeBook.getEmployee());
        System.out.println("____________________________________________________________________");

        //Посчитать сумму затрат на зарплаты в месяц
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.sumSalaryMonth(employeeBook.getEmployee()));
        System.out.println("____________________________________________________________________");

        //Найти сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой:");
        employeeBook.minSalaryEmployee(employeeBook.getEmployee());
        System.out.println("____________________________________________________________________");


        //Найти сотрудника с максимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой:");
        employeeBook.maxSalaryEmployee(employeeBook.getEmployee());
        System.out.println("____________________________________________________________________");

        //Подсчитать среднее значение зарплат
        System.out.println("Среднее знаечние зарплат: " + employeeBook.salaryAverage(employeeBook.getEmployee()));
        System.out.println("____________________________________________________________________");

        //Получить Ф. И. О. всех сотрудников (вывести в консоль).
        employeeBook.fullNameOfAllEmployees(employeeBook.getEmployee());
    }
}