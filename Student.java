import javax.swing.*;

public class Student {
    String name;
    int age;

    public void introduce() {
        System.out.println("My name is " + name + " and Iam " + age + " years old.");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.age = 20;
        student.introduce();
    }

}

//public class Main {
//
//}
