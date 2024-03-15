
import java.util.Scanner;

public class ProperlyAligned {
    public double Sum(double x,double y)
    {
        return x+y;
    }
    public double Difference(double x,double y)
    {
        return x-y;
    }
    public double Product(double x,double y)
    {
        return x*y;
    } public double Average(double x,double y)
    {
        return (x+y)/2;
    }
    public double Distances(double x,double y)
    {
        return Math.abs(x-y);
    }
    public double Max(double x,double y)
    {
        return Math.max(x,y);
    }
    public double Min(double x,double y)
    {
        return Math.min(x,y);
    }

    public static void main(String[] args) {
        ProperlyAligned properlyAligned1 = new ProperlyAligned();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter First Value:");
        double x= sc.nextDouble();
        System.out.printf("Enter Second Value:");
        double y= sc.nextDouble();
        System.out.printf("Sum :        %.2f\n",properlyAligned1.Sum(x,y));
        System.out.printf("difference: %.2f\n",properlyAligned1.Difference(x,y));
        System.out.printf("Product:     %.2f\n",properlyAligned1.Product(x,y));
        System.out.printf("Average:     %.2f\n",properlyAligned1.Average(x,y));
        System.out.printf("Distance :   %.2f\n",properlyAligned1.Distances(x,y));
        System.out.printf("Max:         %.2f\n",properlyAligned1.Max(x,y));
        System.out.printf("Min :        %.2f\n",properlyAligned1.Min(x,y));
    }

}
