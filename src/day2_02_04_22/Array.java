package day2_02_04_22;

import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1,2,3,4,5};

        int arr[] = new int[5];

        // int arr1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i=0; i<5; i++)
        {
        	System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int i: arr)
        {
            // System.out.print(i + " ");

            switch (i) {
                case 1:
                    System.out.println("one");
                    break;

                case 2:
                    System.out.println("two");
                    break;
                
                case 3:
                    System.out.println("three");
                    break;
                
                case 4:
                    System.out.println("four");
                    break;

                case 5:
                    System.out.println("five");
                    break;
            
                default:
                    break;
            }
        }
        // System.out.println();

    }
}

// public class Array {
//     public static void main(String args[]) {
 
//        first:
//           for (int i = 0; i < 3; i++) {
//              for (int j = 0; j < 3; j++){
//                 if(i == 1){
//                    continue first;
//                 }
//                 System.out.print(" [i = " + i + ", j = " + j + "] ");
//              }
//           }
//         System.out.println();
      
//        second:
//           for (int i = 0; i < 3; i++) {
//              for (int j = 0; j < 3; j++){
//                 if(i == 1){
//                    break second;
//                 }
//                 System.out.print(" [i = " + i + ", j = " + j + "] ");
//              }
//           }
//     }
//  }