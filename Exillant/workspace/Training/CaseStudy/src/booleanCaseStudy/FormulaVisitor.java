package booleanCaseStudy;

public interface FormulaVisitor {
public void visit(XorTerm formula);
public void visit(AndTerm formula);
public void visit(OrTerm formula);
public void visit(VarTerm formula);
public void visit(NotTerm formula);

}
