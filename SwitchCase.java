package Com.Demo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        int emprate=sc.nextInt();
        int empSalary=20000;
        double empBonus;
        switch(emprate){
            case 1:
                empBonus= 1 * empSalary;
                System.out.println("Emp Bonus is: "+ empBonus);
                break;
            case 2:
                empBonus=0.5 * empSalary;
                System.out.println("Emp Bonus is:" +empBonus);
                break;
            case 3:
                empBonus=0.25 * empSalary;
                System.out.println("emp Bonus is:"+empBonus);
                break;
            default:
                System.out.println("NO BONUS FOR THE EMPLOYEE");
        }
    }
}
