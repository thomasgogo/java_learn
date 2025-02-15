public class AbsMain {
    public static void main(String[] args) {
        AbsAnimal cat = new AbsCat();
        AbsAnimal dog = new AbsDog();

        cat.makeSound();
        dog.makeSound();

        cat.sleep();
        dog.sleep();
    }
}
