package src.input;

import java.io.File;

import src.data.Salesman;
import src.data.Receipt;


public abstract class Input {
	
	protected Salesman salesman;
	protected File inputFile;
	protected String inputFilePath;
	protected String name;
	protected String afm;
	protected int receiptID;
	protected String date;
	protected String kind;
	protected double sales;
	protected int items;
	protected String companyName;
	protected String companyCountry;
	protected String companyCity;
	protected String companyStreet;
	protected int companyStreetNumber;

	public abstract void readFile();

	
	public Input() {
		salesman = new Salesman();
		kind  = new String("");
	}
	
	
	public void addSalesman() {
		salesman.setName(name);
		salesman.setAfm(afm);
	}
	
	//changed from object to string
	public void addReceipt( ){
		Receipt receipt = new Receipt();			
		if(kind.equals("Shirts")) {
			receipt.setKind("Shirt");
		}
		else if (kind.equals("Skirts")) {
			receipt.setKind("Skirt");
		}
		else if (kind.equals("Trousers")) {
			receipt.setKind("Trousers");
		}
		else {
			receipt.setKind("Coat");
		}
		
		receipt.setReceiptID(receiptID);
		receipt.setDate(date);
		receipt.setSales(sales);
		receipt.setItems(items);
		receipt.getCompany().setName(companyName);
		receipt.getCompany().getCompanyAddress().setCountry(companyCountry);
		receipt.getCompany().getCompanyAddress().setCity(companyCity);
		receipt.getCompany().getCompanyAddress().setStreet(companyStreet);
		receipt.getCompany().getCompanyAddress().setStreetNumber(companyStreetNumber);
		salesman.getReceipts().add(receipt);
	}

	public Salesman getSalesman() {
		return salesman;
	}


}
