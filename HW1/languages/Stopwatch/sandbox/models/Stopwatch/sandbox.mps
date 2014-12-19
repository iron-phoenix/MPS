<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:9dead193-a3bc-436e-99c2-bca6c21d5960(Stopwatch.sandbox)">
  <persistence version="8" />
  <language namespace="bd1439b9-1899-479b-a077-67e79f1cd92b(Stopwatch)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <import index="gy27" modelUID="r:ddc539ac-0329-426d-93d5-861196f79bbf(Stopwatch.structure)" version="-1" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="1t7x" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.awt(JDK/java.awt@java_stub)" version="-1" implicit="yes" />
  <root type="gy27.Stopwatch" typeId="gy27.1580095269991496267" id="1580095269992197674" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="DigitalStopwatch" />
    <property name="principle" nameId="gy27.1580095269991517289" value="digital" />
    <node role="appearance" roleId="gy27.1580095269991734890" type="gy27.Appearance" typeId="gy27.1580095269991734809" id="1580095269992197675" nodeInfo="ng">
      <property name="height" nameId="gy27.1580095269991734848" value="50" />
      <property name="width" nameId="gy27.1580095269991734857" value="50" />
      <node role="color" roleId="gy27.1580095269992175020" type="gy27.ColorReference" typeId="gy27.1580095269991734952" id="1580095269992197752" nodeInfo="ng">
        <link role="color" roleId="gy27.1580095269992126127" targetNodeId="1t7x.~Color%dGRAY" resolveInfo="GRAY" />
      </node>
    </node>
    <node role="maximumTime" roleId="gy27.1580095269992175338" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992197677" nodeInfo="ng">
      <property name="value" nameId="gy27.1580095269992175133" value="60" />
      <property name="unit" nameId="gy27.1580095269992175135" value="m" />
    </node>
    <node role="buttons" roleId="gy27.1580095269992197326" type="gy27.Button" typeId="gy27.1580095269992175406" id="1580095269992197678" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="StartPause" />
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992219875" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="start" />
      </node>
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992230941" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="pause" />
      </node>
    </node>
    <node role="buttons" roleId="gy27.1580095269992197326" type="gy27.Button" typeId="gy27.1580095269992175406" id="1580095269992230954" nodeInfo="ng">
      <property name="name" nameId="tpck.1169194664001" value="Reset" />
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992230955" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="reset" />
      </node>
    </node>
    <node role="timelines" roleId="gy27.1580095269992197571" type="gy27.Timeline" typeId="gy27.1580095269992197375" id="1580095269992197680" nodeInfo="ng">
      <node role="accuracy" roleId="gy27.1580095269992197422" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992197681" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="10" />
        <property name="unit" nameId="gy27.1580095269992175135" value="ms" />
      </node>
      <node role="turnAroundTime" roleId="gy27.1580095269992197424" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992197682" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="60" />
      </node>
    </node>
  </root>
  <root type="gy27.Stopwatch" typeId="gy27.1580095269991496267" id="1580095269992615211" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="MechanicalStopwatch" />
    <property name="purpose" nameId="gy27.1580095269991517291" value="industrial" />
    <property name="usage" nameId="gy27.1580095269991517294" value="stationary" />
    <node role="appearance" roleId="gy27.1580095269991734890" type="gy27.Appearance" typeId="gy27.1580095269991734809" id="1580095269992615212" nodeInfo="ng">
      <property name="shape" nameId="gy27.1580095269991734846" value="square" />
      <property name="height" nameId="gy27.1580095269991734848" value="150" />
      <property name="width" nameId="gy27.1580095269991734857" value="90" />
      <node role="color" roleId="gy27.1580095269992175020" type="gy27.ColorReference" typeId="gy27.1580095269991734952" id="1580095269992615220" nodeInfo="ng">
        <link role="color" roleId="gy27.1580095269992126127" targetNodeId="1t7x.~Color%dBLACK" resolveInfo="BLACK" />
      </node>
    </node>
    <node role="maximumTime" roleId="gy27.1580095269992175338" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992615214" nodeInfo="ng">
      <property name="value" nameId="gy27.1580095269992175133" value="150" />
      <property name="unit" nameId="gy27.1580095269992175135" value="h" />
    </node>
    <node role="buttons" roleId="gy27.1580095269992197326" type="gy27.Button" typeId="gy27.1580095269992175406" id="1580095269992615215" nodeInfo="ng">
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992615266" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="start" />
      </node>
    </node>
    <node role="buttons" roleId="gy27.1580095269992197326" type="gy27.Button" typeId="gy27.1580095269992175406" id="1580095269992670430" nodeInfo="ng">
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992670431" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="pause" />
      </node>
    </node>
    <node role="buttons" roleId="gy27.1580095269992197326" type="gy27.Button" typeId="gy27.1580095269992175406" id="1580095269992670440" nodeInfo="ng">
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992670441" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="reset" />
      </node>
    </node>
    <node role="timelines" roleId="gy27.1580095269992197571" type="gy27.Timeline" typeId="gy27.1580095269992197375" id="1580095269992615217" nodeInfo="ng">
      <node role="accuracy" roleId="gy27.1580095269992197422" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992615218" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="10" />
        <property name="unit" nameId="gy27.1580095269992175135" value="ms" />
      </node>
      <node role="turnAroundTime" roleId="gy27.1580095269992197424" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992615219" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="60" />
        <property name="unit" nameId="gy27.1580095269992175135" value="s" />
      </node>
    </node>
    <node role="timelines" roleId="gy27.1580095269992197571" type="gy27.Timeline" typeId="gy27.1580095269992197375" id="1580095269992670448" nodeInfo="ng">
      <node role="accuracy" roleId="gy27.1580095269992197422" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992670449" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="1" />
      </node>
      <node role="turnAroundTime" roleId="gy27.1580095269992197424" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992670450" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="1" />
        <property name="unit" nameId="gy27.1580095269992175135" value="h" />
      </node>
    </node>
  </root>
  <root type="gy27.Stopwatch" typeId="gy27.1580095269991496267" id="1580095269992698858" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="Simple" />
    <node role="appearance" roleId="gy27.1580095269991734890" type="gy27.Appearance" typeId="gy27.1580095269991734809" id="1580095269992698859" nodeInfo="ng">
      <property name="height" nameId="gy27.1580095269991734848" value="30" />
      <property name="width" nameId="gy27.1580095269991734857" value="30" />
      <node role="color" roleId="gy27.1580095269992175020" type="gy27.ColorReference" typeId="gy27.1580095269991734952" id="1580095269992698867" nodeInfo="ng">
        <link role="color" roleId="gy27.1580095269992126127" targetNodeId="1t7x.~Color%dBLUE" resolveInfo="BLUE" />
      </node>
    </node>
    <node role="maximumTime" roleId="gy27.1580095269992175338" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992698861" nodeInfo="ng">
      <property name="value" nameId="gy27.1580095269992175133" value="60" />
    </node>
    <node role="buttons" roleId="gy27.1580095269992197326" type="gy27.Button" typeId="gy27.1580095269992175406" id="1580095269992698862" nodeInfo="ng">
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992698863" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="start" />
      </node>
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992698870" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="pause" />
      </node>
      <node role="action" roleId="gy27.1580095269992186360" type="gy27.Action" typeId="gy27.1580095269992186312" id="1580095269992698873" nodeInfo="ng">
        <property name="type" nameId="gy27.1580095269992186315" value="reset" />
      </node>
    </node>
    <node role="timelines" roleId="gy27.1580095269992197571" type="gy27.Timeline" typeId="gy27.1580095269992197375" id="1580095269992698864" nodeInfo="ng">
      <node role="accuracy" roleId="gy27.1580095269992197422" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992698865" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="1" />
      </node>
      <node role="turnAroundTime" roleId="gy27.1580095269992197424" type="gy27.Time" typeId="gy27.1580095269992175106" id="1580095269992698866" nodeInfo="ng">
        <property name="value" nameId="gy27.1580095269992175133" value="60" />
      </node>
    </node>
  </root>
</model>

