package src.pro.sky.java.course1.coursework;

public class EmployeeBook {
    private Employee employee[];

    public EmployeeBook() {
        this.employee = new Employee[10];
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


    public Employee[] getEmployee() {
        return employee;
    }

    public void fullInformationEmployees(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public double sumSalaryMonth(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    private void printMaxMinSalary(Employee value){
        for (int i = 0; i < getEmployee().length; i++) {
            if (value.getSalary() == getEmployee()[i].getSalary()){
                System.out.println(getEmployee()[i].toString());
            }
        }
    }

    public void minSalaryEmployee(Employee[] employees) {
        Employee min = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < min.getSalary()) {
                min = e;
            }
        }
        printMaxMinSalary(min);
    }

    public void maxSalaryEmployee(Employee[] employees) {
        Employee max = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > max.getSalary()) {
                max = e;
            }
        }
        printMaxMinSalary(max);
    }

    public double salaryAverage(Employee[] employees){
        double averageValue;
        averageValue = (double) sumSalaryMonth(employees) / employees.length;
        return averageValue;
    }

    public void fullNameOfAllEmployees(Employee[] employees) {
        String fullName;
        for (int i = 0; i < employees.length; i++){
            fullName = employees[i].getFullName();
            System.out.println(fullName);
        }
    }
}