package sample.binarytree;

public abstract class Node<T> {
	
	private T nodeValue;
	private Node<T> leftNode;
	private Node<T> rightNode;
	
	public Node(T value) {
		this.nodeValue = value;
	}
	
	public boolean isBalanced(Node<T> root) {
		return (maxDept(root) - minDept(root)) < 2;
	}
	
	public int maxDept(Node<T> root) {
		if (root == null) {
			return 0;
		}
		
		return 1 + Math.max(maxDept(root.leftNode), maxDept(root.rightNode));
	}
	
	public int minDept(Node<T> root) {
		if (root == null) {
			return 0;
		}
		
		return 1 + Math.min(minDept(root.leftNode), minDept(root.rightNode));
	}
	
	public Node<T> searchByValue(Node<T> root, T value) {
		if (root == null) {
			return null;
		}

		Node<T> result = null;
		if (root.getLeftNode() != null) {
			result = searchByValue(root.getLeftNode(), value);
		}
		
		if (result == null && root.getNodeValue().equals(value)) {
			return root;
		}
		
		if (result == null && root.getRightNode() != null) {
			result = searchByValue(root.getRightNode(), value);
		}
		
		return result;
	}
	
	public Node<T> getLeftNode() {
		return leftNode;
	}
	public Node<T> leftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
		return leftNode;
	}
	public Node<T> getRightNode() {
		return rightNode;
	}
	public Node<T> rightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
		return rightNode;
	}
	public T getNodeValue() {
		return nodeValue;
	}
	public void setNodeValue(T nodeValue) {
		this.nodeValue = nodeValue;
	}
	
	public void printValue() {
		System.out.println(nodeValue);
	}
	
	public abstract long getCompareValue();
}
