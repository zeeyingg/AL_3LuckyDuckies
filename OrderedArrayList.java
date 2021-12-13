// addLinear is a nonstatic method. But why can i call it in the constructor without specifying object?


import java.util.ArrayList;
import java.lang.Math;
public class OrderedArrayList {

  private ArrayList<Integer> _arr;
	private int _size; // instance variable



  public OrderedArrayList(){
		this._arr = new ArrayList<Integer>();
		this._size = 0;
  // for(Integer i = 0; i < this.size() ; i++) // iterates through every element in the array
  //   this.addLinear(_arr[i]); // invokes addLinear on each element in the array
  }


	public OrderedArrayList(int size){
		this._arr = new ArrayList<Integer>();
		this._arr.add((int)(Math.random()*100));
		this._size = 1;
		for(Integer i = 0 ; i < size-1 ; i ++){
			addLinear( (int)(Math.random()*100));
		}

	}

	public int getSize(){
		return this._size;
	}
//addLinear is the same as addLinear
	public boolean addLinear(int value) {

    if (this._arr.get(0) > value) {
			this._arr.add(0,value);
			this._size += 1; // adds the value at the beginning, because it is less than everything already in _arr
			return true;

    }	else if (value > this._arr.get(this._arr.size()-1)) {
			this._arr.add(value);
			this._size += 1;
			return true;

    }	else {
			for(int i = 0; i < this._arr.size(); i++) {
				if (this._arr.get(i) <= value && this._arr.get(i+1) >= value) { //should this be >= and <= or just > and <
					this._arr.add(i+1, value);
					this._size += 1;
					return true;}
				}
			}
			return false;
		}//end addLinear

    public boolean addBinary(int value){
      int minIndexConsidered = 0;
      int maxIndexConsidered = this.size() - 1;
      int splitter = (int)( (maxIndexConsidered + minIndexConsidered)/2 );
      // all of these up here are INDEXES
      if (value <= this.get(0)){
        this._arr.add(0,value);
  			this._size += 1;
        return true;

      } else if(value >= this.get(this.size() - 1)){
        this._arr.add(value);
        return true;

      }
       // exit the loop once the value needs to be right next to splitter
       // these if-else statements handle the edge cases
       boolean adjascent = this.get(splitter) <= value && value < this.get(splitter + 1);
       while (adjascent != true) {
         if (value < this.get(splitter)) { // now search below the splitter
           maxIndexConsidered = splitter; // don't look above splitter
         } else { // the value is above the splitter
           minIndexConsidered = splitter;
         }
         splitter = (int)( (maxIndexConsidered + minIndexConsidered)/2 );
       }
       // when it exits this loop, splitter is the index above which the value should be added
       _arr.add(value, splitter + 1);
       return true;
    }


    public Integer get( int i )
    {
      return _arr.get(i);
    }


    public Integer remove( int i )
      {
        Integer removed = _arr.get(i);
        _arr.remove(i);
        return removed;
      }


      public int size()
      {
        return _arr.size();
      }


	public String toString(){
		String foo = "[";
		for( Integer i = 0; i < this._arr.size(); i++ ) {
			foo += this._arr.get(i) + ",";
		}
		if ( foo.length() > 1 )
			//shave off trailing comma
			foo = foo.substring( 0, foo.length()-1 );
		foo +=( "] size:" + this._size);
		return foo;

	}

  public static void main(String[] args) {
    OrderedArrayList lul = new OrderedArrayList();
		OrderedArrayList bob = new OrderedArrayList(23);
		System.out.println(lul);
		System.out.println(bob);

    //testing size;
    System.out.println(bob.size());
    System.out.println(lul.size());

    // testing add
    bob.addLinear(20);
    System.out.println(bob);

    // testing get
    System.out.println(bob.get(5));

    // testing removed
    System.out.println(bob);
    bob.remove(15);
    System.out.println(bob);

    // testing binarySearch
    OrderedArrayList Franz = new OrderedArrayList();
   // testing linear search
   for( int i = 0; i < 15; i++ )
     Franz.addLinear( (int)( 50 * Math.random() ) );
   System.out.println( Franz );
   // testing binary search
   Franz = new OrderedArrayList();
   for( int i = 0; i < 15; i++ )
     Franz.addBinary( (int)( 50 * Math.random() ) );
   System.out.println( Franz );




  }

/*







  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {

  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {

  }	*/



/*
  public OrderedArrayList(ArrayList<Integer> bob){
    // 1. starts at the beginning of bob and finds the longest possible section that is in order
      // 1.1 go through bob and for each index, check if it is less than the index above
      // 1.2 Once this is not the case, exit the loop (do not add any more items of bob to _arr)
    // 2. for each item in the rest of the bob, adds this items to _arr using addLinear

  }



/*

    public int find(int value) { // returns the index of a value;
      // iterate through _arr checking whether every element is the value
      // alternatively, use a binary search
      return -1;
    }



    public boolean replace(int value, int newValue){
      // 1. _arr.removeOrd(value)
      // 2. add the newValue to _arr
      return true;
    }


*/
}//end class
