package es.davidgfolch.cdi.weld.j2se;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

@ApplicationScoped
public class ContainerInitializationObserver {

	@Inject
	@Parameters
	List<String> parameters;

	@Inject
	InitListener initListener;

	public void observeWeldInit(@Observes ContainerInitialized event) {
		System.out.println(initListener.getWelcomeMessage());
		System.out.println("Parameters: "+parameters.size());
	}
}