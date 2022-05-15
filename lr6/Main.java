import java.util.Scanner;

public class Main {
    public static int [] sostoyanieArray = new int [30];
    public static int sostoyanie;
    public static String[] lenta = new String[150];
    public static int index=4;

    public static void main(String[] args)
    {
        for (int i=0;i<lenta.length;i++)
        {
            lenta[i]="_";
        }
        input_binary();
        index=4;
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
                case 7:
                    sostoyanie7();
                    break;
                case 8:
                    sostoyanie8();
                    break;
                default:
                    break;
            }
            step++;
        }
        unary_to_binary();
        System.out.println("\nResult poluchen za "+step+" shagov");
    }
    public static void sostoyanie1()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="_";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="_";
            sostoyanie=8;
            index++;
        }
    }
    public static void sostoyanie2()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="_";
            sostoyanie=3;
            index++;
        }
    }
    public static void sostoyanie3()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=3;
            index++;
        }
        else if (lenta[index]=="*")
        {
            lenta[index]="*";
            sostoyanie=3;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="_";
            sostoyanie=4;
            index--;
        }
    }
    public static void sostoyanie4()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="*";
            sostoyanie=5;
            index++;
        }
        else if (lenta[index]=="*")
        {
            lenta[index]="*";
            sostoyanie=4;
            index--;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="_";
            sostoyanie=7;
            index--;
        }
    }
    public static void sostoyanie5()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=5;
            index++;
        }
        else if (lenta[index]=="*")
        {
            lenta[index]="*";
            sostoyanie=5;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="1";
            sostoyanie=6;
            index--;
        }
    }
    public static void sostoyanie6()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=6;
            index--;
        }
        else if (lenta[index]=="*")
        {
            lenta[index]="*";
            sostoyanie=4;
            index--;
        }
    }
    public static void sostoyanie7()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=7;
            index--;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="_";
            sostoyanie=1;
            index++;
        }
    }
    public static void sostoyanie8()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="_";
            sostoyanie=8;
            index++;
        }
        else if (lenta[index]=="*")
        {
            lenta[index]="1";
            sostoyanie=8;
            index++;
        }
        else if (lenta[index]=="_")
        {
            sostoyanie=0;
        }
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
    public static void input_binary()
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        num1 = Integer.parseInt(Integer.toString(num1),2);
        for (int i=0;i<num1;i++)
        {
            lenta[index]="1";
            index++;
        }
        index++;
        int num2 = in.nextInt();
        num2 = Integer.parseInt(Integer.toString(num2),2);
        for (int i=0;i<num2;i++)
        {
            lenta[index]="1";
            index++;
        }

    }
    public static void unary_to_binary()
    {
        int result=0;
        for (int i=0;i<lenta.length;i++)
        {
            if (lenta[i]=="1")
            {
                result++;
            }
        }
        System.out.println("Result in decimal: "+result);
        System.out.println("Result in binary:  "+Integer.toBinaryString(result));
    }

}


