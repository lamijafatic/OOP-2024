package org.example.lab10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        Student student = new Student("Alice", "S12345", Arrays.asList(85, 90, 78, 92));
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(student.getGrades());

        try {
            System.out.println("Reflecting on Student Class:");
            reflectAndInvoke(student);

            System.out.println("\nReflecting on GradeAnalyzer Class:");
            reflectAndInvoke(gradeAnalyzer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reflectAndInvoke(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();


        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println("  " + field.getName() + " = " + field.get(obj));
        }


        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);

            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.print("  Invoking " + method.getName() + "(): ");
                if (method.getReturnType() != void.class) {
                    System.out.println("Result = " + method.invoke(obj));
                } else {
                    method.invoke(obj);
                    System.out.println("Invoked (void method)");
                }
            }
        }
    }
}
