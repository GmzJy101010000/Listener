package com.demo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletConectListenerDemo implements ServletContextListener{

	public ServletConectListenerDemo() {
		System.out.println("listner construter");
	}

	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContext sc=sce.getServletContext();
		sc.setAttribute("zgm", "888");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletConectListener is detroyed!!");
		
	}

}
