package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş zammı hesaplama metodu
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double finalSalary = salary - tax + bonus + raise;

        return "Employee Info:" +
                "\nName: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax +
                "\nBonus: " + bonus +
                "\nRaise: " + raise +
                "\nFinal Salary: " + finalSalary;
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Kubilay Kalkan", 1200, 45, 2005);
        System.out.println(emp.toString());
    }


}
