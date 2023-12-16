package src.data;

public class Receipt {
	protected int receiptId;
	protected String date;
	protected String kind;
	protected double sales;
	protected int items;
	protected Company company;
		
	
	public Receipt(){
		kind = new String("No specific kind");
		company  = new Company();
	}
		
	//Getters and Setters for all the fields of the class
	public void setReceiptID(int id) {
		this.receiptId = id;		
		
	}
	
	public int getReceiptID() {
		return receiptId;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
		
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getSales() {
		return sales;
	}
	
	public void setItems(int items) {
		this.items = items;
	}
	
	public int getItems() {
		return this.items;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;			
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Company getCompany(){
		return company;
	}

}
