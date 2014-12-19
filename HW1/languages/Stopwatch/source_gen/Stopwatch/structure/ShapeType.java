package Stopwatch.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum ShapeType {
  Circle("Circle", "circle"),
  Square("Square", "square");

  private String myName;

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public static List<ShapeType> getConstants() {
    List<ShapeType> list = ListSequence.fromList(new LinkedList<ShapeType>());
    ListSequence.fromList(list).addElement(ShapeType.Circle);
    ListSequence.fromList(list).addElement(ShapeType.Square);
    return list;
  }

  public static ShapeType getDefault() {
    return ShapeType.Circle;
  }

  public static ShapeType parseValue(String value) {
    if (value == null) {
      return ShapeType.getDefault();
    }
    if (value.equals(ShapeType.Circle.getValueAsString())) {
      return ShapeType.Circle;
    }
    if (value.equals(ShapeType.Square.getValueAsString())) {
      return ShapeType.Square;
    }
    return ShapeType.getDefault();
  }

  private String myValue;

  ShapeType(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getValue() {
    return this.myValue;
  }
}