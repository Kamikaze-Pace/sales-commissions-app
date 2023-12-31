package src.output;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import src.data.Salesman;

public class XMLReport extends Report{

		
	public XMLReport(Salesman salesman){
			this.salesman = salesman;
	}	

		
	public void saveFile() {
		String fullPathName =  "/users/Nick/Desktop/Reports/" + salesman.getAfm() + "_SALES.xml";
        try {
        	 DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        	 DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        	 Document document = documentBuilder.newDocument();
        	 // root element
        	 Element agentElem = document.createElement("Agent");
        	 document.appendChild(agentElem);
        	 
        	
        	 
        	 Element name = document.createElement("Name");
        	 name.appendChild(document.createTextNode(salesman.getName()));
        	 agentElem.appendChild(name);
        	 
        	 Element afm = document.createElement("AFM");
        	 afm.appendChild(document.createTextNode(salesman.getAfm()));	
        	 agentElem.appendChild(afm);
        	 
        	 Element totalSales = document.createElement("TotalSales");
        	 totalSales.appendChild(document.createTextNode(Double.toString(salesman.calculateTotalSales())));
        	 agentElem.appendChild(totalSales);
        	 
        	 Element trouserSales = document.createElement("TrouserSales");
        	 trouserSales.appendChild(document.createTextNode(Float.toString(salesman.calculateTrouserSales())));
        	 agentElem.appendChild(trouserSales);
        	 
        	 Element skirtsSales = document.createElement("SkirtsSales");
        	 skirtsSales.appendChild(document.createTextNode(Float.toString(salesman.calculateSkirtsSales())));
        	 agentElem.appendChild(skirtsSales);
        	 
        	 Element shirtsSales = document.createElement("ShirtsSales");
        	 shirtsSales.appendChild(document.createTextNode(Float.toString(salesman.calculateShirtsSales())));
        	 agentElem.appendChild(shirtsSales);
        	 
        	 Element coatsSales = document.createElement("CoatsSales");
        	 coatsSales.appendChild(document.createTextNode(Float.toString(salesman.calculateCoatsSales())));
        	 agentElem.appendChild(coatsSales);
        	 
        	 Element commission = document.createElement("Commission");
        	 commission.appendChild(document.createTextNode(Double.toString(salesman.calculateCommission())));
        	 agentElem.appendChild(commission);
        
        	 
        	 
        	 TransformerFactory transformerFactory = TransformerFactory.newInstance();
        	 Transformer transformer = transformerFactory.newTransformer();
        	 transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        	 transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        	 DOMSource domSource = new DOMSource(document);
        	 StreamResult streamResult = new StreamResult(new File(fullPathName));
        	 transformer.transform(domSource, streamResult);
      
    		
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    		
	}

}

