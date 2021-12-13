# AL_3LuckyDuckies

TNPG: 3 Lucky Duckies
Roster: Ziying Jian, Nora Miller, Gloria Lee

#### ALTester Algo
<restate here>
  
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
  
  
