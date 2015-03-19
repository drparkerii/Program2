/*Binary Search Tree class*/


public class BST<T extends Comparable<T>> implements Iterable<T>

public T iterator(){}

private class TreeIterator<T>{

  private boolean hasNext()
    return (!stack.empty() || cursor != null)
    
  private void next(){
    (push the cursor and let cursor = cursor.left) until cursor is null
     if the stack isn't empty
      pop top of stack into cursor and save this pointer at savedCursor
      cursor = cursor.right
   return savedCursor
  }
}
