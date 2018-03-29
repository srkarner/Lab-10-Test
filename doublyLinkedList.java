public class doublyLinkedList<T> implements OrderedStructure<T> {

	private static class Node<T> {
		private Node<T> next;
		private Node<T> previous;
		private T value;

		private Node(T value, Node<T> previous, Node<T> next) {
			this.value = value;
			this.previous = previous;
			this.next = next;
		}
	}

	private int size;
	private Node<T> dumbyNode;

	public doublyLinkedList() {
		size = 0;
		dumbyNode = new Node<T>(null, dumbyNode.next, dumbyNode.previous);
	}

	public int size() {
		throw new UnsupportedOperationException();
	}

	public boolean add(T element) {
		if (element == null) {
			throw new NullPointerException("No null elements in list.");
		}


		if (size == 0) {
			Node<T> newNode = new Node<T>(element, dumbyNode, dumbyNode);
		} else {
			Node<T> newNode = new Node<T>(element, dumbyNode, dumbyNode.next);
			dumbyNode.next.previous = dumbyNode.previous = newNode;
		}
	}

	public T get(int pos) {
		throw new UnsupportedOperationException();
	}

	public void remove(int pos) {
		throw new UnsupportedOperationException();
	}
}