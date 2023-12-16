package src.output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import src.data.Salesman;


public class TXTReport extends Report{

	
	public TXTReport(Salesman salesman){
		this.salesman = salesman;
	}
	
	
	public void saveFile() {
        BufferedWriter bufferedWriter = null;
        try{
        	String fullPathName =  "/users/Nick/Desktop/Reports/" + salesman.getAfm() + "_SALES.txt";
        	bufferedWriter = new BufferedWriter(new FileWriter(new File(fullPathName)));
            
        	bufferedWriter.write("Name: " + salesman.getName()); 
            bufferedWriter.newLine();

            bufferedWriter.write("AFM: " + salesman.getAfm());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.newLine();

            
            bufferedWriter.write("Total Sales: " + salesman.calculateTotalSales());
            bufferedWriter.newLine();
 
            bufferedWriter.write("Trousers Sales: " + salesman.calculateTrouserSales());
            bufferedWriter.newLine();

            bufferedWriter.write("Skirts Sales: " + salesman.calculateSkirtsSales());
            bufferedWriter.newLine();

            bufferedWriter.write("Shirts Sales: " + salesman.calculateShirtsSales());
            bufferedWriter.newLine();
            
            bufferedWriter.write("Coats Sales: " + salesman.calculateCoatsSales());
            bufferedWriter.newLine();

            bufferedWriter.write("Commission: " + salesman.calculateCommission());
            
        	bufferedWriter.close();


        }catch (IOException ex){
			JOptionPane.showMessageDialog(null,"������ ������ �������� ���� ��� ���������� ��� �������");

        }
		
	}

}
