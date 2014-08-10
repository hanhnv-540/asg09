public class PairTest {
	public static void main(String [] args){
	
		Pair<String> ss =  new Pair<String>("1st","2nd");
		System.out.println(ss.toString());
		
		//Pair<int> ii =  new Pair<int>(1,2); error compile
		//System.out.println(ii.toString());
		
		Pair<Integer> it =  new Pair<Integer>(10,20);
		System.out.println(it.toString());
	}
}