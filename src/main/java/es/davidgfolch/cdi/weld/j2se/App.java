package es.davidgfolch.cdi.weld.j2se;

import org.jboss.weld.environment.se.StartMain;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App {
	
	public static void main(String... args) {
		//Initializations triggers ContainerInitializationObserver.observeWeldInit(@Observes ContainerInitialized event)
		Weld weld = new Weld();
		weld.property(Weld.DEV_MODE_SYSTEM_PROPERTY, true);

		System.out.println("Initializing...");
		StartMain.main(args);
		
//		weld.containerId("myContainer");
//		WeldContainer wContdainer = weld.initialize();  //THIS WAY OF INITIALIZATIONS GIVES runtimeError for parameters injection.. see ContainerInitializationObserver
		
//		System.out.println("Selecting bean...");
//		InjectedHelloBean t = weld.instance().select(InjectedHelloBean.class).get();
//		System.out.println(t.greet());
	}
}
