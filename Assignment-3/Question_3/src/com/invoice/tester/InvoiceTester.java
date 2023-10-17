package com.invoice.tester;

import com.invoice.entity.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
	
		
		Invoice inv = new Invoice();
		inv.acceptdata();
	    inv.displaydata();
	    inv.Calculations();
		
	}

}
