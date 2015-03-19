/*Set class*/

public class Set<T extends Comparable<T>> implements Iterable<T>, Comparable <Set<T>>


    //Constructors
    public Set(). This is an empty constructor (no parameters, no actions) which constructs an empty set.
    public Set(T[] setElements). This constructor will take an array of set elements as a parameter and will insert each set element into the set.



    //Methods
    public T search(T target). If target is in the set return a (reference to) the copy found in the set. Otherwise return null.
    public boolean elementOf(T t). Returns whether t is in the set or not.
    public boolean insert(T value). Inserts value into the set if it is not already in the set. If value is already in the set no operation is performed and false is returned.
    public boolean delete(T target). Deletes target from the set. If target is not in the set return false.
    public Set copy(). Return a copy of the current set (i.e. of this). Do not just return a reference to this.
    public Set union(Set s). Return a set which is the union of the current set and s.
    public Set intersection(Set s). Return a set which is the intersection of the current set and this.
    public boolean subsetOf(Set s). Return whether this is a subset of s.
