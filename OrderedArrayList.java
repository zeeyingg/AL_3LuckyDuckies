// addLinear is a nonstatic method. But why can i call it in the constructor without specifying object?

import java.util.ArrayList;
import java.lang.Math;
public class OrderedArrayList {

  private ArrayList<Integer> _arr;

  // default constructor
  public OrderedArrayList(){
		this._arr = new ArrayList<Integer>();
  for(Integer i = 0; i < this.size() ; i++) // iterates through every element in the array
    this.addLinear(_arr.get(i)); // invokes addLinear on each element in the array
  }


	public OrderedArrayList(int size){
		this._arr = new ArrayList<Integer>();
		this._arr.add((int)(Math.random()*100));
		for(Integer i = 0 ; i < size-1 ; i ++){
			addLinear( (int)(Math.random()*100));
		}
	}


	public boolean addLinear(int value) {
     if (this.size() == 0){
       this._arr.add(value);
     } else if (this._arr.get(0) > value) {
			this._arr.add(0,value);
			return true;

    }	else if (value > this._arr.get(this._arr.size()-1)) {
			this._arr.add(value);
			return true;

    }	else {
			for(int i = 0; i < this._arr.size(); i++) {
				if (this._arr.get(i) <= value && this._arr.get(i+1) >= value) { //should this be >= and <= or just > and <
					this._arr.add(i+1, value);
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
      if (this.size() == 0){
        this._arr.add(value);
        return true;
      }
      else if (value <= this.get(0)){
        this._arr.add(0,value);
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
       _arr.add(splitter+1,value) ;
       return true;
    }// end addBinary


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
		foo +=( "] size:" + this.size());
		return foo;
	}


  public static void main(String[] args) {

    // testing constructors
    OrderedArrayList lul = new OrderedArrayList();
    OrderedArrayList mike = new OrderedArrayList(3);
    mike.addBinary(50);
    OrderedArrayList jim = new OrderedArrayList(10);
		OrderedArrayList bob = new OrderedArrayList(23);
		System.out.println(lul);
    System.out.println(mike);
    System.out.println(jim);
    System.out.println(bob);

    System.out.println(bob);

System.out.println(bob);
    //testing size;
    System.out.println(lul.size());
    System.out.println(mike.size());
    System.out.println(jim.size());
    System.out.println(bob.size());

    // testing add
    mike.addLinear(2);
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

/*   Franz.addLinear(1);
   System.out.println(Franz);
   Franz.addLinear(0);
      System.out.println(Franz);
   Franz.addLinear(4);
      System.out.println(Franz);
   Franz.addLinear(2);
      System.out.println(Franz);*/
/*
   for( int i = 0; i < 3; i++ )
   Franz.addLinear( (int)( i) );

   // testing binary search
   Franz = new OrderedArrayList();
   for( int i = 0; i < 23; i++ ){
     int adding = (int) (50 * Math.random());
     Franz.addBinary( (int)(adding)) ;
     System.out.println(Franz);
   }
   */


}//end main
}//end class
