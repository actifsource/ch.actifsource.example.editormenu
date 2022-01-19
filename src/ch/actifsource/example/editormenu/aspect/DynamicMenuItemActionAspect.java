package ch.actifsource.example.editormenu.aspect;

import ch.actifsource.core.INode;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.environment.modelmenu.aspect.IDynamicMenuItemActionAspect;

public class DynamicMenuItemActionAspect implements IDynamicMenuItemActionAspect {

  /**
   * Returns all dynamic sub items.
   */
  public INodeSet getItems(IReadJobExecutor executor, PackagedResource resource) {
    return Select.types(executor, resource.getResource());
  }
  
  /**
   * Return the menu name from the item.
   */
  public String getItemName(IReadJobExecutor executor, PackagedResource resource, INode item) {
    return Select.simpleName(executor, item);
  }
  
  /**
   * Run the menu item action.
   * @param modifiable   Global modifications allowed
   * @param resource     Selected resource 
   */
  public void run(IModifiable modifiable, PackagedResource resource, INode item) {
    
  }
  
}
