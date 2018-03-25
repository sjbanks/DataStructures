
/**This class sets up various constructors, getters, and setters to create can objects
 * @author sjbanks
 *
 */
public class Can {
//Steven Banks
	//make private class variables
	private String company;
	private String content;
	private double size;
	private double price;
	
	
	/**
	 * Default Can constructor
	 */
	public Can() {
		super();
	}
	
	/**
	 * @param com 	the company that makes the canned product
	 * @param con 	the contents of the can
	 */
	public Can(String com, String con) {
		super();
		setCompany(com);
		setContent(con);
	}
	
	/**
	 * @param com	the company that makes the canned product
	 * @param con	the contents of the can
	 * @param s		the size of the can in ounces
	 * @param p		the price of the can
	 */
	public Can(String com, String con, double s, double p) {
		super();
		setCompany(com);
		setContent(con);
		setSize(s);
		setPrice(p);
	}
	
	/**
	 * @param s		the size of the can in ounces
	 * @param p		the price of the can
	 */
	public Can(double s, double p) {
		setSize(s);
		setPrice(p);
	}
	
	/**
	 * @param com	the name of the company
	 * @param p		the price of the can
	 */
	public Can(String com, double p) {
		setCompany(com);
		setPrice(p);
	}
	
	//Getters and Setters
	/**
	 * @return			the name of the Company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company	sets the name of the company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return			the contents of the can
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content	sets the contents of the can
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return			the size of the can
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size		sets the size of the can
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * @return			the price of the can
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price		sets the price of the can
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	//toString
	@Override
	public String toString() {
		return "Can [company=" + company + ", content=" + content + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
}
