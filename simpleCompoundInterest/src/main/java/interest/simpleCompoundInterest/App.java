package interest.simpleCompoundInterest;
import java.util.Scanner;
public class App extends Interest
{
    public static void main( String[] args )
    {
       Interest obj1=new Interest();
       int principle,time,noOfYears;
       float rateOfInterest;
       System.out.println("Enter the type of Interest 1.Simple Interest 2.Compound Interest");
       Scanner sc=new Scanner(System.in);
       int choice=sc.nextInt();
       System.out.println("Enter the principle amount,Time,Rate of Interest");
	   principle=sc.nextInt();
	   time=sc.nextInt();
	   rateOfInterest=sc.nextFloat();
       if(choice==1)
       {
    	   System.out.println("Simple interest is: Rs."+obj1.simpleInterest(principle,time,rateOfInterest));    	   
       }
       else
       {
    	   System.out.println("Enter the no of years for compound interest");
    	   noOfYears=sc.nextInt();
    	   System.out.println("Compound interet is:Rs."+obj1.compoundInterest(principle, time, rateOfInterest, noOfYears)); 	   
       }
       
    }
}
