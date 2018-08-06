package com.exilant.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest02 {
public static void main(String[] args) throws FileNotFoundException, ScriptException {
	ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
	ScriptEngine nashorn=scriptEngineManager.getEngineByName("Nashorn");
	nashorn.eval(new FileReader("resources/com/js/external.js"));
	System.out.println(nashorn.eval("fnTest()"));
	System.out.println(nashorn.eval("sayHello('harry')"));
}
}
