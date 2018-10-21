package dientichtamgiac;

import java.util.Scanner;

public class DienTichTamGiac {

    public static boolean isTriagle(double side1, double side2, double side3){
        if(side1+side2<=side3) return false;
        if(side2+side3<=side1) return false;
        if(side1+side3<=side2) return false;
        return true;
    }
    
    public static double area(double side1, double side2, double side3){
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Enter a triagle: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        if(isTriagle(a, b, c)) System.out.println("Area of this Triagle is: "+area(a, b, c));
        else System.out.println("This is not a Triagle");
    }
    
}
