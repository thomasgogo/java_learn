public class Outer {
    private static int count = 0;

    public static class Inner {
        public void displayCount() {
            System.out.println("Count: " + Outer.count);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.displayCount();

    }

}
