public class NewStudent {
    private String id;
    private String name;
    private int age;

    public NewStudent(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    //public static void main(String[] args) {
    //    NewStudent newStudent = new NewStudent();
    //    newStudent.setName("张三");
    //    newStudent.setAge(24);
    //
    //    System.out.println(newStudent.getName());
    //    System.out.println(newStudent.getAge());
    //    System.out.println(newStudent.getClass());
    //
    //}
}
