package ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MulticonjuntoTest {
    @Test
    public void testArrayListMulticonjunto() {
        Multiconjunto<String> m1 = new ArrayListMulticonjunto<>();
        m1.add("elemento1");
        m1.add("elemento2");

        Multiconjunto<String> m2 = new ArrayListMulticonjunto<>();
        m2.add("elemento1");
        m2.add("elemento2");

        assertTrue(m1.equals(m2));

        m1.addAll(m2);
        assertEquals(4, m1.getElements().size());
    }

    @Test
    public void testSetMulticonjunto() {
        Multiconjunto<String> m1 = new SetMulticonjunto<>();
        m1.add("elemento1");
        m1.add("elemento2");

        Multiconjunto<String> m2 = new SetMulticonjunto<>();
        m2.add("elemento1");
        m2.add("elemento2");

        assertTrue(m1.equals(m2));

        m1.addAll(m2);
        assertEquals(2, m1.getElements().size());
        // O Set não permite elementos iguais, portanto ao somar os dois multiconjuntos o tamanho continua 2.
    } 

    @Test
    public void testLinkedListMulticonjunto() {
        Multiconjunto<String> m1 = new LinkedListMulticonjunto<>();
        m1.add("elemento1");
        m1.add("elemento2");

        Multiconjunto<String> m2 = new LinkedListMulticonjunto<>();
        m2.add("elemento1");
        m2.add("elemento2");

        assertTrue(m1.equals(m2));

        m1.addAll(m2);
        assertEquals(4, m1.getElements().size());
    }

    @Test
    public void testStackListMulticonjunto() {
        Multiconjunto<String> m1 = new StackMulticonjunto<>();
        m1.add("elemento1");
        m1.add("elemento2");

        Multiconjunto<String> m2 = new StackMulticonjunto<>();
        m2.add("elemento1");
        m2.add("elemento2");

        assertTrue(m1.equals(m2));

        m1.addAll(m2);
        assertEquals(4, m1.getElements().size());
    }
    
    @Test
    public void testeEquals() {
    	Multiconjunto<String> m1 = new StackMulticonjunto<>();
        m1.add("elemento1");
        m1.add("elemento2");
        
        Multiconjunto<String> m2 = new LinkedListMulticonjunto<>();
        m2.add("elemento1");
        m2.add("elemento2");
        
        Multiconjunto<String> m3 = new SetMulticonjunto<>();
        m3.add("elemento1");
        m3.add("elemento2");
        
        Multiconjunto<String> m4 = new ArrayListMulticonjunto<>();
        m4.add("elemento1");
        m4.add("elemento2");
        
        assertTrue(m1.equals(m2));
        
        //O teste abaixo resulta em falso, pois o Set não garante a ordem dos elementos, portanto os dois Multiconjuntos sãoconsiderados diferentes

        assertFalse(m2.equals(m3));
        assertTrue(m3.equals(m4));
        assertTrue(m4.equals(m1));
    }

}