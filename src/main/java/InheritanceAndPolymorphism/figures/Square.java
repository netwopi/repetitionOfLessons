package InheritanceAndPolymorphism.figures;

public class Square extends Rectangle{
    public Square(int width, int height) {
        super(width, height);
    }

    public Square(int width) {
        super(width , width);
    }


    public void setWidth(int width) {
        this.setWidth(width);
        height = width;
    }


    public void setHeight(int height) {
        this.setHeight(height);
        width = height;
    }
}
