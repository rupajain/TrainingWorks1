package booleanCaseStudy;

public class OrTerm extends NFoldTerm {
	
	@Override
	public void accept(FormulaVisitor visitor) {
		// TODO Auto-generated method stub
		//super.accept(FormulaVisitor visitor);
		System.out.println("OrTerm");
		visitor.visit(this);
	}
	
}
