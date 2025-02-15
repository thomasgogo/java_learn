public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating.");
    }

    public void displayInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + this.breed);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bobby", "Labrador");
        dog.eat();
        dog.displayInfo();
    }
}
