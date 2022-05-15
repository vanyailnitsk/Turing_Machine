import java.util.Scanner;
//0000011110111
public class Main {
    public static int [] sostoyanieArray = new int [30];
    public static int sostoyanie;
    public static String[] lenta = new String[50];
    public static int index=4;

    public static void main(String[] args)
    {
        for (int i=0;i<lenta.length;i++)
        {
            lenta[i]="0";
        }
        /*input_binary();
        for (int i=5;i<10;i++)
        {
            lenta[i]="1";
        }
        for (int i=11;i<14;i++)
        {
            lenta[i]="1";
        }*/
        input();
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
                case 9:
                    sostoyanie9();
                    break;
                case 10:
                    sostoyanie10();
                    break;
                case 11:
                    sostoyanie11();
                    break;
                case 12:
                    sostoyanie12();
                    break;
                case 13:
                    sostoyanie13();
                    break;
                case 14:
                    sostoyanie14();
                    break;
                case 15:
                    sostoyanie15();
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
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=2;
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
        else if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=3;
            index++;
        }
    }
    public static void sostoyanie3()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=4;
            index--;
        }
        
    }
    public static void sostoyanie4()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=5;
            index--;
        }
    }
    public static void sostoyanie5()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=13;
        }
        else if (lenta[index]=="1")
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
        else if (lenta[index]=="0")
        {
            lenta[index]="1";
            sostoyanie=7;
            index++;
        }
    }
    public static void sostoyanie7()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="0";
            sostoyanie=8;
            index++;
        }
    }
    public static void sostoyanie8()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=8;
            index++;
        }
        else if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=9;
            index++;
        }
    }
    public static void sostoyanie9()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=9;
            index++;
        }
        else if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=10;
            index++;
        }
    }
    public static void sostoyanie10()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=10;
            index++;
        }
        else if (lenta[index]=="0")
        {
            lenta[index]="1";
            sostoyanie=11;
            index--;
        }
    }
    public static void sostoyanie11()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=11;
            index--;
        }
        else if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=12;
            index--;
        }
    }
    public static void sostoyanie12()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=12;
            index--;
        }
        else if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=4;
        }
    }
    public static void sostoyanie13()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="1";
            sostoyanie=14;
            index--;
        }
    }
    public static void sostoyanie14()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=14;
            index--;
        }
        else if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=15;
            index++;
        }
    }
    public static void sostoyanie15()
    {
        lenta[index]="0";
        sostoyanie=0;
    }
    public static void input()
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int temp_index = index+1;
        for (int i=0;i<a;i++)
        {
            lenta[temp_index] = "1";
            temp_index++;
        }
        temp_index++;
        for (int i=0;i<b;i++)
        {
            lenta[temp_index] = "1";
            temp_index++;
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


}


