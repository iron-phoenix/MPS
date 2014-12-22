<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:78d77afe-f14e-4e34-852d-f0c9aa35b022(Tracer.structure)">
  <persistence version="8" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <import index="2dr5" modelUID="r:78d77afe-f14e-4e34-852d-f0c9aa35b022(Tracer.structure)" version="-1" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1812980409690692916" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="CallingTracer" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="1180016765149961969" resolveInfo="Tracer" />
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1180016765149981988" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Log" />
    <property name="rootable" nameId="tpce.1096454100552" value="true" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1812980409699702709" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="format" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1812980409699702693" resolveInfo="LogFormat" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1180016765149981993" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="tracers" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="1180016765149961969" resolveInfo="Tracer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="1180016765150183681" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1812980409699702693" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="LogFormat" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1812980409699702696" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="time" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657063" resolveInfo="boolean" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1180016765149981984" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="ModificationsTracer" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="1180016765149961969" resolveInfo="Tracer" />
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="5504672902128765330" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="ReferencesTracer" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="1180016765149961969" resolveInfo="Tracer" />
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1180016765149961969" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Tracer" />
    <property name="abstract" nameId="tpce.4628067390765956802" value="true" />
    <property name="final" nameId="tpce.4628067390765956807" value="false" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
  </root>
</model>

