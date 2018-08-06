package booleanCaseStudy;

public class AndTerm extends NFoldTerm{
@Override
public void accept(FormulaVisitor visitor) {
	// TODO Auto-generated method stub
	//super.accept();
	System.out.println("AnTerm");
	visitor.visit(this);
}
}
