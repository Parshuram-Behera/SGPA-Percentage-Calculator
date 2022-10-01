package com.parshuram;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

//        Asking For The Calculation Choice

        System.out.println("If You Want To Calculate Percentage Press 1");
        System.out.println("If You Want To Calculate SGPA Press 2");
        Scanner choice = new Scanner(System.in);
        int method = choice.nextInt();

        switch (method) {
            case 1 -> {
                System.out.println("WELL COME TO THE PERCENTAGE CALCULATOR");

//                Taking The Marks For Calculation
                System.out.println("Please Enter Your Marks And Full Marks Respectively");
                Scanner marks = new Scanner(System.in);
                System.out.println("Subject 1");
                float x1 = marks.nextFloat();
                System.out.println("Full Marks of Subject 1");
                float y1 = marks.nextFloat();
                System.out.println("Subject 2");
                float x2 = marks.nextFloat();
                System.out.println("Full Marks of Subject 2");
                float y2 = marks.nextFloat();
                System.out.println("Subject 3");
                float x3 = marks.nextFloat();
                System.out.println("Full Marks of Subject 3");
                float y3 = marks.nextFloat();
                System.out.println("Subject 4");
                float x4 = marks.nextFloat();
                System.out.println("Full Marks of Subject 4");
                float y4 = marks.nextFloat();
                System.out.println("Subject 5");
                float x5 = marks.nextFloat();
                System.out.println("Full Marks of Subject 5");
                float y5 = marks.nextFloat();

//                Calculating The Percentage
                float mark = x1 + x2 + x3 + x4 + x5;
                System.out.print("Your Total Mark Is :  " + mark);
                float full_Mark = y1 + y2 + y3 + y4 + y5;
                System.out.println("  Out Of :  " + full_Mark);
                float percent1 = mark / full_Mark;
                float percent2 = percent1 * 100;
                System.out.println("Your Percentage Is : " + percent2);
            }
            case 2 -> {

                System.out.println("WELL COME TO THE SGPA CALCULATOR");
//                Taking The Marks For Calculation
                System.out.println("Enter Your Mark & Full Mark Respectively");
                Scanner c_sc = new Scanner(System.in);
                System.out.println("Subject 1 Mark");
                float s1 = c_sc.nextFloat();
                System.out.println("Subject 1 Full Mark");
                float f1 = c_sc.nextFloat();
                System.out.println("Subject 2 Mark");
                float s2 = c_sc.nextFloat();
                System.out.println("Subject 2 Full Mark");
                float f2 = c_sc.nextFloat();
                System.out.println("Subject 3 Mark");
                float s3 = c_sc.nextFloat();
                System.out.println("Subject 3 Full Mark");
                float f3 = c_sc.nextFloat();
                System.out.println("Subject 4 Mark");
                float s4 = c_sc.nextFloat();
                System.out.println("Subject 4 Full Mark");
                float f4 = c_sc.nextFloat();
                System.out.println("Subject 5 Mark");
                float s5 = c_sc.nextFloat();
                System.out.println("Subject 5 Full Mark");
                float f5 = c_sc.nextFloat();

//                Calculating The  SGPA
                float total_m = s1 + s2 + s3 + s4 + s5;
                float total_fm = f1 + f2 + f3 + f4 + f5;
                float div = total_m / total_fm;
                float sgpa = div * 10.0f;
                System.out.print("Your SGPA is : ");
                System.out.print(sgpa);
            }
        }

    }
}
