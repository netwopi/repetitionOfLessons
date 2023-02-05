package InheritanceAndPolymorphism.figures;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square.getSquare());
        System.out.println(square.getCreateDate());
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Square square1 = new Square(20);
        System.out.println(square1.getSquare());
        System.out.println(square1.getCreateDate());
        Circle circle = new Circle(10);
        System.out.println(circle.getSquare());
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.getSquare());
    }
}
