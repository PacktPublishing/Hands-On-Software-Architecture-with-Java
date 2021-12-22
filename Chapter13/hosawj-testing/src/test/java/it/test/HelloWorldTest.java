package it.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HelloWorldTest {
    
    HelloWorld hello;

    @BeforeEach
    public void buildHello()
    {
        this.hello= new HelloWorld();
    }

    @Test
    public void testConstructor()
    {
        Assertions.assertEquals(this.hello.getWho(), "default");
    }

    @Test
    public void testGetterSetter()
    {
        String name="Giuseppe";
        this.hello.setWho(name);
        Assertions.assertEquals(this.hello.getWho(),name);
    }
    @Test
    public void testDoIt()
    {
        String name="Giuseppe";
        String expected="Hello "+name;
        this.hello.setWho(name);
        Assertions.assertEquals(this.hello.doIt(),expected);
    }


}
