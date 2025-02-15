public class OuterClass2 {
    private static int outerVariable = 100;

    public static void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();

    }

    static class InnerClass {
        private int innerVariable = 20;

        public void innerMethod() {
            System.out.println("内部类访问外部类的变量：" + outerVariable);
            System.out.println("外部类访问内部类的变量：" + innerVariable);
        }
    }


    public static void main(String[] args) {
        OuterClass2.outerMethod();
    }
}
