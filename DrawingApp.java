import java.util.ArrayList;
import java.util.List;

public class DrawingApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        for( Shape shape: shapes) {
            shape.draw();
        }
    }
}
