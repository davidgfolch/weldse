package es.davidgfolch.cdi.weld.j2se;


public class InjectedHelloBean2 {
	
	public String greet() {
		return InjectedHelloBean2.class.getSimpleName()+"!";
	}
	
}
