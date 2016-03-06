package sample.binarytree.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.Test;

import sample.binarytree.Node;
import sample.binarytree.TraversalTree;

public class TraversalTreeTest extends TestCase {
	
	private Node<Integer> root;
	private TraversalTree<Integer> traversalTree = new TraversalTree<>();
	
	@Override
	protected void setUp() throws Exception {
		init();
	}
	
	@Override
	protected void tearDown() throws Exception {
		traversalTree.clearTraversed();
	}
	
	public void init() {
		root = new Node<>(2);
		Node<Integer> node1 = root.leftNode(new Node<>(7));
		node1.leftNode(new Node<>(2));
		Node<Integer> node2 = node1.rightNode(new Node<>(6));
		node2.leftNode(new Node<>(5));
		node2.rightNode(new Node<>(11));
		root.rightNode(new Node<>(5)).rightNode(new Node<>(9)).leftNode(new Node<>(4));
	}
	
	@Test
	public void testPreOrder() {
		traversalTree.preOrder(root);
		Integer[] result = new Integer[traversalTree.getTraversed().size()];
		assertThat(Arrays.equals(traversalTree.getTraversed().toArray(result), new Integer[] {2, 7, 2, 6, 5, 11, 5, 9, 4})).isTrue();
	}
	
	@Test
	public void testInOrder() {
		traversalTree.inOrder(root);
		Integer[] result = new Integer[traversalTree.getTraversed().size()];
		assertThat(Arrays.equals(traversalTree.getTraversed().toArray(result), new Integer[] {2, 7, 5, 6, 11, 2, 5, 4, 9})).isTrue();
	}
	
	@Test
	public void testPostOrder() {
		traversalTree.postOrder(root);
		Integer[] result = new Integer[traversalTree.getTraversed().size()];
		assertThat(Arrays.equals(traversalTree.getTraversed().toArray(result), new Integer[] {2, 5, 11, 6, 7, 4, 9, 5, 2})).isTrue();
	}
	
}
