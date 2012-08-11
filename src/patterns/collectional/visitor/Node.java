package patterns.collectional.visitor;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private List<Node> leaves = new ArrayList<Node>();
	private String name;
	
	public Node(String name) {
		this.name = name;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public List<Node> getLeaves() {
		return leaves;
	}
	
	public void addLeaf(Node node) {
		leaves.add(node);
	}
	
	public String getName() {
		return name;
	}
}
