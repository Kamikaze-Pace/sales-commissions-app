package input;

import static org;

import org.junit.Test;
import org.junit.Before;

import data.Agent;
import data.Receipt;


public class InputTest {
    
    private Input input;

    @Before
    public void setUp() {
        input = new Input();
    }

    @Test
    public void testAddAgent() {
        input.setName("firstName lastName");
        input.setAfm(123456789);
        input.addAgent();

        assertEquals("firstName lastName", input.agent.getName());
        assertEquals(123456789, input.agent.getAfm());
    }

    @Test
    public void testGetAgent(){
        Agent agent = input.getAgent();
        asserntNotNull(agent);
        
        assertEquals("firstName lastName", agent.getName());
        assertEquals(123456789, agent.getAfm());
    }

    @Test
    public void testAddRecipt(){
        input.setKind("Shirts");
        input.setReceiptID(1);
        input.setDate("01/01/2020");
        input.setSales(100);
        input.setItems(10);
        input.setCompanyName("companyName");
        input.setCompanyCountry("companyCountry");
        input.setCompanyCity("companyCity");
        input.setCompanyStreet("companyStreet");
        input.setCompanyStreetNumber(123);

        input.addReceipt();

        Agent agent = input.getAgent();
        assertEquals(1, agent.getReceipts().size());

        Receipt receipt = agent.getReceipts().get(0);
        assertEquals(1, receipt.getReceiptID());
        assertEquals("01/01/2020", receipt.getDate());
        assertEquals(100, receipt.getSales());
        assertEquals(10, receipt.getItems());
        assertEquals("companyName", receipt.getCompany().getName());
        assertEquals("companyCountry", receipt.getCompany().getCompanyAddress().getCountry());
        assertEquals("companyCity", receipt.getCompany().getCompanyAddress().getCity());
        assertEquals("companyStreet", receipt.getCompany().getCompanyAddress().getStreet());
        assertEquals(123, receipt.getCompany().getCompanyAddress().getStreetNumber());


    }

    // Mock class for Input to avoid calling abstract methods
	private static class InputMock extends Input {
		@Override
		public void readFile() {
			// Mock implementation for testing 
			
		}
	}


}
