package input;

import org.junit.Test;
import org.junit.Before;


public class TXTInput {
    
    @Before
    public void setup(){
        TXTInput txtInput = new TXTInput();
    }

    @Test
    public void testReadFile() {
        // Create a temporary file with sample content for testing
        File tempFile = createTempFileWithContent("Name: firstName lastName\nAFM: 123456789\nReceipt ID: 1\nDate: 01/01/2023\nKind: Shirt\nSales: 100.0\nItems: 5\nCompany: testCompany\nCountry: testCountry\nCity: testCity\nStreet: testStreet\nNumber: 123");

        // Create a TXTInput instance with the temporary file
        TXTInput txtInput = new TXTInput(tempFile);

        // Call the readFile method to populate the attributes
        txtInput.readFile();

        // Verify that the attributes are set correctly
        assertEquals("firstName lastName", txtInput.getName());
        assertEquals("123456789", txtInput.getAfm());
        assertEquals(1, txtInput.getReceiptID());
        assertEquals("01/01/2023", txtInput.getDate());
        assertEquals("Shirt", txtInput.getKind());
        assertEquals(100.0, txtInput.getSales(), 0.01);
        assertEquals(5, txtInput.getItems());
        assertEquals("testCompanyName", txtInput.getCompanyName());
        assertEquals("testCountry", txtInput.getCompanyCountry());
        assertEquals("testCity", txtInput.getCompanyCity());
        assertEquals("testStreet", txtInput.getCompanyStreet());
        assertEquals(123, txtInput.getCompanyStreetNumber());

        // Clean up: delete the temporary file
        tempFile.delete();
    }

    private File createTempFileWithContent(String content) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");
            java.nio.file.Files.write(tempFile.toPath(), content.getBytes());
            return tempFile;
        } catch (Exception e){
            throw new RuntimeException("Error creating temporary file", e);
        }
    }

}
