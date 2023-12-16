package output;

import org.junit.Test;
import org.junit.Before;    


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
    
public class ReportTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        //Create a mock Agent for testing 
        Agent mockAgent = Mockito.mock(Agent.class);

        //Create a Report implementation
        Report report = new Report() {
            @Override
            public void saveFile() {
                // TODO Auto-generated method stub
            }
        };
        

    }
}
    