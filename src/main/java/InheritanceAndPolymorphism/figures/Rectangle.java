package InheritanceAndPolymorphism.figures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Rectangle {
    private int width;
    private int height;
    private LocalDateTime createDate = LocalDateTime.now();

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare(){
        return width*height;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
