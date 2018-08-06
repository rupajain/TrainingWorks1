package com.training.sparkworks;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

public class AverageMilage implements Function2<String, String,String>{
	Double totalMPGCity;
	Double totalMPGHwy;
	
	public double getAverageMPGCity(int count)
	{
		return totalMPGCity/count;
	}
	public String getMPGValue(int count)
	{
		return "";
	}
	
	
	
	@Override
	public String call(String v1, String v2) throws Exception {
		// TODO Auto-generated method stub
		return "";
	}

}
