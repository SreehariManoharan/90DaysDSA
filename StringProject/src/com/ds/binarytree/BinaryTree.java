package com.ds.binarytree;

/**
 *  It is a heirarchichal data structure
 *  at max 2 child nodes will be available
 * @author sreeharimanoharan
 *
 */
public class BinaryTree {
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTrees {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				System.out.println(nodes[idx]);
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			System.out.println("new node value " + newNode.left);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
	}

	private static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		
	}

	private static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		Node root = BinaryTrees.buildTree(nodes);
		System.out.println(root.data);
		preOrder(root);
		inOrder(root);
		postoder(root);
	}

	private static void postoder(Node root) {
		if (root == null) {
			return;
		}
		postoder(root.left);
		postoder(root.right);
		System.out.print(root.data + " ");
	}

}
