package str;

import java.util.Date;

public class Product{

	private int productId;
	private String proName;
	private double price;
	private String productname;
	private Date startdate;
	/*Testing testing;*/
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public void setProductId(int productId)
	{
	    this.productId = productId;
	}
	public int getProductId()
	{
	    return productId;
	}
	 
	public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}
	 
	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}
	/*public Testing getTesting() {
		return testing;
	}
	public void setTesting(Testing testing) {
		this.testing = testing;
	}*/

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
}