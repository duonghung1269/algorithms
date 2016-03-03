package sample.binarytree;

public class Node<T> {
	
	private T nodeValue;
	private Node<T> leftNode;
	private Node<T> rightNode;
	
	public Node(T value) {
		this.nodeValue = value;
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
	
}
