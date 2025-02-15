public class OuterClass3 {
    public void outerMethod() {
        final int outerVariable = 11;

        class InnerClass {
            private int innerVariable = 20;

            public void innerMethod() {
                System.out.println("内部类访问外部类的变量：" + outerVariable);
                System.out.println("外部类访问内部类的变量：" + innerVariable);
            }
        }
        InnerClass inner = new InnerClass();
        inner.innerMethod();

    }

    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.outerMethod();
    }
}
