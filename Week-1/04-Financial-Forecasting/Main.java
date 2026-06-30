import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Amount : ");
        double amt=sc.nextDouble();

        System.out.print("Enter Rate : ");
        double rate=sc.nextDouble();

        System.out.print("Enter Years : ");
        int yr=sc.nextInt();

        double ans=Forecast.predict(amt,rate,yr);

        System.out.printf("Future Value = %.2f",ans);

    }

}