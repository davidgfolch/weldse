package es.davidgfolch.cdi.weld.j2se;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class InjectedHelloBean {

	@Inject
	InjectedHelloBean2 bean2;

	public String greet() {
		return InjectedHelloBean.class.getSimpleName() + "!  " + //
				bean2.greet();
	}

}
