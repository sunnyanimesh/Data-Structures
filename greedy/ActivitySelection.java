package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ActivitySelection {
	static class Activity {
		int startTime;
		int endTime;
			Activity(int startTime, int endTime){
					this.startTime = startTime;
					this.endTime = endTime;
			}
			
	}
	
	static class SortBySTime implements Comparator<Activity>{

		@Override
		public int compare(Activity A1, Activity A2) {
			return A1.endTime - A2.endTime;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Number of Activities");
		Scanner scan =new Scanner(System.in);
		int n;
		n = scan.nextInt();
		ArrayList<Activity> list = new ArrayList<Activity>();
		
		for(int i=0;i<n;i++){
			int st,et;
			st = scan.nextInt();
			et = scan.nextInt();
			list.add(new Activity(st,et));
		}
		
		Collections.sort(list,new SortBySTime());
		
		Stack<Activity> stack =new Stack<Activity>();
		stack.push(list.get(0));
		
		int i =1;
		while(i < list.size()){
			Activity top = stack.peek();
			if(top.endTime <= list.get(i).startTime){
				stack.push(list.get(i));
			}
		i++;
		}
		System.out.println("Total activites  : " + stack.size());
			while(!stack.isEmpty()){
				Activity curr = stack.pop();
				System.out.println(curr.startTime +" "+curr.endTime);
			}
		
	}

}
