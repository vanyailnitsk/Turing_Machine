import java.util.Scanner;

public class Main {
    public static int [] sostoyanieArray = new int [30];
    public static int sostoyanie;
    public static String[] lenta = new String[50];
    public static int index=4;

    public static void main(String[] args)
    {
        input();
        index=1;
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
                case 16:
                    sostoyanie16();
                    break;
                case 17:
                    sostoyanie17();
                    break;
                default:
                    break;
            }
            step++;
        }
        System.out.println("\nResult poluchen za "+step+" shagov");
    }
    public static void input()
    {
        for (int i=0;i<lenta.length;i++)
        {
            lenta[i]="_";
        }
        lenta[0]="#";
        for (int i=1;i<9;i++)
        {
            lenta[i]="0";
        }
        lenta[9]="!";
        lenta[10]="1";
        lenta[11]="0";
        lenta[12]="1";
        lenta[13]="?";
        for (int i=14;i<22;i++)
        {
            lenta[i]="@";
        }
        lenta[22]="!";
        lenta[23]="1";
        lenta[24]="0";
        lenta[25]="1";
        lenta[26]="1";
        lenta[27]="#";

    }
    public static void sostoyanie1()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="#")
        {
            lenta[index]="#";
            sostoyanie=8;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="@";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="z")
        {
            lenta[index]="z";
            sostoyanie=1;
            index++;
        }
        else if (lenta[index]=="o")
        {
            lenta[index]="o";
            sostoyanie=1;
            index++;
        }
    }
    public static void sostoyanie2()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="#")
        {
            lenta[index]="#";
            sostoyanie=3;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="@";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="z")
        {
            lenta[index]="z";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="o")
        {
            lenta[index]="o";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="x")
        {
            lenta[index]="x";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="#";
            sostoyanie=2;
            index--;
        }
    }
    public static void sostoyanie3()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="z";
            sostoyanie=4;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="o";
            sostoyanie=5;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=6;
            index--;
        }
        else if (lenta[index]=="z")
        {
            lenta[index]="z";
            sostoyanie=3;
            index--;
        }
        else if (lenta[index]=="o")
        {
            lenta[index]="o";
            sostoyanie=3;
            index--;
        }
    }
    public static void sostoyanie4()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=4;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=4;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=4;
            index--;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="0";
            sostoyanie=2;
            index++;
        }
    }
    public static void sostoyanie5()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=5;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=5;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=5;
            index--;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="1";
            sostoyanie=2;
            index++;
        }
    }
    public static void sostoyanie6()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=6;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=6;
            index--;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=7;
            index++;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="0";
            sostoyanie=6;
            index--;
        }
    }
    public static void sostoyanie7()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=7;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=7;
            index++;
        }
        else if (lenta[index]=="#")
        {
            lenta[index]="#";
            sostoyanie=10;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=7;
            index++;
        }
        else if (lenta[index]=="z")
        {
            lenta[index]="0";
            sostoyanie=7;
            index++;
        }
        else if (lenta[index]=="o")
        {
            lenta[index]="1";
            sostoyanie=7;
            index++;
        }
    }
    public static void sostoyanie8()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=8;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=8;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=8;
            index--;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=9;
            index--;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="@";
            sostoyanie=8;
            index--;
        }
    }
    public static void sostoyanie9()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="x";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="x";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=0;
        }
        else if (lenta[index]=="x")
        {
            lenta[index]="x";
            sostoyanie=9;
            index--;
        }
    }
    public static void sostoyanie10()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=10;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=10;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=11;
            index--;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=10;
            index--;
        }
        else if (lenta[index]=="x")
        {
            lenta[index]="x";
            sostoyanie=10;
            index--;
        }
    }
    public static void sostoyanie11()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="1";
            sostoyanie=11;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="0";
            sostoyanie=12;
            index--;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=16;
            index++;
        }
    }
    public static void sostoyanie12()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=12;
            index--;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=12;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=13;
            index--;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=12;
            index--;
        }
        else if (lenta[index]=="x")
        {
            lenta[index]="x";
            sostoyanie=12;
            index--;
        }
    }
    public static void sostoyanie13()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="1";
            sostoyanie=14;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="0";
            sostoyanie=13;
            index--;
        }
        else if (lenta[index]=="#")
        {
            lenta[index]="#";
            sostoyanie=14;
            index++;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="1";
            sostoyanie=14;
            index++;
        }
    }
    public static void sostoyanie14()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=14;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=14;
            index++;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=14;
            index++;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=15;
            index++;
        }
        else if (lenta[index]=="x")
        {
            lenta[index]="x";
            sostoyanie=14;
            index++;
        }
    }
    public static void sostoyanie15()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=15;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=15;
            index++;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=11;
            index--;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="@";
            sostoyanie=15;
            index++;
        }
    }
    public static void sostoyanie16()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="@";
            sostoyanie=16;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="@";
            sostoyanie=16;
            index++;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="@";
            sostoyanie=16;
            index++;
        }
    }
    public static void sostoyanie17()
    {
        if (lenta[index]=="0")
        {
            lenta[index]="0";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="#")
        {
            lenta[index]="0";
            sostoyanie=8;
            index--;
        }
        else if (lenta[index]=="!")
        {
            lenta[index]="!";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="?")
        {
            lenta[index]="?";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="@")
        {
            lenta[index]="@";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="x")
        {
            lenta[index]="x";
            sostoyanie=17;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="0";
            sostoyanie=8;
            index--;
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


