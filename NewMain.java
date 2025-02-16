public class NewMain {
    public static void main(String[] args) {
        NewStudent student1 = new NewStudent("001", "张三", 18);
        NewStudent student2 = new NewStudent("002", "李四", 19);

        NewStudentManager manager = new NewStudentManager();
        manager.addStudents(student1);
        manager.addStudents(student2);
        manager.printStudents();

        manager.removeStudent(student1);
        manager.printStudents();

        student2.study();
        student2.sleep();

        Color color1 = Color.RED;
        Color color2 = Color.RED;

        System.out.println(color1 == color2);
        System.out.println(color1.equals(color2));
        System.out.println(color1.compareTo(color2));

        for(Color color: Color.values()) {
            System.out.println(color);
        }
    }
}
