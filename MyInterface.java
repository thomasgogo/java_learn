public interface MyInterface {
    int MAX_VALUE = 100;

    void doSomething();
    int calculate(int a, int b);

    default void doSomethingElse(){
        System.out.println("print Else something");
    }

    static void doStaticMethod() {
        System.out.println("静态方法的实现");
    }
}


//[访问修饰符] interface 接口名 [extends 父接口1, 父接口2, ...] {
//        常量的定义
//        方法的声明
//        }