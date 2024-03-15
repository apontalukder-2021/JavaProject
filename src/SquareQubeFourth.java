import java.util.Scanner;
public class SquareQubeFourth {
    public double Square(double x)
    {
        return Math.pow(x,2);
    }
    public double Qube(double x)
    {
        return Math.pow(x,3);
    }
    public double Fourth(double x)
    {
        return Math.pow(x,4);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        SquareQubeFourth squareQubeFourth1= new SquareQubeFourth();
        System.out.printf("Give me a Value:");
        double x= sc.nextDouble();

        System.out.printf("Square: %.2f\n",squareQubeFourth1.Square(x));
        System.out.printf("Qube:   %.2f\n",squareQubeFourth1.Qube(x));
        System.out.printf("Fourth: %.2f\n",squareQubeFourth1.Fourth(x));

    }
}
