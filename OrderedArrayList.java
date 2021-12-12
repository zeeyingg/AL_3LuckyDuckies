import java.util.ArrayList;

public class ALTester{

	public int inOrder(ArrayList<Integer> bob){
		for(int i = 0; i < bob.length - 1; i++){
			compareTo(bob[i], bob[i+1]); // what do we do with this value
	} if (compareTo(bob[i], bob[i+1]) == -1){
		System.err.println("List is not ordered at index: " + i);
		// will there be an
		// error when running this statement because it's not ret an int?
	}
}

	public int compareTo(Integer a, Integer b){
        Integer diff = a - b;
     	if (diff == 0) {
       return 0;
     } else if(diff > 0){
       return 1;
     } else {
       return -1;
     }
   }

	public static void main(String[] args){
		// testing compareTo
		Integer a = 9;
		Integer b = 9;
		Integer c = 5;
		System.out.println(a.compareTo(b) + " ... expected 0");
		System.out.println(a.compareTo(c) + " ... expected 1");
		System.out.println(c.compareTo(b) + " ... expected -1");

		// testing inOrder
		ArrayList bob = new ArrayList();
		for (i = 0; i < 23; i++) {
			bob.add( (Integer)(Math.random()*100) );
		}
		System.out.println(c.compareTo(b) + " ... expected false");
	}

 }

// should the user be able to intialize an ordered array list with an arbritrary array list which may or may not be in order
