package com.exilant.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest01 {

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
		ScriptEngineManager scriptengineManager = new ScriptEngineManager();
		ScriptEngine nashorn=scriptengineManager.getEngineByName("nashorn");
		String name="rupa";
		Integer result=null;
		nashorn.eval("print('"+name+"')");
		result=(Integer)nashorn.eval("10+20");
		System.out.println("result is"+result);
	}

}
