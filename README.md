# AL_3LuckyDuckies

TNPG: 3 Lucky Duckies
Roster: Ziying Jian, Nora Miller, Gloria Lee

#### ALTester Algo
<restate here>
  Creates instance of class OrderedArrayList with 23 elements. Tests the addLinear as well as the addBinary methods on Franz. The inOrder algorithm uses compareTo on every pair of consecutive indexes. 
#### OrderedArrayList Algo
* Instance vars ArrayList<Integer> _arr and int _size.
* A default constructor that creates a new Array List and sets var _size to 0.
* An overwritten constructor that takes input param of int size. This is the desired size of the Array List you want to create.    
How this overwritten constructor works: 
  
  Creates a new Array List. Adds to index 0 a random int from 0 to 99 inclusive and updates _size to 1. This is to make sure addOrd always has a base case to work with. Then, use addOrd to add size - 1 values to the array to make sure that all values are always added to maintain order.
  
 * A method addOrd that takes input param of int value that is the value you want to add to the Array List _arr. Returns true if value added successfully. 
  
    #1) an insertion point is found.
      We accounted for three cases: if the value would be the smallest, in the middle, or the largest.
  
    #2) adds the value into the array list at that insertion point  
  #3) returns true once this operation has been completed
  
 * a toString method that specifies that when printing out an array list, print out their values with commas separating each one and brackets on both sides.
  
 * A method compareTo takes two ints and compares them to each other. Returns 0 if the ints are equal. Returns 1 if first int > second int. Returns -1 if first int < second int.
 
 * method inOrder returns boolean and checks if the Array List is in order. For each index of Array List (excluding the last one), compare the Integer value at that index with the one directly after. If at any point it is found that the Integer value is greater than the one after, returns false. 
 Also prints out index at which the issue with Order was encountered.
  
