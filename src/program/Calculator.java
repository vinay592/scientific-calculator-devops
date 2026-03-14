import java.util.Scanner;

public class Calculator
{
    public static double squareRoot(double n)
    {
        return Math.sqrt(n);
    }

    public static int factorial(int n)
    {
        int fact = 1;

        for(int i=1;i<=n;i++)
            fact = fact * i;

        return fact;
    }

    public static double naturalLog(double n)
    {
        return Math.log(n);
    }

    public static double power(double a,double b)
    {
        return Math.pow(a,b);
    }

    public static double add(double a,double b)
    {
        return a+b;
    }

    public static double subtract(double a,double b)
    {
        return a-b;
    }

    public static double multiply(double a,double b)
    {
        return a*b;
    }

    public static double divide(double a,double b)
    {
        return a/b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println();
            System.out.println("1 Square Root");
            System.out.println("2 Factorial");
            System.out.println("3 Natural Log");
            System.out.println("4 Power");
            System.out.println("5 Addition");
            System.out.println("6 Subtraction");
            System.out.println("7 Multiplication");
            System.out.println("8 Division");
            System.out.println("9 Exit");

            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            if(choice==1)
            {
                System.out.print("Enter number : ");
                double n = sc.nextDouble();

                System.out.println("Result : "+squareRoot(n));
            }

            else if(choice==2)
            {
                System.out.print("Enter number : ");
                int n = sc.nextInt();

                System.out.println("Result : "+factorial(n));
            }

            else if(choice==3)
            {
                System.out.print("Enter number : ");
                double n = sc.nextDouble();

                System.out.println("Result : "+naturalLog(n));
            }

            else if(choice==4)
            {
                System.out.print("Enter first number : ");
                double a = sc.nextDouble();

                System.out.print("Enter second number : ");
                double b = sc.nextDouble();

                System.out.println("Result : "+power(a,b));
            }

            else if(choice==5)
            {
                System.out.print("Enter first number : ");
                double a = sc.nextDouble();

                System.out.print("Enter second number : ");
                double b = sc.nextDouble();

                System.out.println("Result : "+add(a,b));
            }

            else if(choice==6)
            {
                System.out.print("Enter first number : ");
                double a = sc.nextDouble();

                System.out.print("Enter second number : ");
                double b = sc.nextDouble();

                System.out.println("Result : "+subtract(a,b));
            }

            else if(choice==7)
            {
                System.out.print("Enter first number : ");
                double a = sc.nextDouble();

                System.out.print("Enter second number : ");
                double b = sc.nextDouble();

                System.out.println("Result : "+multiply(a,b));
            }

            else if(choice==8)
            {
                System.out.print("Enter first number : ");
                double a = sc.nextDouble();

                System.out.print("Enter second number : ");
                double b = sc.nextDouble();

                System.out.println("Result : "+divide(a,b));
            }

            else
                break;
        }
    }
}
// test web
