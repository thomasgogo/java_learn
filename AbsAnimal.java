public abstract class AbsAnimal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("动物正在睡觉");
    }

    public AbsAnimal() {
        System.out.println("动物创建了. ");
    }
}
