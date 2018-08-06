package booleanCaseStudy;

public class NotTerm implements Formula {

	@Override
	public void accept(FormulaVisitor visitor) {
		// TODO Auto-generated method stub
		System.out.println("NotTerm");
		visitor.visit(this);
	}

	

}
