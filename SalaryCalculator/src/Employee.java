public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYears;

    Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 3 / 100;
            return tax;
        }
        return tax;

    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            {
                bonus = (this.workHours - 40) * 30;
                return bonus;
            }
        }
        return bonus;
    }

    double raiseSalary() {
        double raiseSalary = 0.0;
        int year = 2021 - this.hireYears;
        if (year > 19) {
            raiseSalary = (this.salary * 15) / 100;
            return raiseSalary;
        } else if (year > 9 && year < 20) {
            raiseSalary = (this.salary * 10) / 100;
            return raiseSalary;
        } else if (year < 10) {
            raiseSalary = (this.salary * 5) / 100;
            return raiseSalary;
        }

        return raiseSalary;
    }

    void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: "+this.workHours);
        System.out.println("Hire Year: "+hireYears);
        System.out.println("------------------------------");
        System.out.println("Tax: " +tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Salary Increase :"+raiseSalary());
        System.out.println("------------------------------");
        double sum=(this.salary+bonus()+raiseSalary())-tax();
        System.out.println("Total Salary: "+sum);

    }


}

