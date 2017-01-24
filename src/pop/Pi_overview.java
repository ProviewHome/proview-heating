import jpwr.rt.*;
import jpwr.jop.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Pi_overview extends JopFrame implements JopUtilityIfc {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  JopAxisarc	jopAxisarc2;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter17;
  pwr_valuereliefdown	pwr_valuereliefdown19;
  pwr_indsquarelarge	pwr_indsquarelarge91;
  pwr_indsquarelarge	pwr_indsquarelarge92;
  pwr_indsquarelarge	pwr_indsquarelarge93;
  pwr_indsquarelarge	pwr_indsquarelarge94;
  pwr_indsquarelarge	pwr_indsquarelarge95;
  pwr_indsquarelarge	pwr_indsquarelarge96;
  pwr_indsquarelarge	pwr_indsquarelarge97;
  pwr_indsquarelarge	pwr_indsquarelarge98;
  pwr_indsquarelarge	pwr_indsquarelarge99;
  pwr_indsquarelarge	pwr_indsquarelarge100;
  pwr_indsquarelarge	pwr_indsquarelarge101;
  pwr_indsquarelarge	pwr_indsquarelarge102;
  ssg5271_controller	ssg5271_controller116;
  sis032260_transmitter	sis032260_transmitter117;
  sis032260_transmitter	sis032260_transmitter122;
  sis032260_transmitter	sis032260_transmitter123;
  sis032260_transmitter	sis032260_transmitter124;
  pwr_valuereliefdown	pwr_valuereliefdown126;
  pwr_valuereliefdown	pwr_valuereliefdown127;
  pwr_valuereliefdown	pwr_valuereliefdown128;
  pwr_indsquarelarge	pwr_indsquarelarge129;
  pwr_indsquarelarge	pwr_indsquarelarge130;
  pwr_indsquarelarge	pwr_indsquarelarge131;
  JopTrend	jopTrend135;
  JopAxis	jopAxis136;
  JopTrend	jopTrend137;
  JopTrend	jopTrend138;
  pwr_valuereliefdown	pwr_valuereliefdown140;
  pwr_valuereliefdown	pwr_valuereliefdown141;
  pwr_valuereliefdown	pwr_valuereliefdown142;
  pwr_valuelargecenter	pwr_valuelargecenter148;
  JopTrend	jopTrend163;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter164;
  JopAxis	jopAxis165;
  JopAxis	jopAxis166;
  pwr_valuelargecenter	pwr_valuelargecenter170;
  pwr_valuelargecenter	pwr_valuelargecenter171;
  JopAxis	jopAxis174;
  pwr_buttoninfo	pwr_buttoninfo185;
  pwr_valuelargecenter	pwr_valuelargecenter187;
  pwr_valuelargecenter	pwr_valuelargecenter189;
  pwr_valuelargecenter	pwr_valuelargecenter190;
  pwr_valuelargecenter	pwr_valuelargecenter191;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter192;
  pwr_trafficlight	pwr_trafficlight193;
  Grp586_	grp586_195;
  pwr_valuereliefdown	pwr_valuereliefdown198;
  pwr_indsquarelarge	pwr_indsquarelarge209;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter217;
  public Pi_overview( JopSession session, String instance, boolean scrollbar) {
    super( session, instance);
    this.scrollbar = scrollbar;
    geInit();
  }
  public Pi_overview( JopSession session, String instance, boolean scrollbar, boolean noinit) {
    super( session, instance);
    this.scrollbar = scrollbar;
    if ( !noinit)
      geInit();
  }
  public void geInit() {
    JopSpider.setSystemName( "pi");
    engine.setAnimationScanTime( 500);
    engine.setScanTime( 100);
    size = new Dimension( 512, 431);
    Dimension dsize = new Dimension(localPanel.original_width,localPanel.original_height);
    this.addComponentListener(new AspectRatioListener(this,size));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    if ( scrollbar)
      contentPane.add( new JScrollPane(localPanel), BorderLayout.CENTER);
    else
      contentPane.add(localPanel, BorderLayout.CENTER);
    contentPane.setOpaque(true);
    localPanel.setLayout( new RatioLayout()); // scaletest
    localPanel.setOpaque(true);
    localPanel.setBackground(GeColor.getColor(213, GeColor.NO_COLOR));
    this.setSize(size);
    if ( engine.isInstance())
      setTitle( engine.getInstance());
    else
      this.setTitle("Pi_overview");
    jopAxisarc2 = new JopAxisarc();
    jopAxisarc2.setBounds(new Rectangle(286,81,50,50));
    jopAxisarc2.setBorderColor(0);
    jopAxisarc2.setTextColor(0);
    jopAxisarc2.setAngle1(0F);
    jopAxisarc2.setAngle2(180F);
    jopAxisarc2.setLineWidth(1);
    jopAxisarc2.setMinValue(100F);
    jopAxisarc2.setMaxValue(0F);
    jopAxisarc2.setLines(11);
    jopAxisarc2.setLongQuotient(2);
    jopAxisarc2.setValueQuotient(2);
    jopAxisarc2.setLineLength(0.15F);
    jopAxisarc2.setLineWidth(1);
    jopAxisarc2.setRotate(0);
    jopAxisarc2.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxisarc2.setFormat("%3.0f");
    localPanel.add(jopAxisarc2, new Proportion(jopAxisarc2.getBounds(), dsize));
    pwr_buttoncommandcenter17 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter17.setBounds(new Rectangle(449,346,51,18));
    pwr_buttoncommandcenter17.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter17, new Proportion(pwr_buttoncommandcenter17.getBounds(), dsize));
    pwr_valuereliefdown19 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown19.setBounds(new Rectangle(25,129,55,20));
    pwr_valuereliefdown19.setBorderColor(114);
    localPanel.add(pwr_valuereliefdown19, new Proportion(pwr_valuereliefdown19.getBounds(), dsize));
    pwr_indsquarelarge91 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge91.setBounds(new Rectangle(313,157,22,7));
    pwr_indsquarelarge91.setFillColor(145);
    pwr_indsquarelarge91.setShadow(1);
    localPanel.add(pwr_indsquarelarge91, new Proportion(pwr_indsquarelarge91.getBounds(), dsize));
    pwr_indsquarelarge92 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge92.setBounds(new Rectangle(273,253,12,7));
    pwr_indsquarelarge92.setFillColor(145);
    pwr_indsquarelarge92.setShadow(1);
    localPanel.add(pwr_indsquarelarge92, new Proportion(pwr_indsquarelarge92.getBounds(), dsize));
    pwr_indsquarelarge93 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge93.setBounds(new Rectangle(313,364,22,7));
    pwr_indsquarelarge93.setFillColor(145);
    pwr_indsquarelarge93.setShadow(1);
    localPanel.add(pwr_indsquarelarge93, new Proportion(pwr_indsquarelarge93.getBounds(), dsize));
    pwr_indsquarelarge94 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge94.setBounds(new Rectangle(34,157,19,7));
    pwr_indsquarelarge94.setFillColor(145);
    pwr_indsquarelarge94.setShadow(1);
    localPanel.add(pwr_indsquarelarge94, new Proportion(pwr_indsquarelarge94.getBounds(), dsize));
    pwr_indsquarelarge95 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge95.setBounds(new Rectangle(84,157,14,7));
    pwr_indsquarelarge95.setFillColor(145);
    pwr_indsquarelarge95.setShadow(1);
    localPanel.add(pwr_indsquarelarge95, new Proportion(pwr_indsquarelarge95.getBounds(), dsize));
    pwr_indsquarelarge96 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge96.setBounds(new Rectangle(117,157,14,7));
    pwr_indsquarelarge96.setFillColor(145);
    pwr_indsquarelarge96.setShadow(1);
    localPanel.add(pwr_indsquarelarge96, new Proportion(pwr_indsquarelarge96.getBounds(), dsize));
    pwr_indsquarelarge97 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge97.setBounds(new Rectangle(178,157,22,7));
    pwr_indsquarelarge97.setFillColor(145);
    pwr_indsquarelarge97.setShadow(1);
    localPanel.add(pwr_indsquarelarge97, new Proportion(pwr_indsquarelarge97.getBounds(), dsize));
    pwr_indsquarelarge98 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge98.setBounds(new Rectangle(44,326,14,7));
    pwr_indsquarelarge98.setFillColor(145);
    pwr_indsquarelarge98.setRotate(-180);
    pwr_indsquarelarge98.setShadow(1);
    localPanel.add(pwr_indsquarelarge98, new Proportion(pwr_indsquarelarge98.getBounds(), dsize));
    pwr_indsquarelarge99 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge99.setBounds(new Rectangle(185,364,22,7));
    pwr_indsquarelarge99.setFillColor(145);
    pwr_indsquarelarge99.setShadow(1);
    localPanel.add(pwr_indsquarelarge99, new Proportion(pwr_indsquarelarge99.getBounds(), dsize));
    pwr_indsquarelarge100 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge100.setBounds(new Rectangle(160,364,22,7));
    pwr_indsquarelarge100.setFillColor(145);
    pwr_indsquarelarge100.setShadow(1);
    localPanel.add(pwr_indsquarelarge100, new Proportion(pwr_indsquarelarge100.getBounds(), dsize));
    pwr_indsquarelarge101 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge101.setBounds(new Rectangle(65,364,14,7));
    pwr_indsquarelarge101.setFillColor(145);
    pwr_indsquarelarge101.setShadow(1);
    localPanel.add(pwr_indsquarelarge101, new Proportion(pwr_indsquarelarge101.getBounds(), dsize));
    pwr_indsquarelarge102 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge102.setBounds(new Rectangle(116,364,14,7));
    pwr_indsquarelarge102.setFillColor(145);
    pwr_indsquarelarge102.setShadow(1);
    localPanel.add(pwr_indsquarelarge102, new Proportion(pwr_indsquarelarge102.getBounds(), dsize));
    ssg5271_controller116 = new ssg5271_controller(session);
    ssg5271_controller116.setBounds(new Rectangle(49,257,12,12));
    ssg5271_controller116.setFillColor(295);
    ssg5271_controller116.setRotate(-90);
    localPanel.add(ssg5271_controller116, new Proportion(ssg5271_controller116.getBounds(), dsize));
    sis032260_transmitter117 = new sis032260_transmitter(session);
    sis032260_transmitter117.setBounds(new Rectangle(9,135,14,14));
    localPanel.add(sis032260_transmitter117, new Proportion(sis032260_transmitter117.getBounds(), dsize));
    sis032260_transmitter122 = new sis032260_transmitter(session);
    sis032260_transmitter122.setBounds(new Rectangle(131,240,12,12));
    localPanel.add(sis032260_transmitter122, new Proportion(sis032260_transmitter122.getBounds(), dsize));
    sis032260_transmitter123 = new sis032260_transmitter(session);
    sis032260_transmitter123.setBounds(new Rectangle(120,221,12,12));
    localPanel.add(sis032260_transmitter123, new Proportion(sis032260_transmitter123.getBounds(), dsize));
    sis032260_transmitter124 = new sis032260_transmitter(session);
    sis032260_transmitter124.setBounds(new Rectangle(311,307,12,12));
    localPanel.add(sis032260_transmitter124, new Proportion(sis032260_transmitter124.getBounds(), dsize));
    pwr_valuereliefdown126 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown126.setBounds(new Rectangle(112,210,29,10));
    pwr_valuereliefdown126.setBorderColor(114);
    localPanel.add(pwr_valuereliefdown126, new Proportion(pwr_valuereliefdown126.getBounds(), dsize));
    pwr_valuereliefdown127 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown127.setBounds(new Rectangle(134,252,29,10));
    pwr_valuereliefdown127.setFillColor(33);
    pwr_valuereliefdown127.setBorderColor(114);
    localPanel.add(pwr_valuereliefdown127, new Proportion(pwr_valuereliefdown127.getBounds(), dsize));
    pwr_valuereliefdown128 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown128.setBounds(new Rectangle(282,309,29,10));
    pwr_valuereliefdown128.setBorderColor(114);
    localPanel.add(pwr_valuereliefdown128, new Proportion(pwr_valuereliefdown128.getBounds(), dsize));
    pwr_indsquarelarge129 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge129.setBounds(new Rectangle(475,49,10,10));
    pwr_indsquarelarge129.setShadow(1);
    localPanel.add(pwr_indsquarelarge129, new Proportion(pwr_indsquarelarge129.getBounds(), dsize));
    pwr_indsquarelarge130 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge130.setBounds(new Rectangle(475,67,10,10));
    pwr_indsquarelarge130.setShadow(1);
    localPanel.add(pwr_indsquarelarge130, new Proportion(pwr_indsquarelarge130.getBounds(), dsize));
    pwr_indsquarelarge131 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge131.setBounds(new Rectangle(475,88,10,10));
    pwr_indsquarelarge131.setShadow(1);
    localPanel.add(pwr_indsquarelarge131, new Proportion(pwr_indsquarelarge131.getBounds(), dsize));
    jopTrend135 = new JopTrend( session);
    jopTrend135.setBounds(new Rectangle(401,87,71,11));
    jopTrend135.setFillColor(0);
    jopTrend135.setBorderColor(36);
    jopTrend135.setBorderColorTrend1(294);
    jopTrend135.setBorderColorTrend2(294);
    jopTrend135.setFillColorTrend1(138);
    jopTrend135.setFillColorTrend2(288);
    jopTrend135.setDrawFill(1);
    jopTrend135.setDrawBorder(1);
    jopTrend135.setTrendBorderWidth(1);
    jopTrend135.setLineWidth(2);
    jopTrend135.setMinValue1(0F);
    jopTrend135.setMaxValue1(1.5F);
    jopTrend135.setMinValue2(0F);
    jopTrend135.setMaxValue2(100F);
    jopTrend135.setNoOfPoints(600);
    jopTrend135.setHorizontalLines(0);
    jopTrend135.setVerticalLines(0);
    jopTrend135.setRotate(0);
    localPanel.add(jopTrend135, new Proportion(jopTrend135.getBounds(), dsize));
    jopAxis136 = new JopAxis();
    jopAxis136.setBounds(new Rectangle(401,100,71,12));
    jopAxis136.setBorderColor(0);
    jopAxis136.setTextColor(0);
    jopAxis136.setLineWidth(1);
    jopAxis136.setMinValue(0F);
    jopAxis136.setMaxValue(300F);
    jopAxis136.setLines(11);
    jopAxis136.setLongQuotient(2);
    jopAxis136.setValueQuotient(2);
    jopAxis136.setLineLength(7);
    jopAxis136.setLineWidth(1);
    jopAxis136.setRotate(270);
    jopAxis136.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis136.setFormat("%3.0f");
    localPanel.add(jopAxis136, new Proportion(jopAxis136.getBounds(), dsize));
    jopTrend137 = new JopTrend( session);
    jopTrend137.setBounds(new Rectangle(401,67,71,11));
    jopTrend137.setFillColor(0);
    jopTrend137.setBorderColor(36);
    jopTrend137.setBorderColorTrend1(294);
    jopTrend137.setBorderColorTrend2(294);
    jopTrend137.setFillColorTrend1(138);
    jopTrend137.setFillColorTrend2(288);
    jopTrend137.setDrawFill(1);
    jopTrend137.setDrawBorder(1);
    jopTrend137.setTrendBorderWidth(1);
    jopTrend137.setLineWidth(2);
    jopTrend137.setMinValue1(0F);
    jopTrend137.setMaxValue1(1.5F);
    jopTrend137.setMinValue2(0F);
    jopTrend137.setMaxValue2(100F);
    jopTrend137.setNoOfPoints(600);
    jopTrend137.setHorizontalLines(0);
    jopTrend137.setVerticalLines(0);
    jopTrend137.setRotate(0);
    localPanel.add(jopTrend137, new Proportion(jopTrend137.getBounds(), dsize));
    jopTrend138 = new JopTrend( session);
    jopTrend138.setBounds(new Rectangle(401,48,71,11));
    jopTrend138.setFillColor(0);
    jopTrend138.setBorderColor(36);
    jopTrend138.setBorderColorTrend1(294);
    jopTrend138.setBorderColorTrend2(294);
    jopTrend138.setFillColorTrend1(9999);
    jopTrend138.setFillColorTrend2(9999);
    jopTrend138.setDrawFill(1);
    jopTrend138.setDrawBorder(1);
    jopTrend138.setTrendBorderWidth(1);
    jopTrend138.setLineWidth(2);
    jopTrend138.setMinValue1(0F);
    jopTrend138.setMaxValue1(1.5F);
    jopTrend138.setMinValue2(0F);
    jopTrend138.setMaxValue2(100F);
    jopTrend138.setNoOfPoints(600);
    jopTrend138.setHorizontalLines(0);
    jopTrend138.setVerticalLines(0);
    jopTrend138.setRotate(0);
    localPanel.add(jopTrend138, new Proportion(jopTrend138.getBounds(), dsize));
    pwr_valuereliefdown140 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown140.setBounds(new Rectangle(359,46,39,14));
    localPanel.add(pwr_valuereliefdown140, new Proportion(pwr_valuereliefdown140.getBounds(), dsize));
    pwr_valuereliefdown141 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown141.setBounds(new Rectangle(359,65,39,14));
    localPanel.add(pwr_valuereliefdown141, new Proportion(pwr_valuereliefdown141.getBounds(), dsize));
    pwr_valuereliefdown142 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown142.setBounds(new Rectangle(359,85,39,14));
    localPanel.add(pwr_valuereliefdown142, new Proportion(pwr_valuereliefdown142.getBounds(), dsize));
    pwr_valuelargecenter148 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter148.setBounds(new Rectangle(291,125,43,15));
    pwr_valuelargecenter148.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter148, new Proportion(pwr_valuelargecenter148.getBounds(), dsize));
    jopTrend163 = new JopTrend( session);
    jopTrend163.setBounds(new Rectangle(118,35,143,79));
    jopTrend163.setFillColor(0);
    jopTrend163.setBorderColor(48);
    jopTrend163.setBorderColorTrend1(1);
    jopTrend163.setBorderColorTrend2(294);
    jopTrend163.setFillColorTrend1(138);
    jopTrend163.setFillColorTrend2(288);
    jopTrend163.setDrawFill(1);
    jopTrend163.setDrawBorder(1);
    jopTrend163.setTrendBorderWidth(1);
    jopTrend163.setLineWidth(1);
    jopTrend163.setMinValue1(-30F);
    jopTrend163.setMaxValue1(30F);
    jopTrend163.setMinValue2(0F);
    jopTrend163.setMaxValue2(100F);
    jopTrend163.setNoOfPoints(3600);
    jopTrend163.setHorizontalLines(7);
    jopTrend163.setVerticalLines(8);
    jopTrend163.setRotate(0);
    localPanel.add(jopTrend163, new Proportion(jopTrend163.getBounds(), dsize));
    pwr_buttoncommandcenter164 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter164.setBounds(new Rectangle(158,5,51,18));
    pwr_buttoncommandcenter164.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter164, new Proportion(pwr_buttoncommandcenter164.getBounds(), dsize));
    jopAxis165 = new JopAxis();
    jopAxis165.setBounds(new Rectangle(118,116,143,12));
    jopAxis165.setBorderColor(0);
    jopAxis165.setTextColor(0);
    jopAxis165.setLineWidth(1);
    jopAxis165.setMinValue(0F);
    jopAxis165.setMaxValue(10F);
    jopAxis165.setLines(10);
    jopAxis165.setLongQuotient(1);
    jopAxis165.setValueQuotient(1);
    jopAxis165.setLineLength(7);
    jopAxis165.setLineWidth(1);
    jopAxis165.setRotate(270);
    jopAxis165.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis165.setFormat("%3.0f");
    localPanel.add(jopAxis165, new Proportion(jopAxis165.getBounds(), dsize));
    jopAxis166 = new JopAxis();
    jopAxis166.setBounds(new Rectangle(262,35,12,79));
    jopAxis166.setBorderColor(0);
    jopAxis166.setTextColor(0);
    jopAxis166.setLineWidth(1);
    jopAxis166.setMinValue(30F);
    jopAxis166.setMaxValue(-30F);
    jopAxis166.setLines(9);
    jopAxis166.setLongQuotient(1);
    jopAxis166.setValueQuotient(1);
    jopAxis166.setLineLength(7);
    jopAxis166.setLineWidth(1);
    jopAxis166.setRotate(180);
    jopAxis166.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis166.setFormat("%3.0f");
    localPanel.add(jopAxis166, new Proportion(jopAxis166.getBounds(), dsize));
    pwr_valuelargecenter170 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter170.setBounds(new Rectangle(290,43,43,15));
    pwr_valuelargecenter170.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter170, new Proportion(pwr_valuelargecenter170.getBounds(), dsize));
    pwr_valuelargecenter171 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter171.setBounds(new Rectangle(290,60,43,15));
    pwr_valuelargecenter171.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter171, new Proportion(pwr_valuelargecenter171.getBounds(), dsize));
    jopAxis174 = new JopAxis();
    jopAxis174.setBounds(new Rectangle(105,36,12,79));
    jopAxis174.setBorderColor(0);
    jopAxis174.setTextColor(0);
    jopAxis174.setLineWidth(1);
    jopAxis174.setMinValue(-30F);
    jopAxis174.setMaxValue(30F);
    jopAxis174.setLines(9);
    jopAxis174.setLongQuotient(1);
    jopAxis174.setValueQuotient(1);
    jopAxis174.setLineLength(7);
    jopAxis174.setLineWidth(1);
    jopAxis174.setRotate(0);
    jopAxis174.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis174.setFormat("%3.0f");
    localPanel.add(jopAxis174, new Proportion(jopAxis174.getBounds(), dsize));
    pwr_buttoninfo185 = new pwr_buttoninfo(session);
    pwr_buttoninfo185.setBounds(new Rectangle(25,3,22,21));
    localPanel.add(pwr_buttoninfo185, new Proportion(pwr_buttoninfo185.getBounds(), dsize));
    pwr_valuelargecenter187 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter187.setBounds(new Rectangle(429,159,59,15));
    pwr_valuelargecenter187.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter187, new Proportion(pwr_valuelargecenter187.getBounds(), dsize));
    pwr_valuelargecenter189 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter189.setBounds(new Rectangle(429,186,59,15));
    pwr_valuelargecenter189.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter189, new Proportion(pwr_valuelargecenter189.getBounds(), dsize));
    pwr_valuelargecenter190 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter190.setBounds(new Rectangle(441,2,59,15));
    pwr_valuelargecenter190.setFillColor(32);
    pwr_valuelargecenter190.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter190, new Proportion(pwr_valuelargecenter190.getBounds(), dsize));
    pwr_valuelargecenter191 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter191.setBounds(new Rectangle(378,2,59,15));
    pwr_valuelargecenter191.setFillColor(32);
    pwr_valuelargecenter191.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter191, new Proportion(pwr_valuelargecenter191.getBounds(), dsize));
    pwr_buttoncommandcenter192 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter192.setBounds(new Rectangle(449,364,51,18));
    pwr_buttoncommandcenter192.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter192, new Proportion(pwr_buttoncommandcenter192.getBounds(), dsize));
    pwr_trafficlight193 = new pwr_trafficlight(session);
    pwr_trafficlight193.setBounds(new Rectangle(3,3,22,22));
    pwr_trafficlight193.setShadow(1);
    localPanel.add(pwr_trafficlight193, new Proportion(pwr_trafficlight193.getBounds(), dsize));
    grp586_195 = new Grp586_(session);
    grp586_195.setBounds(new Rectangle(295,102,21,7));
    grp586_195.setBorderColor(38);
    grp586_195.setRotate(-90);
    grp586_195.setGradient(12);
    localPanel.add(grp586_195, new Proportion(grp586_195.getBounds(), dsize));
    pwr_valuereliefdown198 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown198.setBounds(new Rectangle(154,290,54,20));
    pwr_valuereliefdown198.setBorderColor(114);
    localPanel.add(pwr_valuereliefdown198, new Proportion(pwr_valuereliefdown198.getBounds(), dsize));
    pwr_indsquarelarge209 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge209.setBounds(new Rectangle(14,272,4,10));
    pwr_indsquarelarge209.setFillColor(145);
    pwr_indsquarelarge209.setRotate(-180);
    pwr_indsquarelarge209.setShadow(1);
    localPanel.add(pwr_indsquarelarge209, new Proportion(pwr_indsquarelarge209.getBounds(), dsize));
    pwr_buttoncommandcenter217 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter217.setBounds(new Rectangle(449,328,51,18));
    pwr_buttoncommandcenter217.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter217, new Proportion(pwr_buttoncommandcenter217.getBounds(), dsize));
    pwr_buttoncommandcenter17.dd.setDynType1(1);
    pwr_buttoncommandcenter17.dd.setActionType1(32768);
    pwr_buttoncommandcenter17.dd.setAccess(35454972);
    pwr_buttoncommandcenter17.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter17.dd, "open graph /object=Nodes-Pi-Graph-Pi_system")
      });
    pwr_buttoncommandcenter17.setAnnot1("Network...");
    pwr_valuereliefdown19.dd.setDynType1(1025);
    pwr_valuereliefdown19.dd.setActionType1(8194);
    pwr_valuereliefdown19.dd.setAccess(35454972);
    pwr_valuereliefdown19.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown19.dd, "Pi-SOFTEL-ONEWIRE-OutDoore_BT4.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown19.dd, "Pi-SOFTEL-ONEWIRE-OutDoore_BT4")
      ,new GeDynTipText(pwr_valuereliefdown19.dd, "Out door temp, sensor -BT4")
      });
    pwr_indsquarelarge91.dd.setDynType1(7);
    pwr_indsquarelarge91.dd.setActionType1(8194);
    pwr_indsquarelarge91.dd.setAccess(35454972);
    pwr_indsquarelarge91.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge91.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge91.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7")
      ,new GeDynTipText(pwr_indsquarelarge91.dd, "Zon 3 Radiator 1200W")
      });
    pwr_indsquarelarge92.dd.setDynType1(7);
    pwr_indsquarelarge92.dd.setActionType1(8194);
    pwr_indsquarelarge92.dd.setAccess(35454972);
    pwr_indsquarelarge92.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge92.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge92.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7")
      ,new GeDynTipText(pwr_indsquarelarge92.dd, "Zon 3 Radiator 600W")
      });
    pwr_indsquarelarge93.dd.setDynType1(7);
    pwr_indsquarelarge93.dd.setActionType1(8194);
    pwr_indsquarelarge93.dd.setAccess(35454972);
    pwr_indsquarelarge93.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge93.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge93.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7")
      ,new GeDynTipText(pwr_indsquarelarge93.dd, "Zon 3 Radiator 1200W")
      });
    pwr_indsquarelarge94.dd.setDynType1(7);
    pwr_indsquarelarge94.dd.setActionType1(8194);
    pwr_indsquarelarge94.dd.setAccess(35454972);
    pwr_indsquarelarge94.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge94.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge94.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      ,new GeDynTipText(pwr_indsquarelarge94.dd, "Zon 1 Radiator 1000W")
      });
    pwr_indsquarelarge95.dd.setDynType1(7);
    pwr_indsquarelarge95.dd.setActionType1(8194);
    pwr_indsquarelarge95.dd.setAccess(35454972);
    pwr_indsquarelarge95.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge95.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge95.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      ,new GeDynTipText(pwr_indsquarelarge95.dd, "Zon 1 Radiator 600W")
      });
    pwr_indsquarelarge96.dd.setDynType1(7);
    pwr_indsquarelarge96.dd.setActionType1(8194);
    pwr_indsquarelarge96.dd.setAccess(35454972);
    pwr_indsquarelarge96.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge96.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge96.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      ,new GeDynTipText(pwr_indsquarelarge96.dd, "Zon 1 Radiator 600W")
      });
    pwr_indsquarelarge97.dd.setDynType1(7);
    pwr_indsquarelarge97.dd.setActionType1(8194);
    pwr_indsquarelarge97.dd.setAccess(35454972);
    pwr_indsquarelarge97.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge97.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge97.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      ,new GeDynTipText(pwr_indsquarelarge97.dd, "Zon 1 Radiator 1400W")
      });
    pwr_indsquarelarge98.dd.setDynType1(7);
    pwr_indsquarelarge98.dd.setActionType1(8194);
    pwr_indsquarelarge98.dd.setAccess(35454972);
    pwr_indsquarelarge98.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge98.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge98.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      ,new GeDynTipText(pwr_indsquarelarge98.dd, "Zon 2 Radiator 600W")
      });
    pwr_indsquarelarge99.dd.setDynType1(7);
    pwr_indsquarelarge99.dd.setActionType1(8194);
    pwr_indsquarelarge99.dd.setAccess(35454972);
    pwr_indsquarelarge99.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge99.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge99.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      ,new GeDynTipText(pwr_indsquarelarge99.dd, "Zon 2 Radiator 1200W")
      });
    pwr_indsquarelarge100.dd.setDynType1(7);
    pwr_indsquarelarge100.dd.setActionType1(8194);
    pwr_indsquarelarge100.dd.setAccess(35454972);
    pwr_indsquarelarge100.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge100.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge100.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      ,new GeDynTipText(pwr_indsquarelarge100.dd, "Zon 2 Radiator 1200W")
      });
    pwr_indsquarelarge101.dd.setDynType1(7);
    pwr_indsquarelarge101.dd.setActionType1(8194);
    pwr_indsquarelarge101.dd.setAccess(35454972);
    pwr_indsquarelarge101.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge101.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge101.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      ,new GeDynTipText(pwr_indsquarelarge101.dd, "Zon 2 Radiator 700W")
      });
    pwr_indsquarelarge102.dd.setDynType1(7);
    pwr_indsquarelarge102.dd.setActionType1(8194);
    pwr_indsquarelarge102.dd.setAccess(35454972);
    pwr_indsquarelarge102.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge102.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge102.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      ,new GeDynTipText(pwr_indsquarelarge102.dd, "Zon 2 Radiator 700W")
      });
    ssg5271_controller116.dd.setDynType1(49);
    ssg5271_controller116.dd.setActionType1(8194);
    ssg5271_controller116.dd.setAccess(35454972);
    ssg5271_controller116.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(ssg5271_controller116.dd, "Pi-SOFTEL-PANEL-RedLight.ActualValue##Boolean")
      ,new GeDynDigWarning(ssg5271_controller116.dd, "Pi-SOFTEL-PANEL-YellowLight.ActualValue##Boolean")
      ,new GeDynPopupMenu(ssg5271_controller116.dd, "Pi-SOFTEL-PANEL-YellowLight")
      ,new GeDynTipText(ssg5271_controller116.dd, "heat controller")
      });
    sis032260_transmitter117.dd.setDynType1(1);
    sis032260_transmitter117.dd.setActionType1(8192);
    sis032260_transmitter117.dd.setAccess(35454972);
    sis032260_transmitter117.dd.setElements(new GeDynElemIfc[] {
      new GeDynTipText(sis032260_transmitter117.dd, "Temp sensor -BT4 outdoor")
      });
    sis032260_transmitter117.setAnnot1("t");
    sis032260_transmitter122.dd.setDynType1(1);
    sis032260_transmitter122.dd.setActionType1(8192);
    sis032260_transmitter122.dd.setAccess(35454972);
    sis032260_transmitter122.dd.setElements(new GeDynElemIfc[] {
      new GeDynTipText(sis032260_transmitter122.dd, "Temp sensor -BT2 indoor ground floor zon 2")
      });
    sis032260_transmitter122.setAnnot1("t");
    sis032260_transmitter123.dd.setDynType1(1);
    sis032260_transmitter123.dd.setActionType1(8192);
    sis032260_transmitter123.dd.setAccess(35454972);
    sis032260_transmitter123.dd.setElements(new GeDynElemIfc[] {
      new GeDynTipText(sis032260_transmitter123.dd, "Temp sensor -BT1 indoor ground floor zon 1")
      });
    sis032260_transmitter123.setAnnot1("t");
    sis032260_transmitter124.dd.setDynType1(1);
    sis032260_transmitter124.dd.setActionType1(8192);
    sis032260_transmitter124.dd.setAccess(35454972);
    sis032260_transmitter124.dd.setElements(new GeDynElemIfc[] {
      new GeDynTipText(sis032260_transmitter124.dd, "Temp sensor -BT3 indoor upper floor zon 3")
      });
    sis032260_transmitter124.setAnnot1("t");
    pwr_valuereliefdown126.dd.setDynType1(1025);
    pwr_valuereliefdown126.dd.setActionType1(8194);
    pwr_valuereliefdown126.dd.setAccess(35454972);
    pwr_valuereliefdown126.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown126.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT1.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown126.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT1")
      ,new GeDynTipText(pwr_valuereliefdown126.dd, "In door temp, sensor -BT1")
      });
    pwr_valuereliefdown127.dd.setDynType1(1025);
    pwr_valuereliefdown127.dd.setActionType1(8194);
    pwr_valuereliefdown127.dd.setAccess(35454972);
    pwr_valuereliefdown127.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown127.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT2.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown127.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT2")
      ,new GeDynTipText(pwr_valuereliefdown127.dd, "In door temp, sensor -BT2")
      });
    pwr_valuereliefdown128.dd.setDynType1(1025);
    pwr_valuereliefdown128.dd.setActionType1(8194);
    pwr_valuereliefdown128.dd.setAccess(35454972);
    pwr_valuereliefdown128.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown128.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT3.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown128.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT3")
      ,new GeDynTipText(pwr_valuereliefdown128.dd, "In door temp, sensor -BT3")
      });
    pwr_indsquarelarge129.dd.setDynType1(7);
    pwr_indsquarelarge129.dd.setActionType1(2);
    pwr_indsquarelarge129.dd.setAccess(35454972);
    pwr_indsquarelarge129.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge129.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge129.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      });
    pwr_indsquarelarge130.dd.setDynType1(7);
    pwr_indsquarelarge130.dd.setActionType1(2);
    pwr_indsquarelarge130.dd.setAccess(35454972);
    pwr_indsquarelarge130.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge130.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge130.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      });
    pwr_indsquarelarge131.dd.setDynType1(7);
    pwr_indsquarelarge131.dd.setActionType1(2);
    pwr_indsquarelarge131.dd.setAccess(35454972);
    pwr_indsquarelarge131.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge131.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge131.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7")
      });
    jopTrend135.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean");
    jopTrend137.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean");
    jopTrend138.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean");
    pwr_valuereliefdown140.dd.setDynType1(1025);
    pwr_valuereliefdown140.dd.setActionType1(8194);
    pwr_valuereliefdown140.dd.setAccess(35454972);
    pwr_valuereliefdown140.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown140.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT1.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown140.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT1")
      ,new GeDynTipText(pwr_valuereliefdown140.dd, "In door temp zon 1, sensor -BT1")
      });
    pwr_valuereliefdown141.dd.setDynType1(1025);
    pwr_valuereliefdown141.dd.setActionType1(8194);
    pwr_valuereliefdown141.dd.setAccess(35454972);
    pwr_valuereliefdown141.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown141.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT2.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown141.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT2")
      ,new GeDynTipText(pwr_valuereliefdown141.dd, "In door temp zon 2, sensor -BT2")
      });
    pwr_valuereliefdown142.dd.setDynType1(1025);
    pwr_valuereliefdown142.dd.setActionType1(8194);
    pwr_valuereliefdown142.dd.setAccess(35454972);
    pwr_valuereliefdown142.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown142.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT3.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown142.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT3")
      ,new GeDynTipText(pwr_valuereliefdown142.dd, "In door temp zon 3, sensor -BT3")
      });
    pwr_valuelargecenter148.dd.setDynType1(1025);
    pwr_valuelargecenter148.dd.setActionType1(8194);
    pwr_valuelargecenter148.dd.setAccess(35454972);
    pwr_valuelargecenter148.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter148.dd, "Pi-SOFTEL-HeatReq.ActualValue##Float32","%3.0f %%")
      ,new GeDynPopupMenu(pwr_valuelargecenter148.dd, "Pi-SOFTEL-HeatReq")
      ,new GeDynTipText(pwr_valuelargecenter148.dd, "0-100% heat requirements depending on outdoor temp.")
      });
    geInit1();
  }
  public void geInit1() {
    jopTrend163.setPwrAttribute1("Pi-SOFTEL-ONEWIRE-OutDoore_BT4.ActualValue##Float32");
    pwr_buttoncommandcenter164.dd.setDynType1(1);
    pwr_buttoncommandcenter164.dd.setActionType1(64);
    pwr_buttoncommandcenter164.dd.setAccess(35454972);
    pwr_buttoncommandcenter164.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter164.dd, "open trend/name=Pi-SOFTEL-LOG-Trend1")
      });
    pwr_buttoncommandcenter164.setAnnot1("Trend...");
    pwr_valuelargecenter170.dd.setDynType1(1025);
    pwr_valuelargecenter170.dd.setActionType1(8194);
    pwr_valuelargecenter170.dd.setAccess(35454972);
    pwr_valuelargecenter170.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter170.dd, "Pi-SOFTEL-LOG-CalcPowerOutPerc.ActualValue##Float32","%3.0f %%")
      ,new GeDynPopupMenu(pwr_valuelargecenter170.dd, "Pi-SOFTEL-LOG-CalcPowerOutPerc")
      ,new GeDynTipText(pwr_valuelargecenter170.dd, "0-100% heat output power")
      });
    pwr_valuelargecenter171.dd.setDynType1(1025);
    pwr_valuelargecenter171.dd.setActionType1(8194);
    pwr_valuelargecenter171.dd.setAccess(35454972);
    pwr_valuelargecenter171.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter171.dd, "Pi-SOFTEL-LOG-CalcPowerOutW.ActualValue##Float32","%3.0f W")
      ,new GeDynPopupMenu(pwr_valuelargecenter171.dd, "Pi-SOFTEL-LOG-CalcPowerOutW")
      ,new GeDynTipText(pwr_valuelargecenter171.dd, " Heat output power in watt")
      });
    pwr_buttoninfo185.dd.setDynType1(1);
    pwr_buttoninfo185.dd.setActionType1(16384);
    pwr_buttoninfo185.dd.setAccess(35454972);
    pwr_buttoninfo185.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoninfo185.dd, "help ")
      });
    pwr_valuelargecenter187.dd.setDynType1(1025);
    pwr_valuelargecenter187.dd.setActionType1(8194);
    pwr_valuelargecenter187.dd.setAccess(35454972);
    pwr_valuelargecenter187.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter187.dd, "Pi-SOFTEL-LOG-SumEnergiDay.ActualValue##Float32","%3.0f kWh")
      ,new GeDynPopupMenu(pwr_valuelargecenter187.dd, "Pi-SOFTEL-LOG-SumEnergiDay")
      ,new GeDynTipText(pwr_valuelargecenter187.dd, "Consumption energy in kWh this day")
      });
    pwr_valuelargecenter189.dd.setDynType1(1025);
    pwr_valuelargecenter189.dd.setActionType1(8194);
    pwr_valuelargecenter189.dd.setAccess(35454972);
    pwr_valuelargecenter189.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter189.dd, "Pi-SOFTEL-LOG-SumEnergikWh.ActualValue##Float32","%3.0f kWh")
      ,new GeDynPopupMenu(pwr_valuelargecenter189.dd, "Pi-SOFTEL-LOG-SumEnergikWh")
      ,new GeDynTipText(pwr_valuelargecenter189.dd, "Total consumption energy in kWh since starting up")
      });
    pwr_valuelargecenter190.dd.setDynType1(1024);
    pwr_valuelargecenter190.dd.setActionType1(2);
    pwr_valuelargecenter190.dd.setAccess(35454972);
    pwr_valuelargecenter190.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter190.dd, "Nodes-Pi.SystemTime##Time","%1t")
      ,new GeDynPopupMenu(pwr_valuelargecenter190.dd, "Nodes-Pi")
      });
    pwr_valuelargecenter191.dd.setDynType1(1024);
    pwr_valuelargecenter191.dd.setActionType1(2);
    pwr_valuelargecenter191.dd.setAccess(35454972);
    pwr_valuelargecenter191.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter191.dd, "Nodes-Pi.SystemTime##Time","%4t")
      ,new GeDynPopupMenu(pwr_valuelargecenter191.dd, "Nodes-Pi")
      });
    pwr_buttoncommandcenter192.dd.setDynType1(1);
    pwr_buttoncommandcenter192.dd.setActionType1(32768);
    pwr_buttoncommandcenter192.dd.setAccess(35454972);
    pwr_buttoncommandcenter192.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter192.dd, "open graph /object=Nodes-Pi-Graph-Pi_log")
      });
    pwr_buttoncommandcenter192.setAnnot1("Log & Hist...");
    pwr_trafficlight193.dd.setDynType1(53);
    pwr_trafficlight193.dd.setActionType1(8258);
    pwr_trafficlight193.dd.setAccess(35454972);
    pwr_trafficlight193.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_trafficlight193.dd, "Pi-SOFTEL-START-RedLight.ActualValue##Boolean")
      ,new GeDynDigWarning(pwr_trafficlight193.dd, "Pi-SOFTEL-START-YellowLight.ActualValue##Boolean")
      ,new GeDynDigLowColor(pwr_trafficlight193.dd, "Pi-SOFTEL-START-GreenLight.ActualValue##Boolean",0)
      ,new GeDynPopupMenu(pwr_trafficlight193.dd, "Pi-SOFTEL-START-RedLight")
      ,new GeDynTipText(pwr_trafficlight193.dd, "Red, yellow traffic light = check alarmlist for more info.")
      ,new GeDynCommand(pwr_trafficlight193.dd, "show alarmlist")
      });
    grp586_195.dd.setDynType1(4097);
    grp586_195.dd.setActionType1(0);
    grp586_195.dd.setElements(new GeDynElemIfc[] {
      new GeDynRotate(grp586_195.dd, "Pi-SOFTEL-HMI-PowerOutPerc.ActualValue##Float32",311.98,106.637,1.8)
      });
    pwr_valuereliefdown198.dd.setDynType1(1025);
    pwr_valuereliefdown198.dd.setActionType1(8194);
    pwr_valuereliefdown198.dd.setAccess(35454972);
    pwr_valuereliefdown198.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown198.dd, "Pi-SOFTEL-ONEWIRE-IndoorAverage.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown198.dd, "Pi-SOFTEL-ONEWIRE-IndoorAverage")
      ,new GeDynTipText(pwr_valuereliefdown198.dd, "Averag value indoor temp")
      });
    pwr_indsquarelarge209.dd.setDynType1(7);
    pwr_indsquarelarge209.dd.setActionType1(8194);
    pwr_indsquarelarge209.dd.setAccess(35454972);
    pwr_indsquarelarge209.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge209.dd, "Pi-SOFTEL-ARDU-HeatTowelRail_IO8.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge209.dd, "Pi-SOFTEL-ARDU-HeatTowelRail_IO8")
      ,new GeDynTipText(pwr_indsquarelarge209.dd, "Heated towel rail (100W)")
      });
    pwr_buttoncommandcenter217.dd.setDynType1(1);
    pwr_buttoncommandcenter217.dd.setActionType1(32768);
    pwr_buttoncommandcenter217.dd.setAccess(35454972);
    pwr_buttoncommandcenter217.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter217.dd, "open graph /object=Nodes-Pi-Graph-Pi_settings")
      });
    pwr_buttoncommandcenter217.setAnnot1("Start & Set...");
    engine.setFrameReady();
  }

