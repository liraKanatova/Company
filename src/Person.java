import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Person {
    private long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
 public abstract double period(Group groups);



    public static void sortAge(Person[] persons){
     int[] age=new int[persons.length];
     int counter=0;
     for (Person person:persons){
         age[counter]= person.getAge();
         counter++;
     }
     Arrays.sort(age);
        System.out.println(Arrays.toString(age));


           }


        }







