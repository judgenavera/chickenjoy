/*operation on array(DELETION)*/
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner back = new Scanner(System.in);
		
		int [] array = new int[100];
		int position,i,n;
		
			System.out.println("Enter number of elements in array:");
			n=back.nextInt();
			System.out.println("Enter elements: " + n);
			
				for(i=0;i<n;i++)
				    array[i]=back.nextInt();
				    System.out.print("Enter the location where you wish to insert an element: ");
				    position=back.nextInt();
				    if(position>=n+1)
				    System.out.println("Delete not possible." + "\n");
				    else{
				        for(i=position-1;i<n-1;i++)
				        array[i]=array[i+1];
				        System.out.println("Resultant array is " + "\n");
				        for(i=0;i<n-1;i++)
				        System.out.println(array[i] + "\n");
				        }
				        
				    
	}
}