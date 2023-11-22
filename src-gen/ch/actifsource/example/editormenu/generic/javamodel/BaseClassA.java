package ch.actifsource.example.editormenu.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BaseClassA extends DynamicResource implements IBaseClassA {

  // abstract implementation, only used for static method calls
  private BaseClassA() {
    super(IBaseClassA.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e1a22e7f-8869-11ee-8ced-2d7833d4fb90,8RMkAz7A8KdorwVNAK7iWDjtr78=] */
