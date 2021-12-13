import java.util.ArrayList;

public class ALTester{

	public static String inOrder(ArrayList<Integer> bob){
		for(int i = 0; i < bob.size() - 1; i++){
			// compareTo(bob.get(i), bob.get(i+1)); // what do we do with this value
			if (bob.get(i+1).compareTo(bob.get(i)) == -1){
				return("List is not ordered at index: " + i);
			}

			// will there be an
			// error when running this statement because it's not ret an int?
		}
		return( "List is in order!!!");
	}

	public int compareTo(Integer a, Integer b){ // see DISCO
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

		// testing inOrder on a randomly generated ArrayList
		ArrayList<Integer> bob = new ArrayList<Integer>();
		for (int i = 0; i < 23; i++) {
			bob.add( (int)(Math.random()*100) );
		}
		System.out.println(bob);
		System.out.println(ALTester.inOrder(bob) + " ... expected false");


		OrderedArrayList lul = new OrderedArrayList();
		OrderedArrayList bob = new OrderedArrayList(23);
		System.out.println(lul);
		System.out.println(bob);



	}

 }

// should the user be able to intialize an ordered array list with an arbritrary array list which may or may not be in order
