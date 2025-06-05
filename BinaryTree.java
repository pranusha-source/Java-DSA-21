class Node{
	int key;
	Node left,right;
	public Node(int item){
		key=item;;
		left=right=null;
	}
}
class BinaryTree{
	Node root;
	void traverseTree(Node node){
	if(node!=null){
		traverseTree(node.left);
		System.out.println("" +node.key);
		traverseTree(node.right);
	}
}
	void traverseTree1(Node node){
	if(node!=null){
		System.out.println("" +node.key);
		traverseTree1(node.left);
		traverseTree1(node.right);
	}
}
	void traverseTree2(Node node){
	if(node!=null){
		traverseTree2(node.left);
		traverseTree2(node.right);
		System.out.println("" +node.key);
	}

}
public static void main(String[] args){
	BinaryTree bt=new BinaryTree();
	bt.root=new Node(1);
	bt.root.left=new Node(2);
	bt.root.right=new Node(3);
	bt.root.left.left=new Node(4);
	System.out.println(" binary tree in order");
	bt.traverseTree(bt.root);
	System.out.println(" binary tree pre order");
	bt.traverseTree1(bt.root);

        System.out.println(" binary tree post order");
	bt.traverseTree2(bt.root);
}
}



	
	


	