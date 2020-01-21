package edu.escuelaing.app;

import edu.escuelaing.app.LinkedListImpl.LinkedList;
import static junit.framework.Assert.*;
import org.junit.jupiter.api.Test;


class LinkedListTest {

	@Test
	void deberiaAgregar() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
            
            assertEquals(15,lh.size());
            
	}
        
        @Test
	void deberiaRemoverPorIndice() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
            assertEquals(15,lh.size());
            
            assertEquals(4,lh.remove(4));
            
            assertEquals(14,lh.size());
            
	}
        
        @Test
	void deberiaRemoverPorObjeto() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }

            assertEquals(15,lh.size());
            
            assertTrue(lh.removeForObject(10));
            
            assertEquals(14,lh.size());
            

               
	}
        
        @Test
	void deberiaDarmeUnObjetoPorSuIndice() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
 
            assertEquals(15,lh.size());
            
            assertEquals(lh.get(6),6);
               
	}
        

}
