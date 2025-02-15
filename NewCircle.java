public final class NewCircle {
    private final double radius;

    public NewCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        NewCircle circle = new NewCircle(5.0);
        System.out.println("Area: " + circle.getArea());
    }
}
