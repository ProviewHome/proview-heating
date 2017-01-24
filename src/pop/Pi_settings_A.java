import jpwr.rt.*;
import jpwr.jop.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Pi_settings_A extends JopApplet {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  JopXYCurve	jopXYCurve10;
  pwr_indsquarelarge	pwr_indsquarelarge13;
  pwr_indsquarelarge	pwr_indsquarelarge14;
  pwr_indsquarelarge	pwr_indsquarelarge15;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter18;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter20;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter21;
  pwr_valuelargecenter	pwr_valuelargecenter23;
  pwr_valuelargecenter	pwr_valuelargecenter24;
  pwr_valuelargecenter	pwr_valuelargecenter27;
  JopTrend	jopTrend30;
  JopAxis	jopAxis32;
  JopTrend	jopTrend33;
  JopTrend	jopTrend34;
  JopAxis	jopAxis39;
  JopAxis	jopAxis40;
  pwr_indsquarelarge	pwr_indsquarelarge46;
  pwr_sliderbackground1	pwr_sliderbackground149;
  pwr_slider1	pwr_slider150;
  pwr_indsquarelarge	pwr_indsquarelarge54;
  pwr_indsquarelarge	pwr_indsquarelarge56;
  pwr_valuelargecenter	pwr_valuelargecenter57;
  pwr_valuelargecenter	pwr_valuelargecenter58;
  pwr_valuelargecenter	pwr_valuelargecenter62;
  pwr_valuelargecenter	pwr_valuelargecenter63;
  Grp137_	grp137_68;
  JopAxis	jopAxis75;
  pwr_indsquarelarge	pwr_indsquarelarge79;
  pwr_indsquarelarge	pwr_indsquarelarge81;
  pwr_indsquarelarge	pwr_indsquarelarge86;
  pwr_buttontogglecenter	pwr_buttontogglecenter89;
  pwr_indsquarelarge	pwr_indsquarelarge90;
  pwr_buttontogglecenter	pwr_buttontogglecenter92;
  pwr_buttontogglecenter	pwr_buttontogglecenter95;
  pwr_buttontogglecenter	pwr_buttontogglecenter96;
  Grp197_	grp197_97;
  pwr_indsquarelarge	pwr_indsquarelarge98;
  pwr_indsquarelarge	pwr_indsquarelarge99;
  pwr_valuereliefdown	pwr_valuereliefdown100;
  pwr_valuereliefdown	pwr_valuereliefdown101;
  pwr_valuereliefdown	pwr_valuereliefdown102;
  pwr_valuereliefdown	pwr_valuereliefdown103;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter107;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter109;
  pwr_valueinputlargecenter	pwr_valueinputlargecenter110;
  pwr_buttoninfo	pwr_buttoninfo112;
  pwr_valuelargecenter	pwr_valuelargecenter113;
  pwr_valuelargecenter	pwr_valuelargecenter114;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter116;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter117;
  pwr_trafficlight	pwr_trafficlight118;
  pwr_buttontogglecenter	pwr_buttontogglecenter123;
  pwr_buttontogglecenter	pwr_buttontogglecenter124;
  pwr_indsquarelarge	pwr_indsquarelarge125;
  public Pi_settings_A() {}
  public void init() {
    super.init();
    geInit();
  }
  public void geInit() {
    JopSpider.setSystemName( "pi");
    engine.setAnimationScanTime( 500);
    engine.setScanTime( 100);
    size = new Dimension( 512, 414);
    Dimension dsize = new Dimension(localPanel.original_width,localPanel.original_height);
    this.addComponentListener(new AspectRatioListener(this,size));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
      contentPane.add(localPanel, BorderLayout.CENTER);
    contentPane.setOpaque(true);
    localPanel.setLayout( new RatioLayout()); // scaletest
    localPanel.setOpaque(true);
    localPanel.setBackground(GeColor.getColor(213, GeColor.NO_COLOR));
    jopXYCurve10 = new JopXYCurve( session);
    jopXYCurve10.setBounds(new Rectangle(213,134,162,109));
    jopXYCurve10.setFillColor(39);
    jopXYCurve10.setBorderColor(36);
    jopXYCurve10.setDrawFill(1);
    jopXYCurve10.setDrawBorder(1);
    jopXYCurve10.setTrendBorderWidth(2);
    jopXYCurve10.setLineWidth(1);
    jopXYCurve10.setNoOfPoints(100);
    jopXYCurve10.setHorizontalLines(17);
    jopXYCurve10.setVerticalLines(5);
    jopXYCurve10.setRotate(0);
    localPanel.add(jopXYCurve10, new Proportion(jopXYCurve10.getBounds(), dsize));
    pwr_indsquarelarge13 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge13.setBounds(new Rectangle(354,43,11,11));
    pwr_indsquarelarge13.setShadow(1);
    localPanel.add(pwr_indsquarelarge13, new Proportion(pwr_indsquarelarge13.getBounds(), dsize));
    pwr_indsquarelarge14 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge14.setBounds(new Rectangle(354,64,11,11));
    pwr_indsquarelarge14.setShadow(1);
    localPanel.add(pwr_indsquarelarge14, new Proportion(pwr_indsquarelarge14.getBounds(), dsize));
    pwr_indsquarelarge15 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge15.setBounds(new Rectangle(354,86,11,11));
    pwr_indsquarelarge15.setShadow(1);
    localPanel.add(pwr_indsquarelarge15, new Proportion(pwr_indsquarelarge15.getBounds(), dsize));
    pwr_valueinputlargecenter18 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter18.setBounds(new Rectangle(323,277,52,16));
    pwr_valueinputlargecenter18.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter18, new Proportion(pwr_valueinputlargecenter18.getBounds(), dsize));
    pwr_valueinputlargecenter20 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter20.setBounds(new Rectangle(381,221,36,18));
    pwr_valueinputlargecenter20.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter20, new Proportion(pwr_valueinputlargecenter20.getBounds(), dsize));
    pwr_valueinputlargecenter21 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter21.setBounds(new Rectangle(160,277,52,16));
    pwr_valueinputlargecenter21.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter21, new Proportion(pwr_valueinputlargecenter21.getBounds(), dsize));
    pwr_valuelargecenter23 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter23.setBounds(new Rectangle(162,311,48,16));
    pwr_valuelargecenter23.setBorderColor(295);
    localPanel.add(pwr_valuelargecenter23, new Proportion(pwr_valuelargecenter23.getBounds(), dsize));
    pwr_valuelargecenter24 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter24.setBounds(new Rectangle(162,329,48,16));
    pwr_valuelargecenter24.setBorderColor(295);
    localPanel.add(pwr_valuelargecenter24, new Proportion(pwr_valuelargecenter24.getBounds(), dsize));
    pwr_valuelargecenter27 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter27.setBounds(new Rectangle(162,347,48,16));
    pwr_valuelargecenter27.setBorderColor(235);
    localPanel.add(pwr_valuelargecenter27, new Proportion(pwr_valuelargecenter27.getBounds(), dsize));
    jopTrend30 = new JopTrend( session);
    jopTrend30.setBounds(new Rectangle(273,86,78,12));
    jopTrend30.setFillColor(0);
    jopTrend30.setBorderColor(36);
    jopTrend30.setBorderColorTrend1(294);
    jopTrend30.setBorderColorTrend2(294);
    jopTrend30.setFillColorTrend1(138);
    jopTrend30.setFillColorTrend2(288);
    jopTrend30.setDrawFill(1);
    jopTrend30.setDrawBorder(1);
    jopTrend30.setTrendBorderWidth(1);
    jopTrend30.setLineWidth(2);
    jopTrend30.setMinValue1(0F);
    jopTrend30.setMaxValue1(1.5F);
    jopTrend30.setMinValue2(0F);
    jopTrend30.setMaxValue2(100F);
    jopTrend30.setNoOfPoints(600);
    jopTrend30.setHorizontalLines(0);
    jopTrend30.setVerticalLines(0);
    jopTrend30.setRotate(0);
    localPanel.add(jopTrend30, new Proportion(jopTrend30.getBounds(), dsize));
    jopAxis32 = new JopAxis();
    jopAxis32.setBounds(new Rectangle(273,100,78,13));
    jopAxis32.setBorderColor(0);
    jopAxis32.setTextColor(0);
    jopAxis32.setLineWidth(1);
    jopAxis32.setMinValue(0F);
    jopAxis32.setMaxValue(300F);
    jopAxis32.setLines(11);
    jopAxis32.setLongQuotient(2);
    jopAxis32.setValueQuotient(2);
    jopAxis32.setLineLength(8);
    jopAxis32.setLineWidth(1);
    jopAxis32.setRotate(270);
    jopAxis32.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis32.setFormat("%3.0f");
    localPanel.add(jopAxis32, new Proportion(jopAxis32.getBounds(), dsize));
    jopTrend33 = new JopTrend( session);
    jopTrend33.setBounds(new Rectangle(273,64,78,12));
    jopTrend33.setFillColor(0);
    jopTrend33.setBorderColor(36);
    jopTrend33.setBorderColorTrend1(294);
    jopTrend33.setBorderColorTrend2(294);
    jopTrend33.setFillColorTrend1(138);
    jopTrend33.setFillColorTrend2(288);
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
    jopTrend34 = new JopTrend( session);
    jopTrend34.setBounds(new Rectangle(273,43,78,12));
    jopTrend34.setFillColor(0);
    jopTrend34.setBorderColor(36);
    jopTrend34.setBorderColorTrend1(294);
    jopTrend34.setBorderColorTrend2(294);
    jopTrend34.setFillColorTrend1(9999);
    jopTrend34.setFillColorTrend2(9999);
    jopTrend34.setDrawFill(1);
    jopTrend34.setDrawBorder(1);
    jopTrend34.setTrendBorderWidth(1);
    jopTrend34.setLineWidth(2);
    jopTrend34.setMinValue1(0F);
    jopTrend34.setMaxValue1(1.5F);
    jopTrend34.setMinValue2(0F);
    jopTrend34.setMaxValue2(100F);
    jopTrend34.setNoOfPoints(600);
    jopTrend34.setHorizontalLines(0);
    jopTrend34.setVerticalLines(0);
    jopTrend34.setRotate(0);
    localPanel.add(jopTrend34, new Proportion(jopTrend34.getBounds(), dsize));
    jopAxis39 = new JopAxis();
    jopAxis39.setBounds(new Rectangle(197,135,15,110));
    jopAxis39.setBorderColor(0);
    jopAxis39.setTextColor(0);
    jopAxis39.setLineWidth(1);
    jopAxis39.setMinValue(0F);
    jopAxis39.setMaxValue(100F);
    jopAxis39.setLines(11);
    jopAxis39.setLongQuotient(2);
    jopAxis39.setValueQuotient(2);
    jopAxis39.setLineLength(6);
    jopAxis39.setLineWidth(1);
    jopAxis39.setRotate(0);
    jopAxis39.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis39.setFormat("%3.0f");
    localPanel.add(jopAxis39, new Proportion(jopAxis39.getBounds(), dsize));
    jopAxis40 = new JopAxis();
    jopAxis40.setBounds(new Rectangle(212,245,161,15));
    jopAxis40.setBorderColor(0);
    jopAxis40.setTextColor(0);
    jopAxis40.setLineWidth(1);
    jopAxis40.setMinValue(0F);
    jopAxis40.setMaxValue(100F);
    jopAxis40.setLines(11);
    jopAxis40.setLongQuotient(1);
    jopAxis40.setValueQuotient(2);
    jopAxis40.setLineLength(10);
    jopAxis40.setLineWidth(1);
    jopAxis40.setRotate(270);
    jopAxis40.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis40.setFormat("%3.0f");
    localPanel.add(jopAxis40, new Proportion(jopAxis40.getBounds(), dsize));
    pwr_indsquarelarge46 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge46.setBounds(new Rectangle(37,76,11,11));
    pwr_indsquarelarge46.setFillColor(36);
    pwr_indsquarelarge46.setBorderColor(0);
    pwr_indsquarelarge46.setShadow(1);
    localPanel.add(pwr_indsquarelarge46, new Proportion(pwr_indsquarelarge46.getBounds(), dsize));
    pwr_sliderbackground149 = new pwr_sliderbackground1(session);
    pwr_sliderbackground149.setBounds(new Rectangle(390,157,15,60));
    pwr_sliderbackground149.setShadow(1);
    localPanel.add(pwr_sliderbackground149, new Proportion(pwr_sliderbackground149.getBounds(), dsize));
    pwr_slider150 = new pwr_slider1(session);
    pwr_slider150.setBounds(new Rectangle(393,180,12,9));
    pwr_slider150.setShadow(1);
    localPanel.add(pwr_slider150, new Proportion(pwr_slider150.getBounds(), dsize));
    pwr_indsquarelarge54 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge54.setBounds(new Rectangle(135,87,11,11));
    pwr_indsquarelarge54.setFillColor(38);
    pwr_indsquarelarge54.setShadow(1);
    localPanel.add(pwr_indsquarelarge54, new Proportion(pwr_indsquarelarge54.getBounds(), dsize));
    pwr_indsquarelarge56 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge56.setBounds(new Rectangle(423,43,11,11));
    pwr_indsquarelarge56.setFillColor(114);
    pwr_indsquarelarge56.setShadow(1);
    localPanel.add(pwr_indsquarelarge56, new Proportion(pwr_indsquarelarge56.getBounds(), dsize));
    pwr_valuelargecenter57 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter57.setBounds(new Rectangle(351,313,31,16));
    localPanel.add(pwr_valuelargecenter57, new Proportion(pwr_valuelargecenter57.getBounds(), dsize));
    pwr_valuelargecenter58 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter58.setBounds(new Rectangle(351,330,31,16));
    localPanel.add(pwr_valuelargecenter58, new Proportion(pwr_valuelargecenter58.getBounds(), dsize));
    pwr_valuelargecenter62 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter62.setBounds(new Rectangle(317,313,31,16));
    localPanel.add(pwr_valuelargecenter62, new Proportion(pwr_valuelargecenter62.getBounds(), dsize));
    pwr_valuelargecenter63 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter63.setBounds(new Rectangle(317,330,31,16));
    localPanel.add(pwr_valuelargecenter63, new Proportion(pwr_valuelargecenter63.getBounds(), dsize));
    grp137_68 = new Grp137_(session);
    grp137_68.setBounds(new Rectangle(207,246,10,8));
    grp137_68.setFillColor(114);
    grp137_68.setBorderColor(0);
    grp137_68.setShadow(1);
    localPanel.add(grp137_68, new Proportion(grp137_68.getBounds(), dsize));
    jopAxis75 = new JopAxis();
    jopAxis75.setBounds(new Rectangle(173,135,15,110));
    jopAxis75.setBorderColor(0);
    jopAxis75.setTextColor(0);
    jopAxis75.setLineWidth(1);
    jopAxis75.setMinValue(0F);
    jopAxis75.setMaxValue(100F);
    jopAxis75.setLines(11);
    jopAxis75.setLongQuotient(2);
    jopAxis75.setValueQuotient(2);
    jopAxis75.setLineLength(6);
    jopAxis75.setLineWidth(1);
    jopAxis75.setRotate(0);
    jopAxis75.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis75.setFormat("%3.0f");
    localPanel.add(jopAxis75, new Proportion(jopAxis75.getBounds(), dsize));
    pwr_indsquarelarge79 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge79.setBounds(new Rectangle(37,90,11,11));
    pwr_indsquarelarge79.setFillColor(114);
    pwr_indsquarelarge79.setShadow(1);
    localPanel.add(pwr_indsquarelarge79, new Proportion(pwr_indsquarelarge79.getBounds(), dsize));
    pwr_indsquarelarge81 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge81.setBounds(new Rectangle(37,104,11,11));
    pwr_indsquarelarge81.setShadow(1);
    localPanel.add(pwr_indsquarelarge81, new Proportion(pwr_indsquarelarge81.getBounds(), dsize));
    pwr_indsquarelarge86 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge86.setBounds(new Rectangle(63,230,11,11));
    pwr_indsquarelarge86.setShadow(1);
    localPanel.add(pwr_indsquarelarge86, new Proportion(pwr_indsquarelarge86.getBounds(), dsize));
    pwr_buttontogglecenter89 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter89.setBounds(new Rectangle(27,168,31,19));
    pwr_buttontogglecenter89.setFillColor(33);
    pwr_buttontogglecenter89.setShadow(1);
    localPanel.add(pwr_buttontogglecenter89, new Proportion(pwr_buttontogglecenter89.getBounds(), dsize));
    pwr_indsquarelarge90 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge90.setBounds(new Rectangle(63,172,11,11));
    pwr_indsquarelarge90.setShadow(1);
    localPanel.add(pwr_indsquarelarge90, new Proportion(pwr_indsquarelarge90.getBounds(), dsize));
    pwr_buttontogglecenter92 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter92.setBounds(new Rectangle(27,188,31,19));
    pwr_buttontogglecenter92.setFillColor(33);
    pwr_buttontogglecenter92.setShadow(1);
    localPanel.add(pwr_buttontogglecenter92, new Proportion(pwr_buttontogglecenter92.getBounds(), dsize));
    pwr_buttontogglecenter95 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter95.setBounds(new Rectangle(27,226,31,19));
    pwr_buttontogglecenter95.setFillColor(33);
    pwr_buttontogglecenter95.setShadow(1);
    localPanel.add(pwr_buttontogglecenter95, new Proportion(pwr_buttontogglecenter95.getBounds(), dsize));
    pwr_buttontogglecenter96 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter96.setBounds(new Rectangle(27,247,31,19));
    pwr_buttontogglecenter96.setFillColor(33);
    pwr_buttontogglecenter96.setShadow(1);
    localPanel.add(pwr_buttontogglecenter96, new Proportion(pwr_buttontogglecenter96.getBounds(), dsize));
    grp197_97 = new Grp197_(session);
    grp197_97.setBounds(new Rectangle(204,239,8,10));
    grp197_97.setFillColor(236);
    grp197_97.setBorderColor(3);
    grp197_97.setRotate(-270);
    grp197_97.setShadow(1);
    localPanel.add(grp197_97, new Proportion(grp197_97.getBounds(), dsize));
    pwr_indsquarelarge98 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge98.setBounds(new Rectangle(423,64,11,11));
    pwr_indsquarelarge98.setFillColor(114);
    pwr_indsquarelarge98.setShadow(1);
    localPanel.add(pwr_indsquarelarge98, new Proportion(pwr_indsquarelarge98.getBounds(), dsize));
    pwr_indsquarelarge99 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge99.setBounds(new Rectangle(423,86,11,11));
    pwr_indsquarelarge99.setFillColor(114);
    pwr_indsquarelarge99.setShadow(1);
    localPanel.add(pwr_indsquarelarge99, new Proportion(pwr_indsquarelarge99.getBounds(), dsize));
    pwr_valuereliefdown100 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown100.setBounds(new Rectangle(227,41,42,16));
    localPanel.add(pwr_valuereliefdown100, new Proportion(pwr_valuereliefdown100.getBounds(), dsize));
    pwr_valuereliefdown101 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown101.setBounds(new Rectangle(227,62,42,16));
    localPanel.add(pwr_valuereliefdown101, new Proportion(pwr_valuereliefdown101.getBounds(), dsize));
    pwr_valuereliefdown102 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown102.setBounds(new Rectangle(227,83,42,16));
    localPanel.add(pwr_valuereliefdown102, new Proportion(pwr_valuereliefdown102.getBounds(), dsize));
    pwr_valuereliefdown103 = new pwr_valuereliefdown(session);
    pwr_valuereliefdown103.setBounds(new Rectangle(134,61,61,22));
    pwr_valuereliefdown103.setBorderColor(114);
    localPanel.add(pwr_valuereliefdown103, new Proportion(pwr_valuereliefdown103.getBounds(), dsize));
    pwr_valueinputlargecenter107 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter107.setBounds(new Rectangle(369,42,52,16));
    pwr_valueinputlargecenter107.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter107, new Proportion(pwr_valueinputlargecenter107.getBounds(), dsize));
    pwr_valueinputlargecenter109 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter109.setBounds(new Rectangle(369,63,52,16));
    pwr_valueinputlargecenter109.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter109, new Proportion(pwr_valueinputlargecenter109.getBounds(), dsize));
    pwr_valueinputlargecenter110 = new pwr_valueinputlargecenter(session);
    pwr_valueinputlargecenter110.setBounds(new Rectangle(369,84,52,16));
    pwr_valueinputlargecenter110.setBorderColor(11);
    localPanel.add(pwr_valueinputlargecenter110, new Proportion(pwr_valueinputlargecenter110.getBounds(), dsize));
    pwr_buttoninfo112 = new pwr_buttoninfo(session);
    pwr_buttoninfo112.setBounds(new Rectangle(29,3,24,23));
    localPanel.add(pwr_buttoninfo112, new Proportion(pwr_buttoninfo112.getBounds(), dsize));
    pwr_valuelargecenter113 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter113.setBounds(new Rectangle(363,6,65,16));
    pwr_valuelargecenter113.setFillColor(32);
    pwr_valuelargecenter113.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter113, new Proportion(pwr_valuelargecenter113.getBounds(), dsize));
    pwr_valuelargecenter114 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter114.setBounds(new Rectangle(432,6,65,16));
    pwr_valuelargecenter114.setFillColor(32);
    pwr_valuelargecenter114.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter114, new Proportion(pwr_valuelargecenter114.getBounds(), dsize));
    pwr_buttoncommandcenter116 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter116.setBounds(new Rectangle(441,320,56,19));
    pwr_buttoncommandcenter116.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter116, new Proportion(pwr_buttoncommandcenter116.getBounds(), dsize));
    pwr_buttoncommandcenter117 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter117.setBounds(new Rectangle(441,343,56,19));
    pwr_buttoncommandcenter117.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter117, new Proportion(pwr_buttoncommandcenter117.getBounds(), dsize));
    pwr_trafficlight118 = new pwr_trafficlight(session);
    pwr_trafficlight118.setBounds(new Rectangle(5,4,24,24));
    pwr_trafficlight118.setShadow(1);
    localPanel.add(pwr_trafficlight118, new Proportion(pwr_trafficlight118.getBounds(), dsize));
    pwr_buttontogglecenter123 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter123.setBounds(new Rectangle(27,314,31,19));
    pwr_buttontogglecenter123.setFillColor(33);
    pwr_buttontogglecenter123.setShadow(1);
    localPanel.add(pwr_buttontogglecenter123, new Proportion(pwr_buttontogglecenter123.getBounds(), dsize));
    pwr_buttontogglecenter124 = new pwr_buttontogglecenter(session);
    pwr_buttontogglecenter124.setBounds(new Rectangle(27,335,31,19));
    pwr_buttontogglecenter124.setFillColor(33);
    pwr_buttontogglecenter124.setShadow(1);
    localPanel.add(pwr_buttontogglecenter124, new Proportion(pwr_buttontogglecenter124.getBounds(), dsize));
    pwr_indsquarelarge125 = new pwr_indsquarelarge(session);
    pwr_indsquarelarge125.setBounds(new Rectangle(63,318,11,11));
    pwr_indsquarelarge125.setShadow(1);
    localPanel.add(pwr_indsquarelarge125, new Proportion(pwr_indsquarelarge125.getBounds(), dsize));
    jopXYCurve10.dd.setDynType1(268435456);
    jopXYCurve10.dd.setActionType1(0);
    jopXYCurve10.dd.setElements(new GeDynElemIfc[] {
      new GeDynXYCurve(jopXYCurve10.dd, "Pi-SOFTEL-HMI-Curve3.XValue##Float32#100","Pi-SOFTEL-HMI-Curve3.YValue##Float32#100","Pi-SOFTEL-HMI-Curve3.YMinValue##Float32","Pi-SOFTEL-HMI-Curve3.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve3.XMinValue##Float32","Pi-SOFTEL-HMI-Curve3.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve3.NoOfPoints##UInt32","Pi-SOFTEL-HMI-Curve3.Update##Boolean",0,0,0,0,100,0,5,228,0)
      ,new GeDynXYCurve(jopXYCurve10.dd, "Pi-SOFTEL-HMI-Curve2.XValue##Float32#100","Pi-SOFTEL-HMI-Curve2.YValue##Float32#100","Pi-SOFTEL-HMI-Curve2.YMinValue##Float32","Pi-SOFTEL-HMI-Curve2.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve2.XMinValue##Float32","Pi-SOFTEL-HMI-Curve2.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve2.NoOfPoints##UInt32","Pi-SOFTEL-HMI-Curve2.Update##Boolean",0,0,0,0,100,0,294,288,0)
      ,new GeDynXYCurve(jopXYCurve10.dd, "Pi-SOFTEL-HMI-Curve1.XValue##Float32#100","Pi-SOFTEL-HMI-Curve1.YValue##Float32#100","Pi-SOFTEL-HMI-Curve1.YMinValue##Float32","Pi-SOFTEL-HMI-Curve1.YMaxValue##Float32","Pi-SOFTEL-HMI-Curve1.XMinValue##Float32","Pi-SOFTEL-HMI-Curve1.XMaxValue##Float32","Pi-SOFTEL-HMI-Curve1.NoOfPoints##UInt32","Pi-SOFTEL-HMI-Curve1.Update##Boolean",0,0,0,0,100,0,176,138,0)
      });
    pwr_indsquarelarge13.dd.setDynType1(7);
    pwr_indsquarelarge13.dd.setActionType1(2);
    pwr_indsquarelarge13.dd.setAccess(35454972);
    pwr_indsquarelarge13.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge13.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge13.dd, "Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5")
      });
    pwr_indsquarelarge14.dd.setDynType1(7);
    pwr_indsquarelarge14.dd.setActionType1(2);
    pwr_indsquarelarge14.dd.setAccess(35454972);
    pwr_indsquarelarge14.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge14.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge14.dd, "Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6")
      });
    pwr_indsquarelarge15.dd.setDynType1(7);
    pwr_indsquarelarge15.dd.setActionType1(2);
    pwr_indsquarelarge15.dd.setAccess(35454972);
    pwr_indsquarelarge15.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge15.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge15.dd, "Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7")
      });
    pwr_valueinputlargecenter18.dd.setDynType1(1025);
    pwr_valueinputlargecenter18.dd.setActionType1(12290);
    pwr_valueinputlargecenter18.dd.setAccess(35454972);
    pwr_valueinputlargecenter18.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter18.dd, "Pi-SOFTEL-SetStartPoint.ActualValue##Float32","%4.1f °C")
      ,new GeDynValueInput(pwr_valueinputlargecenter18.dd, 0,100,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter18.dd, "Pi-SOFTEL-SetStartPoint")
      ,new GeDynTipText(pwr_valueinputlargecenter18.dd, "Startpoint X-scale when heating is allowed i.e. house need varming up")
      });
    pwr_valueinputlargecenter18.setAnnot1Font(pwr_valueinputlargecenter18.annotFont.deriveFont((float)11.1111));
    pwr_valueinputlargecenter20.dd.setDynType1(1025);
    pwr_valueinputlargecenter20.dd.setActionType1(12290);
    pwr_valueinputlargecenter20.dd.setAccess(35454972);
    pwr_valueinputlargecenter20.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter20.dd, "Pi-SOFTEL-SetSlope.ActualValue##Float32","%4.1f")
      ,new GeDynValueInput(pwr_valueinputlargecenter20.dd, 1,2.5,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter20.dd, "Pi-SOFTEL-SetSlope")
      ,new GeDynTipText(pwr_valueinputlargecenter20.dd, "Set value slope, i.e. heat requirements/temp inside the house")
      });
    pwr_valueinputlargecenter20.setAnnot1Font(pwr_valueinputlargecenter20.annotFont.deriveFont((float)13.0686));
    pwr_valueinputlargecenter21.dd.setDynType1(1025);
    pwr_valueinputlargecenter21.dd.setActionType1(12290);
    pwr_valueinputlargecenter21.dd.setAccess(35454972);
    pwr_valueinputlargecenter21.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter21.dd, "Pi-SOFTEL-SetDutyCycle.ActualValue##Int32","%d s")
      ,new GeDynValueInput(pwr_valueinputlargecenter21.dd, 0,600,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter21.dd, "Pi-SOFTEL-SetDutyCycle")
      ,new GeDynTipText(pwr_valueinputlargecenter21.dd, "Time loop Y-scale heating zon on time are distributed.")
      });
    pwr_valueinputlargecenter21.setAnnot1Font(pwr_valueinputlargecenter21.annotFont.deriveFont((float)11.1111));
    pwr_valuelargecenter23.dd.setDynType1(1025);
    pwr_valuelargecenter23.dd.setActionType1(8194);
    pwr_valuelargecenter23.dd.setAccess(35454972);
    pwr_valuelargecenter23.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter23.dd, "Pi-SOFTEL-HeatReq.ActualValue##Float32","%3.0f %%")
      ,new GeDynPopupMenu(pwr_valuelargecenter23.dd, "Pi-SOFTEL-HeatReq")
      ,new GeDynTipText(pwr_valuelargecenter23.dd, "0-100% heat requirements depending on outdoor temp.")
      });
    pwr_valuelargecenter24.dd.setDynType1(1025);
    pwr_valuelargecenter24.dd.setActionType1(8194);
    pwr_valuelargecenter24.dd.setAccess(35454972);
    pwr_valuelargecenter24.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter24.dd, "Pi-SOFTEL-OnTimeZon.ActualValue##Float32","%3.0f s")
      ,new GeDynPopupMenu(pwr_valuelargecenter24.dd, "Pi-SOFTEL-OnTimeZon")
      ,new GeDynTipText(pwr_valuelargecenter24.dd, "On time during loop")
      });
    pwr_valuelargecenter27.dd.setDynType1(1025);
    pwr_valuelargecenter27.dd.setActionType1(8194);
    pwr_valuelargecenter27.dd.setAccess(35454972);
    pwr_valuelargecenter27.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter27.dd, "Pi-SOFTEL-Loop.ActualValue##Int32","%d s")
      ,new GeDynPopupMenu(pwr_valuelargecenter27.dd, "Pi-SOFTEL-Loop")
      ,new GeDynTipText(pwr_valuelargecenter27.dd, "Current loop time")
      });
    jopTrend30.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon3StartHeatOut3_IO7.ActualValue##Boolean");
    jopTrend33.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon2StartHeatOut2_IO6.ActualValue##Boolean");
    jopTrend34.setPwrAttribute1("Pi-SOFTEL-ARDU-Zon1StartHeatOut1_IO5.ActualValue##Boolean");
    pwr_indsquarelarge46.dd.setDynType1(64);
    pwr_indsquarelarge46.dd.setActionType1(2);
    pwr_indsquarelarge46.dd.setAccess(35454972);
    pwr_indsquarelarge46.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigFlash(pwr_indsquarelarge46.dd, "Pi-SOFTEL-PANEL-SwitchAllOn.ActualValue##Boolean",114,0)
      ,new GeDynPopupMenu(pwr_indsquarelarge46.dd, "Pi-SOFTEL-PANEL-SwitchAllOn")
      });
    pwr_sliderbackground149.dd.setDynType1(524289);
    pwr_sliderbackground149.dd.setActionType1(0);
    pwr_slider150.dd.setDynType1(1);
    pwr_slider150.dd.setActionType1(2048);
    pwr_slider150.dd.setAccess(35454972);
    pwr_slider150.dd.setElements(new GeDynElemIfc[] {
      new GeDynSlider(pwr_slider150.dd, "Pi-SOFTEL-SetSlope.ActualValue##Float32",1,2.5,4,160.22,210.196,null,null,null,500,366.667)
      });
    pwr_indsquarelarge54.dd.setDynType1(64);
    pwr_indsquarelarge54.dd.setActionType1(8194);
    pwr_indsquarelarge54.dd.setAccess(35454972);
    pwr_indsquarelarge54.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigFlash(pwr_indsquarelarge54.dd, "Pi-SOFTEL-Boost.ActualValue##Boolean",0,114)
      ,new GeDynPopupMenu(pwr_indsquarelarge54.dd, "Pi-SOFTEL-Boost")
      ,new GeDynTipText(pwr_indsquarelarge54.dd, "Yellow flash = add som heat/power around zero degree ")
      });
    pwr_indsquarelarge56.dd.setDynType1(7);
    pwr_indsquarelarge56.dd.setActionType1(8194);
    pwr_indsquarelarge56.dd.setAccess(35454972);
    pwr_indsquarelarge56.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge56.dd, "Pi-SOFTEL-ReduZon1.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge56.dd, "Pi-SOFTEL-ReduZon1")
      ,new GeDynTipText(pwr_indsquarelarge56.dd, "Heating off due to temp in zon reach reduction limit ")
      });
    pwr_valuelargecenter57.dd.setDynType1(1024);
    pwr_valuelargecenter57.dd.setActionType1(2);
    pwr_valuelargecenter57.dd.setAccess(35454972);
    pwr_valuelargecenter57.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter57.dd, "Pi-SOFTEL-HMI-Curve1.YValue##Float32#100[0]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter57.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_valuelargecenter58.dd.setDynType1(1024);
    pwr_valuelargecenter58.dd.setActionType1(2);
    pwr_valuelargecenter58.dd.setAccess(35454972);
    pwr_valuelargecenter58.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter58.dd, "Pi-SOFTEL-HMI-Curve1.XValue##Float32#100[0]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter58.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_valuelargecenter62.dd.setDynType1(1024);
    pwr_valuelargecenter62.dd.setActionType1(2);
    pwr_valuelargecenter62.dd.setAccess(35454972);
    pwr_valuelargecenter62.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter62.dd, "Pi-SOFTEL-HMI-Curve1.YValue##Float32#100[1]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter62.dd, "Pi-SOFTEL-HMI-Curve")
      });
    pwr_valuelargecenter63.dd.setDynType1(1024);
    pwr_valuelargecenter63.dd.setActionType1(2);
    pwr_valuelargecenter63.dd.setAccess(35454972);
    pwr_valuelargecenter63.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter63.dd, "Pi-SOFTEL-HMI-Curve1.XValue##Float32#100[1]","%3.0f")
      ,new GeDynPopupMenu(pwr_valuelargecenter63.dd, "Pi-SOFTEL-HMI-Curve")
      });
    grp137_68.dd.setDynType1(8193);
    grp137_68.dd.setActionType1(8194);
    grp137_68.dd.setAccess(35454972);
    grp137_68.dd.setElements(new GeDynElemIfc[] {
      new GeDynMove(grp137_68.dd, "Pi-SOFTEL-HMI-Arrow1Pos.ActualValue##Float32","","","",0,0,0.9,0.9,1,1)
      ,new GeDynPopupMenu(grp137_68.dd, "Pi-SOFTEL-HMI-Arrow1Pos")
      ,new GeDynTipText(grp137_68.dd, "Outdoor temp")
      });
    pwr_indsquarelarge79.dd.setDynType1(7);
    pwr_indsquarelarge79.dd.setActionType1(2);
    pwr_indsquarelarge79.dd.setAccess(35454972);
    pwr_indsquarelarge79.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge79.dd, "Pi-SOFTEL-PANEL-SwitchOff.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge79.dd, "Pi-SOFTEL-PANEL-SwitchOff")
      });
    pwr_indsquarelarge81.dd.setDynType1(7);
    pwr_indsquarelarge81.dd.setActionType1(2);
    pwr_indsquarelarge81.dd.setAccess(35454972);
    pwr_indsquarelarge81.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge81.dd, "Pi-SOFTEL-PANEL-SwitchRemote.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge81.dd, "Pi-SOFTEL-PANEL-SwitchRemote")
      });
    pwr_indsquarelarge86.dd.setDynType1(7);
    pwr_indsquarelarge86.dd.setActionType1(2);
    pwr_indsquarelarge86.dd.setAccess(35454972);
    pwr_indsquarelarge86.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge86.dd, "Pi-SOFTEL-PANEL-OpForceOn.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge86.dd, "Pi-SOFTEL-PANEL-OpForceOn")
      });
    pwr_buttontogglecenter89.dd.setDynType1(1);
    pwr_buttontogglecenter89.dd.setActionType1(6);
    pwr_buttontogglecenter89.dd.setAccess(35454972);
    pwr_buttontogglecenter89.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_buttontogglecenter89.dd, "Pi-SOFTEL-PANEL-OpControlOn")
      ,new GeDynSetDig(pwr_buttontogglecenter89.dd, "Pi-SOFTEL-PANEL-OpControlOn.ActualValue##Boolean")
      });
    pwr_buttontogglecenter89.setAnnot1("ON");
    pwr_indsquarelarge90.dd.setDynType1(7);
    pwr_indsquarelarge90.dd.setActionType1(2);
    pwr_indsquarelarge90.dd.setAccess(35454972);
    pwr_indsquarelarge90.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge90.dd, "Pi-SOFTEL-PANEL-OpControlOn.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge90.dd, "Pi-SOFTEL-PANEL-OpControlOn")
      });
    pwr_buttontogglecenter92.dd.setDynType1(1);
    pwr_buttontogglecenter92.dd.setActionType1(10);
    pwr_buttontogglecenter92.dd.setAccess(35454972);
    pwr_buttontogglecenter92.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_buttontogglecenter92.dd, "Pi-SOFTEL-PANEL-OpControlOn")
      ,new GeDynResetDig(pwr_buttontogglecenter92.dd, "Pi-SOFTEL-PANEL-OpControlOn.ActualValue##Boolean")
      });
    pwr_buttontogglecenter92.setAnnot1("OFF");
    pwr_buttontogglecenter95.dd.setDynType1(129);
    pwr_buttontogglecenter95.dd.setActionType1(6);
    pwr_buttontogglecenter95.dd.setAccess(35454972);
    pwr_buttontogglecenter95.dd.setElements(new GeDynElemIfc[] {
      new GeDynInvisible(pwr_buttontogglecenter95.dd, "!Pi-SOFTEL-PANEL-SwitchRemote.ActualValue##Boolean",1)
      ,new GeDynPopupMenu(pwr_buttontogglecenter95.dd, "Pi-SOFTEL-PANEL-OpForceOn")
      ,new GeDynSetDig(pwr_buttontogglecenter95.dd, "Pi-SOFTEL-PANEL-OpForceOn.ActualValue##Boolean")
      });
    pwr_buttontogglecenter95.setAnnot1("ON");
    pwr_buttontogglecenter96.dd.setDynType1(129);
    pwr_buttontogglecenter96.dd.setActionType1(10);
    pwr_buttontogglecenter96.dd.setAccess(35454972);
    pwr_buttontogglecenter96.dd.setElements(new GeDynElemIfc[] {
      new GeDynInvisible(pwr_buttontogglecenter96.dd, "!Pi-SOFTEL-PANEL-SwitchRemote.ActualValue##Boolean",1)
      ,new GeDynPopupMenu(pwr_buttontogglecenter96.dd, "Pi-SOFTEL-PANEL-OpForceOn")
      ,new GeDynResetDig(pwr_buttontogglecenter96.dd, "Pi-SOFTEL-PANEL-OpForceOn.ActualValue##Boolean")
      });
    pwr_buttontogglecenter96.setAnnot1("OFF");
    grp197_97.dd.setDynType1(8193);
    grp197_97.dd.setActionType1(8194);
    grp197_97.dd.setAccess(35454972);
    grp197_97.dd.setElements(new GeDynElemIfc[] {
      new GeDynMove(grp197_97.dd, "","Pi-SOFTEL-HMI-Arrow2Pos.ActualValue##Float32","","",0,0,0,-1.1,1,1)
      ,new GeDynPopupMenu(grp197_97.dd, "Pi-SOFTEL-HMI-Arrow2Pos")
      ,new GeDynTipText(grp197_97.dd, "Loop time")
      });
    pwr_indsquarelarge98.dd.setDynType1(7);
    pwr_indsquarelarge98.dd.setActionType1(8194);
    pwr_indsquarelarge98.dd.setAccess(35454972);
    pwr_indsquarelarge98.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge98.dd, "Pi-SOFTEL-ReduZon2.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge98.dd, "Pi-SOFTEL-ReduZon2")
      ,new GeDynTipText(pwr_indsquarelarge98.dd, "Heating off due to temp in zon reach reduction limit ")
      });
    pwr_indsquarelarge99.dd.setDynType1(7);
    pwr_indsquarelarge99.dd.setActionType1(8194);
    pwr_indsquarelarge99.dd.setAccess(35454972);
    pwr_indsquarelarge99.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge99.dd, "Pi-SOFTEL-ReduZon3.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge99.dd, "Pi-SOFTEL-ReduZon3")
      ,new GeDynTipText(pwr_indsquarelarge99.dd, "Heating off due to temp in zon reach reduction limit ")
      });
    pwr_valuereliefdown100.dd.setDynType1(1025);
    pwr_valuereliefdown100.dd.setActionType1(8194);
    pwr_valuereliefdown100.dd.setAccess(35454972);
    pwr_valuereliefdown100.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown100.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT1.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown100.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT1")
      ,new GeDynTipText(pwr_valuereliefdown100.dd, "In door temp zon 1, sensor -BT1")
      });
    pwr_valuereliefdown101.dd.setDynType1(1025);
    pwr_valuereliefdown101.dd.setActionType1(8194);
    pwr_valuereliefdown101.dd.setAccess(35454972);
    pwr_valuereliefdown101.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown101.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT2.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown101.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT2")
      ,new GeDynTipText(pwr_valuereliefdown101.dd, "In door temp zon 2, sensor -BT2")
      });
    pwr_valuereliefdown102.dd.setDynType1(1025);
    pwr_valuereliefdown102.dd.setActionType1(8194);
    pwr_valuereliefdown102.dd.setAccess(35454972);
    pwr_valuereliefdown102.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown102.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT3.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown102.dd, "Pi-SOFTEL-ONEWIRE-InDoore_BT3")
      ,new GeDynTipText(pwr_valuereliefdown102.dd, "In door temp zon 3, sensor -BT3")
      });
    pwr_valuereliefdown103.dd.setDynType1(1025);
    pwr_valuereliefdown103.dd.setActionType1(8194);
    pwr_valuereliefdown103.dd.setAccess(35454972);
    pwr_valuereliefdown103.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuereliefdown103.dd, "Pi-SOFTEL-ONEWIRE-OutDoore_BT4.ActualValue##Float32","%4.1f °C")
      ,new GeDynPopupMenu(pwr_valuereliefdown103.dd, "Pi-SOFTEL-ONEWIRE-OutDoore_BT4")
      ,new GeDynTipText(pwr_valuereliefdown103.dd, "Out door temp, sensor -BT4")
      });
    pwr_valueinputlargecenter107.dd.setDynType1(1025);
    pwr_valueinputlargecenter107.dd.setActionType1(12290);
    pwr_valueinputlargecenter107.dd.setAccess(35454972);
    pwr_valueinputlargecenter107.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter107.dd, "Pi-SOFTEL-SetReduZon1.ActualValue##Float32","%4.1f °C")
      ,new GeDynValueInput(pwr_valueinputlargecenter107.dd, 0,100,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter107.dd, "Pi-SOFTEL-SetReduZon1")
      ,new GeDynTipText(pwr_valueinputlargecenter107.dd, "Reduction limit indoor temp zon 1 when stop heating activates")
      });
    pwr_valueinputlargecenter107.setAnnot1Font(pwr_valueinputlargecenter107.annotFont.deriveFont((float)11.1111));
    pwr_valueinputlargecenter109.dd.setDynType1(1025);
    pwr_valueinputlargecenter109.dd.setActionType1(12290);
    pwr_valueinputlargecenter109.dd.setAccess(35454972);
    pwr_valueinputlargecenter109.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter109.dd, "Pi-SOFTEL-SetReduZon2.ActualValue##Float32","%4.1f °C")
      ,new GeDynValueInput(pwr_valueinputlargecenter109.dd, 0,100,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter109.dd, "Pi-SOFTEL-SetReduZon2")
      ,new GeDynTipText(pwr_valueinputlargecenter109.dd, "Reduction limit indoor temp zon 2 when stop heating activates")
      });
    pwr_valueinputlargecenter109.setAnnot1Font(pwr_valueinputlargecenter109.annotFont.deriveFont((float)11.1111));
    pwr_valueinputlargecenter110.dd.setDynType1(1025);
    pwr_valueinputlargecenter110.dd.setActionType1(12290);
    pwr_valueinputlargecenter110.dd.setAccess(35454972);
    pwr_valueinputlargecenter110.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valueinputlargecenter110.dd, "Pi-SOFTEL-SetReduZon3.ActualValue##Float32","%4.1f °C")
      ,new GeDynValueInput(pwr_valueinputlargecenter110.dd, 0,100,null,null)
      ,new GeDynPopupMenu(pwr_valueinputlargecenter110.dd, "Pi-SOFTEL-SetReduZon3")
      ,new GeDynTipText(pwr_valueinputlargecenter110.dd, "Reduction limit indoor temp zon 3 when stop heating activates")
      });
    pwr_valueinputlargecenter110.setAnnot1Font(pwr_valueinputlargecenter110.annotFont.deriveFont((float)11.1111));
    pwr_buttoninfo112.dd.setDynType1(1);
    pwr_buttoninfo112.dd.setActionType1(16384);
    pwr_buttoninfo112.dd.setAccess(35454972);
    pwr_buttoninfo112.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoninfo112.dd, "help ")
      });
    pwr_valuelargecenter113.dd.setDynType1(1024);
    pwr_valuelargecenter113.dd.setActionType1(2);
    pwr_valuelargecenter113.dd.setAccess(35454972);
    pwr_valuelargecenter113.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter113.dd, "Nodes-Pi.SystemTime##Time","%4t")
      ,new GeDynPopupMenu(pwr_valuelargecenter113.dd, "Nodes-Pi")
      });
    pwr_valuelargecenter114.dd.setDynType1(1024);
    pwr_valuelargecenter114.dd.setActionType1(2);
    pwr_valuelargecenter114.dd.setAccess(35454972);
    pwr_valuelargecenter114.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter114.dd, "Nodes-Pi.SystemTime##Time","%1t")
      ,new GeDynPopupMenu(pwr_valuelargecenter114.dd, "Nodes-Pi")
      });
    pwr_buttoncommandcenter116.dd.setDynType1(1);
    pwr_buttoncommandcenter116.dd.setActionType1(32768);
    pwr_buttoncommandcenter116.dd.setAccess(35454972);
    pwr_buttoncommandcenter116.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter116.dd, "open graph /object=Nodes-Pi-Graph-Pi_overview")
      });
    pwr_buttoncommandcenter116.setAnnot1("Overview...");
    pwr_buttoncommandcenter117.dd.setDynType1(1);
    pwr_buttoncommandcenter117.dd.setActionType1(32768);
    pwr_buttoncommandcenter117.dd.setAccess(35454972);
    pwr_buttoncommandcenter117.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter117.dd, "open graph /object=Nodes-Pi-Graph-Pi_log")
      });
    pwr_buttoncommandcenter117.setAnnot1("Log & hist...");
    pwr_trafficlight118.dd.setDynType1(53);
    pwr_trafficlight118.dd.setActionType1(8258);
    pwr_trafficlight118.dd.setAccess(35454972);
    pwr_trafficlight118.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_trafficlight118.dd, "Pi-SOFTEL-START-RedLight.ActualValue##Boolean")
      ,new GeDynDigWarning(pwr_trafficlight118.dd, "Pi-SOFTEL-START-YellowLight.ActualValue##Boolean")
      ,new GeDynDigLowColor(pwr_trafficlight118.dd, "Pi-SOFTEL-START-GreenLight.ActualValue##Boolean",0)
      ,new GeDynPopupMenu(pwr_trafficlight118.dd, "Pi-SOFTEL-START-RedLight")
      ,new GeDynTipText(pwr_trafficlight118.dd, "Red, yellow traffic light = check alarmlist for more info.")
      ,new GeDynCommand(pwr_trafficlight118.dd, "show alarmlist")
      });
    pwr_buttontogglecenter123.dd.setDynType1(1);
    pwr_buttontogglecenter123.dd.setActionType1(6);
    pwr_buttontogglecenter123.dd.setAccess(35454972);
    pwr_buttontogglecenter123.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_buttontogglecenter123.dd, "Pi-SOFTEL-PANEL-OpTowelForceOn")
      ,new GeDynSetDig(pwr_buttontogglecenter123.dd, "Pi-SOFTEL-PANEL-OpTowelForceOn.ActualValue##Boolean")
      });
    pwr_buttontogglecenter123.setAnnot1("ON");
    pwr_buttontogglecenter124.dd.setDynType1(1);
    pwr_buttontogglecenter124.dd.setActionType1(10);
    pwr_buttontogglecenter124.dd.setAccess(35454972);
    pwr_buttontogglecenter124.dd.setElements(new GeDynElemIfc[] {
      new GeDynPopupMenu(pwr_buttontogglecenter124.dd, "Pi-SOFTEL-PANEL-OpTowelForceOn")
      ,new GeDynResetDig(pwr_buttontogglecenter124.dd, "Pi-SOFTEL-PANEL-OpTowelForceOn.ActualValue##Boolean")
      });
    pwr_buttontogglecenter124.setAnnot1("OFF");
    pwr_indsquarelarge125.dd.setDynType1(7);
    pwr_indsquarelarge125.dd.setActionType1(2);
    pwr_indsquarelarge125.dd.setAccess(35454972);
    pwr_indsquarelarge125.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_indsquarelarge125.dd, "Pi-SOFTEL-PANEL-OpTowelForceOn.ActualValue##Boolean",10)
      ,new GeDynPopupMenu(pwr_indsquarelarge125.dd, "Pi-SOFTEL-PANEL-OpTowelForceOn")
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
  public int original_height = 370;
  double rotate;
  public void setRotate( double rotate) {
    if ( rotate < 0)
      this.rotate = rotate % 360 + 360;
    else
      this.rotate = rotate % 360;
  }
  public double getRotate() { return rotate;}
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(21.1382F, 286.579F, 95.4741F, 73.665F),
    new Rectangle2D.Float(213.726F, 29.3017F, 231.252F, 87.539F),
    new Polygon( new int[] { 214, 445, 444, 215, 215, 214}, new int[] { 29, 29, 30, 30, 116, 117}, 6), 
    new Polygon( new int[] { 445, 445, 444, 444, 215, 214}, new int[] { 117, 29, 30, 116, 116, 117}, 6), 
    new Rectangle2D.Float(10.4046F, 55.1111F, 118.026F, 308.066F),
    new Polygon( new int[] { 10, 128, 127, 12, 12, 10}, new int[] { 55, 55, 56, 56, 362, 363}, 6), 
    new Polygon( new int[] { 128, 128, 127, 127, 12, 10}, new int[] { 363, 55, 56, 362, 362, 363}, 6), 
    new Rectangle2D.Float(21.1382F, 70.5222F, 95.4741F, 52.3262F),
    new Line2D.Float( 186.043F, 256.824F, 186.043F, 245.376F),
    new Line2D.Float( 158.944F, 256.824F, 158.944F, 245.376F),
    new Line2D.Float( 154.861F, 245.36F, 206.044F, 245.36F),
    new Rectangle2D.Float(285.427F, 256.87F, 16.69F, 7.33789F),
    new Line2D.Float( 294.016F, 244.645F, 294.016F, 133.407F),
    new Rectangle2D.Float(21.1382F, 140.144F, 95.4741F, 131.684F),
    new Line2D.Float( 169.713F, 174.051F, 158.602F, 174.051F),
    new Line2D.Float( 169.713F, 185.162F, 169.713F, 174.051F),
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
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[2]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[3]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[1]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[6]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    }
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-50",154, 261);
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "-40",181, 261);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[10]);
    {
    int fcolor = GeColor.getDrawtype(67, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[11]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[12]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[13]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Heat",298, 39);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "On",355, 39);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Starting point",324, 274);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Duty Cycle Loop",163, 274);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Heat req.",212, 322);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "On time",212, 339);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Loop time",212, 358);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "In door",233, 39);
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "+/- 0",286, 262);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "slope",386, 151);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "2.5",381, 164);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "1.0",381, 213);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "2.0",381, 185);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[S]",198, 130);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",377, 260);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Out door",137, 59);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Panels",10, 49);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Temp.",386, 141);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "All Zone ON",52, 84);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[S]",354, 113);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Calculation",163, 307);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 8));
    g.drawString( "X",378, 253);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 8));
    g.drawString( "Y",190, 127);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Boost",149, 95);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Curve/Slope",325, 309);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "X",384, 341);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Y",384, 324);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Stop",325, 358);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Start",359, 358);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Y",213, 289);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "X",377, 288);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(294, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[14]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(5, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[S]",150, 175);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",161, 192);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "max",408, 164);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "min",408, 213);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[%]",177, 130);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",304, 341);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[S]",308, 323);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "OFF (summer)",52, 99);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Remote",52, 113);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Remote/Terminal",17, 136);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Main switch (not in use)",17, 66);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Force",33, 224);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Heat all",79, 239);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Control",31, 165);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "On",79, 181);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Heat Zone",25, 153);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Start control & settings",59, 19);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "1",218, 53);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "2",218, 73);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "3",218, 95);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Reduction limit",370, 39);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Zone",216, 25);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Graph",443, 319);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Outdoor Temp (X) and On Time (Y)",228, 131);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Towel rail",17, 282);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Heating",25, 299);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Force",31, 312);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "On",79, 327);
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
    size = new Dimension( 50, 18);
    annot1Font = new Font("Helvetica", Font.BOLD, 10);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 50;
  public int original_height = 18;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 46.1111F, 14.4444F),
    new Polygon( new int[] { 2, 48, 47, 3, 3, 2}, new int[] { 2, 2, 3, 3, 15, 16}, 6), 
    new Polygon( new int[] { 48, 48, 47, 47, 3, 2}, new int[] { 16, 2, 3, 15, 15, 16}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,46.1111F,14.4444F, false,41, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 25 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 13F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 25 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 13F);
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
    size = new Dimension( 22, 22);
  }
  public int original_width = 22;
  public int original_height = 22;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 18.8889F, 18.8889F),
    new Polygon( new int[] { 2, 21, 19, 4, 4, 2}, new int[] { 2, 2, 4, 4, 19, 21}, 6), 
    new Polygon( new int[] { 21, 21, 19, 19, 4, 2}, new int[] { 21, 2, 4, 19, 19, 21}, 6), 
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,18.8889F,18.8889F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    size = new Dimension( 26, 26);
  }
  public int original_width = 26;
  public int original_height = 26;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 22.2222F, 22.2222F),
    new Polygon( new int[] { 2, 24, 23, 4, 4, 2}, new int[] { 2, 2, 4, 4, 23, 24}, 6), 
    new Polygon( new int[] { 24, 24, 23, 23, 4, 2}, new int[] { 24, 2, 4, 23, 23, 24}, 6), 
    new Arc2D.Float(4.82879F, 5.05064F, 16.5647F, 16.1209F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(4.82879F, 5.05064F, 16.5647F, 16.1209F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(4.82879F, 5.05064F, 16.5647F, 16.1209F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(4.82879F, 5.05064F, 16.5647F, 16.1209F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(6.11846F, 6.34031F, 13.9853F, 13.5416F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(4.82879F, 5.05064F, 16.5647F, 16.1209F, 0F, 360F, Arc2D.PIE),
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,22.2222F,22.2222F, true,28, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    GeGradient.paint( g, 9,2,-2,4.82879F,5.05064F,16.5647F,16.1209F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    GeGradient.paint( g, gradient,2,-2,4.82879F,5.05064F,16.5647F,16.1209F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[7]);
    }
    } else {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    } else {
    GeGradient.paint( g, gradient,2,-2,4.82879F,5.05064F,16.5647F,16.1209F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    size = new Dimension( 58, 21);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
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
    new Rectangle2D.Float(2F, 2F, 54.4444F, 17.7778F),
    new Polygon( new int[] { 2, 56, 54, 5, 5, 2}, new int[] { 2, 2, 5, 5, 17, 20}, 6), 
    new Polygon( new int[] { 56, 56, 54, 54, 5, 2}, new int[] { 20, 2, 5, 17, 17, 20}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,54.4444F,17.7778F, false,102, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 29 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 13F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 29 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 13F);
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
    size = new Dimension( 54, 48);
  }
  public int original_width = 54;
  public int original_height = 48;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 50F, 44.4444F),
    new Polygon( new int[] { 2, 52, 48, 6, 6, 2}, new int[] { 2, 2, 6, 6, 43, 46}, 6), 
    new Polygon( new int[] { 52, 52, 48, 48, 6, 2}, new int[] { 46, 2, 6, 43, 43, 46}, 6), 
    new Rectangle2D.Float(13.1111F, 10.8889F, 27.7778F, 26.6123F),
    new Polygon( new int[] { 21, 32, 32, 33, 34, 34, 21, 21, 22, 23, 23, 22, 21, 21}, new int[] {22, 22, 33, 34, 34, 35, 35, 34, 34, 33, 24, 23, 23, 23}, 14),
    new Arc2D.Float(23.1111F, 12F, 8.88889F, 8.88889F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(2F, 40.8889F, 5.55556F, 0F),
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,50F,44.4444F, false,222, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
protected class pwr_valueinputlargecenter extends GeTextField {
  public pwr_valueinputlargecenter( JopSession session)
  {
    super( session);
    setFont( annotFont);
    setFillColor( 41);
  }
  int original_width = 50;
  int original_height = 18;
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
    size = new Dimension( 58, 21);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
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
    new Rectangle2D.Float(2F, 2F, 54.4444F, 17.7778F),
    new Polygon( new int[] { 2, 56, 54, 5, 5, 2}, new int[] { 2, 2, 5, 5, 17, 20}, 6), 
    new Polygon( new int[] { 56, 56, 54, 54, 5, 2}, new int[] { 20, 2, 5, 17, 17, 20}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,54.4444F,17.7778F, false,102, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 29 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 13F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 29 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 13F);
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
    size = new Dimension( 26, 126);
  }
  public int original_width = 26;
  public int original_height = 126;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 24, 13, 2}, new int[] {2, 2, 13, 2}, 4),
    new Polygon( new int[] { 24, 13, 13, 24, 24}, new int[] {2, 13, 113, 124, 2}, 5),
    new Polygon( new int[] { 2, 2, 13, 13, 2}, new int[] {2, 124, 113, 13, 2}, 5),
    new Polygon( new int[] { 2, 13, 24, 2}, new int[] {124, 113, 124, 124}, 4),
    new Rectangle2D.Float(10.8889F, 10.8889F, 4.44444F, 104.444F),
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
    size = new Dimension( 20, 19);
  }
  public int original_width = 20;
  public int original_height = 19;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 14, 19, 19, 8, 2, 14, 14}, new int[] {2, 14, 18, 18, 13, 13, 2}, 7),
    new Rectangle2D.Float(2F, 2F, 12.2222F, 11.1111F),
    new Rectangle2D.Float(2F, 2F, 12.2222F, 3.33333F),
    new Rectangle2D.Float(2F, 9.77778F, 12.2222F, 3.33333F),
    new Line2D.Float( 14.2222F, 7.19344F, 2F, 7.19344F),
    new Line2D.Float( 14.2222F, 7.77278F, 2F, 7.77278F),
    new Rectangle2D.Float(2F, 2F, 12.2222F, 11.1111F),
    new Polygon( new int[] { 2, 14, 14, 3, 3, 2}, new int[] { 2, 2, 3, 3, 13, 13}, 6), 
    new Polygon( new int[] { 14, 14, 14, 14, 3, 2}, new int[] { 13, 2, 3, 13, 13, 13}, 6), 
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
    size = new Dimension( 15, 15);
  }
  public int original_width = 15;
  public int original_height = 15;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 8, 2, 13, 8}, new int[] {2, 13, 13, 2}, 4),
    new Polygon( new int[] { 8, 7, 4, 2}, new int[] { 2, 4, 12,13}, 4),
    new Polygon( new int[] { 2, 4, 11, 13}, new int[] { 13, 12, 12,13}, 4),
    new Polygon( new int[] { 13, 11, 7, 8}, new int[] { 13, 12, 4,2}, 4),
    new Polygon( new int[] { 8, 7, -182, -182}, new int[] { 2, 4, 20,-140}, 4),
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,11.1111F,11.1111F, false,34, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
protected class pwr_valuereliefdown extends GeComponent {
  // Dimension size;
  public pwr_valuereliefdown( JopSession session)
  {
    super( session);
    size = new Dimension( 29, 11);
  }
  public int original_width = 29;
  public int original_height = 11;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 25.5556F, 7.77778F),
    new Polygon( new int[] { 2, 28, 27, 2, 2, 2}, new int[] { 2, 2, 2, 2, 9, 10}, 6), 
    new Polygon( new int[] { 28, 28, 27, 27, 2, 2}, new int[] { 10, 2, 2, 9, 9, 10}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,25.5556F,7.77778F, false,41, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
protected class Grp137_ extends GeComponent {
  // Dimension size;
  pwr_arrow	pwr_arrow0;
  public Grp137_( JopSession session)
  {
    super( session);
    size = new Dimension( 15, 15);
    pwr_arrow0 = new pwr_arrow(session);
    pwr_arrow0.setBounds(new Rectangle(1,1,13,13));
    pwr_arrow0.setFillColor(175);
    add(pwr_arrow0);
    pwr_arrow0.dd.setDynType1(1);
    pwr_arrow0.dd.setActionType1(0);
  }
  public int original_width = 15;
  public int original_height = 15;
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
protected class Grp197_ extends GeComponent {
  // Dimension size;
  pwr_arrow	pwr_arrow0;
  public Grp197_( JopSession session)
  {
    super( session);
    size = new Dimension( 15, 15);
    pwr_arrow0 = new pwr_arrow(session);
    pwr_arrow0.setBounds(new Rectangle(1,1,13,13));
    pwr_arrow0.setFillColor(175);
    add(pwr_arrow0);
    pwr_arrow0.dd.setDynType1(1);
    pwr_arrow0.dd.setActionType1(0);
  }
  public int original_width = 15;
  public int original_height = 15;
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
