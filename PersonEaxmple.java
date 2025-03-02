import java.util.Objects;

public class PersonEaxmple {
    private String name;
    private int age;

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

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        PersonEaxmple personEaxmple = (PersonEaxmple) obj;
        return age == personEaxmple.age && Objects.equals(name ,((PersonEaxmple) obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age =" + age +
                '}';
    }

    public void printClassName() {
        System.out.println("类名： " + getClass().getName());
        System.out.println("包名： " + getClass().getPackage().getName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PersonEaxmple personEaxmple = new PersonEaxmple();
        PersonEaxmple personEaxmple1 = new PersonEaxmple();

        personEaxmple.setAge(10);
        personEaxmple.setName("Pete");

        personEaxmple1.setName("Jack");
        personEaxmple1.setAge(7);

        if (personEaxmple.equals(personEaxmple1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("hashCode : " + personEaxmple.hashCode());
        System.out.println("PersonExample: " + personEaxmple);

        personEaxmple.printClassName();

        Object personExample2 = personEaxmple.clone();
        System.out.println("PersonExample2: " + personExample2);



    }

}
