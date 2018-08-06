package com.training.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyClass {
private List questionBank;
private Set addressSet;
//Map accountMap;

private AccountMap accountMap;

public AccountMap getAccountMap() {
	return accountMap;
}
public void setAccountMap(AccountMap accountMap) {
	this.accountMap = accountMap;
}
public List getQuestionBank() {
	return questionBank;
}
public void setQuestionBank(List questionBank) {
	this.questionBank = questionBank;
}
public Set getAddressSet() {
	return addressSet;
}
public void setAddressSet(Set addressSet) {
	this.addressSet = addressSet;
}
//public Map getAccountMap() {
//	return accountMap;
//}
//public void setAccountMap(Map accountMap) {
//	this.accountMap = accountMap;
//}
@Override
public String toString() {
	return "MyClass [questionBank=" + questionBank + ", addressSet=" + addressSet + ", accountMap=" + accountMap + "]";
}

}
