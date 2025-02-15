public class OuterClass {
    private int outerVariable = 10;

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    class InnerClass {
        private int innerVariable = 20;

        public void innerMethod() {
            System.out.println("内部类访问外部类的变量: " + outerVariable);
            System.out.println("外部类访问内部类的变量: " + innerVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}
