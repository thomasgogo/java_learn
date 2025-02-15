public class outerClass4 {

    public void outerMethod() {
        MyInterface anonymousClass = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类的方法实现");
            }
        };
        anonymousClass.method();
    }

    interface MyInterface {
        void method();
    }

    public static void main(String[] args) {
        outerClass4 outerClass4 = new outerClass4();
        outerClass4.outerMethod();
    }
}
