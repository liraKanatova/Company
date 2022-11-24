import java.util.Arrays;

public class Campany {

    private String name;
    private String address;
    private Course[] cources;
    private String languageOfInstruction;

    public Campany(String name, String address, Course[] cources, String languageOfInstruction) {
        this.name = name;
        this.address = address;
        this.cources = cources;
        this.languageOfInstruction = languageOfInstruction;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course[] getCources() {
        return cources;
    }

    public void setCources(Course[] cources) {
        this.cources = cources;
    }

    public String getLanguageOfInstruction() {
        return languageOfInstruction;
    }

    public void setLanguageOfInstruction(String languageOfInstruction) {
        this.languageOfInstruction = languageOfInstruction;
    }

    @Override
    public String toString() {
        return "Campany{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cources=" + Arrays.toString(cources) +
                ", languageOfInstruction='" + languageOfInstruction + '\'' +
                '}';
    }
    public static double income(Student[] students){
     double sum=0;
     for (Student student:students){
         sum=student.getContract()+sum;
     }
return sum;
    }
}
