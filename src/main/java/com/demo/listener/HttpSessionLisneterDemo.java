package com.demo.listener;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HttpSessionLisneterDemo implements HttpSessionListener ,ServletContextListener {


    public HttpSessionLisneterDemo() {
        // TODO Auto-generated constructor stub
    }


    public void sessionCreated(HttpSessionEvent se)  { 
      HttpSession session =se.getSession();
      ServletContext servletContext =session.getServletContext();
      AtomicInteger userCount = (AtomicInteger)servletContext.getAttribute("userCount");
      int test=userCount.incrementAndGet(); 
      System.out.println("create a sessin,current session count is:"+test); 
     
    }

     
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	  HttpSession session =se.getSession();
          ServletContext servletContext =session.getServletContext();
          AtomicInteger userCount = (AtomicInteger)servletContext.getAttribute("userCount");
          int test=userCount.decrementAndGet(); 
          System.out.println("destroy a sessin,current session count is:"+test); 
    	
    }

	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContext sc =sce.getServletContext();
		sc.setAttribute("userCount", new AtomicInteger());
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}
	
}
