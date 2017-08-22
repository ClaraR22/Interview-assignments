
package test;

import linkedlist.LinkedList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author rachapud
 */


public class TestLinkedList{
    
@Test
    public void test(){
        LinkedList list = new LinkedList();
        assertNull(list.head);
        System.out.println("passed head is null, linkedlist should not be empty !!");
}    
    
}
