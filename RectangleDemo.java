class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0, 3.0);

        System.out.println("Length = " + r.length);
        System.out.println("Width = " + r.width);
        System.out.println("Area = " + r.calculateArea());
    }
}
