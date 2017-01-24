import jpwr.rt.*;
import jpwr.jop.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Pi_log_A extends JopApplet {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  JopAxisarc	jopAxisarc1;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter6;
  pwr_trafficlight	pwr_trafficlight8;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter26;
  pwr_buttoninfo	pwr_buttoninfo28;
  pwr_valuelargecenter	pwr_valuelargecenter30;
  pwr_valuelargecenter	pwr_valuelargecenter32;
  pwr_valuelargecenter	pwr_valuelargecenter33;
  pwr_valuelargecenter	pwr_valuelargecenter34;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter35;
  GeTable	geTable36;
  JopAxis	jopAxis37;
  JopAxis	jopAxis40;
  GeTable	geTable42;
  JopBarChart	jopBarChart51;
  JopXYCurve	jopXYCurve52;
  Grp606_	grp606_54;
  JopAxis	jopAxis57;
  JopAxis	jopAxis75;
  JopAxis	jopAxis76;
  JopAxis	jopAxis91;
  pwr_valuelargecenter	pwr_valuelargecenter101;
  pwr_valuelargecenter	pwr_valuelargecenter102;
  public Pi_log_A() {}
  public void init() {
    super.init();
    geInit();
  }
  public void geInit() {
    JopSpider.setSystemName( "pi");
    engine.setAnimationScanTime( 500);
    engine.setScanTime( 100);
    size = new Dimension( 512, 384);
    Dimension dsize = new Dimension(localPanel.original_width,localPanel.original_height);
    this.addComponentListener(new AspectRatioListener(this,size));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
      contentPane.add(localPanel, BorderLayout.CENTER);
    contentPane.setOpaque(true);
    localPanel.setLayout( new RatioLayout()); // scaletest
    localPanel.setOpaque(true);
    localPanel.setBackground(GeColor.getColor(213, GeColor.NO_COLOR));
    jopAxisarc1 = new JopAxisarc();
    jopAxisarc1.setBounds(new Rectangle(10,144,43,43));
    jopAxisarc1.setBorderColor(0);
    jopAxisarc1.setTextColor(0);
    jopAxisarc1.setAngle1(0F);
    jopAxisarc1.setAngle2(180F);
    jopAxisarc1.setLineWidth(1);
    jopAxisarc1.setMinValue(100F);
    jopAxisarc1.setMaxValue(0F);
    jopAxisarc1.setLines(11);
    jopAxisarc1.setLongQuotient(2);
    jopAxisarc1.setValueQuotient(2);
    jopAxisarc1.setLineLength(0.15F);
    jopAxisarc1.setLineWidth(1);
    jopAxisarc1.setRotate(0);
    jopAxisarc1.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxisarc1.setFormat("%3.0f");
    localPanel.add(jopAxisarc1, new Proportion(jopAxisarc1.getBounds(), dsize));
    pwr_buttoncommandcenter6 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter6.setBounds(new Rectangle(442,308,44,15));
    pwr_buttoncommandcenter6.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter6, new Proportion(pwr_buttoncommandcenter6.getBounds(), dsize));
    pwr_trafficlight8 = new pwr_trafficlight(session);
    pwr_trafficlight8.setBounds(new Rectangle(3,2,19,19));
    pwr_trafficlight8.setShadow(1);
    localPanel.add(pwr_trafficlight8, new Proportion(pwr_trafficlight8.getBounds(), dsize));
    pwr_buttoncommandcenter26 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter26.setBounds(new Rectangle(442,274,44,15));
    pwr_buttoncommandcenter26.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter26, new Proportion(pwr_buttoncommandcenter26.getBounds(), dsize));
    pwr_buttoninfo28 = new pwr_buttoninfo(session);
    pwr_buttoninfo28.setBounds(new Rectangle(22,3,19,18));
    localPanel.add(pwr_buttoninfo28, new Proportion(pwr_buttoninfo28.getBounds(), dsize));
    pwr_valuelargecenter30 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter30.setBounds(new Rectangle(9,186,51,13));
    pwr_valuelargecenter30.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter30, new Proportion(pwr_valuelargecenter30.getBounds(), dsize));
    pwr_valuelargecenter32 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter32.setBounds(new Rectangle(9,209,51,13));
    pwr_valuelargecenter32.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter32, new Proportion(pwr_valuelargecenter32.getBounds(), dsize));
    pwr_valuelargecenter33 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter33.setBounds(new Rectangle(447,2,51,13));
    pwr_valuelargecenter33.setFillColor(32);
    pwr_valuelargecenter33.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter33, new Proportion(pwr_valuelargecenter33.getBounds(), dsize));
    pwr_valuelargecenter34 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter34.setBounds(new Rectangle(393,2,51,13));
    pwr_valuelargecenter34.setFillColor(32);
    pwr_valuelargecenter34.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter34, new Proportion(pwr_valuelargecenter34.getBounds(), dsize));
    pwr_buttoncommandcenter35 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter35.setBounds(new Rectangle(442,291,44,15));
    pwr_buttoncommandcenter35.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter35, new Proportion(pwr_buttoncommandcenter35.getBounds(), dsize));
    geTable36 = new GeTable(session, 24,5,1,0);
    geTable36.setHeaderRowHeight(6);
    geTable36.setRowHeight(8);
    geTable36.setHeaderText(0,"Out [°C]");
    geTable36.setColumnWidth(0,34);
    geTable36.setHeaderText(1,"Zon1 [°C]");
    geTable36.setColumnWidth(1,34);
    geTable36.setHeaderText(2,"Zon2 [°C]");
    geTable36.setColumnWidth(2,34);
    geTable36.setHeaderText(3,"Zon3 [°C]");
    geTable36.setColumnWidth(3,34);
    geTable36.setHeaderText(4,"Energy [kWh]");
    geTable36.setColumnWidth(4,34);
    geTable36.setFillColor(32);
    geTable36.setFont(new Font("Helvetica", Font.PLAIN, 12));
    geTable36.setBounds(new Rectangle(314,34,172,214));
    localPanel.add(geTable36, new Proportion(geTable36.getBounds(), dsize));
    jopAxis37 = new JopAxis();
    jopAxis37.setBounds(new Rectangle(305,43,8,201));
    jopAxis37.setBorderColor(0);
    jopAxis37.setTextColor(0);
    jopAxis37.setLineWidth(1);
    jopAxis37.setMinValue(0F);
    jopAxis37.setMaxValue(23F);
    jopAxis37.setLines(24);
    jopAxis37.setLongQuotient(1);
    jopAxis37.setValueQuotient(1);
    jopAxis37.setLineLength(3);
    jopAxis37.setLineWidth(1);
    jopAxis37.setRotate(180);
    jopAxis37.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis37.setFormat("%3.0f");
    localPanel.add(jopAxis37, new Proportion(jopAxis37.getBounds(), dsize));
    jopAxis40 = new JopAxis();
    jopAxis40.setBounds(new Rectangle(488,43,8,201));
    jopAxis40.setBorderColor(0);
    jopAxis40.setTextColor(0);
    jopAxis40.setLineWidth(1);
    jopAxis40.setMinValue(0F);
    jopAxis40.setMaxValue(23F);
    jopAxis40.setLines(24);
    jopAxis40.setLongQuotient(1);
    jopAxis40.setValueQuotient(1);
    jopAxis40.setLineLength(3);
    jopAxis40.setLineWidth(1);
    jopAxis40.setRotate(180);
    jopAxis40.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis40.setFormat("%3.0f");
    localPanel.add(jopAxis40, new Proportion(jopAxis40.getBounds(), dsize));
    geTable42 = new GeTable(session, 7,5,1,0);
    geTable42.setHeaderRowHeight(6);
    geTable42.setRowHeight(8);
    geTable42.setHeaderText(0,"Outside [°C]");
    geTable42.setColumnWidth(0,34);
    geTable42.setHeaderText(1,"Zon1 [°C]");
    geTable42.setColumnWidth(1,34);
    geTable42.setHeaderText(2,"Zon2 [°C]");
    geTable42.setColumnWidth(2,34);
    geTable42.setHeaderText(3,"Zon3 [°C]");
    geTable42.setColumnWidth(3,34);
    geTable42.setHeaderText(4,"Energy [kWh]");
    geTable42.setColumnWidth(4,34);
    geTable42.setFillColor(32);
    geTable42.setFont(new Font("Helvetica", Font.PLAIN, 12));
    geTable42.setBounds(new Rectangle(120,34,172,67));
    localPanel.add(geTable42, new Proportion(geTable42.getBounds(), dsize));
    jopBarChart51 = new JopBarChart(session);
    jopBarChart51.setBounds(new Rectangle(120,251,172,77));
    jopBarChart51.setFillColor(39);
    jopBarChart51.setBorderColor(0);
    jopBarChart51.setDrawFill(1);
    jopBarChart51.setDrawBorder(1);
    jopBarChart51.setBars(7);
    jopBarChart51.setBarSegments(1);
    jopBarChart51.setBarColors(new int[] {174,144,174,204,234,264,294,104,134,164,194,224});
    jopBarChart51.setLineWidth(1);
    jopBarChart51.setMinValue(0F);
    jopBarChart51.setMaxValue(150F);
    jopBarChart51.setRotate(0);
    jopBarChart51.setShadow(0);
    jopBarChart51.setShadowWidth(3.87944);
    jopBarChart51.setGradient(1);
    jopBarChart51.setGc1(2);
    jopBarChart51.setGc2(-2);
    jopBarChart51.setVerticalLines(6);
    jopBarChart51.setHorizontalLines(11);
    jopBarChart51.setLineColor(36);
    localPanel.add(jopBarChart51, new Proportion(jopBarChart51.getBounds(), dsize));
    jopXYCurve52 = new JopXYCurve( session);
    jopXYCurve52.setBounds(new Rectangle(122,107,171,107));
    jopXYCurve52.setFillColor(39);
    jopXYCurve52.setBorderColor(36);
    jopXYCurve52.setDrawFill(1);
    jopXYCurve52.setDrawBorder(1);
    jopXYCurve52.setTrendBorderWidth(1);
    jopXYCurve52.setLineWidth(1);
    jopXYCurve52.setNoOfPoints(100);
    jopXYCurve52.setHorizontalLines(5);
    jopXYCurve52.setVerticalLines(0);
    jopXYCurve52.setRotate(0);
    localPanel.add(jopXYCurve52, new Proportion(jopXYCurve52.getBounds(), dsize));
    grp606_54 = new Grp606_(session);
    grp606_54.setBounds(new Rectangle(18,162,18,6));
    grp606_54.setBorderColor(38);
    grp606_54.setRotate(-90);
    grp606_54.setGradient(12);
    localPanel.add(grp606_54, new Proportion(grp606_54.getBounds(), dsize));
    jopAxis57 = new JopAxis();
    jopAxis57.setBounds(new Rectangle(110,251,8,77));
    jopAxis57.setBorderColor(0);
    jopAxis57.setTextColor(0);
    jopAxis57.setLineWidth(1);
    jopAxis57.setMinValue(150F);
    jopAxis57.setMaxValue(0F);
    jopAxis57.setLines(7);
    jopAxis57.setLongQuotient(1);
    jopAxis57.setValueQuotient(1);
    jopAxis57.setLineLength(3);
    jopAxis57.setLineWidth(1);
    jopAxis57.setRotate(180);
    jopAxis57.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis57.setFormat("%3.0f");
    localPanel.add(jopAxis57, new Proportion(jopAxis57.getBounds(), dsize));
    jopAxis75 = new JopAxis();
    jopAxis75.setBounds(new Rectangle(109,107,8,106));
    jopAxis75.setBorderColor(0);
    jopAxis75.setTextColor(0);
    jopAxis75.setLineWidth(1);
    jopAxis75.setMinValue(150F);
    jopAxis75.setMaxValue(0F);
    jopAxis75.setLines(7);
    jopAxis75.setLongQuotient(1);
    jopAxis75.setValueQuotient(1);
    jopAxis75.setLineLength(3);
    jopAxis75.setLineWidth(1);
    jopAxis75.setRotate(180);
    jopAxis75.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis75.setFormat("%3.0f");
    localPanel.add(jopAxis75, new Proportion(jopAxis75.getBounds(), dsize));
    jopAxis76 = new JopAxis();
    jopAxis76.setBounds(new Rectangle(122,107,8,106));
    jopAxis76.setBorderColor(0);
    jopAxis76.setTextColor(0);
    jopAxis76.setLineWidth(1);
    jopAxis76.setMinValue(30F);
    jopAxis76.setMaxValue(-30F);
    jopAxis76.setLines(7);
    jopAxis76.setLongQuotient(1);
    jopAxis76.setValueQuotient(1);
    jopAxis76.setLineLength(3);
    jopAxis76.setLineWidth(1);
    jopAxis76.setRotate(180);
    jopAxis76.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis76.setFormat("%3.0f");
    localPanel.add(jopAxis76, new Proportion(jopAxis76.getBounds(), dsize));
    jopAxis91 = new JopAxis();
    jopAxis91.setBounds(new Rectangle(282,108,8,106));
    jopAxis91.setBorderColor(0);
    jopAxis91.setTextColor(0);
    jopAxis91.setLineWidth(1);
    jopAxis91.setMinValue(30F);
    jopAxis91.setMaxValue(0F);
    jopAxis91.setLines(7);
    jopAxis91.setLongQuotient(1);
    jopAxis91.setValueQuotient(1);
    jopAxis91.setLineLength(3);
    jopAxis91.setLineWidth(1);
    jopAxis91.setRotate(180);
    jopAxis91.setFont(new Font("Helvetica", Font.PLAIN, 6));
    jopAxis91.setFormat("%3.0f");
    localPanel.add(jopAxis91, new Proportion(jopAxis91.getBounds(), dsize));
    pwr_valuelargecenter101 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter101.setBounds(new Rectangle(58,157,23,9));
    pwr_valuelargecenter101.setFillColor(33);
    pwr_valuelargecenter101.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter101, new Proportion(pwr_valuelargecenter101.getBounds(), dsize));
    pwr_valuelargecenter102 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter102.setBounds(new Rectangle(58,148,23,9));
    pwr_valuelargecenter102.setFillColor(33);
    pwr_valuelargecenter102.setBorderColor(0);
    localPanel.add(pwr_valuelargecenter102, new Proportion(pwr_valuelargecenter102.getBounds(), dsize));
    pwr_buttoncommandcenter6.dd.setDynType1(1);
    pwr_buttoncommandcenter6.dd.setActionType1(32768);
    pwr_buttoncommandcenter6.dd.setAccess(35454972);
    pwr_buttoncommandcenter6.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter6.dd, "open graph /object=Nodes-Pi-Graph-Pi_overview")
      });
    pwr_buttoncommandcenter6.setAnnot1("Overview...");
    pwr_trafficlight8.dd.setDynType1(53);
    pwr_trafficlight8.dd.setActionType1(8258);
    pwr_trafficlight8.dd.setAccess(35454972);
    pwr_trafficlight8.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_trafficlight8.dd, "Pi-SOFTEL-START-RedLight.ActualValue##Boolean")
      ,new GeDynDigWarning(pwr_trafficlight8.dd, "Pi-SOFTEL-START-YellowLight.ActualValue##Boolean")
      ,new GeDynDigLowColor(pwr_trafficlight8.dd, "Pi-SOFTEL-START-GreenLight.ActualValue##Boolean",0)
      ,new GeDynPopupMenu(pwr_trafficlight8.dd, "Pi-SOFTEL-START-RedLight")
      ,new GeDynTipText(pwr_trafficlight8.dd, "Red, yellow traffic light = check alarmlist for more info.")
      ,new GeDynCommand(pwr_trafficlight8.dd, "show alarmlist")
      });
    pwr_buttoncommandcenter26.dd.setDynType1(1);
    pwr_buttoncommandcenter26.dd.setActionType1(64);
    pwr_buttoncommandcenter26.dd.setAccess(35454972);
    pwr_buttoncommandcenter26.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter26.dd, "open trend/name=Pi-SOFTEL-LOG-Trend1")
      });
    pwr_buttoncommandcenter26.setAnnot1("Trend...");
    pwr_buttoninfo28.dd.setDynType1(1);
    pwr_buttoninfo28.dd.setActionType1(16384);
    pwr_buttoninfo28.dd.setAccess(35454972);
    pwr_buttoninfo28.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoninfo28.dd, "help ")
      });
    pwr_valuelargecenter30.dd.setDynType1(1025);
    pwr_valuelargecenter30.dd.setActionType1(8194);
    pwr_valuelargecenter30.dd.setAccess(35454972);
    pwr_valuelargecenter30.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter30.dd, "Pi-SOFTEL-LOG-SumEnergiDay.ActualValue##Float32","%3.0f kWh")
      ,new GeDynPopupMenu(pwr_valuelargecenter30.dd, "Pi-SOFTEL-LOG-SumEnergiDay")
      ,new GeDynTipText(pwr_valuelargecenter30.dd, "Consumption energy in kWh this day")
      });
    pwr_valuelargecenter32.dd.setDynType1(1025);
    pwr_valuelargecenter32.dd.setActionType1(8194);
    pwr_valuelargecenter32.dd.setAccess(35454972);
    pwr_valuelargecenter32.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter32.dd, "Pi-SOFTEL-LOG-SumEnergikWh.ActualValue##Float32","%3.0f kWh")
      ,new GeDynPopupMenu(pwr_valuelargecenter32.dd, "Pi-SOFTEL-LOG-SumEnergikWh")
      ,new GeDynTipText(pwr_valuelargecenter32.dd, "Total consumption energy in kWh since starting up")
      });
    pwr_valuelargecenter33.dd.setDynType1(1024);
    pwr_valuelargecenter33.dd.setActionType1(2);
    pwr_valuelargecenter33.dd.setAccess(35454972);
    pwr_valuelargecenter33.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter33.dd, "Nodes-Pi.SystemTime##Time","%1t")
      ,new GeDynPopupMenu(pwr_valuelargecenter33.dd, "Nodes-Pi")
      });
    pwr_valuelargecenter34.dd.setDynType1(1024);
    pwr_valuelargecenter34.dd.setActionType1(2);
    pwr_valuelargecenter34.dd.setAccess(35454972);
    pwr_valuelargecenter34.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter34.dd, "Nodes-Pi.SystemTime##Time","%4t")
      ,new GeDynPopupMenu(pwr_valuelargecenter34.dd, "Nodes-Pi")
      });
    pwr_buttoncommandcenter35.dd.setDynType1(1);
    pwr_buttoncommandcenter35.dd.setActionType1(32768);
    pwr_buttoncommandcenter35.dd.setAccess(35454972);
    pwr_buttoncommandcenter35.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter35.dd, "open graph /object=Nodes-Pi-Graph-Pi_settings")
      });
    pwr_buttoncommandcenter35.setAnnot1("Start & Set...");
    geTable36.dd.setDynType1(16777216);
    geTable36.dd.setActionType1(0);
    geTable36.dd.setElements(new GeDynElemIfc[] {
      new GeDynTable(geTable36.dd, new String[] {"Pi-SOFTEL-LOG-DayLog.TempOutside##Float32#24","Pi-SOFTEL-LOG-DayLog.TempInZon1##Float32#24","Pi-SOFTEL-LOG-DayLog.TempInZon2##Float32#24","Pi-SOFTEL-LOG-DayLog.TempInZon3##Float32#24","Pi-SOFTEL-LOG-DayLog.Energy_kWh##Float32#24"}, new String[] {"%4.1f","%4.1f","%4.1f","%4.1f","%4.1f"}, new String[] {"","","","",""},24,5)
      });
    geTable42.dd.setDynType1(16777216);
    geTable42.dd.setActionType1(0);
    geTable42.dd.setElements(new GeDynElemIfc[] {
      new GeDynTable(geTable42.dd, new String[] {"Pi-SOFTEL-LOG-WeekLog.AveTempOutside##Float32#7","Pi-SOFTEL-LOG-WeekLog.AveTempInZon1##Float32#7","Pi-SOFTEL-LOG-WeekLog.AveTempInZon2##Float32#7","Pi-SOFTEL-LOG-WeekLog.AveTempInZon3##Float32#7","Pi-SOFTEL-LOG-WeekLog.Energy_kWh##Float32#7"}, new String[] {"%4.1f","%4.1f","%4.1f","%4.1f","%4.1f"}, new String[] {"","","","",""},7,5)
      });
    jopBarChart51.setPwrAttribute(new String[]{"Pi-SOFTEL-LOG-WeekLog.Energy_kWh##Float32#7",null,null,null,null,null,null,null,null,null,null,null});
    jopXYCurve52.dd.setDynType1(268435456);
    jopXYCurve52.dd.setActionType1(0);
    jopXYCurve52.dd.setElements(new GeDynElemIfc[] {
      new GeDynXYCurve(jopXYCurve52.dd, "Pi-SOFTEL-LOG-WeekLog.Day##Int32#7","Pi-SOFTEL-LOG-WeekLog.Energy_kWh##Float32#7","","","","","Pi-SOFTEL-LOG-NbLogWeek.ActualValue##Int32","Pi-SOFTEL-START-Puls1Hz.ActualValue##Boolean",0,150,0,8,100,0,174,168,0)
      ,new GeDynXYCurve(jopXYCurve52.dd, "Pi-SOFTEL-LOG-WeekLog.Day##Int32#7","Pi-SOFTEL-LOG-WeekLog.AveTempInZon3##Float32#7","","","","","Pi-SOFTEL-LOG-NbLogWeek.ActualValue##Int32","Pi-SOFTEL-START-Puls1Hz.ActualValue##Boolean",0,30,0,8,100,0,114,108,0)
      ,new GeDynXYCurve(jopXYCurve52.dd, "Pi-SOFTEL-LOG-WeekLog.Day##Int32#7","Pi-SOFTEL-LOG-WeekLog.AveTempInZon2##Float32#7","","","","","Pi-SOFTEL-LOG-NbLogWeek.ActualValue##Int32","Pi-SOFTEL-START-Puls1Hz.ActualValue##Boolean",0,30,0,8,100,0,234,228,0)
      ,new GeDynXYCurve(jopXYCurve52.dd, "Pi-SOFTEL-LOG-WeekLog.Day##Int32#7","Pi-SOFTEL-LOG-WeekLog.AveTempInZon1##Float32#7","","","","","Pi-SOFTEL-LOG-NbLogWeek.ActualValue##Int32","Pi-SOFTEL-START-Puls1Hz.ActualValue##Boolean",0,30,0,8,100,0,294,288,0)
      ,new GeDynXYCurve(jopXYCurve52.dd, "Pi-SOFTEL-LOG-WeekLog.Day##Int32#7","Pi-SOFTEL-LOG-WeekLog.AveTempOutside##Float32#7","","","","","Pi-SOFTEL-LOG-NbLogWeek.ActualValue##Int32","Pi-SOFTEL-START-Puls1Hz.ActualValue##Boolean",-30,30,0,8,100,0,144,138,0)
      });
    grp606_54.dd.setDynType1(4097);
    grp606_54.dd.setActionType1(0);
    grp606_54.dd.setElements(new GeDynElemIfc[] {
      new GeDynRotate(grp606_54.dd, "Pi-SOFTEL-HMI-PowerOutPerc.ActualValue##Float32",32.5172,165.879,1.8)
      });
    pwr_valuelargecenter101.dd.setDynType1(1025);
    pwr_valuelargecenter101.dd.setActionType1(8194);
    pwr_valuelargecenter101.dd.setAccess(35454972);
    pwr_valuelargecenter101.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter101.dd, "Pi-SOFTEL-LOG-CalcPowerOutW.ActualValue##Float32","%3.0f W")
      ,new GeDynPopupMenu(pwr_valuelargecenter101.dd, "Pi-SOFTEL-LOG-CalcPowerOutW")
      ,new GeDynTipText(pwr_valuelargecenter101.dd, " Heat output power in watt")
      });
    pwr_valuelargecenter102.dd.setDynType1(1025);
    pwr_valuelargecenter102.dd.setActionType1(8194);
    pwr_valuelargecenter102.dd.setAccess(35454972);
    pwr_valuelargecenter102.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter102.dd, "Pi-SOFTEL-LOG-CalcPowerOutPerc.ActualValue##Float32","%3.0f %%")
      ,new GeDynPopupMenu(pwr_valuelargecenter102.dd, "Pi-SOFTEL-LOG-CalcPowerOutPerc")
      ,new GeDynTipText(pwr_valuelargecenter102.dd, "0-100% heat output power")
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
  public int original_height = 340;
  double rotate;
  public void setRotate( double rotate) {
    if ( rotate < 0)
      this.rotate = rotate % 360 + 360;
    else
      this.rotate = rotate % 360;
  }
  public double getRotate() { return rotate;}
  Shape[] shapes = new Shape[] { 
    new RoundRectangle2D.Float(8.46582F, 142.022F, 47.4418F, 30.1803F, 9.0541F, 9.0541F),
    new Rectangle2D.Float(12.9929F, 142.022F, 38.3877F, 1.50902F),
    new Rectangle2D.Float(8.46582F, 146.549F, 1.50902F, 21.1262F),
    new Arc2D.Float(8.46582F, 142.022F, 9.0541F, 9.0541F, 90F, 90F, Arc2D.PIE),
    new Arc2D.Float(46.8535F, 142.022F, 9.0541F, 9.0541F, 45F, 45F, Arc2D.PIE),
    new Arc2D.Float(8.46582F, 163.149F, 9.0541F, 9.0541F, 180F, 45F, Arc2D.PIE),
    new Rectangle2D.Float(12.9929F, 170.694F, 38.3877F, 1.50902F),
    new Rectangle2D.Float(54.3986F, 146.549F, 1.50902F, 21.1262F),
    new Arc2D.Float(46.8535F, 163.149F, 9.0541F, 9.0541F, 270F, 90F, Arc2D.PIE),
    new Arc2D.Float(46.8535F, 142.022F, 9.0541F, 9.0541F, 0F, 45F, Arc2D.PIE),
    new Arc2D.Float(8.46582F, 163.149F, 9.0541F, 9.0541F, 225F, 45F, Arc2D.PIE),
    new RoundRectangle2D.Float(9.97484F, 143.531F, 44.4237F, 27.1623F, 6.03607F, 6.03607F),
    new Rectangle2D.Float(10.1757F, 33.8818F, 62.5771F, 28.4177F),
    new Polygon( new int[] { 10, 73, 72, 10, 10, 10}, new int[] { 34, 34, 34, 34, 62, 62}, 6), 
    new Polygon( new int[] { 73, 73, 72, 72, 10, 10}, new int[] { 62, 34, 34, 62, 62, 62}, 6), 
    new Polygon( new int[] { 26, 26, 28, 28, 26}, new int[] {108, 107, 107, 108, 108}, 5),
    new Polygon( new int[] { 11, 32, 54, 11}, new int[] {114, 106, 114, 114}, 4),
    new Rectangle2D.Float(10.9179F, 114.468F, 43.1814F, 12.8733F),
    new Polygon( new int[] { 11, 54, 53, 12, 12, 11}, new int[] { 114, 114, 115, 115, 127, 127}, 6), 
    new Polygon( new int[] { 54, 54, 53, 53, 12, 11}, new int[] { 127, 114, 115, 127, 127, 127}, 6), 
    new Line2D.Float( 851.138F, 439.5F, 840.362F, 439.5F),
    new Rectangle2D.Float(29.0214F, 109.295F, 2.83852F, 2.80552F),
    new Polygon( new int[] { 29, 32, 32, 29, 29, 29}, new int[] { 109, 109, 109, 109, 112, 112}, 6), 
    new Polygon( new int[] { 32, 32, 32, 32, 29, 29}, new int[] { 112, 109, 109, 112, 112, 112}, 6), 
    new Rectangle2D.Float(26.4351F, 119.253F, 2.58621F, 7.68648F),
    new Polygon( new int[] { 26, 29, 29, 27, 27, 26}, new int[] { 119, 119, 119, 119, 127, 127}, 6), 
    new Polygon( new int[] { 29, 29, 29, 29, 27, 26}, new int[] { 127, 119, 119, 127, 127, 127}, 6), 
    new Rectangle2D.Float(29.0213F, 119.253F, 2.58621F, 7.68648F),
    new Polygon( new int[] { 29, 32, 31, 29, 29, 29}, new int[] { 119, 119, 119, 119, 127, 127}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 29, 29}, new int[] { 127, 119, 119, 127, 127, 127}, 6), 
    new Rectangle2D.Float(14.3661F, 119.253F, 2.58621F, 7.68648F),
    new Polygon( new int[] { 14, 17, 17, 14, 14, 14}, new int[] { 119, 119, 119, 119, 127, 127}, 6), 
    new Polygon( new int[] { 17, 17, 17, 17, 14, 14}, new int[] { 127, 119, 119, 127, 127, 127}, 6), 
    new Rectangle2D.Float(20.4006F, 119.181F, 5.17241F, 5.17241F),
    new Polygon( new int[] { 20, 26, 25, 21, 21, 20}, new int[] { 119, 119, 119, 119, 124, 124}, 6), 
    new Polygon( new int[] { 26, 26, 25, 25, 21, 20}, new int[] { 124, 119, 119, 124, 124, 124}, 6), 
    new Rectangle2D.Float(32.4696F, 119.181F, 5.17241F, 5.17241F),
    new Polygon( new int[] { 32, 38, 37, 33, 33, 32}, new int[] { 119, 119, 119, 119, 124, 124}, 6), 
    new Polygon( new int[] { 38, 38, 37, 37, 33, 32}, new int[] { 124, 119, 119, 124, 124, 124}, 6), 
    new Rectangle2D.Float(41.9523F, 119.181F, 5.17241F, 5.17241F),
    new Polygon( new int[] { 42, 47, 47, 42, 42, 42}, new int[] { 119, 119, 119, 119, 124, 124}, 6), 
    new Polygon( new int[] { 47, 47, 47, 47, 42, 42}, new int[] { 124, 119, 119, 124, 124, 124}, 6), 
    new Rectangle2D.Float(47.9868F, 119.181F, 5.17241F, 5.17241F),
    new Polygon( new int[] { 48, 53, 53, 48, 48, 48}, new int[] { 119, 119, 119, 119, 124, 124}, 6), 
    new Polygon( new int[] { 53, 53, 53, 53, 48, 48}, new int[] { 124, 119, 119, 124, 124, 124}, 6), 
    new Rectangle2D.Float(38.5041F, 119.253F, 2.58621F, 7.68648F),
    new Polygon( new int[] { 39, 41, 41, 39, 39, 39}, new int[] { 119, 119, 119, 119, 127, 127}, 6), 
    new Polygon( new int[] { 41, 41, 41, 41, 39, 39}, new int[] { 127, 119, 119, 127, 127, 127}, 6), 
    new Rectangle2D.Float(33.3317F, 109.295F, 2.83852F, 2.80552F),
    new Polygon( new int[] { 33, 36, 36, 33, 33, 33}, new int[] { 109, 109, 109, 109, 112, 112}, 6), 
    new Polygon( new int[] { 36, 36, 36, 36, 33, 33}, new int[] { 112, 109, 109, 112, 112, 112}, 6), 
    new Arc2D.Float(34.3276F, 165.729F, 0F, 0F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(121.541F, 103.15F, 14.3448F, 116.231F),
    new Rectangle2D.Float(279.703F, 106.093F, 14.3448F, 116.231F),
    new Line2D.Float( 155.554F, 227.326F, 143.049F, 227.326F),
    new Line2D.Float( 232.899F, 225.241F, 220.394F, 225.241F),
    new Line2D.Float( 232.899F, 231.351F, 220.394F, 231.351F),
    new Line2D.Float( 232.899F, 237.892F, 220.394F, 237.892F),
    new Line2D.Float( 155.862F, 235.664F, 143.357F, 235.664F),
    new Line2D.Float( 279.758F, 161.003F, 130.515F, 161.003F),
    new Rectangle2D.Float(10.1757F, 69.346F, 62.5771F, 16.9922F),
    new Polygon( new int[] { 10, 73, 73, 10, 10, 10}, new int[] { 69, 69, 70, 70, 86, 86}, 6), 
    new Polygon( new int[] { 73, 73, 73, 73, 10, 10}, new int[] { 86, 69, 70, 86, 86, 86}, 6), 
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
    int fcolor = GeColor.getDrawtype(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[1]);
    g.fill( shapes[2]);
    g.fill( shapes[3]);
    g.fill( shapes[4]);
    g.fill( shapes[5]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[6]);
    g.fill( shapes[7]);
    g.fill( shapes[8]);
    g.fill( shapes[9]);
    g.fill( shapes[10]);
    }
    {
      GradientPaint gp = new GradientPaint( 55.9076F,172.203F,        GeColor.getColor(36,colorTone,colorShift,colorIntensity,2, colorInverse, fillColor, dimmed),
        8.46582F,142.022F,GeColor.getColor(36,colorTone,colorShift,colorIntensity,-2, colorInverse, fillColor, dimmed),true);
      g.setPaint(gp);
    }
    g.fill( shapes[11]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[13]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[14]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[12]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    }
    {
    int fcolor = GeColor.getDrawtype(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[16]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    }
    {
    int fcolor = GeColor.getDrawtype(137, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[17]);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[18]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[19]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[17]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Graph",443, 271);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[20]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "House",20, 99);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zone 1 radiators = 3600W",11, 38);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zone 2 radiators = 4400W",11, 45);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zone 3 radiators = 3000W",11, 52);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.drawString( "Total radiators = 10300W",11, 59);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 10));
    g.drawString( "Log & History",43, 15);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[22]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[23]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[21]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
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
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[28]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[29]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[27]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[31]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[32]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[30]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[34]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[35]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[33]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[37]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[38]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[36]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[40]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[41]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[39]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[43]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[44]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[42]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[46]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[47]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[45]);
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[49]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[50]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[48]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Electric radiator  effect",10, 32);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Energy this day",13, 184);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Total energy",17, 207);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[h]",304, 252);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 8));
    g.drawString( "This Day",316, 32);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[h]",491, 252);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 8));
    g.drawString( "Last 7 days (temp average)",121, 32);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Sunday",102, 100);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Monday",101, 46);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Tuesday",100, 56);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Wednesday",94, 65);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Thursday",98, 74);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Friday",105, 83);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Suterday",99, 92);
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "[ % ]",28, 160);
    ((Arc2D)shapes[51]).setArcType(Arc2D.PIE);
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[51]);
    ((Arc2D)shapes[51]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[51]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Power Out",19, 138);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "kWh",109, 336);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Tu",152, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "We",178, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Th",201, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Fr",229, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Su",278, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Sa",252, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Mo",129, 335);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Tu",160, 219);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "We",181, 219);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Th",203, 219);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Fr",225, 219);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Su",268, 219);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Sa",246, 219);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Mo",138, 219);
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[52]);
    }
    {
    int fcolor = GeColor.getDrawtype(213, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[53]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "kWh",108, 221);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",122, 221);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(7, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[54]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(19, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[55]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(14, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[56]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(5, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[57]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(1, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[58]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Outside",157, 228);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zon1",237, 226);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zon3",237, 239);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zon2",237, 232);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Energy",157, 237);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 8));
    g.drawString( "This week energy",123, 247);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[59]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[0-30 °C]",251, 232);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[-30/+30 °C]",175, 229);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[0-150 kWh]",175, 237);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "[°C]",281, 221);
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.shiftColor( fcolor, -1, colorInverse));
    g.fill( shapes[61]);
    g.setColor(GeColor.shiftColor( fcolor, 1, colorInverse));
    g.fill( shapes[62]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[60]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Floor heating  effect",10, 67);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Bathroom = 800W",11, 74);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.drawString( "Total floor heating = 1100W",11, 84);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Hall = 300W",11, 79);
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
    size = new Dimension( 39, 15);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 39;
  public int original_height = 15;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 35.7759F, 11.2069F),
    new Polygon( new int[] { 2, 38, 37, 3, 3, 2}, new int[] { 2, 2, 3, 3, 12, 13}, 6), 
    new Polygon( new int[] { 38, 38, 37, 37, 3, 2}, new int[] { 13, 2, 3, 12, 12, 13}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,35.7759F,11.2069F, false,41, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 20 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 10F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 20 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 10F);
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
protected class pwr_trafficlight extends GeComponent {
  // Dimension size;
  public pwr_trafficlight( JopSession session)
  {
    super( session);
    size = new Dimension( 21, 21);
  }
  public int original_width = 21;
  public int original_height = 21;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 17.2414F, 17.2414F),
    new Polygon( new int[] { 2, 19, 18, 3, 3, 2}, new int[] { 2, 2, 3, 3, 18, 19}, 6), 
    new Polygon( new int[] { 19, 19, 18, 18, 3, 2}, new int[] { 19, 2, 3, 18, 18, 19}, 6), 
    new Arc2D.Float(4.19475F, 4.36687F, 12.8519F, 12.5076F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(4.19475F, 4.36687F, 12.8519F, 12.5076F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(4.19475F, 4.36687F, 12.8519F, 12.5076F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(4.19475F, 4.36687F, 12.8519F, 12.5076F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(5.19536F, 5.36748F, 10.8507F, 10.5064F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(4.19475F, 4.36687F, 12.8519F, 12.5076F, 0F, 360F, Arc2D.PIE),
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,17.2414F,17.2414F, true,28, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    GeGradient.paint( g, 9,2,-2,4.19475F,4.36687F,12.8519F,12.5076F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    GeGradient.paint( g, gradient,2,-2,4.19475F,4.36687F,12.8519F,12.5076F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[7]);
    }
    } else {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    } else {
    GeGradient.paint( g, gradient,2,-2,4.19475F,4.36687F,12.8519F,12.5076F, false,293, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    size = new Dimension( 46, 17);
    annot1Font = new Font("Helvetica", Font.BOLD, 8);
  }
  int annot1Color = 0;
  public String getAnnot1() { return annot1;}
  public void setAnnot1( String s) { annot1 = s;}
  public void setAnnot1Font( Font font) { annot1Font = font;}
  public Font getAnnot1Font() { return annot1Font;}
  public void setAnnot1Color( int color) { annot1Color = color;}
  public int original_width = 46;
  public int original_height = 17;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 42.2414F, 13.7931F),
    new Polygon( new int[] { 2, 44, 42, 4, 4, 2}, new int[] { 2, 2, 4, 4, 14, 16}, 6), 
    new Polygon( new int[] { 44, 44, 42, 42, 4, 2}, new int[] { 16, 2, 4, 14, 14, 16}, 6), 
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,42.2414F,13.7931F, false,102, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
        g.drawString( annot1, 24 * original_height / width * height / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 11F);
    } else {
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
      g.transform( AffineTransform.getScaleInstance( original_width/width *
      		height/original_height, 1));
      if ( annot1 != null)
        g.drawString( annot1, 24 * original_height / height * width / original_width- (float)g.getFont().getStringBounds(annot1, frc).getWidth()/2, 11F);
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
    size = new Dimension( 42, 38);
  }
  public int original_width = 42;
  public int original_height = 38;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 38.7931F, 34.4828F),
    new Polygon( new int[] { 2, 41, 38, 5, 5, 2}, new int[] { 2, 2, 5, 5, 34, 36}, 6), 
    new Polygon( new int[] { 41, 41, 38, 38, 5, 2}, new int[] { 36, 2, 5, 34, 34, 36}, 6), 
    new Rectangle2D.Float(10.6207F, 8.89655F, 21.5517F, 20.6475F),
    new Polygon( new int[] { 17, 25, 25, 26, 27, 27, 17, 17, 18, 18, 18, 18, 17, 17}, new int[] {18, 18, 26, 27, 27, 28, 28, 27, 27, 26, 19, 18, 18, 18}, 14),
    new Arc2D.Float(18.3793F, 9.75862F, 6.89655F, 6.89655F, 0F, 360F, Arc2D.PIE),
    new Rectangle2D.Float(2F, 32.1724F, 4.31034F, 0F),
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
    GeGradient.paint( g, gradient,1,-1,2F,2F,38.7931F,34.4828F, false,222, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
protected class Grp606_ extends GeComponent {
  // Dimension size;
  public Grp606_( JopSession session)
  {
    super( session);
    size = new Dimension( 8, 20);
  }
  public int original_width = 8;
  public int original_height = 20;
  Shape[] shapes = new Shape[] { 
    new Polygon( new int[] { 2, 6, 6, 4, 2, 2}, new int[] {18, 18, 8, 2, 8, 18}, 6),
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
}
