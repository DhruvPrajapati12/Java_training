package day2_02_04_22;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String search;
        String emp[][] = new String[3][3];

        // System.out.println("Enter the details: ");
        emp[0][0] = "Om";
        emp[0][1] = "1994";
        emp[0][2] = "64C- WallsStreat";

        emp[1][0] = "Dhruv";
        emp[1][1] = "2000";
        emp[1][2] = "68D- WallsStreat";

        emp[2][0] = "Het";
        emp[2][1] = "1999";
        emp[2][2] = "26B- WallsStreat";

        System.out.println("Details are below: ");
        System.out.println("------------------------------");
        System.out.println("Name        Year     Address");
        
        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<3; j++)
        //     {
        //         System.out.print(emp[i][j]+"        ");
        //     }
        //     System.out.println();
        // }

        for(String row[]: emp)
        {
            for(String data: row)
            {
                System.out.print(data+ "      ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");

        System.out.print("Enter name for search: ");
        search = sc.nextLine();

        sc.close();

        System.out.println("Details are below: ");
        System.out.println("------------------------------");
        System.out.println("Name        Year     Address");
        for(int i=0; i<3; i++)
        {
                if(emp[i][0].equals(search))
                {
                    for(int j=0; j<3; j++)
                    {
                        System.out.print(emp[i][j] + "        ");
                    }
                }

        }
        System.out.println();
        System.out.println("------------------------------");
    }
}
