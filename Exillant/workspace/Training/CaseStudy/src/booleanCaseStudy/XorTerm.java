package booleanCaseStudy;

public class XorTerm implements Formula{

	@Override
	public void accept(FormulaVisitor visitor) {
		System.out.println("XoTerm");
		visitor.visit(this);
	}

	
}
