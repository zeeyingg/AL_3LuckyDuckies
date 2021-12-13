// addOrd is a nonstatic method. But why can i call it in the constructor without specifying object?


import java.util.ArrayList;
import java.lang.Math;
public class OrderedArrayList {

  private ArrayList<Integer> _arr;
	private int _size; // instance variable



  public OrderedArrayList(){
		this._arr = new ArrayList<Integer>();
		this._size = 0;
  // for(Integer i = 0; i < this.size() ; i++) // iterates through every element in the array
  //   this.addOrd(_arr[i]); // invokes addOrd on each element in the array
  }


	public OrderedArrayList(int size){
		this._arr = new ArrayList<Integer>();
		this._arr.add((int)(Math.random()*100));
		this._size = 1;
		for(Integer i = 0 ; i < size-1 ; i ++){
			addOrd( (int)(Math.random()*100));
		}

	}

	public int getSize(){
		return this._size;
	}

	public boolean addOrd(int value) {

		if (this._arr.get(0) > value) {
			this._arr.add(0,value);
			this._size += 1; // adds the value at the beginning, because it is less than everything already in _arr
			return true;

		}

		else if (value > this._arr.get(this._arr.size()-1)) {
			this._arr.add(value);
			this._size += 1;
			return true;

		}

		else {
			for(int i = 0; i < this._arr.size(); i++) {
				if (this._arr.get(i) <= value && this._arr.get(i+1) >= value) { //should this be >= and <= or just > and <
					this._arr.add(i+1, value);
					this._size += 1;
					return true;}
				}
			}
			return false;
		}//end addOrd

	public String toString(){
		String foo = "[";
		for( Integer i = 0; i < this._arr.size(); i++ ) {
			foo += this._arr.get(i) + ",";
		}
		if ( foo.length() > 1 )
			//shave off trailing comma
			foo = foo.substring( 0, foo.length()-1 );
		foo +=( "] size:" + this._size);
		foo+=("\nOrdered?" + this.inOrder());

		return foo;

	}


		public boolean inOrder(){
			for(int i = 0; i < this._arr.size() - 1; i++){
				if (compareTo(this._arr.get(i), this._arr.get(i+1)) > 0){
					System.err.println("\nList is not ordered at index: " + i);
					return false;
				}
			// will there be an
			// error when running this statement because it's not ret an int?
		}
		return true;
	}

	public static int compareTo(Integer a, Integer b){
System.out.println(a+"+"+b);
				Integer diff = a - b;
			if (diff == 0) {
			 return 0;
		 } else if(diff > 0){
			 return 1;
		 } else {
			 return -1;
		 }
	 }






/*
  public OrderedArrayList(ArrayList<Integer> bob){
    // 1. starts at the beginning of bob and finds the longest possible section that is in order
      // 1.1 go through bob and for each index, check if it is less than the index above
      // 1.2 Once this is not the case, exit the loop (do not add any more items of bob to _arr)
    // 2. for each item in the rest of the bob, adds this items to _arr using addOrd

  }



  addOrd - adds a value into the Array List in its right order
  1) an insertion point is found
      * we accounted for three cases: if the value would be the smallest, in the middle, or the largest
  2) adds the value into the array list at that insertion point
  3) returns true once this operation has been completed
  */
/*

    public int find(int value) { // returns the index of a value;
      // iterate through _arr checking whether every element is the value
      // alternatively, use a binary search
      return -1;
    }

    public boolean removeOrd(int value) {
      // 1.find the value using find()
      // 2.use remove(index) on _arr
      return true;
    }

    public boolean replace(int value, int newValue){
      // 1. _arr.removeOrd(value)
      // 2. add the newValue to _arr
      return true;
    }


*/
}//end class
