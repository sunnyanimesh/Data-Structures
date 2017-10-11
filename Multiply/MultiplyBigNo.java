package Multiply;
import java.util.*;
public class MultiplyBigNo {

static int[] ans;	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n,m;
		int t;
		System.out.println("Test cases:");
		t = scan.nextInt();
		while(t-->0)
		{
		System.out.println("Enter number n");
		n = scan.next();
		System.out.println("Enter number m");
		m = scan.next();
	
		int[] num1 = new int[n.length()];
		int[] num2 = new int[m.length()];
		ans = new int[n.length()+m.length()];
		
		for(int i=0;i<n.length();i++)
			num1[i] = Integer.parseInt(n.substring(i,i+1));
		
		for(int i=0;i<m.length();i++)
			num2[i] = Integer.parseInt(m.substring(i,i+1));
		
		
		int carry = 0;
		for(int i=m.length()-1 ; i>=0;i--){
			int[] arr = new int[n.length()+ m.length()];
			   int k = arr.length-1;
			for(int l=0;l< ( (m.length()-1) - i);l++){
				arr[k] = 0;
				k--;
			}
			
		 for(int j=n.length()-1;j>=0;j--)
		  {
			  
          int num = num2[i] * num1[j] + carry;
          carry = num/10;
          
          num = num%10;
          
          arr[k] = num;
		  k--;
		  if(j==0)
		  {
			  arr[k] = carry;
		  }
		  }
		 
		 sum(arr);
		carry =0;
		
		
		
		}
		for(int x=0;x<ans.length;x++)
			System.out.print(ans[x]);
		System.out.println("");
	
		carry = 0;
		for(int i=0;i<ans.length;i++)	
			ans[i] = 0;
		
		}
	}
static int carry = 0;
	private static void sum(int[] arr) {
		for(int i=arr.length-1;i>=0;i--)
		{			int num;
		    	num = ans[i] + arr[i] + carry;
    	carry = num/10;
    	num = num%10;
    	ans[i] = num;
	}

}
}