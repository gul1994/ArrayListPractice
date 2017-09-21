package lists;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
   ArrayList numbers=new ArrayList();
   numbers.add(888);
   numbers.add(221);
  System.out.println(numbers);
  numbers.remove(0);
  
  ArrayList <String> fruites=new ArrayList<>();
  fruites.add("apple");
  fruites.add("banana");
  fruites.add("orange");
  fruites.add("peach");
  
  
  
  fruites.remove(1);
  System.out.println(fruites);

  for(String some:fruites){
	  System.out.println(some);
  }


  
  


	}

}
