package es.davidgfolch.cdi.weld.j2se;

import javax.inject.Inject;

public class InitListener {
	
	@Inject 
	InjectedHelloBean injectedBean;
	
	public String getWelcomeMessage() {
		return "Hi, welcome to the "+InitListener.class.getSimpleName() + "...."+ //
				" Hello " + injectedBean.greet();
	}
}
