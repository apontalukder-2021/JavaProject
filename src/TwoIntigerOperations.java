import java.util.Scanner;
public class TwoIntigerOperations {
    public double Add(double a,double b)
    {
        return a+b;
    }
    public double Difference(double a,double b)
    {
        return a-b;
    }
    public double Product(double a,double b)
    {
        return a*b;
    }
    public double Average(double a,double b)
    {
        return (a+b)/2;
    }
    public double Distance(double a,double b)
    {
        return Math.abs(a-b);
    }
    public double Max(double a,double b)
    {
        return Math.max(a,b);
    }
    public double Min(double a,double b)
    {
        return Math.min(a,b);
    }

    public static void main(String[] args) {
        TwoIntigerOperations twoIntigerOperations1= new TwoIntigerOperations();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter First Value:");
        double a= sc.nextDouble();
        System.out.printf("Enter Second Value:");
        double b= sc.nextDouble();

        System.out.printf("Sum:        %.2f\n",twoIntigerOperations1.Add(a,b));
        System.out.printf("Difference: %.2f\n",twoIntigerOperations1.Difference(a,b));
        System.out.printf("Product:    %.2f\n",twoIntigerOperations1.Product(a,b));
        System.out.printf("Average:    %.2f\n",twoIntigerOperations1.Average(a,b));
        System.out.printf("Distance:   %.2f\n",twoIntigerOperations1.Distance(a,b));
        System.out.printf("Max:        %.2f\n",twoIntigerOperations1.Max(a,b));
        System.out.printf("Min:        %.2f\n",twoIntigerOperations1.Min(a,b));


    }

}
