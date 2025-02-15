public class MyClass implements MyInterface {

    @Override
    public void doSomething() {
        System.out.println("do something! ");
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyInterface.doStaticMethod();
    }
}
