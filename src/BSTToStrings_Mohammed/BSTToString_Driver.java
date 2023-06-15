//--------------------------------------------------------------------------
// BSTExample.java          by Dale/Joyce/Weems                    Chapter 7
//
// Creates a BST to match Figure 7.8 and demonstrates use of iteration.
//--------------------------------------------------------------------------
package BSTToStrings_Mohammed;

import java.util.Iterator; 

public class BSTToString_Driver 
{
  public static void main(String[] args)
  {  
    BinarySearchTree<Character> tree = new BinarySearchTree<Character>();
    
    tree.add('P'); tree.add('F'); tree.add('S'); tree.add('B'); 
    tree.add('H'); tree.add('R'); tree.add('Y'); tree.add('G'); 
    tree.add('T'); tree.add('Z'); tree.add('W');  

    System.out.print(tree);
  }
}