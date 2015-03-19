Program 2
due
Sections 002 and 003 (Monday-Wednesday sections): March 30, 2015

The program

In this program you will code a binary search tree and use it to implement sets. A test driver to execcise your code is here: Prog2TestDriver.java.
The BST class

You will write a binary search tree class. You may, if you wish, use the code presented in class for the search and insert methods but you must code a delete method yourself. Your BST class will also provide an iterator. This is described next.
The iterator

You will add "implements Iterable" to the class line of class BST:


    public class BST<T extends Comparable<T>> implements Iterable<T>

This will require you to supply a method Iterator<T> iterator() which you return an instance of a class implementing the interface Iterator<T>, described as follows.

Create a private inner class to class BST<T>: TreeIterator<T>. An instance of this class will be an iterator for the BST. The class you construct will provide hasNext() and next() methods which can be used to do a traversal of the tree. However, you cannot use a recursive tree traversal. Instead you will use a non-recursive inorder traversal as described in the following pseudo-code. TreeIterator<T> will have two data fields, a stack (you may use the Stack class from the library described at http://docs.oracle.com/javase/7/docs/api/java/util/Stack.html) and a cursor (a pointer) of type private BSTNode<T> which will be initialized to root.

    hasNext()
       return (!stack.empty() || cursor != null)
       
    next()
       (push the cursor and let cursor = cursor.left) until cursor is null
       if the stack isn't empty
          pop top of stack into cursor and save this pointer at savedCursor
          cursor = cursor.right
       return savedCursor

The iterator() method in your BST class will return an instance of TreeIterator.
The Set class

Sets will be represented by binary search trees. The elements of a set will be the data stored in a tree, so one tree represents one set. Thus you will create a Set class:

    public class Set<T extends Comparable<T>> implements Iterable<T>, Comparable <Set<T>> 

You will notice that you can only store types in a set which implement Comparable. Since our Set class will implement Comparable <Set<T>> it will be possible to create sets of sets.

Set will have only one data field, a binary search tree. The usual set operations (union, intersection, etc.) are then easy to implement using the BST operations and a tree iterator. Set will also provide a set iterator. The operations you must implement are:

    public T search(T target). If target is in the set return a (reference to) the copy found in the set. Otherwise return null.
    public boolean elementOf(T t). Returns whether t is in the set or not.
    public boolean insert(T value). Inserts value into the set if it is not already in the set. If value is already in the set no operation is performed and false is returned.
    public boolean delete(T target). Deletes target from the set. If target is not in the set return false.
    public Set copy(). Return a copy of the current set (i.e. of this). Do not just return a reference to this.
    public Set union(Set s). Return a set which is the union of the current set and s.
    public Set intersection(Set s). Return a set which is the intersection of the current set and this.
    public boolean subsetOf(Set s). Return whether this is a subset of s.

There will also be two constructors:

    public Set(). This is an empty constructor (no parameters, no actions) which constructs an empty set.
    public Set(T[] setElements). This constructor will take an array of set elements as a parameter and will insert each set element into the set.

You will also provide iterator() and toString() methods. The iterator() method needs only return a new instance of BST's iterator(). toString() will display the set in the usual notation using braces ('{' and '}'), will iterate through the set and call the toString() method of T. For example the set containing the integers 7, 77 and 777 will be represented by the String {7, 77, 777} and the set containing the strings Our fathers brought forth will be represented by the String {Our, brought, fathers, forth}. Note that Strings will automatically be displayed in lexicographical order.
To turn in

You will turn in a hardcopy of your (well-commented) source code and a sample terminal session running the test driver whose link is at the top of this page.
