<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:ddc539ac-0329-426d-93d5-861196f79bbf(Stopwatch.structure)">
  <persistence version="8" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="gy27" modelUID="r:ddc539ac-0329-426d-93d5-861196f79bbf(Stopwatch.structure)" version="-1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="5" implicit="yes" />
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269991496267" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Stopwatch" />
    <property name="rootable" nameId="tpce.1096454100552" value="true" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1580095269991505133" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269991517289" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="principle" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="1580095269991505190" resolveInfo="PrincipleType" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269991517291" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="purpose" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="1580095269991505212" resolveInfo="PurposeType" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269991517294" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="usage" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="1580095269991505252" resolveInfo="UsageType" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269991734890" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="appearance" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269991734809" resolveInfo="Appearance" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992175338" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="maximumTime" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269992175106" resolveInfo="Time" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992197326" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="buttons" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269992175406" resolveInfo="Button" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992197571" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="timelines" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269992197375" resolveInfo="Timeline" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="1580095269991505190" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="PrincipleType" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991505191" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="mechanical" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Mechanical" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991505204" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="digital" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Digital" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="1580095269991505212" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="PurposeType" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991505213" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="everyday" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Everyday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991505241" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="industrial" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Industrial" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="1580095269991505252" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="UsageType" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991505253" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="portable" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Portable" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991505254" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="stationary" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Stationary" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="1580095269991734775" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="ShapeType" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991734776" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="circle" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Circle" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269991734781" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="square" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Square" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269991734809" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Appearance" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269991734846" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="shape" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="1580095269991734775" resolveInfo="ShapeType" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269991734848" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="height" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269991734857" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="width" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992175020" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="color" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269991734952" resolveInfo="ColorReference" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269991734952" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="ColorReference" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992126127" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="reference" />
      <property name="role" nameId="tpce.1071599776563" value="color" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="tpee.1070462154015" resolveInfo="StaticFieldDeclaration" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269992175106" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Time" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269992175133" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="value" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269992175135" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="unit" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="1580095269992175220" resolveInfo="TimeUnitType" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="1580095269992175220" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="TimeUnitType" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175221" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="s" />
      <property name="externalValue" nameId="tpce.1083923523172" value="seconds" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175252" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="ms" />
      <property name="externalValue" nameId="tpce.1083923523172" value="milliseconds" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175255" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="m" />
      <property name="externalValue" nameId="tpce.1083923523172" value="minutes" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175259" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="h" />
      <property name="externalValue" nameId="tpce.1083923523172" value="hours" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269992175406" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Button" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1580095269992175407" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992186360" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="action" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269992186312" resolveInfo="Action" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="1580095269992175484" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="ActionType" />
    <property name="hasNoDefaultMember" nameId="tpce.1212080844762" value="true" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175485" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="start" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Start" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175525" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="pause" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Pause" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="1580095269992175528" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="reset" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Reset" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269992186312" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Action" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1580095269992186315" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="type" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="1580095269992175484" resolveInfo="ActionType" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1580095269992197375" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Timeline" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992197422" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="accuracy" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269992175106" resolveInfo="Time" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1580095269992197424" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="turnAroundTime" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1580095269992175106" resolveInfo="Time" />
    </node>
  </root>
</model>

