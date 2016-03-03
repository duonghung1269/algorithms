package sample.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TraversalTree<T> {
	
	private List<T> traversed = new ArrayList<>();
	
	public void preOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		
		traversed.add(root.getNodeValue());
		
		preOrder(root.getLeftNode());
		preOrder(root.getRightNode());
	}
	
	public void postOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		
		postOrder(root.getLeftNode());
		postOrder(root.getRightNode());
		traversed.add(root.getNodeValue());
	}
	
	public void inOrder(Node<T> root) {
		if (root == null) {
			return;
		}
		
		inOrder(root.getLeftNode());
		traversed.add(root.getNodeValue());
		inOrder(root.getRightNode());
	}

	public List<T> getTraversed() {
		return traversed;
	}
	
	public void clearTraversed() {
		traversed.clear();
	}
}
