package patterns.collectional.visitor;

public class PrintVisitor extends Visitor {

	@Override
	void visit(Node n) {
		System.out.println(n.getName());
	}
}
