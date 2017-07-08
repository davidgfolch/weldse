package es.davidgfolch.cdi.weld.j2se;

import javax.inject.Inject;

public class InjectedHelloBean {

	@Inject
	InjectedHelloBean2 bean2;

	public String greet() {
		return InjectedHelloBean.class.getSimpleName() + "!  " + //
				bean2.greet();
	}

}
