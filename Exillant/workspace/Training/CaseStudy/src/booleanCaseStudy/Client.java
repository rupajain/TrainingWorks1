package booleanCaseStudy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula fv=null;
		fv=(Formula) new AndTerm();
		FormulaVisitor f=(FormulaVisitor) new FormulaEvaluator();
		fv.accept(f);
		
		fv=(Formula) new OrTerm();
		fv.accept(f);
		
		fv=(Formula) new XorTerm();
		fv.accept(f);
		
		fv=(Formula) new VarTerm();
		fv.accept(f);
		
		fv=(Formula) new NotTerm();
		fv.accept(f);
		
		
	}

}
