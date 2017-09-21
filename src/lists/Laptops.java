package lists;

import java.util.ArrayList;

public class Laptops {

	public static void main(String[] args) {


		ArrayList<String> jira  =new ArrayList<>();
		jira.add("Big");
		jira.add("Different");
		jira.add("report");
		
		System.out.println(jira);
		
		for(String str:jira){
			System.out.println(str);
			
		}
		
	}

}
