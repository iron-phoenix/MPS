package Schedule.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("Schedule.structure.DaySchedule").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("day").children(new String[]{"lectures"}, new boolean[]{true}).create();
      case 1:
        return new ConceptDescriptorBuilder("Schedule.structure.Lecture").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").properties("presenter", "room").children(new String[]{"timeRange"}, new boolean[]{false}).create();
      case 2:
        return new ConceptDescriptorBuilder("Schedule.structure.Schedule").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"daySchedules"}, new boolean[]{true}).create();
      case 3:
        return new ConceptDescriptorBuilder("Schedule.structure.Time").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("hours", "minutes").create();
      case 4:
        return new ConceptDescriptorBuilder("Schedule.structure.TimeRange").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"begin", "end"}, new boolean[]{false, false}).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"Schedule.structure.DaySchedule", "Schedule.structure.Lecture", "Schedule.structure.Schedule", "Schedule.structure.Time", "Schedule.structure.TimeRange"};
}