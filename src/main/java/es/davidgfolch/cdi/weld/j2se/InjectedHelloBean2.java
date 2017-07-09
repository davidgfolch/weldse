package es.davidgfolch.cdi.weld.j2se;

import java.io.Serializable;

import org.jboss.weld.environment.se.contexts.ThreadScoped;

@ThreadScoped
//@ApplicationScoped
public class InjectedHelloBean2 implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public String greet() {
		return InjectedHelloBean2.class.getSimpleName()+"!";
	}
	
}
