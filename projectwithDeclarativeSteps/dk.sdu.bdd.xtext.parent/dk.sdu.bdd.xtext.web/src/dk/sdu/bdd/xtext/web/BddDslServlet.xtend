/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.bdd.xtext.web

import javax.servlet.annotation.WebServlet
import org.eclipse.xtext.util.DisposableRegistry
import org.eclipse.xtext.web.servlet.XtextServlet

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = 'XtextServices', urlPatterns = '/xtext-service/*')
class BddDslServlet extends XtextServlet {
	
	static final long serialVersionUID = 1L
	
	DisposableRegistry disposableRegistry
	
	override init() {
		super.init()
		val injector = new BddDslWebSetup().createInjectorAndDoEMFRegistration()
		disposableRegistry = injector.getInstance(DisposableRegistry)
	}
	
	override destroy() {
		if (disposableRegistry !== null) {
			disposableRegistry.dispose()
			disposableRegistry = null
		}
		super.destroy()
	}
	
}
