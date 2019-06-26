package org.example.domainmodel.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.domainmodel.domainmodel.AbstractElement;
import org.example.domainmodel.domainmodel.Domainmodel;
import org.example.domainmodel.domainmodel.Entity;
import org.example.domainmodel.domainmodel.Property;
import org.example.domainmodel.tests.DomainmodelInjectorProvider;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DomainmodelInjectorProvider.class)
@SuppressWarnings("all")
public class DomainmodelParsingTest {
  @Inject
  private ParseHelper<Domainmodel> parseHelper;
  
  @Test
  public void parseDomainmodel() {
    try {
      final Domainmodel model = this.parseHelper.parse(
        "entity MyEntity {\r\n                parent: MyEntity\r\n            }");
      AbstractElement _head = IterableExtensions.<AbstractElement>head(model.getElements());
      final Entity entity = ((Entity) _head);
      Assert.assertSame(entity, IterableExtensions.<Property>head(entity.getProperties()).getType());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
