
import java.util.Scanner;
public class Main {

    public static String lab1_1() {
        return "Marcin 23";
    }

    public static void lab1_2(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static boolean lab1_3(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lab1_4(int a) {
        if (Math.abs(a) % 10 == 0 | Math.abs(a) % 10 == 5) {
            return true;
        } else {
            return false;
        }
    }

    public static double lab1_5(double a) {
        return Math.pow(a, 3);
    }

    public static double lab1_6(double a) {
        return Math.sqrt(a);
    }

    public static boolean lab1_7(int a, int b, int c) {
        if (a > b && a > c && b + c > a)
            return true;
        else if (b > a && b > c && a + c > b)
            return true;
        else if (c > a && c > b && a + b > c)
            return true;

        else
            return false;

    }

    public static void lab2_2()
    {

        double x,a_x,b_x,c_x;
       c_x=0;
       b_x=0;
       a_x=0;
        Scanner input = new Scanner(System.in);
        System.out.println("podaj x: ");
        x=getInt();

        if(x>0)
        {
            a_x=2*x;
        }
        else if (x==0) {
            a_x=0;

        } else if (x<0)
        {
            a_x=(-1)*(3*x);

        }

        if(x>=0)
        {
            b_x=Math.pow(x,2);
        }
        else if (x<1)
        {
            b_x=x;

        }



        if(x>2)
        {
            c_x=2+x;
        }
        else if (x==2) {
            c_x=8;

        } else if (x<2)
        {
            c_x=x-4;

        }

        System.out.println("a(x)= "+ a_x);
        System.out.println("b(x)= "+ b_x);
        System.out.println("c(x)= "+ c_x);







    }

    public static void lab2_3()
    {
        int x,y,z;
        Scanner input = new Scanner(System.in);
        System.out.println("podaj x: ");
        x=getInt();
        System.out.println("podaj y: ");
        y=getInt();
        System.out.println("podaj z: ");
        z=getInt();


        int tmp;

        if (x > y) { tmp = x; x = y; y = tmp; }
        if (x > z) { tmp = x; x = z; z = tmp; }
        if (y > z) { tmp = y; y = z; z = tmp; }

        System.out.println(x + " " + y + " " + z);



    }

    public static void lab3_1()
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Liczba studentow: ");
        n=getInt();
        int i=0;
        int suma=0;
        int temp=0;
        while(n>i)
        {
            System.out.println("Ocena: ");
            temp=getInt();
            suma=suma+temp;
            i++;
        }

        System.out.println("Srednia to: "+ suma/n);
    }



    public static void lab3_2()
    {
        int ujemne=0;
        int dodatnie=0;
        int temp=0;

        Scanner input = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {

            System.out.println("Liczba: ");
            temp=getInt();

            if(temp>=0){
                dodatnie++;
            }
            else {
                ujemne++;
            }

        }

        System.out.println("Liczba ujemnych = "+ ujemne);
        System.out.println("Liczba dodatnie = "+ dodatnie);

    }

    public static void lab3_3()
    {
        int n=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Podaj n= ");
            n=getInt();
        }
        while(n<=0);
        int temp=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                temp=temp+i;
                }
            }

        System.out.println("Suma to "+temp);
        }






























    public static int getInt()
    {
        return new Scanner(System.in).nextInt();

    }



















}