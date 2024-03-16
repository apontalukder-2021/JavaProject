import java.util.Scanner;
public class RectanglePerimeterDiagonal {
    public double Perimeter(double x,double y)
    {
        double z = 2 * (x + y);
        return z;
    }
    public double DiagonalLength(double x,double y)
    {
        double d=Math.pow(x,2)+Math.pow(y,2);
        return Math.sqrt(d);
    }

    public static void main(String[] args) {
        RectanglePerimeterDiagonal rectanglePerimeterDiagonal1= new RectanglePerimeterDiagonal();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Give me a first Value:");
        double x= sc.nextDouble();
        System.out.printf("Give me a 2nd Value:");
        double y= sc.nextDouble();
        System.out.printf("Perimeter: %.2f\n",rectanglePerimeterDiagonal1.Perimeter(x,y));
        System.out.printf("Digonallength: %.2f\n",rectanglePerimeterDiagonal1.DiagonalLength(x,y));

    }
}
