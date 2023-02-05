package InheritanceAndPolymorphism.figures;

import java.time.LocalDateTime;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private LocalDateTime createDate = LocalDateTime.now();

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSquare(){
        return width*height;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
