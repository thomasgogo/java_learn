import java.util.HashMap;

public class StudentManagementSystem {
    private HashMap<String, String> studentMap;

    public StudentManagementSystem() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String id, String name){
        studentMap.put(id, name);
    }

    public String getStudentName(String id){
        return studentMap.get(id);
    }

    public boolean isStudentExist(String id){
        return studentMap.containsKey(id);
    }

    public void removeStudent(String id){
        studentMap.remove(id);
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        system.addStudent("20210001", "张三");
        system.addStudent("20210002", "李四");
        system.addStudent("20210003", "王五");

        String name = system.getStudentName("20210002");
        System.out.println("学号为20210002的学生姓名为: " + name);

        boolean isStudentExist = system.isStudentExist("20210004");
        System.out.println("学号为20210004的学生是否在校: " + isStudentExist);

        system.removeStudent("20210001");
        String name1 = system.getStudentName("20210001");
        System.out.println("学号为20210001的学生姓名为: " + name1);
        System.out.println(system);

    }

}
