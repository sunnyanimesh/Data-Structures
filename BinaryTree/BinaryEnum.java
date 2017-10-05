package BinaryTree;
import java.util.*;

public class BinaryEnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number n:");
		int n;
		n=scan.nextInt();
		int arr[] = new int[n+1];
		
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;

		for(int i=3;i<=n;i++)
		{		int ans=0;
		
			for(int j=0;j<i;j++){
				ans += arr[j]*arr[i-j-1];
			}
			arr[i] = ans;
		}
		
		System.out.println(arr[n]);
	}

}
