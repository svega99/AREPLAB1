package edu.escuelaing.app;

import edu.escuelaing.app.LinkedListImpl.LinkedList;
import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;



class Lab1ApplicationTests {

	@Test
	void deberiaAgregar() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
            
            assertEquals(15,lh.size());
            
	}

}
