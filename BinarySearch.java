import java.util.Scanner;

public class BinarySearch{

     public static void main(String []args){
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HOLA ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("HOLA ");
        int data = sc.nextInt();
        
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            
            int mid = (high+low)/2;
            
            if(data > arr[mid]){
                low = mid + 1;
            }
            
            else if(data<arr[mid]){
                high = mid - 1;
            }
            
            else{
                System.out.println("ELEMENT FOUND AT " + mid);
                break;
            }
        }
        
        System.out.println("ELEMENT NOT FOUND");
         
         
         
         
        
     }
}
