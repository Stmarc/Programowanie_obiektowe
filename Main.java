
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {



    public static int zad1()
    {
        Random rand = new Random();
        int a = rand.nextInt(100);
        return a;


    }

    public static void zad11()
    {
        int srednia=0;
        int suma=0;
        int sredniaeach=0;
        int sumaeach=0;
        int tab[]= new int[10];
        for(int i=0;i<10;i++)
        {
            tab[i]=zad1();
        }
        for(int i=0;i<10;i++)
        {
            srednia=srednia+tab[i];
            suma=suma+tab[i];
        }

        for(int x:tab)
        {
            sredniaeach=sredniaeach+x;
            sumaeach=sumaeach+x;
        }



        System.out.println("Suma to "+suma);
        System.out.println("srednia to "+srednia/tab.length);
        System.out.println("Suma each to "+sumaeach);
        System.out.println("srednia each to "+sredniaeach/tab.length);
    }





    public static void zad2()
    {

        int[] tab1={1,2,3,4,5,6,7,8,9,10};
        int[] tab2={1,2,3,4,5,6,7,8,9};

        for(int i=0;i<10;i=i+2)
        {
            System.out.println(tab1[i]);
        }
        for(int i=0;i<9;i=i+2)
        {
            System.out.println(tab2[i]);
        }

    }


    public static void zad3()
    {
        String[] tab1={"Ala ","ma"," kota"};


        for(String x:tab1)
        {
            System.out.println(x.toUpperCase());
        }
    }

    public static String getstring(){
        Scanner scan = new Scanner(System.in);
        String imie  = scan.nextLine();
        return imie;
    }
    public static int getint(){
        Scanner scan = new Scanner(System.in);
        int imie  = scan.nextInt();
        return imie;
    }


    public static void zad4()
    {
        String tab[]= new String[5];

        for(int i=0;i<5;i++)
        {
            tab[i]=getstring();
        }

        for(int i= tab.length-1;i>=0;i--)
        {
            for(int j= tab[i].length()-1;j>=0;j--)
            {
                System.out.println(tab[i].charAt(j));
            }

        }
    }

    public static void zad5()
    {
        int tab[]= new int[8];

        for(int i=0;i<8;i++)
        {
            tab[i]=zad1();
            System.out.println(tab[i]);
        }


        System.out.print("--------------");


        int temp;
        int zmiana=1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }

        for(int i=0;i<8;i++)
        {

            System.out.println(tab[i]);
        }
        for(int i=0;i<8;i++)
        {
            tab[i]=zad1();
            System.out.println(tab[i]);
        }

        Arrays.sort(tab);

        for(int i=0;i<8;i++)
        {

            System.out.println(tab[i]);
        }

    }


    public static void zad6(){
        int tab[]= new int[5];
        int silnia[]= new int[5];


        for(int i=0;i<5;i++)
        {
            tab[i]=getint();
        }
        for(int i=0;i<5;i++)
        {
            silnia[i]=silnia(tab[i]);
        }

        for(int i=0;i<5;i++)
        {
            System.out.print(silnia[i]+ " ");

        }

    }

    static int silnia(int n){
        if(n>1)
            return n*silnia(n-1);
        else
            return 1;
    }


    public static void zad7()
    {

        String[] tab1={"Ala ","ma"," kota"};
        String[] tab2={"Ala ","ma"," kota"};
        int len=tab1.length;
        int temp=0;
        for(int i=0;i<tab1.length;i++)
        {
            if(tab1[i] == tab2[i])
            {
                temp++;
            }

        }
        if(temp==len)
        {
            System.out.println("\n takie same");
        }
        else {
            System.out.println("\n nie sÄ… takie same");
        }


    }

















}