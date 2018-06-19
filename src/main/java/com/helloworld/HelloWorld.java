package com.helloworld;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Boris Misljencevic
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
      
   private static final long serialVersionUID = 1L;

   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
	   
	  String text = "Hello World!";	  
	  String upperCase = UpperCase.upperCase(text);
      resp.setContentType("text/plain");
      resp.getWriter().write(upperCase);
   }
}