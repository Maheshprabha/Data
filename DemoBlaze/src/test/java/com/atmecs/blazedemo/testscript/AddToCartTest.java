package com.atmecs.blazedemo.testscript;



import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.AddtocartPageAction;


public class AddToCartTest extends BaseClass {
	AddtocartPageAction addtocartproduct = new AddtocartPageAction(); 
	public void purchase() throws Exception {
		addtocartproduct.addToCart();
	}
}





		
