package Stack;

import java.util.Scanner;

public class TowerOFHanoi {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter number of tower:");
		Scanner scan = new Scanner(System.in);
		 n=scan.nextInt();
		move(n,'A','C','B');
		
	}

	private static void move(int n, char from, char to, char aux) {
		
		if(n==1)	
		{
			System.out.println("move disk "+n+" from "+from+" to "+to);

			return;
		}
			move(n-1,from,aux,to);
			System.out.println("move disk "+n+" from "+from+" to "+to);

			move(n-1,aux,to,from);
			
		
	}

}
