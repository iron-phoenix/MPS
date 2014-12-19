package Schedule.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class TimeRange_Constraints extends BaseConstraintsDescriptor {
  public TimeRange_Constraints() {
    super("Schedule.structure.TimeRange");
  }

  @Override
  public boolean hasOwnCanBeParentMethod() {
    return true;
  }

  @Override
  public boolean canBeParent(SNode node, @Nullable SNode childNode, SNode childConcept, SNode link, IOperationContext operationContext, @Nullable CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAParent(node, childNode, childConcept, link, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeParentBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAParent(SNode node, SNode childNode, SNode childConcept, SNode link, final IOperationContext operationContext) {
    if (SPropertyOperations.getInteger(SLinkOperations.getTarget(node, "begin", true), "hours") > SPropertyOperations.getInteger(SLinkOperations.getTarget(node, "end", true), "hours")) {
      return false;
    }
    if (SPropertyOperations.getInteger(SLinkOperations.getTarget(node, "begin", true), "hours") <= SPropertyOperations.getInteger(SLinkOperations.getTarget(node, "end", true), "hours")) {
      if (SPropertyOperations.getInteger(SLinkOperations.getTarget(node, "begin", true), "minutes") > SPropertyOperations.getInteger(SLinkOperations.getTarget(node, "end", true), "minutes")) {
        return false;
      }
    }
    return true;
  }

  private static SNodePointer canBeParentBreakingPoint = new SNodePointer("r:c871f3f8-f949-4a5e-83a0-8750a941f55c(Schedule.constraints)", "5187177448639834697");
}