package ch.actifsource.example.editormenu.aspect;

import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.job.Select;

public class MenuItemActionAspect implements ch.actifsource.environment.modelmenu.aspect.IMenuItemActionAspect {

	@Override
	public void run(IModifiable modifiable, PackagedResource selection) {
		if (!selection.getPackage().isModifiable()) return;
		String name = Select.simpleName(modifiable, selection.getResource());
		Update.setSimpleName(modifiable, selection.getResource(), "Prefix_"+name);
	}
	
}
