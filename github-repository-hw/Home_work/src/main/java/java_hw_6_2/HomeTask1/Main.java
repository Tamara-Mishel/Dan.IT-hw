package java_hw_6_2.HomeTask1;

public class Main {

    public static void main(String[] args) {

        Figure square = new Square(5);
        Figure triangle = new Triangle(10, 6, 7, 8, 9);
        Figure circle = new Circle(3);

        Figure[] figures = {square, triangle, circle};

        for (Figure f : figures) {
            System.out.println(f);
            System.out.println("Area = " + f.getArea());
            System.out.println("Perimeter = " + f.getPerimeter());
            System.out.println("-------------------");
        }
    }
}
