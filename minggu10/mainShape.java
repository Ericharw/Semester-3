public class mainShape {
    public static void main(String[] args) {
        shape circle = new circle(5.0);
        shape rectangle = new rectangle(4.0, 6.0); 

        System.out.println("Circle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
