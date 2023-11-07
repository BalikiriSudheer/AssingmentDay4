package Com.Demo;

import java.util.Scanner;

public class EmpPartTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int ITS_PART_TIME=1;
        int ITS_FULL_TIME=2;
        int EMP_RATE_PERHOUR=20;
        int empwage=0;
        int empHrs=0;
        int empCheck=sc.nextInt();
        if(empCheck==ITS_PART_TIME){
            empHrs=4;
        } else if (empCheck==ITS_FULL_TIME) {
            empHrs=8;

        }
        else {
            empHrs=0;
        }
        empwage=empHrs * EMP_RATE_PERHOUR;
        System.out.println("EMP WAGES: "+ empwage);
    }
}
