package test.java.com.mj.demo;

import main.java.com.mj.demo.MessageService;

import org.junit.Before;
import org.junit.Test;
 

import static org.junit.Assert.assertEquals;
 
public class MessageServiceTest {
 
    private MessageService messageService;
 
    @Before
    public void setUp() {
        messageService = new MessageService();
    }
 
    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello World!", messageService.getMessage());
    }
}