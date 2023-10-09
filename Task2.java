import java.util.Scanner;
public class Task2
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in first subject");
        double first=sc.nextDouble();

        System.out.println("Enter marks in second subject");
        double second=sc.nextDouble();

        System.out.println("Enter marks in third subject");
        double third=sc.nextDouble();

        System.out.println("Enter marks in fourth subject");
        double fourth=sc.nextDouble();

        System.out.println("Enter marks in fifth subject");
        double fifth=sc.nextDouble();

        double Total_marks=first+second+third+fourth+fifth;

        double Avg_Percentage=Total_marks/5;

        if(Avg_Percentage>90)
        {
            System.out.println("A");
        }
        else if(Avg_Percentage>80 && Avg_Percentage<90)
        {
            System.out.println("B");
        }
        else if(Avg_Percentage>65 && Avg_Percentage<80)
        {
            System.out.println("C");
        }
        else if(Avg_Percentage>50 && Avg_Percentage<65)
            System.out.println("D");
    }
}
