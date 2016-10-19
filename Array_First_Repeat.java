public class Array_First_Repeat 
{   
    public static void main(String[] args) 
    {
       int arr[] = {2, 7, 3, 7, 1, 2, 3};
       int duplicate[] = new int[10];
       int position[] = new int[10];
       int a,pos=0,element=0;
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if( (arr[i]==(arr[j])) && (i != j) )
                {
                              duplicate[element]=arr[j];                   
                              element++;
                }
            }
        }
        
        
        
        
            System.out.println("The first repeated element in the array is "+duplicate[0]);
    
    
    
    
     }
    
   
}
