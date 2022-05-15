import java.util.Scanner;
//0000011110111
public class Main {
    public static int [] sostoyanieArray = new int [30];
    public static int sostoyanie;
    public static String[] lenta = new String[50];
    public static int index=7;

    public static void main(String[] args)
    {
        for (int i=0;i<lenta.length;i++) {
            lenta[i] = "_";
        }

        input();
        sostoyanie=1;
        int check=1;
        int step=1;
        while (check==1) {
            print_LENTA();
            print_sostoyanie();
            switch (sostoyanie) {
                case 0:
                    check=0;
                    break;
                case 1:
                    sostoyanie1();
                    break;
                case 2:
                    sostoyanie2();
                    break;
                case 3:
                    sostoyanie3();
                    break;
                case 4:
                    sostoyanie4();
                    break;
                case 5:
                    sostoyanie5();
                    break;
                case 6:
                    sostoyanie6();
                    break;
                default:
                    break;
            }
            step++;
        }
        System.out.println("\nResult poluchen za "+step+" shagov");
    }
    public static void sostoyanie1()
    {
        switch(lenta[index])
        {
            case "0":
                lenta[index]="9";
                sostoyanie=1;
                index--;
                break;
            case "1":
                lenta[index]="0";
                sostoyanie=2;
                index--;
                break;
            case "2":
                lenta[index]="1";
                sostoyanie=2;
                index--;
                break;
            case "3":
                lenta[index]="2";
                sostoyanie=2;
                index--;
                break;
            case "4":
                lenta[index]="3";
                sostoyanie=2;
                index--;
                break;
            case "5":
                lenta[index]="4";
                sostoyanie=2;
                index--;
                break;
            case "6":
                lenta[index]="5";
                sostoyanie=2;
                index--;
                break;
            case "7":
                lenta[index]="6";
                sostoyanie=2;
                index--;
                break;
            case "8":
                lenta[index]="7";
                sostoyanie=2;
                index--;
                break;
            case "9":
                lenta[index]="8";
                sostoyanie=2;
                index--;
                break;
            case "-":
                lenta[index]="-";
                sostoyanie=5;
                index++;
                break;

        }
        
    }
    public static void sostoyanie2()
    {
        if (lenta[index]=="-")
        {
            sostoyanie=3;
            index--;
        }
        else if (lenta[index]=="_")
        {
            sostoyanie=5;
            index++;
        }
        else
        {
            index--;
        }
    }
    public static void sostoyanie3()
    {
        switch (lenta[index])
        {
            case "0":
                lenta[index]="9";
                sostoyanie=3;
                index--;
                break;
            case "1":
                lenta[index]="0";
                sostoyanie=4;
                index--;
                break;
            case "2":
                lenta[index]="1";
                sostoyanie=4;
                index++;
                break;
            case "3":
                lenta[index]="2";
                sostoyanie=4;
                index++;
                break;
            case "4":
                lenta[index]="3";
                sostoyanie=4;
                index++;
                break;
            case "5":
                lenta[index]="4";
                sostoyanie=4;
                index++;
                break;
            case "6":
                lenta[index]="5";
                sostoyanie=4;
                index++;
                break;
            case "7":
                lenta[index]="6";
                sostoyanie=4;
                index++;
                break;
            case "8":
                lenta[index]="7";
                sostoyanie=4;
                index++;
                break;
            case "9":
                lenta[index]="8";
                sostoyanie=4;
                index++;
                break;
            case "_":
                lenta[index]="_";
                sostoyanie=5;
                index++;
                break;
        }
        
    }
    public static void sostoyanie4()
    {
        if (lenta[index]=="-")
        {
            lenta[index]="-";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="_";
            sostoyanie=6;
            index++;
        }
        else
        {
            sostoyanie=4;
            index++;
        }
    }
    public static void sostoyanie5()
    {
        if (lenta[index]=="9")
        {
            lenta[index]="_";
            sostoyanie=5;
            index--;
        }
        else if (lenta[index]=="-")
        {
            lenta[index]="_";
            sostoyanie=5;
        }
        else
        {
            sostoyanie=0;
        }
    }
    public static void sostoyanie6()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="_";
            sostoyanie=6;
            index++;
        }
        else if (lenta[index]=="-")
        {
            lenta[index]="-";
            sostoyanie=5;
        }
        else if (lenta[index]=="_")
        {
            index++;
        }
    }


    public static void input()
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        while (true)
        {
            System.out.print("Type number1: ");
            a=in.nextInt();
            System.out.print("Type number2:  ");
            b=in.nextInt();
            if (a>=0&&a<10&&b>=0&&b<10)
            {
                break;
            }
            else
            {
                System.out.println("Incorrect numbers");
            }

        }

        lenta[index]=Integer.toString(a);
        lenta[index-1]="-";
        lenta[index-2]=Integer.toString(b);

    }
    public static void print_LENTA()
    {
        System.out.print("Lenta:     ");
        for (int i=0;i< lenta.length;i++)
        {
            System.out.print(lenta[i]+" ");
        }
        System.out.println();
    }
    public static void print_sostoyanie()
    {
        System.out.print("Sostoyanie:");
        for (int i=0;i<lenta.length;i++)
        {
            if (i==index)
            {
                System.out.print(sostoyanie+" ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println("\n");
    }


}


