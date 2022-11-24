import java.time.LocalDate;

public class Mentor extends Instructor{


    public Mentor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }



    @Override
    public double period(Group groups) {
        LocalDate localDate=LocalDate.now();
        LocalDate result=groups.getDateOfFinish().minusYears(groups.getDateOfStart().getYear()).
                minusMonths(groups.getDateOfStart().getMonthValue()).minusDays(groups.getDateOfStart().getDayOfMonth());
        return result.getMonthValue()* super.getSalary();
    }
    
}

