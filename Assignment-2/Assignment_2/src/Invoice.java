/*Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/

public class Invoice {
	
	String partnumber;
	String partdescription;
	int quantity;
	double priceperitem;
	
	
	public Invoice() {
		this.partnumber="0";
		this.partdescription="0";
		this.quantity=0;
		this.priceperitem=0;
		
		
	}
		
	
	
	

	public String getPartnumber() {
		return partnumber;
	}





	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}





	public String getPartdescription() {
		return partdescription;
	}





	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}





	public int getQuantity() {
		return quantity;
	}





	public void setQuantity(int quantity) {
		if (quantity<0)
		this.quantity = quantity;
	}





	public double getPriceperitem() {
		return priceperitem;
	}





	public void setPriceperitem(double priceperitem) {
		if (quantity<0)
		this.priceperitem = priceperitem;
	}
	
	double calculateinvoice() {
		  
		int amt=0;
		amt+=quantity*priceperitem;
		return amt;
	}





	public Invoice(String partnumber, String partdescription, int quantity, double priceperitem) {
		super();
		this.partnumber = partnumber;
		this.partdescription = partdescription;
		this.quantity = quantity;
		this.priceperitem = priceperitem;
	}





	
		
                
	

}
