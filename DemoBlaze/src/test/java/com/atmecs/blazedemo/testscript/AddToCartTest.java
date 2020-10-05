package com.atmecs.blazedemo.testscript;



import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.AddtocartPageAction;
import com.atmecs.blazedemo.report.Loggers;


public class AddToCartTest extends BaseClass {
	Loggers log = new Loggers();

	AddtocartPageAction addtocartproduct = new AddtocartPageAction(); 
	public void purchase() throws Exception {
		log.info("add to cart");

		addtocartproduct.addToCart();
		log.info("product has been added to cart");

	}
}





		
