package org.eclipse.e4.demo.minimal;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

public class ExitHandler {
	
	@Execute
	public void exit(IPresentationEngine engine) {
		engine.stop();
	}
}
