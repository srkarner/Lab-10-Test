public interface OrderedStructure<E> {
	int size() ;
	boolean add(E element) throws IllegalArgumentException;
	E get(int pos) throws IndexOutOfBoundsException;
	void remove(int pos) throws IndexOutOfBoundsException;
}