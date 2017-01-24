import jpwr.rt.*;
import jpwr.jop.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Pi_main_A extends JopApplet {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  JopXYCurve	jopXYCurve8;
  pwr_indsquarelarge	pwr_indsquarelarge11;
  pwr_indsquarelarge	pwr_indsquarelarge12;
  pwr_indsquarelarge	pwr_indsquarelarge13;
  pwr_valuelargecenter	pwr_valuelargecenter16;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter17;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter19;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter20;
  pwr_valuelargecenter	pwr_valuelargecenter22;
  pwr_valuelargecenter	pwr_valuelargecenter23;
  pwr_valuelargecenter	pwr_valuelargecenter26;
  JopTrend	jopTrend29;
  JopAxis	jopAxis31;
  JopTrend	jopTrend32;
  JopTrend	jopTrend33;
  JopAxis	jopAxis41;
  JopAxis	jopAxis42;
  pwr_valuelargecenter	pwr_valuelargecenter46;
  pwr_indsquarelarge	pwr_indsquarelarge49;
  pwr_sliderbackground1	pwr_sliderbackground153;
  pwr_slider1	pwr_slider154;
  pwr_indsquarelarge	pwr_indsquarelarge58;
  pwr_indsquarelarge	pwr_indsquarelarge60;
  pwr_valuelargecenter	pwr_valuelargecenter62;
  pwr_valuelargecenter	pwr_valuelargecenter63;
  pwr_valuelargecenter	pwr_valuelargecenter67;
  pwr_valuelargecenter	pwr_valuelargecenter68;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter73;
  Grp137_	grp137_74;
  JopAxis	jopAxis81;
  pwr_indsquarelarge	pwr_indsquarelarge85;
  pwr_indsquarelarge	pwr_indsquarelarge87;
  pwr_buttontogglecenter	pwr_buttontogglecenter92;
  pwr_buttontogglecenter	pwr_buttontogglecenter93;
  pwr_indsquarelarge	pwr_indsquarelarge94;
  pwr_buttontogglecenter	pwr_buttontogglecenter97;
  pwr_indsquarelarge	pwr_indsquarelarge98;
  pwr_buttontogglecenter	pwr_buttontogglecenter100;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter102;
  pwr_trafficlight	pwr_trafficlight106;
  public Pi_main_A() {}
  public void init() {
    super.init();
    geInit();
  }
  public void geInit() {
    JopSpider.setSystemName( "pi");
    engine.setAnimationScanTime( 500);
    engine.setScanTime( 500);
    size = new Dimension( 512, 454);
    Dimension dsize = new Dimension(localPanel.original_width,localPanel.original_height);
    this.addComponentListener(new AspectRatioListener(this,size));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
      contentPane.add(localPanel, BorderLayout.CENTER);
    contentPane.setOpaque(true);
    localPanel.setLayout( new RatioLayout()); // scaletest
    localPanel.setOpaque(true);
    localPanel.setBackground(GeColor.getColor(213, GeColor.NO_COLOR));
    jopXYCurve8 = new JopXYCurve( session);
    jopXYCurve8.setBounds(new Rectangle(227,135,191,130));
    jopXYCurve8.setFillColor(39);
    jopXYCurve8.setBorderColor(36);
    jopXYCurve8.setDrawFill(1);
    jopXYCurve8.setDrawBorder(1);
    jopXYCurve8.setTrendBorderWidth(2);
    jopXYCurve8.setLineWidth(1);
    jopXYCurve8.setNoOfPoints(100);
    jopXYCurve8.setHorizontalLines(17);
    jopXYCurve8.setVerticalLines(5);
    jopXYCurve8.setRotate(0);
    localPanel.add(jopXYCurve8, new Proportion(jopXYCurve8.getBounds(), dsize));
    pwr_indsquarelarge11 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge11.setBounds(new Rectangle(417,41,13,13));
    pwr_indsquarelarge11.setShadow(1);
    localPanel.add(pwr_indsquarelarge11, new Proportion(pwr_indsquarelarge11.getBounds(), dsize));
    pwr_indsquarelarge12 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge12.setBounds(new Rectangle(417,66,13,13));
    pwr_indsquarelarge12.setShadow(1);
    localPanel.add(pwr_indsquarelarge12, new Proportion(pwr_indsquarelarge12.getBounds(), dsize));
    pwr_indsquarelarge13 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge13.setBounds(new Rectangle(417,92,13,13));
    pwr_indsquarelarge13.setShadow(1);
    localPanel.add(pwr_indsquarelarge13, new Proportion(pwr_indsquarelarge13.getBounds(), dsize));
    pwr_valuelargecenter16 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter16.setBounds(new Rectangle(226,39,66,26));
    pwr_valuelargecenter16.setFillColor(32);
    pwr_valuelargecenter16.setBorderColor(0);
    pwr_valuelargecenter16.setShadow(1);
    localPanel.add(pwr_valuelargecenter16, new Proportion(pwr_valuelargecenter16.getBounds(), dsize));
    pwr_valueinputlargecenter17 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter17.setBounds(new Rectangle(365,305,61,19));
    pwr_valueinputlargecenter17.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter17, new Proportion(pwr_valueinputlargecenter17.getBounds(), dsize));
    pwr_valueinputlargecenter19 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter19.setBounds(new Rectangle(426,238,42,22));
    pwr_valueinputlargecenter19.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter19, new Proportion(pwr_valueinputlargecenter19.getBounds(), dsize));
    pwr_valueinputlargecenter20 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter20.setBounds(new Rectangle(223,305,61,19));
    pwr_valueinputlargecenter20.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter20, new Proportion(pwr_valueinputlargecenter20.getBounds(), dsize));
    pwr_valuelargecenter22 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter22.setBounds(new Rectangle(225,346,56,19));
    localPanel.add(pwr_valuelargecenter22, new Proportion(pwr_valuelargecenter22.getBounds(), dsize));
    pwr_valuelargecenter23 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter23.setBounds(new Rectangle(225,367,56,19));
    localPanel.add(pwr_valuelargecenter23, new Proportion(pwr_valuelargecenter23.getBounds(), dsize));
    pwr_valuelargecenter26 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter26.setBounds(new Rectangle(225,387,56,19));
    localPanel.add(pwr_valuelargecenter26, new Proportion(pwr_valuelargecenter26.getBounds(), dsize));
    jopTrend29 = new JopTrend( session);
    jopTrend29.setBounds(new Rectangle(323,91,93,14));
    jopTrend29.setFillColor(0);
    jopTrend29.setBorderColor(36);
    jopTrend29.setBorderColorTrend1(294);
    jopTrend29.setBorderColorTrend2(294);
    jopTrend29.setFillColorTrend1(138);
    jopTrend29.setFillColorTrend2(288);
    jopTrend29.setDrawFill(1);
    jopTrend29.setDrawBorder(1);
    jopTrend29.setTrendBorderWidth(1);
    jopTrend29.setLineWidth(2);
    jopTrend29.setMinValue1(0F);
    jopTrend29.setMaxValue1(1.5F);
    jopTrend29.setMinValue2(0F);
    jopTrend29.setMaxValue2(100F);
    jopTrend29.setNoOfPoints(600);
    jopTrend29.setHorizontalLines(0);
    jopTrend29.setVerticalLines(0);
    jopTrend29.setRotate(0);
    localPanel.add(jopTrend29, new Proportion(jopTrend29.getBounds(), dsize));
    jopAxis31 = new JopAxis();
    jopAxis31.setBounds(new Rectangle(323,102,92,15));
    jopAxis31.setBorderColor(0);
    jopAxis31.setTextColor(0);
    jopAxis31.setLineWidth(1);
    jopAxis31.setMinValue(0F);
    jopAxis31.setMaxValue(100F);
    jopAxis31.setLines(5);
    jopAxis31.setLongQuotient(2);
    jopAxis31.setValueQuotient(1);
    jopAxis31.setLineLength(9);
    jopAxis31.setLineWidth(1);
    jopAxis31.setRotate(270);
    jopAxis31.setFont(new Font("Helvetica", Font.PLAIN, 8));
    jopAxis31.setFormat("%3.0f");
    localPanel.add(jopAxis31, new Proportion(jopAxis31.getBounds(), dsize));
    jopTrend32 = new JopTrend( session);
    jopTrend32.setBounds(new Rectangle(323,65,93,14));
    jopTrend32.setFillColor(0);
    jopTrend32.setBorderColor(36);
    jopTrend32.setBorderColorTrend1(294);
    jopTrend32.setBorderColorTrend2(294);
    jopTrend32.setFillColorTrend1(138);
    jopTrend32.setFillColorTrend2(288);
    jopTrend32.setDrawFill(1);
    jopTrend32.setDrawBorder(1);
    jopTrend32.setTrendBorderWidth(1);
    jopTrend32.setLineWidth(2);
    jopTrend32.setMinValue1(0F);
    jopTrend32.setMaxValue1(1.5F);
    jopTrend32.setMinValue2(0F);
    jopTrend32.setMaxValue2(100F);
    jopTrend32.setNoOfPoints(600);
    jopTrend32.setHorizontalLines(0);
    jopTrend32.setVerticalLines(0);
    jopTrend32.setRotate(0);
    localPanel.add(jopTrend32, new Proportion(jopTrend32.getBounds(), dsize));
    jopTrend33 = new JopTrend( session);
    jopTrend33.setBounds(new Rectangle(323,40,93,14));
    jopTrend33.setFillColor(0);
    jopTrend33.setBorderColor(36);
    jopTrend33.setBorderColorTrend1(294);
    jopTrend33.setBorderColorTrend2(294);
    jopTrend33.setFillColorTrend1(9999);
    jopTrend33.setFillColorTrend2(9999);
    jopTrend33.setDrawFill(1);
    jopTrend33.setDrawBorder(1);
    jopTrend33.setTrendBorderWidth(1);
    jopTrend33.setLineWidth(2);
    jopTrend33.setMinValue1(0F);
    jopTrend33.setMaxValue1(1.5F);
    jopTrend33.setMinValue2(0F);
    jopTrend33.setMaxValue2(100F);
    jopTrend33.setNoOfPoints(600);
    jopTrend33.setHorizontalLines(0);
    jopTrend33.setVerticalLines(0);
    jopTrend33.setRotate(0);
    localPanel.add(jopTrend33, new Proportion(jopTrend33.getBounds(), dsize));
    jopAxis41 = new JopAxis();
    jopAxis41.setBounds(new Rectangle(209,135,18,130));
    jopAxis41.setBorderColor(0);
    jopAxis41.setTextColor(0);
    jopAxis41.setLineWidth(1);
    jopAxis41.setMinValue(0F);
    jopAxis41.setMaxValue(100F);
    jopAxis41.setLines(11);
    jopAxis41.setLongQuotient(2);
    jopAxis41.setValueQuotient(2);
    jopAxis41.setLineLength(9);
    jopAxis41.setLineWidth(1);
    jopAxis41.setRotate(0);
    jopAxis41.setFont(new Font("Helvetica", Font.PLAIN, 8));
    jopAxis41.setFormat("%3.0f");
    localPanel.add(jopAxis41, new Proportion(jopAxis41.getBounds(), dsize));
    jopAxis42 = new JopAxis();
    jopAxis42.setBounds(new Rectangle(227,266,191,18));
    jopAxis42.setBorderColor(0);
    jopAxis42.setTextColor(0);
    jopAxis42.setLineWidth(1);
    jopAxis42.setMinValue(0F);
    jopAxis42.setMaxValue(100F);
    jopAxis42.setLines(11);
    jopAxis42.setLongQuotient(2);
    jopAxis42.setValueQuotient(1);
    jopAxis42.setLineLength(12);
    jopAxis42.setLineWidth(1);
    jopAxis42.setRotate(270);
    jopAxis42.setFont(new Font("Helvetica", Font.PLAIN, 8));
    jopAxis42.setFormat("%3.0f");
    localPanel.add(jopAxis42, new Proportion(jopAxis42.getBounds(), dsize));
    pwr_valuelargecenter46 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter46.setBounds(new Rectangle(227,83,66,26));
    pwr_valuelargecenter46.setFillColor(32);
    pwr_valuelargecenter46.setBorderColor(0);
    pwr_valuelargecenter46.setShadow(1);
    localPanel.add(pwr_valuelargecenter46, new Proportion(pwr_valuelargecenter46.getBounds(), dsize));
    pwr_indsquarelarge49 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge49.setBounds(new Rectangle(29,89,13,13));
    pwr_indsquarelarge49.setFillColor(36);
    pwr_indsquarelarge49.setBorderColor(0);
    pwr_indsquarelarge49.setShadow(1);
    localPanel.add(pwr_indsquarelarge49, new Proportion(pwr_indsquarelarge49.getBounds(), dsize));
    pwr_sliderbackground153 = new pwr_sliderbackground1(session);
    pwr_sliderbackground153.setBounds(new Rectangle(438,162,18,71));
    pwr_sliderbackground153.setShadow(1);
    localPanel.add(pwr_sliderbackground153, new Proportion(pwr_sliderbackground153.getBounds(), dsize));
    pwr_slider154 = new pwr_slider1(session);
    pwr_slider154.setBounds(new Rectangle(441,189,14,10));
    pwr_slider154.setShadow(1);
    localPanel.add(pwr_slider154, new Proportion(pwr_slider154.getBounds(), dsize));
    pwr_indsquarelarge58 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge58.setBounds(new Rectangle(145,62,13,13));
    pwr_indsquarelarge58.setFillColor(38);
    pwr_indsquarelarge58.setShadow(1);
    localPanel.add(pwr_indsquarelarge58, new Proportion(pwr_indsquarelarge58.getBounds(), dsize));
    pwr_indsquarelarge60 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge60.setBounds(new Rectangle(145,46,13,13));
    pwr_indsquarelarge60.setFillColor(114);
    pwr_indsquarelarge60.setShadow(1);
    localPanel.add(pwr_indsquarelarge60, new Proportion(pwr_indsquarelarge60.getBounds(), dsize));
    pwr_valuelargecenter62 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter62.setBounds(new Rectangle(397,346,37,19));
    localPanel.add(pwr_valuelargecenter62, new Proportion(pwr_valuelargecenter62.getBounds(), dsize));
    pwr_valuelargecenter63 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter63.setBounds(new Rectangle(397,367,37,19));
    localPanel.add(pwr_valuelargecenter63, new Proportion(pwr_valuelargecenter63.getBounds(), dsize));
    pwr_valuelargecenter67 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter67.setBounds(new Rectangle(357,346,37,19));
    localPanel.add(pwr_valuelargecenter67, new Proportion(pwr_valuelargecenter67.getBounds(), dsize));
    pwr_valuelargecenter68 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter68.setBounds(new Rectangle(357,367,37,19));
    localPanel.add(pwr_valuelargecenter68, new Proportion(pwr_valuelargecenter68.getBounds(), dsize));
    pwr_buttoncommandcenter73 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter73.setBounds(new Rectangle(28,372,66,23));
    pwr_buttoncommandcenter73.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter73, new Proportion(pwr_buttoncommandcenter73.getBounds(), dsize));
    grp137_74 = new Grp137_(session);
    grp137_74.setBounds(new Rectangle(221,267,11,9));
    grp137_74.setBorderColor(3);
    grp137_74.setShadow(1);
    localPanel.add(grp137_74, new Proportion(grp137_74.getBounds(), dsize));
    jopAxis81 = new JopAxis();
    jopAxis81.setBounds(new Rectangle(185,135,18,130));
    jopAxis81.setBorderColor(0);
    jopAxis81.setTextColor(0);
    jopAxis81.setLineWidth(1);
    jopAxis81.setMinValue(0F);
    jopAxis81.setMaxValue(100F);
    jopAxis81.setLines(11);
    jopAxis81.setLongQuotient(2);
    jopAxis81.setValueQuotient(2);
    jopAxis81.setLineLength(9);
    jopAxis81.setLineWidth(1);
    jopAxis81.setRotate(0);
    jopAxis81.setFont(new Font("Helvetica", Font.PLAIN, 8));
    jopAxis81.setFormat("%3.0f");
    localPanel.add(jopAxis81, new Proportion(jopAxis81.getBounds(), dsize));
    pwr_indsquarelarge85 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge85.setBounds(new Rectangle(29,106,13,13));
    pwr_indsquarelarge85.setFillColor(114);
    pwr_indsquarelarge85.setShadow(1);
    localPanel.add(pwr_indsquarelarge85, new Proportion(pwr_indsquarelarge85.getBounds(), dsize));
    pwr_indsquarelarge87 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge87.setBounds(new Rectangle(29,123,13,13));
    pwr_indsquarelarge87.setShadow(1);
    localPanel.add(pwr_indsquarelarge87, new Proportion(pwr_indsquarelarge87.getBounds(), dsize));
    pwr_buttontogglecenter92 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter92.setBounds(new Rectangle(29,265,36,23));
    pwr_buttontogglecenter92.setFillColor(33);
    pwr_buttontogglecenter92.setShadow(1);
    localPanel.add(pwr_buttontogglecenter92, new Proportion(pwr_buttontogglecenter92.getBounds(), dsize));
    pwr_buttontogglecenter93 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter93.setBounds(new Rectangle(29,291,36,23));
    pwr_buttontogglecenter93.setFillColor(33);
    pwr_buttontogglecenter93.setShadow(1);
    localPanel.add(pwr_buttontogglecenter93, new Proportion(pwr_buttontogglecenter93.getBounds(), dsize));
    pwr_indsquarelarge94 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge94.setBounds(new Rectangle(70,271,13,13));
    pwr_indsquarelarge94.setShadow(1);
    localPanel.add(pwr_indsquarelarge94, new Proportion(pwr_indsquarelarge94.getBounds(), dsize));
    pwr_buttontogglecenter97 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter97.setBounds(new Rectangle(29,196,36,23));
    pwr_buttontogglecenter97.setFillColor(33);
    pwr_buttontogglecenter97.setShadow(1);
    localPanel.add(pwr_buttontogglecenter97, new Proportion(pwr_buttontogglecenter97.getBounds(), dsize));
    pwr_indsquarelarge98 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge98.setBounds(new Rectangle(70,202,13,13));
    pwr_indsquarelarge98.setShadow(1);
    localPanel.add(pwr_indsquarelarge98, new Proportion(pwr_indsquarelarge98.getBounds(), dsize));
    pwr_buttontogglecenter100 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter100.setBounds(new Rectangle(29,220,36,23));
    pwr_buttontogglecenter100.setFillColor(33);
    pwr_buttontogglecenter100.setShadow(1);
    localPanel.add(pwr_buttontogglecenter100, new Proportion(pwr_buttontogglecenter100.getBounds(), dsize));
    pwr_valueinputlargecenter102 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter102.setBounds(new Rectangle(29,333,61,19));
    pwr_valueinputlargecenter102.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter102, new Proportion(pwr_valueinputlargecenter102.getBounds(), dsize));
    pwr_trafficlight106 = new pwr_trafficlight(session);
    pwr_trafficlight106.setBounds(new Rectangle(12,11,28,28));
    pwr_trafficlight106.setShadow(1);
    localPanel.add(pwr_trafficlight106, new Proportion(pwr_trafficlight106.getBounds(), dsize));
    jopXYCurve8.dd.setDynType1(268435456);
    jopXYCurve8.dd.setActionType1(0);
    jopXYCurve8.dd.setElements(new GeDynElemIfc[] {
      new GeDynXYCurve(jopXYCurve8.dd, "Pi-SOFTEL-HMI-Curve3.XValue##Float32#100","Pi-SOFTEL-HMI-Curve3.YValue##Float32#100","Pi-SOFTEL-HMI-Curve3.YMinValue##Float32","Pi-SOFTEL-HMI-Curve3.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve3.XMinValue##Float32","Pi-SOFTEL-HMI-Curve3.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve3.NoOfPoints##UInt32","Pi-SOFTEL-HMI-Curve3.Update##Boolean",0,0,0,0,100,0,5,228,0)
      ,new GeDynXYCurve(jopXYCurve8.dd, "Pi-SOFTEL-HMI-Curve2.XValue##Float32#100","Pi-SOFTEL-HMI-Curve2.YValue##Float32#100","Pi-SOFTEL-HMI-Curve2.YMinValue##Float32","Pi-SOFTEL-HMI-Curve2.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve2.XMinValue##Float32","Pi-SOFTEL-HMI-Curve2.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve2.NoOfPoints##UInt32","Pi-SOFTEL-HMI-Curve2.Update##Boolean",0,0,0,0,100,0,5,288,0)
      ,new GeDynXYCurve(jopXYCurve8.dd, "Pi-SOFTEL-HMI-Curve1.XValue##Float32#100","Pi-SOFTEL-HMI-Curve1.YValue##Float32#100","Pi-SOFTEL-HMI-Curve1.YMinValue##Float32","Pi-SOFTEL-HMI-Curve1.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve1.XMinValue##Float32","Pi-SOFTEL-HMI-Curve1.XMaxValue##Float32","Pi-SOFTEL-HMI-Curve1.NoOfPoints##UInt32","Pi-SOFTEL-HMI-Curve1.Update##Boolean",0,0,0,0,100,0,176,138,0)
      });
    pwr_indsquarelarge11.dd.setDynType1(7);
    pwr_indsquarelarge11.dd.setActionType1(2);
    pwr_indsquarelarge11.dd.setAccess(35454972);
    pwr_indsquarelarge11.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge11.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge11.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      });
    pwr_indsquarelarge12.dd.setDynType1(7);
    pwr_indsquarelarge12.dd.setActionType1(2);
    pwr_indsquarelarge12.dd.setAccess(35454972);
    pwr_indsquarelarge12.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge12.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge12.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      });
    pwr_indsquarelarge13.dd.setDynType1(7);
    pwr_indsquarelarge13.dd.setActionType1(2);
    pwr_indsquarelarge13.dd.setAccess(35454972);
    pwr_indsquarelarge13.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge13.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge13.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7")
      });
    pwr_valuelargecenter16.dd.setDynType1(1025);
    pwr_valuelargecenter16.dd.setActionType1(8194);
    pwr_valuelargecenter16.dd.setAccess(35454972);
    pwr_valuelargecenter16.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter16.dd, "Pi-SOFTEL-ONEWIRE-IndoorAverage.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuelargecenter16.dd, "Pi-SOFTEL-ONEWIRE-IndoorAverage")
      ,new GeDynTipText(pwr_valuelargecenter16.dd, "Avaerage value indoor temp")
      });
    pwr_valueinputlargecenter17.dd.setDynType1(1025);
    pwr_valueinputlargecenter17.dd.setActionType1(12290);
    pwr_valueinputlargecenter17.dd.setAccess(35454972);
    pwr_valueinputlargecenter17.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter17.dd, "Pi-SOFTEL-SetStartPoint.ActualValue##Float32","%4.1f C")
      ,new GeDynValueInput(pwr_valueinputlargecenter17.dd, 0,100,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter17.dd, "Pi-SOFTEL-SetStartPoint")
      ,new GeDynTipText(pwr_valueinputlargecenter17.dd, "Startpoint X-scale when heating is allowed i.e. house need varming up")
      });
    pwr_valueinputlargecenter17.setAnnot1Font(pwr_valueinputlargecenter17.annotFont.deriveFont((float)13.1579));
    pwr_valueinputlargecenter19.dd.setDynType1(1025);
    pwr_valueinputlargecenter19.dd.setActionType1(12290);
    pwr_valueinputlargecenter19.dd.setAccess(35454972);
    pwr_valueinputlargecenter19.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter19.dd, "Pi-SOFTEL-SetSlope.ActualValue##Float32","%4.1f")
      ,new GeDynValueInput(pwr_valueinputlargecenter19.dd, 1,2.5,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter19.dd, "Pi-SOFTEL-SetSlope")
      ,new GeDynTipText(pwr_valueinputlargecenter19.dd, "Set value slope, i.e. heat requirements/temp inside the house")
      });
    pwr_valueinputlargecenter19.setAnnot1Font(pwr_valueinputlargecenter19.annotFont.deriveFont((float)15.4759));
    pwr_valueinputlargecenter20.dd.setDynType1(1025);
    pwr_valueinputlargecenter20.dd.setActionType1(12290);
    pwr_valueinputlargecenter20.dd.setAccess(35454972);
    pwr_valueinputlargecenter20.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter20.dd, "Pi-SOFTEL-SetDutyCycle.ActualValue##Int32","%d s")
      ,new GeDynValueInput(pwr_valueinputlargecenter20.dd, 0,600,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter20.dd, "Pi-SOFTEL-SetDutyCycle")
      ,new GeDynTipText(pwr_valueinputlargecenter20.dd, "Time loop Y-scale heating zon on time are distributed.")
      });
    pwr_valueinputlargecenter20.setAnnot1Font(pwr_valueinputlargecenter20.annotFont.deriveFont((float)13.1579));
    pwr_valuelargecenter22.dd.setDynType1(1025);
    pwr_valuelargecenter22.dd.setActionType1(8194);
    pwr_valuelargecenter22.dd.setAccess(35454972);
    pwr_valuelargecenter22.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter22.dd, "Pi-SOFTEL-HeatReq.ActualValue##Float32","%3.0f %%")
      ,new GeDynPopupMenu(pwr_valuelargecenter22.dd, "Pi-SOFTEL-HeatReq")
      ,new GeDynTipText(pwr_valuelargecenter22.dd, "0-100% heat requirements depending on outdoor temp.")
      });
    pwr_valuelargecenter23.dd.setDynType1(1025);
    pwr_valuelargecenter23.dd.setActionType1(8194);
    pwr_valuelargecenter23.dd.setAccess(35454972);
    pwr_valuelargecenter23.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter23.dd, "Pi-SOFTEL-OnTimeZon.ActualValue##Float32","%3.0f s")
      ,new GeDynPopupMenu(pwr_valuelargecenter23.dd, "Pi-SOFTEL-OnTimeZon")
      ,new GeDynTipText(pwr_valuelargecenter23.dd, "On time during loop")
      });
    pwr_valuelargecenter26.dd.setDynType1(1025);
    pwr_valuelargecenter26.dd.setActionType1(8194);
    pwr_valuelargecenter26.dd.setAccess(35454972);
    pwr_valuelargecenter26.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter26.dd, "Pi-SOFTEL-Loop.ActualValue##Int32","%d s")
      ,new GeDynPopupMenu(pwr_valuelargecenter26.dd, "Pi-SOFTEL-Loop")
      ,new GeDynTipText(pwr_valuelargecenter26.dd, "Current loop time")
      });
    jopTrend29.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean");
    jopTrend32.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean");
    jopTrend33.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean");
    pwr_valuelargecenter46.dd.setDynType1(1025);
    pwr_valuelargecenter46.dd.setActionType1(2);
    pwr_valuelargecenter46.dd.setAccess(35454972);
    pwr_valuelargecenter46.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter46.dd, "Pi-SOFTEL-ONEWIRE-OutDoore_BT2.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuelargecenter46.dd, "Pi-SOFTEL-ONEWIRE-OutDoore_BT2")
      });
    pwr_indsquarelarge49.dd.setDynType1(64);
    pwr_indsquarelarge49.dd.setActionType1(2);
    pwr_indsquarelarge49.dd.setAccess(35454972);
    pwr_indsquarelarge49.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigFlash(pwr_indsquarelarge49.dd, "Pi-SOFTEL-PANEL-SwitchAllOn.ActualValue##Boolean",114,0)
      ,new GeDynPopupMenu(pwr_indsquarelarge49.dd, "Pi-SOFTEL-PANEL-SwitchAllOn")
      });
    pwr_sliderbackground153.dd.setDynType1(524289);
    pwr_sliderbackground153.dd.setActionType1(0);
    pwr_slider154.dd.setDynType1(1);
    pwr_slider154.dd.setActionType1(2048);
    pwr_slider154.dd.setAccess(35454972);
    pwr_slider154.dd.setElements(new GeDynElemIfc[] {
      new GeDynSlider(pwr_slider154.dd, "Pi-SOFTEL-SetSlope.ActualValue##Float32",1,2.5,4,165.586,224.767,null,null,null,500,406.579)
      });
    pwr_indsquarelarge58.dd.setDynType1(64);
    pwr_indsquarelarge58.dd.setActionType1(8194);
    pwr_indsquarelarge58.dd.setAccess(35454972);
    pwr_indsquarelarge58.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigFlash(pwr_indsquarelarge58.dd, "Pi-SOFTEL-Boost.ActualValue##Boolean",0,114)
      ,new GeDynPopupMenu(pwr_indsquarelarge58.dd, "Pi-SOFTEL-Boost")
      ,new GeDynTipText(pwr_indsquarelarge58.dd, "Yellow flash = add som heat/power around zero degree ")
      });
    pwr_indsquarelarge60.dd.setDynType1(7);
    pwr_indsquarelarge60.dd.setActionType1(2);
    pwr_indsquarelarge60.dd.setAccess(35454972);
    pwr_indsquarelarge60.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge60.dd, "",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge60.dd, "")
      });
    pwr_valuelargecenter62.dd.setDynType1(1024);
    pwr_valuelargecenter62.dd.setActionType1(2);
    pwr_valuelargecenter62.dd.setAccess(35454972);
    pwr_valuelargecenter62.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter62.dd, "Pi-SOFTEL-HMI-Curve1.YValue##Float32#100[0]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter62.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_valuelargecenter63.dd.setDynType1(1024);
    pwr_valuelargecenter63.dd.setActionType1(2);
    pwr_valuelargecenter63.dd.setAccess(35454972);
    pwr_valuelargecenter63.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter63.dd, "Pi-SOFTEL-HMI-Curve1.XValue##Float32#100[0]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter63.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_valuelargecenter67.dd.setDynType1(1024);
    pwr_valuelargecenter67.dd.setActionType1(2);
    pwr_valuelargecenter67.dd.setAccess(35454972);
    pwr_valuelargecenter67.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter67.dd, "Pi-SOFTEL-HMI-Curve1.YValue##Float32#100[1]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter67.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_valuelargecenter68.dd.setDynType1(1024);
    pwr_valuelargecenter68.dd.setActionType1(2);
    pwr_valuelargecenter68.dd.setAccess(35454972);
    pwr_valuelargecenter68.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter68.dd, "Pi-SOFTEL-HMI-Curve1.XValue##Float32#100[1]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter68.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_buttoncommandcenter73.dd.setDynType1(1);
    pwr_buttoncommandcenter73.dd.setActionType1(32768);
    pwr_buttoncommandcenter73.dd.setAccess(35454972);
    pwr_buttoncommandcenter73.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter73.dd, "open graph /object=Nodes-Pi-Graph-Pi_process1")
      });
    pwr_buttoncommandcenter73.setAnnot1("Process...");
    grp137_74.dd.setDynType1(8193);
    grp137_74.dd.setActionType1(2);
    grp137_74.dd.setAccess(35454972);
    grp137_74.dd.setElements(new GeDynElemIfc[] {
      new GeDynMove(grp137_74.dd, "Pi-SOFTEL-HMI-ArrowPos.ActualValue##Float32","","","",0,0,1.06579,1.06579,1,1)
      ,new GeDynPopupMenu(grp137_74.dd, "Pi-SOFTEL-HMI-ArrowPos")
      });
    pwr_indsquarelarge85.dd.setDynType1(7);
    pwr_indsquarelarge85.dd.setActionType1(2);
    pwr_indsquarelarge85.dd.setAccess(35454972);
    pwr_indsquarelarge85.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge85.dd, "Pi-SOFTEL-PANEL-SwitchOff.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge85.dd, "Pi-SOFTEL-PANEL-SwitchOff")
      });
    pwr_indsquarelarge87.dd.setDynType1(7);
    pwr_indsquarelarge87.dd.setActionType1(2);
    pwr_indsquarelarge87.dd.setAccess(35454972);
    pwr_indsquarelarge87.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge87.dd, "Pi-SOFTEL-PANEL-SwitchRemote.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge87.dd, "Pi-SOFTEL-PANEL-SwitchRemote")
      });
    pwr_buttontogglecenter92.dd.setDynType1(1);
    pwr_buttontogglecenter92.dd.setActionType1(16);
    pwr_buttontogglecenter92.dd.setAccess(35454972);
    pwr_buttontogglecenter92.dd.setElements(new GeDynElemIfc[] {
      new GeDynToggleDig(pwr_buttontogglecenter92.dd, "")
      });
    pwr_buttontogglecenter92.setAnnot1("ON");
    pwr_buttontogglecenter93.dd.setDynType1(1);
    pwr_buttontogglecenter93.dd.setActionType1(16);
    pwr_buttontogglecenter93.dd.setAccess(35454972);
    pwr_buttontogglecenter93.dd.setElements(new GeDynElemIfc[] {
      new GeDynToggleDig(pwr_buttontogglecenter93.dd, "")
      });
    pwr_buttontogglecenter93.setAnnot1("OFF");
    pwr_indsquarelarge94.dd.setDynType1(7);
    pwr_indsquarelarge94.dd.setActionType1(2);
    pwr_indsquarelarge94.dd.setAccess(35454972);
    pwr_indsquarelarge94.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge94.dd, "Pi-SOFTEL-GPIO-Zon3StartHeat_GPIO8.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge94.dd, "Pi-SOFTEL-GPIO-Zon3StartHeat_GPIO8")
      });
    pwr_buttontogglecenter97.dd.setDynType1(1);
    pwr_buttontogglecenter97.dd.setActionType1(16);
    pwr_buttontogglecenter97.dd.setAccess(35454972);
    pwr_buttontogglecenter97.dd.setElements(new GeDynElemIfc[] {
      new GeDynToggleDig(pwr_buttontogglecenter97.dd, "")
      });
    pwr_buttontogglecenter97.setAnnot1("ON");
    pwr_indsquarelarge98.dd.setDynType1(7);
    pwr_indsquarelarge98.dd.setActionType1(2);
    pwr_indsquarelarge98.dd.setAccess(35454972);
    pwr_indsquarelarge98.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge98.dd, "Pi-SOFTEL-GPIO-Zon3StartHeat_GPIO8.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge98.dd, "Pi-SOFTEL-GPIO-Zon3StartHeat_GPIO8")
      });
    pwr_buttontogglecenter100.dd.setDynType1(1);
    pwr_buttontogglecenter100.dd.setActionType1(16);
    pwr_buttontogglecenter100.dd.setAccess(35454972);
    pwr_buttontogglecenter100.dd.setElements(new GeDynElemIfc[] {
      new GeDynToggleDig(pwr_buttontogglecenter100.dd, "")
      });
    pwr_buttontogglecenter100.setAnnot1("OFF");
    pwr_valueinputlargecenter102.dd.setDynType1(1025);
    pwr_valueinputlargecenter102.dd.setActionType1(12290);
    pwr_valueinputlargecenter102.dd.setAccess(35454972);
    pwr_valueinputlargecenter102.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter102.dd, "Pi-SOFTEL-SetReductionPoint.ActualValue##Float32","%4.1f C")
      ,new GeDynValueInput(pwr_valueinputlargecenter102.dd, 0,100,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter102.dd, "Pi-SOFTEL-SetReductionPoint")
      ,new GeDynTipText(pwr_valueinputlargecenter102.dd, "Reduction limit indoor temp when stop heating activates")
      });
    pwr_valueinputlargecenter102.setAnnot1Font(pwr_valueinputlargecenter102.annotFont.deriveFont((float)13.1579));
    pwr_trafficlight106.dd.setDynType1(53);
    pwr_trafficlight106.dd.setActionType1(2);
    pwr_trafficlight106.dd.setAccess(35454972);
    pwr_trafficlight106.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_trafficlight106.dd, "Pi-SOFTEL-PANEL-RedLight.ActualValue##Boolean")
      ,new GeDynDigWarning(pwr_trafficlight106.dd, "Pi-SOFTEL-PANEL-YellowLight.ActualValue##Boolean")
      ,new GeDynDigLowColor(pwr_trafficlight106.dd, "Pi-SOFTEL-PANEL-GreenLight.ActualValue##Boolean",0)
      ,new GeDynPopupMenu(pwr_trafficlight106.dd, "Pi-SOFTEL-PANEL-RedLight")
      });
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
  public int original_height = 410;
  double rotate;
  public void setRotate( double rotate) {
    if ( rotate < 0)
      this.rotate = rotate % 360 + 360;
    else
      this.rotate = rotate % 360;
  }
  public double getRotate() { return rotate;}
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(11.953F, 40.4323F, 126.832F, 366.288F),
    new Polygon( new int[] { 12, 139, 138, 13, 13, 12}, new int[] { 40, 40, 42, 42, 405, 407}, 6), 
    new Polygon( new int[] { 139, 139, 138, 138, 13, 12}, new int[] { 407, 40, 42, 405, 405, 407}, 6), 
    new Rectangle2D.Float(18.6056F, 83.1447F, 113.061F, 61.9652F),
    new Line2D.Float( 195.603F, 279.985F, 195.603F, 266.428F),
    new Line2D.Float( 163.512F, 279.985F, 163.512F, 266.428F),
    new Line2D.Float( 158.676F, 266.374F, 219.288F, 266.374F),
    new Rectangle2D.Float(313.295F, 125.359F, 19.7645F, 8.68961F),
    new Line2D.Float( 323.466F, 265.563F, 323.466F, 133.833F),
    new Rectangle2D.Float(18.6056F, 163.24F, 113.061F, 239.291F),
    new Line2D.Float( 178.896F, 181.964F, 165.738F, 181.964F),
    new Line2D.Float( 178.896F, 195.122F, 178.896F, 181.964F),
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
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    }
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-50",157, 285);
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-40",190, 285);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[6]);
    {
    int fcolor = GeColor.getDrawtype(67, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Heat Zon",324, 34);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "On",418, 38);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Starting point",365, 300);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Duty Cycle Loop",226, 300);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Heat req.",284, 359);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "On time",284, 379);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Loop time",284, 400);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "In door",228, 35);
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "+/- 0",315, 132);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 14));
    g.drawString( "1",435, 52);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 14));
    g.drawString( "2",435, 77);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 14));
    g.drawString( "3",435, 103);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "slope",433, 155);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "2.5",426, 170);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "1.0",426, 228);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "2.0",427, 195);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[s]",210, 130);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[C]",422, 284);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Out door",229, 81);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 14));
    g.drawString( "Panel",20, 58);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Temp.",433, 143);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "All Zon ON",46, 100);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[s]",313, 115);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[s]",420, 115);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Calculation",226, 342);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 10));
    g.drawString( "X",423, 275);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 10));
    g.drawString( "Y",200, 127);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Boost",162, 72);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Reduction",162, 57);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Curve/Slope",365, 342);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "X",437, 380);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Y",437, 359);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Stop",367, 399);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Start",406, 399);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Y",213, 318);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "X",356, 318);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(5, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[10]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(5, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[11]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[s]",155, 184);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[C]",173, 203);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "max",458, 170);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "min",458, 228);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[%]",185, 130);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[C]",346, 379);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[s]",346, 359);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( " OFF (summer)",46, 116);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Remote",46, 134);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Remote/Terminal",20, 158);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Main switch",20, 77);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Force",33, 262);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Heat",89, 281);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Control",32, 193);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "On",89, 212);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Heat",24, 178);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Reduction limit",30, 329);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 14));
    g.drawString( "Heating System",43, 30);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Graph",30, 370);
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
    size = new Dimension( 68, 25);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 68;
  public int original_height = 25;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 64.4737F, 21.0526F),
    new Polygon( new int[] { 2, 66, 63, 5, 5, 2}, new int[] { 2, 2, 5, 5, 20, 23}, 6), 
    new Polygon( new int[] { 66, 66, 63, 63, 5, 2}, new int[] { 23, 2, 5, 20, 20, 23}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,64.4737F,21.0526F, false,102, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 35 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 15F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 35 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 15F);
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
    size = new Dimension( 26, 26);
  }
  public int original_width = 26;
  public int original_height = 26;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 22.3684F, 22.3684F),
    new Polygon( new int[] { 2, 24, 23, 4, 4, 2}, new int[] { 2, 2, 4, 4, 23, 24}, 6), 
    new Polygon( new int[] { 24, 24, 23, 23, 4, 2}, new int[] { 24, 2, 4, 23, 23, 24}, 6), 
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,22.3684F,22.3684F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
protected class pwr_valuelargecenter extends GeComponent {
  // Dimension size;
  public pwr_valuelargecenter( JopSession session)
  {
    super( session);
    size = new Dimension( 58, 21);
    annot1Font = new Font("Helvetica", Font.BOLD, 12);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 58;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 54.6053F, 17.1053F),
    new Polygon( new int[] { 2, 57, 55, 4, 4, 2}, new int[] { 2, 2, 4, 4, 17, 19}, 6), 
    new Polygon( new int[] { 57, 57, 55, 55, 4, 2}, new int[] { 19, 2, 4, 17, 17, 19}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,54.6053F,17.1053F, false,41, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 29 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 15F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 29 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 15F);
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
protected class pwr_valueinputlargecenter extends GeTextField {
  public pwr_valueinputlargecenter( JopSession session)
  {
    super( session);
    setFont( annotFont);
    setFillColor( 41);
  }
  int original_width = 58;
  int original_height = 21;
  boolean fontSet = false;
  public void paintComponent(Graphics g1) {
    if ( !fontSet) {
      float width = getWidth();
      float height = getHeight();
      setFont( annotFont.deriveFont((float)(height / original_height * annotFont.getSize())));
      fontSet = true;
    }
    super.paintComponent( g1);
  }
}
protected class pwr_buttontogglecenter extends GeComponent {
  // Dimension size;
  public pwr_buttontogglecenter( JopSession session)
  {
    super( session);
    size = new Dimension( 68, 25);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 68;
  public int original_height = 25;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 64.4737F, 21.0526F),
    new Polygon( new int[] { 2, 66, 63, 5, 5, 2}, new int[] { 2, 2, 5, 5, 20, 23}, 6), 
    new Polygon( new int[] { 66, 66, 63, 63, 5, 2}, new int[] { 23, 2, 5, 20, 20, 23}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,64.4737F,21.0526F, false,102, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 35 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 15F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 35 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 15F);
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
protected class pwr_sliderbackground1 extends GeComponent {
  // Dimension size;
  public pwr_sliderbackground1( JopSession session)
  {
    super( session);
    size = new Dimension( 30, 148);
  }
  public int original_width = 30;
  public int original_height = 148;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 28, 15, 2}, new int[] {2, 2, 15, 2}, 4),
    new Polygon( new int[] { 28, 15, 15, 28, 28}, new int[] {2, 15, 134, 147, 2}, 5),
    new Polygon( new int[] { 2, 2, 15, 15, 2}, new int[] {2, 147, 134, 15, 2}, 5),
    new Polygon( new int[] { 2, 15, 28, 2}, new int[] {147, 134, 147, 147}, 4),
    new Rectangle2D.Float(12.5263F, 12.5263F, 5.26316F, 123.684F),
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
    int fcolor = GeColor.getDrawtype(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    }
    {
    int fcolor = GeColor.getDrawtype(46, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[1]);
    }
    {
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[2]);
    }
    {
    int fcolor = GeColor.getDrawtype(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    }
    {
    int fcolor = GeColor.getDrawtype(28, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[4]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_slider1 extends GeComponent {
  // Dimension size;
  public pwr_slider1( JopSession session)
  {
    super( session);
    size = new Dimension( 23, 22);
  }
  public int original_width = 23;
  public int original_height = 22;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 16, 22, 22, 9, 2, 16, 16}, new int[] {2, 16, 20, 20, 15, 15, 2}, 7),
    new Rectangle2D.Float(2F, 2F, 14.4737F, 13.1579F),
    new Rectangle2D.Float(2F, 2F, 14.4737F, 3.94737F),
    new Rectangle2D.Float(2F, 11.2105F, 14.4737F, 3.94737F),
    new Line2D.Float( 16.4737F, 8.15013F, 2F, 8.15013F),
    new Line2D.Float( 16.4737F, 8.83618F, 2F, 8.83618F),
    new Rectangle2D.Float(2F, 2F, 14.4737F, 13.1579F),
    new Polygon( new int[] { 2, 16, 16, 3, 3, 2}, new int[] { 2, 2, 3, 3, 14, 15}, 6), 
    new Polygon( new int[] { 16, 16, 16, 16, 3, 2}, new int[] { 15, 2, 3, 14, 14, 15}, 6), 
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
    int fcolor = GeColor.getDrawtype(28, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    }
    {
    int fcolor = GeColor.getDrawtype(102, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[1]);
    }
    {
    int fcolor = GeColor.getDrawtype(100, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[2]);
    }
    {
    int fcolor = GeColor.getDrawtype(108, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(108, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(100, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    {
    int fcolor = GeColor.getDrawtype(28, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[8]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[6]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_arrow extends GeComponent {
  // Dimension size;
  public pwr_arrow( JopSession session)
  {
    super( session);
    size = new Dimension( 17, 17);
  }
  public int original_width = 17;
  public int original_height = 17;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 9, 2, 15, 9}, new int[] {2, 15, 15, 2}, 4),
    new Polygon( new int[] { 9, 8, 4, 2}, new int[] { 2, 4, 14,15}, 4),
    new Polygon( new int[] { 2, 4, 13, 15}, new int[] { 15, 14, 14,15}, 4),
    new Polygon( new int[] { 15, 13, 8, 9}, new int[] { 15, 14, 4,2}, 4),
    new Polygon( new int[] { 9, 8, -139, -139}, new int[] { 2, 4, 127998,-98}, 4),
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
    int fcolor = GeColor.getDrawtype(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,13.1579F,13.1579F, false,34, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[3]);
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
    size = new Dimension( 30, 30);
  }
  public int original_width = 30;
  public int original_height = 30;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 26.3158F, 26.3158F),
    new Polygon( new int[] { 2, 28, 26, 4, 4, 2}, new int[] { 2, 2, 4, 4, 26, 28}, 6), 
    new Polygon( new int[] { 28, 28, 26, 26, 4, 2}, new int[] { 28, 2, 4, 26, 26, 28}, 6), 
    new Arc2D.Float(5.34988F, 5.6126F, 19.6161F, 19.0905F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(5.34988F, 5.6126F, 19.6161F, 19.0905F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(5.34988F, 5.6126F, 19.6161F, 19.0905F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(5.34988F, 5.6126F, 19.6161F, 19.0905F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(6.87712F, 7.13984F, 16.5616F, 16.0361F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(5.34988F, 5.6126F, 19.6161F, 19.0905F, 0F, 360F, Arc2D.PIE),
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,26.3158F,26.3158F, true,28, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    GeGradient.paint( g, 9,2,-2,5.34988F,5.6126F,19.6161F,19.0905F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    GeGradient.paint( g, gradient,2,-2,5.34988F,5.6126F,19.6161F,19.0905F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[7]);
    }
    } else {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    } else {
    GeGradient.paint( g, gradient,2,-2,5.34988F,5.6126F,19.6161F,19.0905F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
protected class Grp137_ extends GeComponent {
  // Dimension size;
  pwr_arrow	pwr_arrow0;
  public Grp137_( JopSession session)
  {
    super( session);
    size = new Dimension( 17, 17);
    pwr_arrow0 = new pwr_arrow(session);
    pwr_arrow0.setBounds(new Rectangle(1,1,15,15));
    pwr_arrow0.setFillColor(175);
    add(pwr_arrow0);
    pwr_arrow0.dd.setDynType1(1);
    pwr_arrow0.dd.setActionType1(0);
  }
  public int original_width = 17;
  public int original_height = 17;
  Shape[] shapes = new Shape[] { 
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
    save_tmp = g.getTransform();
    g.translate( pwr_arrow0.getX(), pwr_arrow0.getY());
    if ( pwr_arrow0.dd.dynType == 0) {
      pwr_arrow0.colorTone = colorTone;
      pwr_arrow0.colorBrightness = colorBrightness;
      pwr_arrow0.colorIntensity = colorIntensity;
      pwr_arrow0.colorShift = colorShift;
      pwr_arrow0.colorInverse = colorInverse;
    }
    pwr_arrow0.paintComponent(g);
    g.setTransform( save_tmp);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
}
