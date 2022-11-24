import java.time.LocalDate;

public class Student extends Person{
    private double contract;

    public Student(long id, String fullName, int age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Student{" +
                "contract=" + contract +
                '}';
    }

    @Override
  public   double period(Group groups) {
        LocalDate localDate=LocalDate.now();
        LocalDate result= groups.getDateOfFinish().minusYears(groups.getDateOfStart().getYear()).
                minusMonths(groups.getDateOfStart().getMonthValue()).minusDays(groups.getDateOfStart().
                getDayOfMonth());
        return result.getMonthValue()*contract;
    }


    }

