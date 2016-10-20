

/**
 *
 * @author Pradeep Kumar
 */
import java.util.Scanner;


public class Closest_zerosum {
    
    public static int num1=0;
     public static int num2=0;
      public static int sum=0;
       public static int s=0;
    
    public static void main(String[] args)
    {   
       Scanner s = new Scanner(System.in);
        System.out.println("Enter the array Lenght");
        int len=s.nextInt();
        int array[] = new int[len];
        
        for(int i=0;i<len;i++)
        {
            System.out.println("Enter the "+i+" Element");
            array[i]=s.nextInt();
            
        }
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i!=j)
                {
                    min(array[i],array[j]);
                   
                }
                
            }
            
            
        }
        
       System.out.println("The number whose sum is closest ot zero are "+num1+" and "+num2);
    }

    public static void min(int a, int b)
    {
       
        s=a+b;
        
       if(s<=0)
        {
           s=-s;
        
        }
        if(sum==0)
        {
            sum=s;
            num1=a;
            num2=b;
        
        }
        
        if(s<sum)
        {
            sum=s;
            num1=a;
            num2=b;
        
        }
        
        
    
    
    }
           
}
