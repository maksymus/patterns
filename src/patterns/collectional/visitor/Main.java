package patterns.collectional.visitor;

public class Main {
	public static void main(String[] args) {
		Node root = new Node("root");
		root.addLeaf(new Node("leaf1"));
		root.addLeaf(new Node("leaf2"));
		root.addLeaf(new Node("leaf3"));
		
		PrintVisitor pv = new PrintVisitor();
		pv.visitTree(root);
	}
}
