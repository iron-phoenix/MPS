package Stopwatch.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0b, fqName)) {
      case 4:
        return new Stopwatch_BehaviorDescriptor();
      case 1:
        return new Appearance_BehaviorDescriptor();
      case 3:
        return new ColorReference_BehaviorDescriptor();
      case 5:
        return new Time_BehaviorDescriptor();
      case 2:
        return new Button_BehaviorDescriptor();
      case 0:
        return new Action_BehaviorDescriptor();
      case 6:
        return new Timeline_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"Stopwatch.structure.Action", "Stopwatch.structure.Appearance", "Stopwatch.structure.Button", "Stopwatch.structure.ColorReference", "Stopwatch.structure.Stopwatch", "Stopwatch.structure.Time", "Stopwatch.structure.Timeline"};
}
