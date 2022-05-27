import java.util.Scanner;

public class Main {
    public static int sostoyanie;
    public static String[] lenta = new String[150];
    public static int index=4;

    public static void main(String[] args)
    {
        //PART1
        System.out.println("PART 1");
        for (int i=0;i<lenta.length;i++)
        {
            lenta[i]="_";
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
                    check = 0;
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


        //PART 2
        for (int i=0;i<lenta.length;i++)
        {
            lenta[i]="_";
        }
        sostoyanie=1;
        check=1;
        step=1;
        System.out.println("PART 1");
        input();
        while (check==1) {
            print_LENTA();
            print_sostoyanie();
            switch (sostoyanie) {
                case 0:
                    check = 0;
                    break;
                case 1:
                    sostoyanie1();
                    break;
                case 2:
                    sostoyanie2_2();
                    break;
                case 3:
                    sostoyanie2_3();
                    break;
                case 4:
                    sostoyanie2_4();
                    break;
                case 5:
                    sostoyanie2_5();
                    break;
                case 6:
                    sostoyanie2_6();
                    break;
                case 7:
                    sostoyanie2_7();
                    break;
                default:
                    break;
            }
            step++;
        }



    }
    public static void sostoyanie1()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="_")
        {
            lenta[index]="A";
            sostoyanie=0;
        }
    }
    public static void sostoyanie2()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=3;
            index++;
        }
        else if (lenta[index]=="A")
        {
            lenta[index]="A";
            sostoyanie=4;
            index--;
        }
    }
    public static void sostoyanie3()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="A") {
            lenta[index] = "A";
            sostoyanie = 5;
            index--;
        }
    }
    public static void sostoyanie4()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="A";
            sostoyanie=4;
            index--;
        }
        else if (lenta[index]=="A")
        {
            lenta[index]="A";
            sostoyanie=6;
            index++;
        }
    }
    public static void sostoyanie5()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="A";
            sostoyanie=5;
            index--;
        }
        else if (lenta[index]=="A")
        {
            lenta[index]="A";
            sostoyanie=0;
            index++;
        }
    }
    public static void sostoyanie6()
    {
        if (lenta[index]=="A")
        {
            lenta[index]="1";
            sostoyanie=0;
        }
    }

    public static void sostoyanie2_2()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=3;
            index++;
        }
        else if (lenta[index]=="A") {
            lenta[index] = "A";
            sostoyanie = 4;
            index++;
        }
    }
    public static void sostoyanie2_3()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="1";
            sostoyanie=2;
            index++;
        }
        else if (lenta[index]=="A") {
            lenta[index] = "A";
            sostoyanie = 5;
            index++;
        }
    }
    public static void sostoyanie2_4()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="A";
            sostoyanie=4;
            index++;
        }
        else if (lenta[index]=="A")
        {
            lenta[index]="A";
            sostoyanie=6;
            index++;
        }
        else if (lenta[index]=="_")
        {
            sostoyanie=7;
            index++;
        }
    }
    public static void sostoyanie2_5()
    {
        if (lenta[index]=="1")
        {
            lenta[index]="A";
            sostoyanie=5;
            index++;
        }
        else if (lenta[index]=="_")
        {
            sostoyanie=6;
            index++;
        }
    }
    public static void sostoyanie2_6()
    {
        lenta[index]="0";
        sostoyanie=0;
    }
    public static void sostoyanie2_7()
    {
        lenta[index]="1";
        sostoyanie=0;
    }


    public static void input()
    {
        lenta[index-1]="A";
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i=0;i<a;i++)
        {
            lenta[index+i]="1";
        }
        lenta[index+a]="A";

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


