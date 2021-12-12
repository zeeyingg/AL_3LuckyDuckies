import java.util.ArrayList;

public class OrderedArrayList {

  ArrayList<Integer> _arr = new ArrayList<Integer>(23); // instance variable

  public OrderedArrayList(){ //
  // for(Integer i = 0; i < this.size() ; i++) // iterates through every element in the array
  //   this.addOrd(_arr[i]); // invokes addOrd on each element in the array
  }

  public OrderedArrayList(ArrayList<Integer> bob){
    // 1. starts at the beginning of bob and finds the longest possible section that is in order
      // 1.1 go through bob and for each index, check if it is less than the index above
      // 1.2 Once this is not the case, exit the loop (do not add any more items of bob to _arr)
    // 2. for each item in the rest of the bob, adds this items to _arr using addOrd

  }


  /*
  addOrd - adds a value into the Array List in its right order
  1) an insertion point is found
      * we accounted for three cases: if the value would be the smallest, in the middle, or the largest
  2) adds the value into the array list at that insertion point
  3) returns true once this operation has been completed
  */

  public String toString(ArrayList<Integer> bob){
    String str = ""
    return
  }

  public boolean addOrd(int value) {

    if (_arr[0] > value) {
      add(0, value); // adds the value at the beginning, because it is less than everything already in _arr
      return true;
    }

    else if (value > _arr[_arr.size()-1]) {
      add(value);
      return true;
    }

    else {
        for(int i = 0; i < _arr.size(); i++) {
          if (_arr[i] < value && _arr[i+1] > value) {
            add(i, value);
            return true;
          }
        }
      }
    }//end addOrd

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

    public String toString()
    {
      String foo = "[";
      for( Integer i = 0; i < _size; i++ ) {
        foo += _arr[i] + ",";
      }
      if ( foo.length() > 1 )
        //shave off trailing comma
        foo = foo.substring( 0, foo.length()-1 );
      foo += "]";
      return foo;
    }

}//end class
