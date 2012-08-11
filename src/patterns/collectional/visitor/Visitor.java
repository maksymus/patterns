package patterns.collectional.visitor;

public abstract class Visitor {
	abstract void visit(Node n);
	
	public void visitTree(Node root) {
		root.accept(this);
		for (Node node: root.getLeaves()) {
			visitTree(node);
		}
	}
}
