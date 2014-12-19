<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:61dd3078-bf16-4282-aa45-1e303ac3acd8(Schedule.structure)" version="0">
  <persistence version="8" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="5jiq" modelUID="r:61dd3078-bf16-4282-aa45-1e303ac3acd8(Schedule.structure)" version="0" implicit="yes" />
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4951184322560525365" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Schedule" />
    <property name="rootable" nameId="tpce.1096454100552" value="true" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="4951184322560580884" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4951184322560825167" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="daySchedules" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="4951184322560877940" resolveInfo="DaySchedule" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4951184322560825130" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Lecture" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="4951184322560826225" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="presenter" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="4951184322560826227" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="room" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="4951184322560825137" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4951184322560826294" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="timeRange" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="4951184322560826248" resolveInfo="TimeRange" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4951184322560826248" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="TimeRange" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4951184322560826276" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="begin" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="4951184322560826257" resolveInfo="Time" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4951184322560826278" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="end" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="4951184322560826257" resolveInfo="Time" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4951184322560826257" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Time" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="4951184322560826258" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="hours" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="4951184322560826260" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="minutes" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="4951184322560877797" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="Day" />
    <property name="hasNoDefaultMember" nameId="tpce.1212080844762" value="true" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877798" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Sunday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Sunday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877815" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Monday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Monday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877818" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Tuesday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Tuesday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877822" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Wednesday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Wednesday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877837" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Thursday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Thursday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877843" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Friday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Friday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="4951184322560877850" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Saturday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Saturday" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4951184322560877940" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="DaySchedule" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="4951184322560877941" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="day" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="4951184322560877797" resolveInfo="Day" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4951184322560905236" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="lectures" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="4951184322560825130" resolveInfo="Lecture" />
    </node>
  </root>
</model>

