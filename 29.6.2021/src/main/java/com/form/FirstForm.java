package com.form;

import org.apache.struts.action.ActionForm;

public class FirstForm  extends ActionForm{
 
String message ="it will instiat ";

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
  
}