class LocalPanel extends JPanel {
  public LocalPanel() {}
  int fillColor = 9999;
  int originalFillColor = 9999;
  int textColor = 9999;
  int originalTextColor = 9999;
  int borderColor = 9999;
  int colorTone = 0;
  int originalColorTone = 0;
  int colorShift = 0;
  int originalColorShift = 0;
  int colorBrightness = 0;
  int originalColorBrightness = 0;
  int colorIntensity = 0;
  int originalColorIntensity = 0;
  int colorInverse = 0;
  int originalColorInverse = 0;
  int shadow = 0;
  boolean dimmed = false;
  public void setColorTone( int colorTone) {
    this.colorTone = colorTone;
    originalColorTone = colorTone;
  }
  public int getColorTone() {
    return colorTone;
  }
  public void setColorShift( int colorShift) {
    this.colorShift = colorShift;
    originalColorShift = colorShift;
  }
  public int getColorShift() {
    return colorShift;
  }
  public void setColorBrightness( int colorBrightness) {
    this.colorBrightness = colorBrightness;
    originalColorBrightness = colorBrightness;
  }
  public int getColorBrightness() {
    return colorBrightness;
  }
  public void setColorIntensity( int colorIntensity) {
    this.colorIntensity = colorIntensity;
    originalColorIntensity = colorIntensity;
  }
  public int getColorIntensity() {
    return colorIntensity;
  }
  public void setFillColor( int fillColor) {
    this.fillColor = fillColor;
    this.originalFillColor = fillColor;
  }
  public void resetFillColor() {
    fillColor = originalFillColor;
  }
  public int getFillColor() {
    return fillColor;
  }
  public void setBorderColor( int borderColor) {
    this.borderColor = borderColor;
  }
  public int getBorderColor() {
    return borderColor;
  }
  public int original_width = 504;
  public int original_height = 387;
  double rotate;
  public void setRotate( double rotate) {
    if ( rotate < 0)
      this.rotate = rotate % 360 + 360;
    else
      this.rotate = rotate % 360;
  }
  public double getRotate() { return rotate;}
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(281.232F, 35.8473F, 61.8072F, 79.4205F),
    new Polygon( new int[] { 281, 343, 342, 282, 282, 281}, new int[] { 36, 36, 36, 36, 115, 115}, 6), 
    new Polygon( new int[] { 343, 343, 342, 342, 282, 281}, new int[] { 115, 36, 36, 115, 115, 115}, 6), 
    new RoundRectangle2D.Float(284.269F, 78.7393F, 55.4763F, 35.2915F, 10.5875F, 10.5875F),
    new Rectangle2D.Float(289.563F, 78.7393F, 44.8888F, 1.76458F),
    new Rectangle2D.Float(284.269F, 84.0331F, 1.76458F, 24.7041F),
    new Arc2D.Float(284.269F, 78.7393F, 10.5875F, 10.5875F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(329.158F, 78.7393F, 10.5875F, 10.5875F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(284.269F, 103.443F, 10.5875F, 10.5875F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(289.563F, 112.266F, 44.8888F, 1.76458F),
    new Rectangle2D.Float(337.981F, 84.0331F, 1.76458F, 24.7041F),
    new Arc2D.Float(329.158F, 103.443F, 10.5875F, 10.5875F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(329.158F, 78.7393F, 10.5875F, 10.5875F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(284.269F, 103.443F, 10.5875F, 10.5875F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(286.034F, 80.5039F, 51.9471F, 31.7624F, 7.05831F, 7.05831F),
    new Rectangle2D.Float(347.263F, 35.8473F, 144.083F, 79.4205F),
    new Polygon( new int[] { 347, 491, 491, 348, 348, 347}, new int[] { 36, 36, 37, 37, 114, 115}, 6), 
    new Polygon( new int[] { 491, 491, 491, 491, 348, 347}, new int[] { 115, 36, 37, 114, 114, 115}, 6), 
    new Polygon( new int[] { 31, 31, 32, 32, 31}, new int[] {99, 97, 97, 99, 99}, 5),
    new Polygon( new int[] { 12, 38, 63, 12}, new int[] {106, 96, 106, 106}, 4),
    new Polygon( new int[] { 12, 17, 38, 38}, new int[] { 106, 105, 97,96}, 4),
    new Polygon( new int[] { 38, 38, 58, 63}, new int[] { 96, 97, 105,106}, 4),
    new Polygon( new int[] { 63, 58, 17, 12}, new int[] { 106, 105, 105,106}, 4),
    new Polygon( new int[] { 12, 17, -229, -229}, new int[] { 106, 105, -35,-100}, 4),
    new Rectangle2D.Float(12.4282F, 105.868F, 50.4944F, 15.0535F),
    new Polygon( new int[] { 12, 63, 62, 13, 13, 12}, new int[] { 106, 106, 107, 107, 120, 121}, 6), 
    new Polygon( new int[] { 63, 63, 62, 62, 13, 12}, new int[] { 121, 106, 107, 120, 120, 121}, 6), 
    new Rectangle2D.Float(224.179F, 153.825F, 201.783F, 221.968F),
    new Rectangle2D.Float(224.179F, 153.825F, 45.545F, 221.934F),
    new Rectangle2D.Float(381.045F, 153.825F, 45.545F, 221.934F),
    new Rectangle2D.Float(12.6689F, 153.825F, 206.109F, 221.968F),
    new Polygon( new int[] { 63, 63, 83, 83, 144, 144, 63}, new int[] {154, 214, 214, 234, 234, 154, 154}, 7),
    new Polygon( new int[] { 310, 310, 380, 380, 270, 270, 310, 310}, new int[] {295, 305, 305, 376, 376, 295, 295, 305}, 8),
    new Rectangle2D.Float(12.4851F, 254.678F, 50.4933F, 70.3324F),
    new Rectangle2D.Float(12.4851F, 153.825F, 50.6355F, 60.536F),
    new Rectangle2D.Float(269.664F, 249.592F, 40.2002F, 45.3629F),
    new Rectangle2D.Float(269.542F, 153.826F, 110.887F, 60.6469F),
    new Rectangle2D.Float(12.485F, 325.196F, 50.4884F, 50.4032F),
    new Rectangle2D.Float(78.0093F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(72.9689F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(67.9286F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(62.8883F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(57.848F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(52.8077F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(47.7673F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(42.727F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(37.6867F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(32.6464F, 214.309F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(62.8883F, 254.631F, 12.6008F, 12.6008F),
    new Rectangle2D.Float(62.8883F, 297.474F, 12.6008F, 12.6008F),
    new Rectangle2D.Float(105.731F, 254.631F, 12.6008F, 12.6008F),
    new Rectangle2D.Float(118.332F, 254.631F, 12.6008F, 12.6008F),
    new Rectangle2D.Float(62.8883F, 267.232F, 12.6008F, 30.2419F),
    new Rectangle2D.Float(62.8883F, 310.075F, 12.6008F, 12.6008F),
    new Line2D.Float( 78.0093F, 254.631F, 62.8883F, 254.631F),
    new Line2D.Float( 133.498F, 254.631F, 93.1302F, 254.631F),
    new Line2D.Float( 62.8881F, 287.678F, 62.8881F, 254.635F),
    new Line2D.Float( 27.606F, 214.309F, 17.5254F, 214.309F),
    new Line2D.Float( 52.6128F, 254.558F, 42.5322F, 254.558F),
    new Line2D.Float( 120.852F, 234.47F, 110.771F, 234.47F),
    new Line2D.Float( 62.8883F, 168.946F, 62.8883F, 161.385F),
    new Line2D.Float( 62.8883F, 340.317F, 62.8883F, 330.236F),
    new Line2D.Float( 42.727F, 375.599F, 27.606F, 375.599F),
    new Line2D.Float( 110.771F, 375.599F, 85.5697F, 375.599F),
    new Line2D.Float( 153.704F, 375.599F, 141.013F, 375.599F),
    new Line2D.Float( 163.695F, 153.825F, 151.094F, 153.825F),
    new Line2D.Float( 52.8077F, 153.825F, 35.1665F, 153.825F),
    new Line2D.Float( 100.691F, 153.825F, 83.0496F, 153.825F),
    new Line2D.Float( 133.453F, 153.825F, 115.812F, 153.825F),
    new Line2D.Float( 204.13F, 153.825F, 173.775F, 153.825F),
    new Line2D.Float( 209.171F, 375.599F, 186.436F, 375.599F),
    new Line2D.Float( 118.143F, 58.9612F, 97.9451F, 58.9612F),
    new Line2D.Float( 181.389F, 375.599F, 158.654F, 375.599F),
    new Line2D.Float( 115.812F, 375.599F, 130.933F, 375.599F),
    new Line2D.Float( 65.4085F, 375.599F, 80.5294F, 375.599F),
    new Line2D.Float( 12.4851F, 347.877F, 12.4851F, 360.478F),
    new Line2D.Float( 12.4851F, 294.954F, 12.4851F, 307.555F),
    new Line2D.Float( 12.4851F, 267.232F, 12.4851F, 279.833F),
    new Rectangle2D.Float(93.1302F, 254.631F, 12.6008F, 12.6008F),
    new Rectangle2D.Float(98.1708F, 294.952F, 25.5891F, 50.521F),
    new Rectangle2D.Float(294.744F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(284.663F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(284.663F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(274.583F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(274.583F, 214.31F, 5.04032F, 20.1613F),
    new Line2D.Float( 322.466F, 153.826F, 304.825F, 153.826F),
    new Line2D.Float( 342.627F, 153.826F, 324.986F, 153.826F),
    new Line2D.Float( 324.986F, 375.6F, 340.107F, 375.6F),
    new Line2D.Float( 309.865F, 375.6F, 324.986F, 375.6F),
    new Rectangle2D.Float(269.542F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(279.623F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(289.704F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(294.744F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(299.784F, 214.31F, 5.04032F, 20.1613F),
    new Rectangle2D.Float(304.825F, 214.31F, 5.04032F, 20.1613F),
    new Line2D.Float( 994.944F, 513.593F, 982.343F, 513.593F),
    new Line2D.Float( 327.506F, 214.31F, 314.905F, 214.31F),
    new Line2D.Float( 327.506F, 305.035F, 314.905F, 305.035F),
    new Line2D.Float( 309.865F, 234.471F, 269.542F, 234.471F),
    new Line2D.Float( 269.542F, 199.189F, 269.542F, 209.269F),
    new Line2D.Float( 380.429F, 219.35F, 380.429F, 229.431F),
    new Line2D.Float( 12.4849F, 234.47F, 12.4849F, 247.58F),
    new Line2D.Float( -10.0938F, 264.276F, -10.0938F, 274.357F),
    new Line2D.Float( 380.429F, 305.035F, 380.429F, 229.43F),
    new Line2D.Float( 380.429F, 214.309F, 380.429F, 219.349F),
    new Line2D.Float( 269.542F, 234.47F, 269.542F, 249.591F),
    new Rectangle2D.Float(33.5976F, 99.8192F, 3.31924F, 3.28065F),
    new Polygon( new int[] { 34, 37, 37, 34, 34, 34}, new int[] { 100, 100, 100, 100, 103, 103}, 6), 
    new Polygon( new int[] { 37, 37, 37, 37, 34, 34}, new int[] { 103, 100, 100, 103, 103, 103}, 6), 
    new Rectangle2D.Float(30.5733F, 111.463F, 3.02419F, 8.98823F),
    new Polygon( new int[] { 31, 34, 33, 31, 31, 31}, new int[] { 111, 111, 112, 112, 120, 120}, 6), 
    new Polygon( new int[] { 34, 34, 33, 33, 31, 31}, new int[] { 120, 111, 112, 120, 120, 120}, 6), 
    new Rectangle2D.Float(33.5975F, 111.463F, 3.02419F, 8.98823F),
    new Polygon( new int[] { 34, 37, 36, 34, 34, 34}, new int[] { 111, 111, 112, 112, 120, 120}, 6), 
    new Polygon( new int[] { 37, 37, 36, 36, 34, 34}, new int[] { 120, 111, 112, 120, 120, 120}, 6), 
    new Rectangle2D.Float(16.4604F, 111.463F, 3.02419F, 8.98823F),
    new Polygon( new int[] { 16, 19, 19, 17, 17, 16}, new int[] { 111, 111, 112, 112, 120, 120}, 6), 
    new Polygon( new int[] { 19, 19, 19, 19, 17, 16}, new int[] { 120, 111, 112, 120, 120, 120}, 6), 
    new Rectangle2D.Float(23.5168F, 111.379F, 6.04839F, 6.04839F),
    new Polygon( new int[] { 24, 30, 29, 24, 24, 24}, new int[] { 111, 111, 112, 112, 117, 117}, 6), 
    new Polygon( new int[] { 30, 30, 29, 29, 24, 24}, new int[] { 117, 111, 112, 117, 117, 117}, 6), 
    new Rectangle2D.Float(37.6297F, 111.379F, 6.04839F, 6.04839F),
    new Polygon( new int[] { 38, 44, 43, 38, 38, 38}, new int[] { 111, 111, 112, 112, 117, 117}, 6), 
    new Polygon( new int[] { 44, 44, 43, 43, 38, 38}, new int[] { 117, 111, 112, 117, 117, 117}, 6), 
    new Rectangle2D.Float(48.7184F, 111.379F, 6.04839F, 6.04839F),
    new Polygon( new int[] { 49, 55, 54, 49, 49, 49}, new int[] { 111, 111, 112, 112, 117, 117}, 6), 
    new Polygon( new int[] { 55, 55, 54, 54, 49, 49}, new int[] { 117, 111, 112, 117, 117, 117}, 6), 
    new Rectangle2D.Float(55.7749F, 111.379F, 6.04839F, 6.04839F),
    new Polygon( new int[] { 56, 62, 62, 56, 56, 56}, new int[] { 111, 111, 112, 112, 117, 117}, 6), 
    new Polygon( new int[] { 62, 62, 62, 62, 56, 56}, new int[] { 117, 111, 112, 117, 117, 117}, 6), 
    new Rectangle2D.Float(44.6862F, 111.463F, 3.02419F, 8.98823F),
    new Polygon( new int[] { 45, 48, 48, 45, 45, 45}, new int[] { 111, 111, 112, 112, 120, 120}, 6), 
    new Polygon( new int[] { 48, 48, 48, 48, 45, 45}, new int[] { 120, 111, 112, 120, 120, 120}, 6), 
    new Rectangle2D.Float(38.6379F, 99.8192F, 3.31924F, 3.28065F),
    new Polygon( new int[] { 39, 42, 42, 39, 39, 39}, new int[] { 100, 100, 100, 100, 103, 103}, 6), 
    new Polygon( new int[] { 42, 42, 42, 42, 39, 39}, new int[] { 103, 100, 100, 103, 103, 103}, 6), 
    new Line2D.Float( 261.186F, 75.5809F, 117.748F, 75.5809F),
    new Arc2D.Float(314.511F, 106.461F, 0F, 0F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(11.0563F, 38.7771F, 73.1748F, 33.2304F),
    new Polygon( new int[] { 11, 84, 84, 11, 11, 11}, new int[] { 39, 39, 39, 39, 72, 72}, 6), 
    new Polygon( new int[] { 84, 84, 84, 84, 11, 11}, new int[] { 72, 39, 39, 72, 72, 72}, 6), 
  };
  public void paint(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    Component c;
    Point p;
    paintComponent(g);
    for ( int i = 0; i < getComponentCount(); i++) {
      AffineTransform save = g.getTransform();
      c = getComponent(i);
      p = c.getLocation();
      g.translate((int)p.getX(), (int)p.getY());
      c.paint(g);
      g.setTransform(save);
    }
  }
  public void paintComponent(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    double scaleWidth =  (1.0*width/original_width);
    double scaleHeight = (1.0*height/original_height);
    AffineTransform save = g.getTransform();
    g.setColor(getBackground());
    g.fill(new Rectangle(0,0,getWidth(),getHeight()));
    g.transform( AffineTransform.getScaleInstance( scaleWidth, scaleHeight)); // scaletest
    AffineTransform save_tmp;
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.fill( shapes[5]);
    g.fill( shapes[6]);
    g.fill( shapes[7]);
    g.fill( shapes[8]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[9]);
    g.fill( shapes[10]);
    g.fill( shapes[11]);
    g.fill( shapes[12]);
    g.fill( shapes[13]);
    }
    {
      GradientPaint gp = new GradientPaint( 339.745F,114.031F,        GeColor.getColor(36,colorTone,colorShift,colorIntensity,2, colorInverse, fillColor, dimmed),
        284.269F,78.7393F,GeColor.getColor(36,colorTone,colorShift,colorIntensity,-2, colorInverse, fillColor, dimmed),true);
      g.setPaint(gp);
    }
    g.fill( shapes[14]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[16]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[17]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[18]);
    }
    {
    int fcolor = GeColor.getDrawtype(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[19]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[20]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[21]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[22]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[19]);
    {
    int fcolor = GeColor.getDrawtype(137, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[24]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[25]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[26]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[24]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[27]);
    }
    {
    int fcolor = GeColor.getDrawtype(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[28]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(45, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[28]);
    }
    {
    int fcolor = GeColor.getDrawtype(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[29]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(45, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[29]);
    }
    {
    int fcolor = GeColor.getDrawtype(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[30]);
    g.setStroke( new BasicStroke(2F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[30]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[31]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[31]);
    }
    {
    int fcolor = GeColor.getDrawtype(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[32]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[32]);
    }
    {
    int fcolor = GeColor.getDrawtype(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[33]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[33]);
    }
    {
    int fcolor = GeColor.getDrawtype(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[34]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[34]);
    }
    {
    int fcolor = GeColor.getDrawtype(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[35]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[35]);
    }
    {
    int fcolor = GeColor.getDrawtype(44, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[36]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[36]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Graph",451, 326);
    {
    int fcolor = GeColor.getDrawtype(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[37]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[37]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[38]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[39]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[40]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[41]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[42]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[43]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[44]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[45]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[46]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[47]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[48]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[49]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[50]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[51]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[52]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[53]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[54]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[55]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[56]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[57]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[58]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[59]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[60]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[61]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[62]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[63]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[64]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[65]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[66]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[67]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[68]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[69]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[70]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[71]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[72]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[73]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[74]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[75]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[76]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[77]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[78]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[79]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[80]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[81]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[82]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[83]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[84]);
    }
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[85]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[86]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[87]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[88]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[89]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[90]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[91]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[92]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[93]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[94]);
    }
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[95]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[96]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[97]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[98]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[99]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[100]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone1",37, 170);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone2",44, 339);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone2",66, 363);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone2",117, 363);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone2",164, 363);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone2",189, 363);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone3",317, 363);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone3",274, 266);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone3",318, 169);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Ground floor",167, 147);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Upper floor",227, 148);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[101]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[102]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Outdoor",34, 129);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-BT1",114, 209);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-BT2",147, 250);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-BT3",284, 308);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "House",23, 88);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Heat",424, 45);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "On",475, 44);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Indoor",364, 45);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[S]",475, 111);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "1",351, 57);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "2",351, 75);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "3",351, 95);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Zone",349, 32);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Overview",50, 17);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Heat req.",298, 124);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[103]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[104]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[105]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[107]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[108]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[106]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[110]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[111]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[109]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[113]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[114]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[112]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[116]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[117]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[115]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[119]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[120]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[118]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[122]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[123]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[121]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[125]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[126]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[124]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[128]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[129]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[127]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[131]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[132]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[130]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[134]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[135]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[133]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",105, 31);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[h]",264, 125);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Heat out",296, 41);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Outdoor",165, 32);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[136]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",262, 31);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[h]",110, 125);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-BT4",10, 134);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Bedroom",91, 191);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Livingroom",169, 265);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Bathroom",25, 290);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Bedroom",317, 189);
    g.setColor(GeColor.getColor(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Bedroom",318, 339);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Kitchen",96, 283);
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Closet",31, 188);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Energy this day",430, 156);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Total energy",432, 183);
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "[ % ]",307, 100);
    ((Arc2D)shapes[137]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[137]);
    ((Arc2D)shapes[137]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[137]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Average indoor",157, 288);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Bathroom",277, 276);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Livingroom",331, 261);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[139]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[140]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[138]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone 1 radiators = 3600W",12, 44);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone 2 radiators = 4400W",12, 52);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone 3 radiators = 3000W",12, 60);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 8));
    g.drawString( "Total radiators = 10300W",12, 68);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Electric radiator  effect",11, 37);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Hall (floor heating)",18, 242);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "(floor heating)",22, 296);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "(800W)",30, 302);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "(300W)",18, 249);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone1",85, 170);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone1",117, 170);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Zone1",181, 170);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Attic",238, 203);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Attic",391, 226);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_valuelargecenter extends GeComponent {
  // Dimension size;
  public pwr_valuelargecenter( JopSession session)
  {
    super( session);
    size = new Dimension( 45, 17);
    annot1Font = new Font("Helvetica", Font.BOLD, 10);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 45;
  public int original_height = 17;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 41.8347F, 13.1048F),
    new Polygon( new int[] { 2, 44, 43, 3, 3, 2}, new int[] { 2, 2, 3, 3, 14, 15}, 6), 
    new Polygon( new int[] { 44, 44, 43, 43, 3, 2}, new int[] { 15, 2, 3, 14, 14, 15}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(41, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,1,-1,2F,2F,41.8347F,13.1048F, false,41, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    FontRenderContext frc = g.getFontRenderContext();
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    if ( (45.0 <= rotate && rotate < 135.0) || (225.0 <= rotate && rotate < 315.0)) {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/height *
      		width/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 23 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 12F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 23 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 12F);
    }
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_indsquarelarge extends GeComponent {
  // Dimension size;
  public pwr_indsquarelarge( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 17.1371F, 17.1371F),
    new Polygon( new int[] { 2, 19, 18, 3, 3, 2}, new int[] { 2, 2, 3, 3, 18, 19}, 6), 
    new Polygon( new int[] { 19, 19, 18, 18, 3, 2}, new int[] { 19, 2, 3, 18, 18, 19}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(293, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,17.1371F,17.1371F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_trafficlight extends GeComponent {
  // Dimension size;
  public pwr_trafficlight( JopSession session)
  {
    super( session);
    size = new Dimension( 24, 24);
  }
  public int original_width = 24;
  public int original_height = 24;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 20.1613F, 20.1613F),
    new Polygon( new int[] { 2, 22, 21, 3, 3, 2}, new int[] { 2, 2, 3, 3, 21, 22}, 6), 
    new Polygon( new int[] { 22, 22, 21, 21, 3, 2}, new int[] { 22, 2, 3, 21, 21, 22}, 6), 
    new Arc2D.Float(4.56644F, 4.76772F, 15.0284F, 14.6258F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(4.56644F, 4.76772F, 15.0284F, 14.6258F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(4.56644F, 4.76772F, 15.0284F, 14.6258F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(4.56644F, 4.76772F, 15.0284F, 14.6258F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(5.73651F, 5.93778F, 12.6883F, 12.2857F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(4.56644F, 4.76772F, 15.0284F, 14.6258F, 0F, 360F, Arc2D.PIE),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = 28;
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,20.1613F,20.1613F, true,28, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(293, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[5]);
    g.fill( shapes[6]);
    g.fill( shapes[7]);
    } else {
    GeGradient.paint( g, 9,2,-2,4.56644F,4.76772F,15.0284F,14.6258F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    GeGradient.paint( g, gradient,2,-2,4.56644F,4.76772F,15.0284F,14.6258F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[7]);
    }
    } else {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    } else {
    GeGradient.paint( g, gradient,2,-2,4.56644F,4.76772F,15.0284F,14.6258F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    }
    }
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_buttoncommandcenter extends GeComponent {
  // Dimension size;
  public pwr_buttoncommandcenter( JopSession session)
  {
    super( session);
    size = new Dimension( 53, 20);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 53;
  public int original_height = 20;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 49.3952F, 16.129F),
    new Polygon( new int[] { 2, 51, 49, 5, 5, 2}, new int[] { 2, 2, 5, 5, 16, 18}, 6), 
    new Polygon( new int[] { 51, 51, 49, 49, 5, 2}, new int[] { 18, 2, 5, 16, 16, 18}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(102, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,1,-1,2F,2F,49.3952F,16.129F, false,102, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    FontRenderContext frc = g.getFontRenderContext();
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    if ( (45.0 <= rotate && rotate < 135.0) || (225.0 <= rotate && rotate < 315.0)) {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/height *
      		width/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 27 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 12F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 27 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 12F);
    }
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_buttoninfo extends GeComponent {
  // Dimension size;
  public pwr_buttoninfo( JopSession session)
  {
    super( session);
    size = new Dimension( 49, 44);
  }
  public int original_width = 49;
  public int original_height = 44;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 45.3629F, 40.3226F),
    new Polygon( new int[] { 2, 47, 44, 5, 5, 2}, new int[] { 2, 2, 5, 5, 39, 42}, 6), 
    new Polygon( new int[] { 47, 47, 44, 44, 5, 2}, new int[] { 42, 2, 5, 39, 39, 42}, 6), 
    new Rectangle2D.Float(12.0806F, 10.0645F, 25.2016F, 24.1442F),
    new Polygon( new int[] { 19, 29, 29, 30, 31, 31, 19, 19, 20, 21, 21, 20, 19, 19}, new int[] {20, 20, 30, 31, 31, 32, 32, 31, 31, 30, 22, 21, 21, 21}, 14),
    new Arc2D.Float(21.1532F, 11.0726F, 8.06452F, 8.06452F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(2F, 37.2823F, 5.04032F, 0F),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(222, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,1,-1,2F,2F,45.3629F,40.3226F, false,222, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    {
    int fcolor = GeColor.getDrawtype(20, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    }
    {
    int fcolor = GeColor.getDrawtype(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[4]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[5]);
    {
    int fcolor = GeColor.getDrawtype(230, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[6]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_valuereliefdown extends GeComponent {
  // Dimension size;
  public pwr_valuereliefdown( JopSession session)
  {
    super( session);
    size = new Dimension( 27, 11);
  }
  public int original_width = 27;
  public int original_height = 11;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 23.1855F, 7.05645F),
    new Polygon( new int[] { 2, 25, 25, 2, 2, 2}, new int[] { 2, 2, 2, 2, 9, 9}, 6), 
    new Polygon( new int[] { 25, 25, 25, 25, 2, 2}, new int[] { 9, 2, 2, 9, 9, 9}, 6), 
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(41, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,1,-1,2F,2F,23.1855F,7.05645F, false,41, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class ssg5271_controller extends GeComponent {
  // Dimension size;
  public ssg5271_controller( JopSession session)
  {
    super( session);
    size = new Dimension( 19, 19);
  }
  public int original_width = 19;
  public int original_height = 19;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 15.121F, 15.121F),
    new Polygon( new int[] { 2, 17, 16, 3, 3, 2}, new int[] { 2, 2, 3, 3, 16, 17}, 6), 
    new Polygon( new int[] { 17, 17, 16, 16, 3, 2}, new int[] { 17, 2, 3, 16, 16, 17}, 6), 
    new Line2D.Float( 17.121F, 10.0645F, 13.0887F, 2F),
    new Line2D.Float( 13.0887F, 17.121F, 17.121F, 10.0645F),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,15.121F,15.121F, false,74, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class sis032260_transmitter extends GeComponent {
  // Dimension size;
  public sis032260_transmitter( JopSession session)
  {
    super( session);
    size = new Dimension( 14, 14);
    annot1Font = new Font("Helvetica", Font.PLAIN, 8);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 14;
  public int original_height = 14;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 7, 2, 4, 6, 8, 10, 12, 7}, new int[] {12, 4, 3, 2, 2, 3, 4, 12}, 8),
    new Polygon( new int[] { 7, 7, 3, 2}, new int[] { 12, 10, 4,4}, 4),
    new Polygon( new int[] { 2, 3, 7, 4}, new int[] { 4, 4, 3,3}, 4),
    new Polygon( new int[] { 4, 7, 6, 6}, new int[] { 3, 3, 3,2}, 4),
    new Polygon( new int[] { 6, 6, 8, 8}, new int[] { 2, 3, 3,2}, 4),
    new Polygon( new int[] { 8, 8, 11, 10}, new int[] { 2, 3, 5,3}, 4),
    new Polygon( new int[] { 10, 11, 11, 12}, new int[] { 3, 5, 4,4}, 4),
    new Polygon( new int[] { 12, 11, 7, 7}, new int[] { 4, 4, 10,12}, 4),
    new Polygon( new int[] { 7, 7, -224, -224}, new int[] { 12, 10, -51,-100}, 4),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(74, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,10.0806F,10.0806F, false,74, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[3]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    FontRenderContext frc = g.getFontRenderContext();
    g.setColor(GeColor.getColor( annot1Color , colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont( annot1Font);
    save_tmp = g.getTransform();
    if ( (45.0 <= rotate && rotate < 135.0) || (225.0 <= rotate && rotate < 315.0)) {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/height *
      		width/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 8 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 8F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 8 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 8F);
    }
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class Grp586_ extends GeComponent {
  // Dimension size;
  public Grp586_( JopSession session)
  {
    super( session);
    size = new Dimension( 9, 23);
  }
  public int original_width = 9;
  public int original_height = 23;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 7, 7, 5, 2, 2}, new int[] {21, 21, 9, 2, 9, 21}, 6),
  };
  public void paintComponent(Graphics g1) {
    animationCount = 1;
    if ( !visible)
      return;
    Graphics2D g = (Graphics2D) g1;
    float width = getWidth();
    float height = getHeight();
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    if ( 45.0 <= rotate && rotate < 135.0) {
      g.translate( width, 0.0); 
      g.rotate( Math.PI * rotate/180, 0.0, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else if ( 135.0 <= rotate && rotate < 225.0)
    {
      g.rotate( Math.PI * rotate/180, width/2, height/2);
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    }
    else if ( 225.0 <= rotate && rotate < 315.0)
    {
      g.translate( -height, 0.0);
      g.rotate( Math.PI * rotate/180, height, 0.0);
      g.transform( AffineTransform.getScaleInstance( height/original_width,
      		width/original_height));
    }
    else
      g.transform( AffineTransform.getScaleInstance( width/original_width,
      		height/original_height));
    if ( (dd.dynType & GeDyn.mDynType_Rotate) != 0 && dd.rotate != 0) {
      g.rotate( Math.PI * dd.rotate/180, 

           (dd.x0 - getX())*original_width/width,
           (dd.y0 - getY()) * original_height / height);
    }
    AffineTransform save = g.getTransform();
    AffineTransform save_tmp;
    int rounds = 1;
    if ( fillLevel != 1F)
      rounds = 2;
    int oldColor = 0;
    for ( int i = 0; i < rounds; i++) {
      if ( rounds == 2) {
        switch ( i) {
        case 0:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO) {
	    oldColor = colorTone;
	    colorTone = levelColorTone;
	  }
	  else if ( levelFillColor != GeColor.COLOR_NO) {
	    oldColor = fillColor;
	    fillColor = levelFillColor;
	  }
	  break;
        case 1:
	  if ( levelColorTone != GeColor.COLOR_TONE_NO)
	    colorTone = oldColor;
	  else if ( levelFillColor != GeColor.COLOR_NO)
	    fillColor = oldColor;
	  break;
        }
        switch ( levelDirection) {
        case Ge.DIRECTION_UP:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,fillLevel*original_height+Ge.cJBean_Offset,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,fillLevel * original_height+Ge.cJBean_Offset));
	  break;
	case Ge.DIRECTION_DOWN:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,original_width,(1-fillLevel)*original_height+Ge.cJBean_Offset));
	  else
	    g.setClip(new Rectangle2D.Float(0F,(1-fillLevel)*original_height+Ge.cJBean_Offset,original_width,original_height));
	  break;
	case Ge.DIRECTION_RIGHT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(fillLevel*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  else
	    g.setClip(new Rectangle2D.Float(0F,0F,fillLevel*width+Ge.cJBean_Offset,height));
	  break;
	case Ge.DIRECTION_LEFT:
	  if ( i == 0)
	    g.setClip(new Rectangle2D.Float(0F,0F,(1-fillLevel)*original_width+Ge.cJBean_Offset,original_height));
	  else
	    g.setClip(new Rectangle2D.Float((1-fillLevel)*original_width+Ge.cJBean_Offset,0F,original_width,original_height));
	  break;
	}
      }
    {
    int fcolor = GeColor.getDrawtype(144, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
  public int getUtilityType() {
    return JopUtility.GRAPH;
  }
  public PwrtObjid getUtilityObjid() {
    if ( utilityAref != null)
      return utilityAref.getObjid();
    else
      return null;
  }
  public PwrtAttrRef getUtilityAttrRef() {
    return utilityAref;
  }
  public String getUtilityName() {
    return this.getClass().getName();
  }
}
