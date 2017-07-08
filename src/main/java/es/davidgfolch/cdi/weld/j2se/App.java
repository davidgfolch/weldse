package es.davidgfolch.cdi.weld.j2se;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App {
	
	public static void main(String... args) {
		//Initializations triggers ContainerInitializationObserver.observeWeldInit(@Observes ContainerInitialized event)
		System.out.println("Initializing...");
		WeldContainer weld = new Weld().initialize();
		System.out.println("Selecting bean...");
		InjectedHelloBean t = weld.instance().select(InjectedHelloBean.class).get();
		System.out.println(t.greet());
	}
}
