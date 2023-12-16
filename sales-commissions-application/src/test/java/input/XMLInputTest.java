package input;

import org.junit.Test;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import org.junit.jupiter.api.Test;

public class XMLInputTest {

    @Test
    public void testReadFile() {
        // Create a temporary XML file with sample content for testing
        File tempFile = createTempFileWithContent(
                "<Agent>" +
                        "  <Name>firstName lastName</Name>" +
                        "  <AFM>123456789</AFM>" +
                        "  <Receipt>" +
                        "    <ReceiptID>1</ReceiptID>" +
                        "    <Date>01/01/2023</Date>" +
                        "    <Kind>Shirt</Kind>" +
                        "    <Sales>100.0</Sales>" +
                        "    <Items>5</Items>" +
                        "    <Company>testCompanyName</Company>" +
                        "    <Country>testCountry</Country>" +
                        "    <City>testCity</City>" +
                        "    <Street>testStreet</Street>" +
                        "    <Number>123</Number>" +
                        "  </Receipt>" +
                        "</Agent>");

        // Create an XMLInput instance with the temporary file
        XMLInput xmlInput = new XMLInput(tempFile);

        // Call the readFile method to populate the attributes
        xmlInput.readFile();

        // Verify that the attributes are set correctly
        assertEquals("firstName lastName", xmlInput.getName());
        assertEquals("123456789", xmlInput.getAfm());
        assertEquals(1, xmlInput.getReceiptID());
        assertEquals("01/01/2023", xmlInput.getDate());
        assertEquals("Shirt", xmlInput.getKind());
        assertEquals(100.0, xmlInput.getSales(), 0.01);
        assertEquals(5, xmlInput.getItems());
        assertEquals("testCompanyName", xmlInput.getCompanyName());
        assertEquals("testCountry", xmlInput.getCompanyCountry());
        assertEquals("testCity", xmlInput.getCompanyCity());
        assertEquals("testStreet", xmlInput.getCompanyStreet());
        assertEquals(123, xmlInput.getCompanyStreetNumber());

        // Clean up: delete the temporary file
        tempFile.delete();
    }

    private File createTempFileWithContent(String content) {
        try {
            File tempFile = File.createTempFile("temp", ".xml");
            java.nio.file.Files.write(tempFile.toPath(), content.getBytes());
            return tempFile;
        } catch (Exception e) {
            throw new RuntimeException("Error creating temporary file.", e);
        }
    }
}
