package com.edu.rafael;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class ListenerSessao
 *
 */
@WebListener
public class ListenerSessao implements HttpSessionAttributeListener {

	/**
	 * Default constructor.
	 */
	public ListenerSessao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		try {
			FileWriter fw = new FileWriter(
					"C:\\Users\\Std treinamento\\git\\pos_java_JEE\\exemplosessao\\src\\main\\java\\com\\edu\\rafael",
					true);
			fw.write("usuário armazenado na sessão" + new Date().toString() + "\r\n");
			fw.close();
			

		} catch (Exception e) {

		}
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

}
