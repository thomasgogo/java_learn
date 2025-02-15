public class exceptionExample {

    public static int divide(int dividend, int divisor) throws Exception {
        if (divisor == 0) {
            throw new ArithmeticException("除数不能为零! ");
        }
        return dividend / divisor;
    }


    public static void main(String[] args) {

    }
}
