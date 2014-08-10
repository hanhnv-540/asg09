import java.util.*;
import java.io.*;

public class ArrayAlg {
Exception Exception = null;
	//phan 2a
	/*public <T> void printArray(T[] a){
		for (int i = 0; i< a.length; i++){
			System.out.println(a[i]);
		}*/
	
	//phan 2b
	public <T> void printArray(T[] a,int start,int end) throws Exception{
	
			for (int i = start; i< end; i++){
				if (start < 0 || start >= end || end > a.length) 
				throw Exception;
				System.out.println(a[i]);
			}
	}
	
	//phan 2c
	public static <T extends Comparable<T>> Pair<T> maxTwo(T[] a){
		if (a == null || a.length == 0) return null;
		T max1 = a[0];
		Integer in = new Integer(0);
		T max2 = (T)in;
		try{
			for(int i = 0; i< a.length; i++){
				if(a[i].compareTo(max2)>0){
					if(a[i].compareTo(max1) > 0){
						max2 = max1;
						max1 = a[i];
					}
					else 
						max2 = a[i];
					}
					else if(max2.compareTo(max1)>= 0)
						max2 = a[i];
				}
			}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		return new Pair<T>(max1, max2);
	}

	
	public static void main(String [] args){
		ArrayAlg a = new ArrayAlg();		
		Integer[] number = {1,2,3,4,5,6};
		try{
			a.<Integer>printArray(number,1,4);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		//String[] words = { "Mary", "had", "a", "little", "lamb" }; 
		Pair<Integer> mt = a.maxTwo(number);
		System.out.println("max = " + mt.getFirst());
		System.out.println("max1 = " + mt.getSecond());
	}
}