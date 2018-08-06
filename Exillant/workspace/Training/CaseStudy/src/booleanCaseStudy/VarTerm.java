package booleanCaseStudy;

public class VarTerm implements Formula {

	@Override
	public void accept(FormulaVisitor visitor) {
		// TODO Auto-generated method stub
		System.out.println("VarTerm");
		visitor.visit(this);
	}

	

}
