package misc;

import java.util.ArrayList;

public class Circular_Array<T> {
	
	
	private ArrayList<T> data = new ArrayList<>();
	private int rotator = 0;
	
	
	public Circular_Array(){}
	
	public void add(T smt){	
		data.add(smt);
		
	}
	
	public T remove(T smt){
		data.remove(smt);
		return smt;
	}
	
	public void rotate_left_to_right(int x){
		//rotations will be a multiple of [1,data.size()]
		 rotator += x % (data.size());
	}
	
	public T get(int i){
		//if the index of the rotator overflows i go back to the start 
		if(i+rotator >= data.size()){
			return data.get(i+rotator - data.size());
		}
		else {
			return data.get(i+rotator);
		}
	}
	
	public void reset_rotator() {
		//If you want to start the rotations from zero
		rotator = 0;
	}
	
	public int size(){
		return data.size();
	}
	
	
	
	

}
