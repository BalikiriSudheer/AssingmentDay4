package Com.Demo;

import java.util.Scanner;

public class CalculateEmpWages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWages=0;
        int empCheck=sc.nextInt();
        if(empCheck==IS_FULL_TIME){
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        empWages=empHrs * EMP_RATE_PER_HOUR;

        System.out.println("Employee wage is"+empWages);
        System.out.println();
    }
}
