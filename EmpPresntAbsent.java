package Com.Demo;

import java.util.Scanner;

public class EmpPresntAbsent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int IS_FULL_TIME =1;

        int empCheck=sc.nextInt();
        if(empCheck==IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
        System.out.println();


    }
}
