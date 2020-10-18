package practice4.oop.encapsulation;

import practice4.oop.encapsulation.StudentClass;

public class StudentExecution {
    public static void main(String[] args) {
        StudentClass student = new StudentClass();
        student.setNameOfStudent("Mayas");

        System.out.println(student.getNameOfStudent());
    }
}
