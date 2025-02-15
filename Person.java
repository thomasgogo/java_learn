public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void updateAge() {
        this.age++;
    }

    public static void main(String[] args) {
        Person  person = new Person("John", 25);
        person.printInfo();

        person.changeName("Mike");
        person.updateAge();

        person.printInfo();
    }
}
