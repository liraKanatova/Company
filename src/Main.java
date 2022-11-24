import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Akun Akunov", 25, 'M', 8000);
        Student student2 = new Student(124, "Akin Akinov", 26, 'M', 8000);
        Student student3 = new Student(125, "Ekun Ekunov", 20, 'M', 12000);
        Student student4 = new Student(126, "Okun Okunov", 21, 'M', 8000);
        Student student5 = new Student(127, "Akina Akinova", 22, 'F', 12000);
        Student student6 = new Student(128, "Ikuna Ikunova", 23, 'F', 12000);
        Student[] students = {student1, student2, student3, student4, student5, student6};
        System.out.println(Arrays.toString(students));

        Instructor instructor1 = new Instructor(223, "Anna Kim", 26, 'F', 300);
        Instructor instructor2 = new Instructor(224, "Samir Li", 24, 'M', 600);
        Instructor[] instructors = {instructor1, instructor2};
        System.out.println(Arrays.toString(instructors));

        Mentor mentor1 = new Mentor(333, "Iman Imanov", 25, 'M', 1000);
        Mentor mentor2 = new Mentor(334, "Imran Imranov", 26, 'F', 1200);
        Mentor[] mentors = {mentor1, mentor2};
        System.out.println(Arrays.toString(mentors));

        LocalDate date = LocalDate.of(2022, 10, 3);
        LocalDate dateOFinish = LocalDate.of(2023, 5, 31);
        LocalDate date1 = LocalDate.of(2022, 10, 3);
        LocalDate dateOFinish2 = LocalDate.of(2023, 6, 3);

        Group group = new Group("Java", students, date, dateOFinish);
        Group group1 = new Group("Java1", students, date, dateOFinish);
        Group[] groups = {group, group1};
        System.out.println(Arrays.toString(groups));

        Course course1 = new Course("Backend", groups, instructors, mentors);
        Course course2 = new Course("Frontend", groups, instructors, mentors);
        Course[] courses = {course1, course2};
        System.out.println(Arrays.toString(courses));

        Person[] persons = {student1, student2, student3, student4, student5, student6, instructor1, instructor2,
                mentor1, mentor2};

        Person.sortAge(persons);
        System.out.println(" 1 Instructor salary,2 Mentor salary,3 Student contract,4 sorAge");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println(instructor1.period(group));
                    break;
                case 2:
                    System.out.println(mentor1.period(group));
                    break;
                case 3:
                    System.out.println(student1.period(group));
                    break;
                case 4:
                    Person.sortAge(persons);
                    break;

            }

        }


    }

}











