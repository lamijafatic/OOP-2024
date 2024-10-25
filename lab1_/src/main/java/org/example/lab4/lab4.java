package org.example.lab4;
import org.example.lab4.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class lab4 {

    public static void main(String[] args) {
        /*Person pekka= new Person("Pekka Mikkola","Korsontie Street 1 03100 Vantaa");
        Person esko= new Person("Esko Ukonnen","Mannerheimintie Street 15 001000 Helsinki");
        System.out.println(pekka.getDetails());
        System.out.println();
        System.out.println(esko.getDetails());
        Student olli=new Student("Olii","Ida Alberginties Street 1 00400 Helsinki");
        System.out.println(olli.getStudentDetails());
        System.out.println("credits: "+olli.credits());
        olli.study();
        System.out.println("credits "+olli.credits());

        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekka.getTeacherDetails());
        System.out.println();
        System.out.println(esko.getTeacherDetails());
        System.out.println();
        Student olli=new Student("Olii","Ida Alberginties Street 1 00400 Helsinki");
        for (int i = 0; i < 25; i++) {
            olli.study();
        }
        System.out.println(olli.getStudentDetails());
        System.out.println("credits: "+olli.credits());


        List<Person> people=new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        printDepartment(people);
        Student olli=new Student("Olii","Ida Alberginties Street 1 00400 Helsinki");
        System.out.println("credits: "+olli.credits());


    }
    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            if (person instanceof Teacher) {

                Teacher teacher = (Teacher) person;
                System.out.println(teacher.getTeacherDetails());
            } else if (person instanceof Student) {

                Student student = (Student) person;
                System.out.println(student.getStudentDetails());
            }
            System.out.println();
        }*/
        /*onaj sa shape*/
        Circle circle = new Circle("Red", FillType.FILLED, 4.0);
        circle.displayInfo();
        System.out.println("Circumfeence math: " + circle.calculateCircumference());
        System.out.println("Circumference 2: " + circle.calculateCircumference());
        System.out.println();
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);
        rectangle.displayInfo();


        Student student = new Student("Alice Johnson", "456 Elm Street", 20, "USA", 12, "12", new ArrayList<>(Arrays.asList(85, 90, 78)) );
        student.displayStudentInfo();
        student.addGrade(85);
        student.addGrade(120); // Invalid grade
        student.addGrade(92);
        System.out.println("\nUpdated Student Information:");

        student.displayStudentInfo();
    }
}