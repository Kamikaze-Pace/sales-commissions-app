package src.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import src.data.Receipt;

public class TXTReceiptFileUpdater extends ReceiptFileUpdater{

	public  void setFileToUpdate(File fileToUpdate) {
		
		this.fileToUpdate = fileToUpdate;
		
	}

	public void updateFile(){
		System.out.println("Mpike sto TXT");
		System.out.println(fileToUpdate.getAbsolutePath());

		try {
			
			FileWriter fileWriter = new FileWriter(fileToUpdate,true);		
			fileWriter.write("\n");
			fileWriter.write("Receipt ID: ");
			fileWriter.write(receipt.getReceiptID());
			fileWriter.write("\n");

			fileWriter.write("Date: ");
			fileWriter.write(receipt.getDate());
			fileWriter.write("\n");

			fileWriter.write("Kind: ");
			fileWriter.write(receipt.getKind());
			fileWriter.write("\n");

			fileWriter.write("Sales: ");
			fileWriter.write(Double.toString(receipt.getSales()));
			fileWriter.write("\n");

			fileWriter.write("Items: ");
			fileWriter.write(receipt.getItems());
			fileWriter.write("\n");

			fileWriter.write("Company: ");
			fileWriter.write(receipt.getCompany().getName());
			fileWriter.write("\n");


			fileWriter.write("Country: ");
			fileWriter.write(receipt.getCompany().getCompanyAddress().getCountry());
			fileWriter.write("\n");
			
			fileWriter.write("City: ");
			fileWriter.write(receipt.getCompany().getCompanyAddress().getCity());
			fileWriter.write("\n");

			fileWriter.write("Street: ");
			fileWriter.write(receipt.getCompany().getCompanyAddress().getStreet());	
			fileWriter.write("\n");

			fileWriter.write("Number: ");
			fileWriter.write(receipt.getCompany().getCompanyAddress().getStreetNumber());
			fileWriter.write("\n");

			fileWriter.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	// public void setReceiptID(String receiptID) {
	// 	this.receiptID = receiptID;
	// }


	// public void setDate(String date) {
	// 	this.date = date;
	// }


	// public void setKind(String kind) {
	// 	this.kind = kind;
	// }



	// public void setSales(String sales) {
	// 	this.sales = sales;
	// }



	// public void setItems(String items) {
	// 	this.items = items;
	// }


	// public void setCompany(String company) {
	// 	this.company = company;
	// }


	// public void setCountry(String country) {
	// 	this.country = country;
	// }


	// public void setCity(String city) {
	// 	this.city = city;
	// }


	// public void setStreet(String street) {
	// 	this.street = street;
	// }

	// public void setNumber(String number) {
	// 	this.number = number;
	// }


}
