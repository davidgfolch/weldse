package es.davidgfolch.cdi.weld.j2se;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.weld.environment.se.contexts.activators.ActivateThreadScope;

@ApplicationScoped
public class InitListener {
	
	@Inject 
	InjectedHelloBean injectedBean;
	
	@ActivateThreadScope
	public String getWelcomeMessage() {
		return "Hi, welcome to the "+InitListener.class.getSimpleName() + "...."+ //
				" Hello " + injectedBean.greet();
	}
}
