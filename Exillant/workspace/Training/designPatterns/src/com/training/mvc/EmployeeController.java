package com.training.mvc;

public class EmployeeController {
private Employee model;
private StarView starView;
private DashView dashView;
//private DashView dashView;
public EmployeeController(Employee model, StarView starView) {
	super();
	this.model = model;
	this.starView = starView;
}
public Employee getModel() {
	return model;
}
public void setModel(Employee model) {
	this.model = model;
}
public StarView getStarView() {
	return starView;
}
public void setStarView(StarView starView) {
	this.starView = starView;
}
public void updateView(String viewType)
{
	starView.printEmployee(model);
}
public void updateView1(String viewType)
{
	dashView.printEmployee(model);
}

}
