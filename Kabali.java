import java.util.Scanner;
/*@Author Pradeep Kumar*/
public class Kabali {

    public static void main(String args[]) {
      
        int temp=0, count=0;
      System.out.println("Enter the range a to b ");
      
      Scanner s = new Scanner(System.in);
      int a= s.nextInt();
      int b= s.nextInt();
      int prime[]=new int[b];
      int dprime[]=new int[b];
      
     for(int n = a; n<=b; n++){     
         
         if(n<10&&n!=1){
         
                if(isPrime(n)){
              
                        prime[temp]=n;
                        System.out.println(n);
                        temp++;
                        System.out.println("temp"+temp);
                            }
                    }
         
         
         if(n>=10){
                int r,sum=0,num=0;
                r=n%10;
                num=n/10;
                sum=num+r;
                    if(sum==1)
                    continue;
         
                if(isPrime(sum)){
              
                    prime[temp]=n;
                    System.out.println(n);
                    temp++;
                    System.out.println("temp"+temp);
                                }       
         
         
                }
         
         
      }
        System.out.println("There are "+count+"Numbers");
    
    
     
    
    }
    
    

    
    public static boolean isPrime(int number){
       
        
        
        for(int i=2; i<number; i++){
           
            if(number%i == 0){
               return false; 
           }
        }
               
        return true; 
        
        
    }
}
