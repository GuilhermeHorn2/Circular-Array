package misc;

import java.util.ArrayList;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
	
		Circular_Array<Integer> a = new Circular_Array<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
	   for(int i = 0;i < a.size();i++) {
		   int x = a.get(i);
		   System.out.print(x);
	   }
	   System.out.println();
	   a.rotate_left_to_right(4);
	   for(int i = 0;i < a.size();i++) {
		   int x = a.get(i);
		   System.out.print(x);
	   }
	
	
	
	
	}	
	
}
