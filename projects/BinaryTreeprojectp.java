class Node1{
	String key;
	Node1 left,right;
	public Node1(String item){
		key=item;
		left=right=null;
	}
}
class BinaryTreeprojectp{
	Node1 root;
	void traverseInorder(Node1 node){
	if(node!=null){
		traverseInorder(node.left);
		System.out.println("" +node.key);
		traverseInorder(node.right);
	}
}
	void traversePreorder(Node1 node){
	if(node!=null){
		System.out.println("" +node.key);
		traversePreorder(node.left);
		traversePreorder(node.right);
	}
}
	void traversePostorder(Node1 node){
	if(node!=null){
		traversePostorder(node.left);
		traversePostorder(node.right);
		System.out.println("" +node.key);
	}

}
public static void main(String[] args){
	BinaryTreeprojectp btr=new BinaryTreeprojectp();
	btr.root=new Node1("Pranusha");
	btr.root.left=new Node1("Sudharshan");
	btr.root.right=new Node1("Nagaveni");
	btr.root.left.left=new Node1(" chengaiha");
	btr.root.left.right=new Node1("gangamma");
	btr.root.right.left=new Node1("subbayyya");
	btr.root.right.right=new Node1("subradhamma");
	System.out.println(" binary tree in order");
	btr.traverseInorder(btr.root);
	System.out.println(" binary tree pre order");
	btr.traversePreorder(btr.root);

        System.out.println(" binary tree post order");
	btr.traversePostorder(btr.root);
}
}