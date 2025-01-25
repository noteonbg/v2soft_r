package com.example.testingweb.poc.another;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.testingweb.poc.another.HelloApplication.Greeter;
import com.example.testingweb.poc.another.HelloApplication.HelloActable;
import com.example.testingweb.poc.another.HelloApplication.HelloAction;

public class HelloActionUnitTest {
   
   Greeter helloGreeterMock;
   Appendable helloWriterMock;
   HelloActable helloAction;
   
   @BeforeEach
   public void setUp() {
      helloGreeterMock = mock(Greeter.class);
      helloWriterMock = mock(Appendable.class);
      helloAction = new HelloAction(helloGreeterMock, helloWriterMock);
   }
   
   @Test
   public void testSayHello() throws Exception {
      when(helloWriterMock.append(any(String.class))).thenReturn(helloWriterMock);
      when(helloGreeterMock.getIntroduction(eq("unitTest"))).thenReturn("unitTest : ");
      when(helloGreeterMock.getGreeting(eq("world"))).thenReturn("hi world");
      
      helloAction.sayHello("unitTest", "world");
      
      verify(helloGreeterMock).getIntroduction(eq("unitTest"));
      verify(helloGreeterMock).getGreeting(eq("world"));

      verify(helloWriterMock, times(2)).append(any(String.class));
      verify(helloWriterMock, times(1)).append(eq("unitTest : "));
      verify(helloWriterMock, times(1)).append(eq("hi world"));
   }
}