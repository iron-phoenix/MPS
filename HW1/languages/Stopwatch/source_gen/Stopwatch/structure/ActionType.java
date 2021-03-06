package Stopwatch.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum ActionType {
  Start("Start", "start"),
  Pause("Pause", "pause"),
  Reset("Reset", "reset");

  private String myName;

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public static List<ActionType> getConstants() {
    List<ActionType> list = ListSequence.fromList(new LinkedList<ActionType>());
    ListSequence.fromList(list).addElement(ActionType.Start);
    ListSequence.fromList(list).addElement(ActionType.Pause);
    ListSequence.fromList(list).addElement(ActionType.Reset);
    return list;
  }

  public static ActionType getDefault() {
    return null;
  }

  public static ActionType parseValue(String value) {
    if (value == null) {
      return ActionType.getDefault();
    }
    if (value.equals(ActionType.Start.getValueAsString())) {
      return ActionType.Start;
    }
    if (value.equals(ActionType.Pause.getValueAsString())) {
      return ActionType.Pause;
    }
    if (value.equals(ActionType.Reset.getValueAsString())) {
      return ActionType.Reset;
    }
    return ActionType.getDefault();
  }

  private String myValue;

  ActionType(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getValue() {
    return this.myValue;
  }
}
