package src.output;

import java.io.File;
import src.data.Receipt;


public abstract class ReceiptFileUpdater {

	protected File fileToUpdate;
	protected Receipt receipt;

	// protected String receiptID;
	// protected String date;
	// protected String kind;
	// protected String sales;
	// protected String items;
	// protected String company;
	// protected String country;
	// protected String city;
	// protected String street;
	// protected String number;
		
	public abstract void updateFile();
	public abstract void setFileToUpdate(File fileToUpdate); 

	public void setReceipt(Receipt receipt){
		this.receipt = receipt;
	}

	public Receipt getReceipt(){
		return receipt;
	}

	// public abstract void setReceiptID(String receiptID);
	// public abstract void setDate(String date);
	// public abstract void setKind(String kind);
	// public abstract void setSales(String sales);
	// public abstract void setItems(String items);
	// public abstract void setCompany(String company);
	// public abstract void setCountry(String country); 
	// public abstract void setCity(String city);
	// public abstract void setStreet(String street);
	// public abstract void setNumber(String number);

}

