import java.util.Arrays;
import java.util.Objects;
public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        initializeEmployees();

        System.out.println("=== Список всех сотрудников ===");
        printAllEmployees();
        System.out.println("\n === ФИО всех сотрудников ===");
        printAllEmployeesFullName();
        System.out.println("\n === Статистика по всем  зарплатам ===");
        System.out.println("Сумма затрат на ЗП: " + calculateTotalSalary() + " руб. ");
        System.out.println("Сотрудник с минимальной зп " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зп " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата " + calculateAverageSalary() + " руб. ");
    }

    private static void initializeEmployees() {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Александрова Александра Александровна", 3, 40000);
        employees[3] = new Employee("Алексеев Алексей Алексеевич", 4, 70000);
        employees[4] = new Employee("Сергеев Сергей Сергеич", 5, 55000);
        employees[5] = new Employee("Максимов Максим Максимович", 1, 48000);
        employees[6] = new Employee("Михайлов Михаил Михаилович", 2, 38000);
        employees[7] = new Employee("Павлов Павел Павлович", 3, 61000);
        employees[8] = new Employee("Фёдоров Фёдор Фёдорович", 4, 68000);
        employees[9] = new Employee("Денисов Денис Денисович", 5, 59000);
    }

    public static void printAllEmployees() {
        for (Employee employee :employees){
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count > 0 ? calculateTotalSalary() / count : 0;
    }

    public static void printAllEmployeesFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
        }
    }
}
}
