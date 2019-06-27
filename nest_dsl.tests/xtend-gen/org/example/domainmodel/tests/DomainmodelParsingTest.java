package org.example.domainmodel.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)/* 
@InjectWith(/* name is null */) */
@SuppressWarnings("all")
public class DomainmodelParsingTest {
  @Inject
  private /* ParseHelper<Domainmodel> */Object parseHelper;
  
  @Test
  public void parseDomainmodel() {
    throw new Error("Unresolved compilation problems:"
      + "\nEntity cannot be resolved to a type."
      + "\nThe field DomainmodelParsingTest.parseHelper refers to the missing type Domainmodel"
      + "\nelements cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nhead cannot be resolved"
      + "\ntype cannot be resolved");
  }
}
