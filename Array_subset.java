
import java.util.Scanner;


/**
 *
 * @author Pradeep Kumar
 */
public class Array_subset {
    public static int lena=0;
     public static int lenb=0;
     public static int flag=0; 
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a-array Lenght");
         lena=s.nextInt();
        int arraya[] = new int[lena];  
        
        for(int i=0;i<lena;i++)
        {
            System.out.println("Enter the "+(i+1)+" Element");
            arraya[i]=s.nextInt();
            
        }
        
        
        System.out.println("Enter the b-array Lenght");
         lenb=s.nextInt();
        int arrayb[] = new int[lenb];  
        
        for(int i=0;i<lenb;i++)
        {
            System.out.println("Enter the "+(i+1)+" Element");
            arrayb[i]=s.nextInt();
            
        }
        
        Array_subset(arraya,arrayb,lena,lenb);
        
        if(flag==lenb)
          System.out.println("array b is  a subset of array a");     
        else
        System.out.println("array b is not subset of array a ");
 
    }
    
    public static void Array_subset(int arraya[], int arrayb[], int len_arr1, int len_arr2)
            
    {    int i,j;
         for (i=0; i<len_arr2; i++)
          {
             for (j = 0; j<len_arr1; j++)
            {
                 if(arrayb[i] == arraya[j])
                 flag++;
            }
         
        
                 
        }
     
    }
    
    
}
