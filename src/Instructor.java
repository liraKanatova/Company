import java.time.LocalDate;

public class Instructor extends Person {

    private double salary;

    public Instructor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public double period(Group groups) {
        LocalDate localDate=LocalDate.now();
        LocalDate result=groups.getDateOfFinish().minusYears(groups.getDateOfStart().getYear()).
                minusMonths(groups.getDateOfStart().getMonthValue()).minusDays(groups.getDateOfStart().getDayOfMonth());
        return result.getMonthValue()*salary;
    }


    }


