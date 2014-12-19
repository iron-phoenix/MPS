package Schedule.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Time_Constraints extends BaseConstraintsDescriptor {
  public Time_Constraints() {
    super("Schedule.structure.Time");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("hours", new BasePropertyConstraintsDescriptor("hours", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "hours";
        if (SPropertyOperations.getInteger(node, "hours") < 0 || SPropertyOperations.getInteger(node, "hours") > 24) {
          return false;
        }
        if (SPropertyOperations.getInteger(node, "minutes") < 0 || SPropertyOperations.getInteger(node, "minutes") > 60) {
          return false;
        }
        return true;
      }
    });
    return properties;
  }
}