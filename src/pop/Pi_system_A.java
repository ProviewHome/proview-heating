import jpwr.rt.*;
import jpwr.jop.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.event.*;

public class Pi_system_A extends JopApplet {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  public LocalPanel localPanel = new LocalPanel();
  boolean scrollbar = false;
  Dimension size;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter1;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter6;
  pwr_buttoninfo	pwr_buttoninfo7;
  pwr_valuelargecenter	pwr_valuelargecenter8;
  pwr_valuelargecenter	pwr_valuelargecenter9;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter10;
  pwr_trafficlight	pwr_trafficlight11;
  pwr_buttoncommandcenter	pwr_buttoncommandcenter12;
  pwr_minicircuitbreaker3	pwr_minicircuitbreaker313;
  pwr_manswitch2	pwr_manswitch214;
  pwr_minicircuitbreaker3	pwr_minicircuitbreaker315;
  pwr_minicircuitbreaker3	pwr_minicircuitbreaker316;
  pwr_framethin	pwr_framethin17;
  pwr_framethin	pwr_framethin18;
  pwr_terminal	pwr_terminal19;
  pwr_pc	pwr_pc20;
  ssg5271_controller	ssg5271_controller21;
  pwr_framethin	pwr_framethin27;
  pwr_elheater2	pwr_elheater244;
  pwr_elheater2	pwr_elheater245;
  pwr_elheater2	pwr_elheater246;
  sis032260_transmitter	sis032260_transmitter58;
  sis032260_transmitter	sis032260_transmitter59;
  pwr_framethin	pwr_framethin65;
  pwr_contactor2	pwr_contactor266;
  pwr_contactor2	pwr_contactor267;
  pwr_contactor2	pwr_contactor268;
  public Pi_system_A() {}
  public void init() {
    super.init();
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
      contentPane.add(localPanel, BorderLayout.CENTER);
    contentPane.setOpaque(true);
    localPanel.setLayout( new RatioLayout()); // scaletest
    localPanel.setOpaque(true);
    localPanel.setBackground(GeColor.getColor(213, GeColor.NO_COLOR));
    pwr_buttoncommandcenter1 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter1.setBounds(new Rectangle(449,326,51,18));
    pwr_buttoncommandcenter1.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter1, new Proportion(pwr_buttoncommandcenter1.getBounds(), dsize));
    pwr_buttoncommandcenter6 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter6.setBounds(new Rectangle(449,366,51,18));
    pwr_buttoncommandcenter6.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter6, new Proportion(pwr_buttoncommandcenter6.getBounds(), dsize));
    pwr_buttoninfo7 = new pwr_buttoninfo(session);
    pwr_buttoninfo7.setBounds(new Rectangle(25,3,22,21));
    localPanel.add(pwr_buttoninfo7, new Proportion(pwr_buttoninfo7.getBounds(), dsize));
    pwr_valuelargecenter8 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter8.setBounds(new Rectangle(441,2,59,15));
    pwr_valuelargecenter8.setFillColor(32);
    pwr_valuelargecenter8.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter8, new Proportion(pwr_valuelargecenter8.getBounds(), dsize));
    pwr_valuelargecenter9 = new pwr_valuelargecenter(session);
    pwr_valuelargecenter9.setBounds(new Rectangle(378,2,59,15));
    pwr_valuelargecenter9.setFillColor(32);
    pwr_valuelargecenter9.setBorderColor(212);
    localPanel.add(pwr_valuelargecenter9, new Proportion(pwr_valuelargecenter9.getBounds(), dsize));
    pwr_buttoncommandcenter10 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter10.setBounds(new Rectangle(449,346,51,18));
    pwr_buttoncommandcenter10.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter10, new Proportion(pwr_buttoncommandcenter10.getBounds(), dsize));
    pwr_trafficlight11 = new pwr_trafficlight(session);
    pwr_trafficlight11.setBounds(new Rectangle(3,3,22,22));
    pwr_trafficlight11.setShadow(1);
    localPanel.add(pwr_trafficlight11, new Proportion(pwr_trafficlight11.getBounds(), dsize));
    pwr_buttoncommandcenter12 = new pwr_buttoncommandcenter(session);
    pwr_buttoncommandcenter12.setBounds(new Rectangle(449,307,51,18));
    pwr_buttoncommandcenter12.setFillColor(33);
    localPanel.add(pwr_buttoncommandcenter12, new Proportion(pwr_buttoncommandcenter12.getBounds(), dsize));
    pwr_minicircuitbreaker313 = new pwr_minicircuitbreaker3(session);
    pwr_minicircuitbreaker313.setBounds(new Rectangle(340,103,15,17));
    localPanel.add(pwr_minicircuitbreaker313, new Proportion(pwr_minicircuitbreaker313.getBounds(), dsize));
    pwr_manswitch214 = new pwr_manswitch2(session);
    pwr_manswitch214.setBounds(new Rectangle(322,102,17,17));
    localPanel.add(pwr_manswitch214, new Proportion(pwr_manswitch214.getBounds(), dsize));
    pwr_minicircuitbreaker315 = new pwr_minicircuitbreaker3(session);
    pwr_minicircuitbreaker315.setBounds(new Rectangle(354,103,15,17));
    localPanel.add(pwr_minicircuitbreaker315, new Proportion(pwr_minicircuitbreaker315.getBounds(), dsize));
    pwr_minicircuitbreaker316 = new pwr_minicircuitbreaker3(session);
    pwr_minicircuitbreaker316.setBounds(new Rectangle(369,103,15,17));
    localPanel.add(pwr_minicircuitbreaker316, new Proportion(pwr_minicircuitbreaker316.getBounds(), dsize));
    pwr_framethin17 = new pwr_framethin(session);
    pwr_framethin17.setBounds(new Rectangle(297,92,114,41));
    localPanel.add(pwr_framethin17, new Proportion(pwr_framethin17.getBounds(), dsize));
    pwr_framethin18 = new pwr_framethin(session);
    pwr_framethin18.setBounds(new Rectangle(313,169,73,42));
    localPanel.add(pwr_framethin18, new Proportion(pwr_framethin18.getBounds(), dsize));
    pwr_terminal19 = new pwr_terminal(session);
    pwr_terminal19.setBounds(new Rectangle(94,89,40,33));
    pwr_terminal19.setFillColor(235);
    localPanel.add(pwr_terminal19, new Proportion(pwr_terminal19.getBounds(), dsize));
    pwr_pc20 = new pwr_pc(session);
    pwr_pc20.setBounds(new Rectangle(71,76,27,47));
    pwr_pc20.setFillColor(235);
    localPanel.add(pwr_pc20, new Proportion(pwr_pc20.getBounds(), dsize));
    ssg5271_controller21 = new ssg5271_controller(session);
    ssg5271_controller21.setBounds(new Rectangle(167,172,29,29));
    localPanel.add(ssg5271_controller21, new Proportion(ssg5271_controller21.getBounds(), dsize));
    pwr_framethin27 = new pwr_framethin(session);
    pwr_framethin27.setBounds(new Rectangle(154,139,257,87));
    localPanel.add(pwr_framethin27, new Proportion(pwr_framethin27.getBounds(), dsize));
    pwr_elheater244 = new pwr_elheater2(session);
    pwr_elheater244.setBounds(new Rectangle(341,275,22,7));
    localPanel.add(pwr_elheater244, new Proportion(pwr_elheater244.getBounds(), dsize));
    pwr_elheater245 = new pwr_elheater2(session);
    pwr_elheater245.setBounds(new Rectangle(358,260,22,7));
    localPanel.add(pwr_elheater245, new Proportion(pwr_elheater245.getBounds(), dsize));
    pwr_elheater246 = new pwr_elheater2(session);
    pwr_elheater246.setBounds(new Rectangle(371,245,22,7));
    localPanel.add(pwr_elheater246, new Proportion(pwr_elheater246.getBounds(), dsize));
    sis032260_transmitter58 = new sis032260_transmitter(session);
    sis032260_transmitter58.setBounds(new Rectangle(200,247,12,12));
    sis032260_transmitter58.setShadow(1);
    localPanel.add(sis032260_transmitter58, new Proportion(sis032260_transmitter58.getBounds(), dsize));
    sis032260_transmitter59 = new sis032260_transmitter(session);
    sis032260_transmitter59.setBounds(new Rectangle(215,268,12,12));
    sis032260_transmitter59.setShadow(1);
    localPanel.add(sis032260_transmitter59, new Proportion(sis032260_transmitter59.getBounds(), dsize));
    pwr_framethin65 = new pwr_framethin(session);
    pwr_framethin65.setBounds(new Rectangle(232,159,72,60));
    localPanel.add(pwr_framethin65, new Proportion(pwr_framethin65.getBounds(), dsize));
    pwr_contactor266 = new pwr_contactor2(session);
    pwr_contactor266.setBounds(new Rectangle(323,182,17,17));
    localPanel.add(pwr_contactor266, new Proportion(pwr_contactor266.getBounds(), dsize));
    pwr_contactor267 = new pwr_contactor2(session);
    pwr_contactor267.setBounds(new Rectangle(341,182,17,17));
    localPanel.add(pwr_contactor267, new Proportion(pwr_contactor267.getBounds(), dsize));
    pwr_contactor268 = new pwr_contactor2(session);
    pwr_contactor268.setBounds(new Rectangle(358,182,17,17));
    localPanel.add(pwr_contactor268, new Proportion(pwr_contactor268.getBounds(), dsize));
    pwr_buttoncommandcenter1.dd.setDynType1(1);
    pwr_buttoncommandcenter1.dd.setActionType1(32768);
    pwr_buttoncommandcenter1.dd.setAccess(35454972);
    pwr_buttoncommandcenter1.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter1.dd, "open graph /object=Nodes-Pi-Graph-Pi_settings")
      });
    pwr_buttoncommandcenter1.setAnnot1("Start & Set...");
    pwr_buttoncommandcenter6.dd.setDynType1(1);
    pwr_buttoncommandcenter6.dd.setActionType1(64);
    pwr_buttoncommandcenter6.dd.setAccess(35454972);
    pwr_buttoncommandcenter6.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter6.dd, "open trend/name=Pi-SOFTEL-LOG-Trend1")
      });
    pwr_buttoncommandcenter6.setAnnot1("Trend...");
    pwr_buttoninfo7.dd.setDynType1(1);
    pwr_buttoninfo7.dd.setActionType1(16384);
    pwr_buttoninfo7.dd.setAccess(35454972);
    pwr_buttoninfo7.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoninfo7.dd, "help ")
      });
    pwr_valuelargecenter8.dd.setDynType1(1024);
    pwr_valuelargecenter8.dd.setActionType1(2);
    pwr_valuelargecenter8.dd.setAccess(35454972);
    pwr_valuelargecenter8.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter8.dd, "Nodes-Pi.SystemTime##Time","%1t")
      ,new GeDynPopupMenu(pwr_valuelargecenter8.dd, "Nodes-Pi")
      });
    pwr_valuelargecenter9.dd.setDynType1(1024);
    pwr_valuelargecenter9.dd.setActionType1(2);
    pwr_valuelargecenter9.dd.setAccess(35454972);
    pwr_valuelargecenter9.dd.setElements(new GeDynElemIfc[] {
      new GeDynValue(pwr_valuelargecenter9.dd, "Nodes-Pi.SystemTime##Time","%4t")
      ,new GeDynPopupMenu(pwr_valuelargecenter9.dd, "Nodes-Pi")
      });
    pwr_buttoncommandcenter10.dd.setDynType1(1);
    pwr_buttoncommandcenter10.dd.setActionType1(32768);
    pwr_buttoncommandcenter10.dd.setAccess(35454972);
    pwr_buttoncommandcenter10.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter10.dd, "open graph /object=Nodes-Pi-Graph-Pi_log")
      });
    pwr_buttoncommandcenter10.setAnnot1("Log & Hist...");
    pwr_trafficlight11.dd.setDynType1(53);
    pwr_trafficlight11.dd.setActionType1(8258);
    pwr_trafficlight11.dd.setAccess(35454972);
    pwr_trafficlight11.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigError(pwr_trafficlight11.dd, "Pi-SOFTEL-START-RedLight.ActualValue##Boolean")
      ,new GeDynDigWarning(pwr_trafficlight11.dd, "Pi-SOFTEL-START-YellowLight.ActualValue##Boolean")
      ,new GeDynDigLowColor(pwr_trafficlight11.dd, "Pi-SOFTEL-START-GreenLight.ActualValue##Boolean",0)
      ,new GeDynPopupMenu(pwr_trafficlight11.dd, "Pi-SOFTEL-START-RedLight")
      ,new GeDynTipText(pwr_trafficlight11.dd, "Red, yellow traffic light = check alarmlist for more info.")
      ,new GeDynCommand(pwr_trafficlight11.dd, "show alarmlist")
      });
    pwr_buttoncommandcenter12.dd.setDynType1(1);
    pwr_buttoncommandcenter12.dd.setActionType1(32768);
    pwr_buttoncommandcenter12.dd.setAccess(35454972);
    pwr_buttoncommandcenter12.dd.setElements(new GeDynElemIfc[] {
      new GeDynCommand(pwr_buttoncommandcenter12.dd, "open graph /object=Nodes-Pi-Graph-Pi_overview")
      });
    pwr_buttoncommandcenter12.setAnnot1("Overview...");
    pwr_minicircuitbreaker313.dd.setDynType1(32769);
    pwr_minicircuitbreaker313.dd.setActionType1(0);
    pwr_minicircuitbreaker313.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigShift(pwr_minicircuitbreaker313.dd, "")
      });
    pwr_manswitch214.dd.setDynType1(32769);
    pwr_manswitch214.dd.setActionType1(0);
    pwr_minicircuitbreaker315.dd.setDynType1(32769);
    pwr_minicircuitbreaker315.dd.setActionType1(0);
    pwr_minicircuitbreaker315.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigShift(pwr_minicircuitbreaker315.dd, "")
      });
    pwr_minicircuitbreaker316.dd.setDynType1(32769);
    pwr_minicircuitbreaker316.dd.setActionType1(0);
    pwr_minicircuitbreaker316.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigShift(pwr_minicircuitbreaker316.dd, "")
      });
    pwr_framethin17.dd.setDynType1(1);
    pwr_framethin17.dd.setActionType1(0);
    pwr_framethin18.dd.setDynType1(1);
    pwr_framethin18.dd.setActionType1(0);
    pwr_terminal19.dd.setDynType1(1);
    pwr_terminal19.dd.setActionType1(0);
    pwr_pc20.dd.setDynType1(1);
    pwr_pc20.dd.setActionType1(0);
    ssg5271_controller21.dd.setDynType1(1);
    ssg5271_controller21.dd.setActionType1(0);
    pwr_framethin27.dd.setDynType1(1);
    pwr_framethin27.dd.setActionType1(0);
    pwr_elheater244.dd.setDynType1(5);
    pwr_elheater244.dd.setActionType1(0);
    pwr_elheater244.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_elheater244.dd, "",34)
      });
    pwr_elheater245.dd.setDynType1(5);
    pwr_elheater245.dd.setActionType1(0);
    pwr_elheater245.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_elheater245.dd, "",34)
      });
    pwr_elheater246.dd.setDynType1(5);
    pwr_elheater246.dd.setActionType1(0);
    pwr_elheater246.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigLowColor(pwr_elheater246.dd, "",34)
      });
    sis032260_transmitter58.dd.setDynType1(1);
    sis032260_transmitter58.dd.setActionType1(0);
    sis032260_transmitter58.setAnnot1("t");
    sis032260_transmitter59.dd.setDynType1(1);
    sis032260_transmitter59.dd.setActionType1(0);
    sis032260_transmitter59.setAnnot1("t");
    pwr_framethin65.dd.setDynType1(1);
    pwr_framethin65.dd.setActionType1(0);
    pwr_contactor266.dd.setDynType1(32769);
    pwr_contactor266.dd.setActionType1(0);
    pwr_contactor266.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigShift(pwr_contactor266.dd, "")
      });
    pwr_contactor267.dd.setDynType1(32769);
    pwr_contactor267.dd.setActionType1(0);
    pwr_contactor267.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigShift(pwr_contactor267.dd, "")
      });
    pwr_contactor268.dd.setDynType1(32769);
    pwr_contactor268.dd.setActionType1(0);
    pwr_contactor268.dd.setElements(new GeDynElemIfc[] {
      new GeDynDigShift(pwr_contactor268.dd, "")
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
    new Line2D.Float( 348.416F, 112.19F, 335.816F, 112.19F),
    new Line2D.Float( 994.944F, 513.593F, 982.343F, 513.593F),
    new Line2D.Float( -10.0938F, 264.276F, -10.0938F, 274.357F),
    new Rectangle2D.Float(50F, 161F, 5F, 1F),
    new Rectangle2D.Float(50F, 161F, 1F, 5F),
    new Rectangle2D.Float(50F, 156F, 1F, 5F),
    new Line2D.Float( 50F, 161F, 55F, 161F),
    new Line2D.Float( 50F, 156F, 50F, 161F),
    new Line2D.Float( 50F, 161F, 55F, 161F),
    new Line2D.Float( 50F, 161F, 50F, 166F),
    new Line2D.Float( 50F, 156F, 50F, 166F),
    new Rectangle2D.Float(50F, 50F, 1F, 5F),
    new Rectangle2D.Float(45F, 50F, 5F, 1F),
    new Rectangle2D.Float(50F, 50F, 5F, 1F),
    new Line2D.Float( 45F, 50F, 50F, 50F),
    new Line2D.Float( 50F, 50F, 50F, 55F),
    new Line2D.Float( 50F, 50F, 55F, 50F),
    new Line2D.Float( 50F, 50F, 50F, 55F),
    new Line2D.Float( 45F, 50F, 55F, 50F),
    new Rectangle2D.Float(17F, 50F, 5F, 1F),
    new Line2D.Float( 17F, 50F, 22F, 50F),
    new Line2D.Float( 17F, 50F, 22F, 50F),
    new Line2D.Float( 17F, 50F, 17F, 50F),
    new Rectangle2D.Float(403F, 50F, 5F, 1F),
    new Line2D.Float( 403F, 50F, 408F, 50F),
    new Line2D.Float( 403F, 50F, 408F, 50F),
    new Line2D.Float( 408F, 50F, 408F, 50F),
    new Rectangle2D.Float(241.732F, 173.371F, 50.374F, 35.312F),
    new Rectangle2D.Float(248.976F, 180.931F, 17.8004F, 20.3349F),
    new Rectangle2D.Float(236F, 188F, 5F, 1F),
    new Line2D.Float( 236F, 188F, 241F, 188F),
    new Line2D.Float( 236F, 188F, 241F, 188F),
    new Line2D.Float( 241F, 188F, 241F, 188F),
    new Rectangle2D.Float(196F, 188F, 5F, 1F),
    new Line2D.Float( 196F, 188F, 201F, 188F),
    new Line2D.Float( 196F, 188F, 201F, 188F),
    new Line2D.Float( 196F, 188F, 196F, 188F),
    new Rectangle2D.Float(271.657F, 180.931F, 17.8004F, 20.3349F),
    new Line2D.Float( 349.782F, 170.851F, 349.782F, 133.048F),
    new Line2D.Float( 374.985F, 191.012F, 291.819F, 191.012F),
    new Rectangle2D.Float(181F, 201F, 1F, 5F),
    new Line2D.Float( 181F, 201F, 181F, 206F),
    new Line2D.Float( 181F, 201F, 181F, 206F),
    new Line2D.Float( 181F, 201F, 181F, 201F),
    new Rectangle2D.Float(181F, 254F, 5F, 1F),
    new Rectangle2D.Float(181F, 254F, 1F, 5F),
    new Rectangle2D.Float(181F, 249F, 1F, 5F),
    new Line2D.Float( 181F, 254F, 186F, 254F),
    new Line2D.Float( 181F, 249F, 181F, 254F),
    new Line2D.Float( 181F, 254F, 186F, 254F),
    new Line2D.Float( 181F, 254F, 181F, 259F),
    new Line2D.Float( 181F, 249F, 181F, 259F),
    new Rectangle2D.Float(201F, 254F, 5F, 1F),
    new Line2D.Float( 201F, 254F, 206F, 254F),
    new Line2D.Float( 201F, 254F, 206F, 254F),
    new Line2D.Float( 206F, 254F, 206F, 254F),
    new Rectangle2D.Float(181F, 274F, 5F, 1F),
    new Rectangle2D.Float(181F, 274F, 1F, 5F),
    new Rectangle2D.Float(181F, 269F, 1F, 5F),
    new Line2D.Float( 181F, 274F, 186F, 274F),
    new Line2D.Float( 181F, 269F, 181F, 274F),
    new Line2D.Float( 181F, 274F, 186F, 274F),
    new Line2D.Float( 181F, 274F, 181F, 279F),
    new Line2D.Float( 181F, 269F, 181F, 279F),
    new Rectangle2D.Float(216F, 274F, 5F, 1F),
    new Line2D.Float( 216F, 274F, 221F, 274F),
    new Line2D.Float( 216F, 274F, 221F, 274F),
    new Line2D.Float( 221F, 274F, 221F, 274F),
    new Rectangle2D.Float(181F, 284F, 1F, 5F),
    new Line2D.Float( 181F, 284F, 181F, 289F),
    new Line2D.Float( 181F, 284F, 181F, 289F),
    new Line2D.Float( 181F, 289F, 181F, 289F),
    new Line2D.Float( 55F, 161F, 77F, 161F),
    new Line2D.Float( 82F, 156F, 82F, 123F),
    new Arc2D.Float(72F, 151F, 10F, 10F, 270F, 90F, Arc2D.OPEN),
    new Line2D.Float( 55F, 161F, 77F, 161F),
    new Line2D.Float( 55F, 161F, 77F, 161F),
    new Line2D.Float( 82F, 156F, 82F, 123F),
    new Line2D.Float( 82F, 156F, 82F, 123F),
    new Arc2D.Float(72F, 151F, 10F, 10F, 270F, 90F, Arc2D.OPEN),
    new Arc2D.Float(72F, 151F, 10F, 10F, 270F, 90F, Arc2D.OPEN),
    new Line2D.Float( 22F, 50F, 45F, 50F),
    new Line2D.Float( 22F, 50F, 45F, 50F),
    new Line2D.Float( 22F, 50F, 45F, 50F),
    new Line2D.Float( 403F, 50F, 55F, 50F),
    new Line2D.Float( 403F, 50F, 55F, 50F),
    new Line2D.Float( 403F, 50F, 55F, 50F),
    new Line2D.Float( 50F, 166F, 50F, 182F),
    new Line2D.Float( 55F, 187F, 168F, 187F),
    new Arc2D.Float(50F, 177F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 50F, 166F, 50F, 182F),
    new Line2D.Float( 50F, 166F, 50F, 182F),
    new Line2D.Float( 55F, 187F, 168F, 187F),
    new Line2D.Float( 55F, 187F, 168F, 187F),
    new Arc2D.Float(50F, 177F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Arc2D.Float(50F, 177F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 50F, 156F, 50F, 55F),
    new Line2D.Float( 50F, 156F, 50F, 55F),
    new Line2D.Float( 50F, 156F, 50F, 55F),
    new Line2D.Float( 201F, 188F, 236F, 188F),
    new Line2D.Float( 201F, 188F, 236F, 188F),
    new Line2D.Float( 201F, 188F, 236F, 188F),
    new Line2D.Float( 350F, 199F, 350F, 259F),
    new Line2D.Float( 355F, 264F, 360F, 264F),
    new Arc2D.Float(350F, 254F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 350F, 199F, 350F, 259F),
    new Line2D.Float( 350F, 199F, 350F, 259F),
    new Line2D.Float( 355F, 264F, 360F, 264F),
    new Line2D.Float( 355F, 264F, 360F, 264F),
    new Arc2D.Float(350F, 254F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Arc2D.Float(350F, 254F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 332F, 199F, 332F, 274F),
    new Line2D.Float( 337F, 279F, 342F, 279F),
    new Arc2D.Float(332F, 269F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 332F, 199F, 332F, 274F),
    new Line2D.Float( 332F, 199F, 332F, 274F),
    new Line2D.Float( 337F, 279F, 342F, 279F),
    new Line2D.Float( 337F, 279F, 342F, 279F),
    new Arc2D.Float(332F, 269F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Arc2D.Float(332F, 269F, 10F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 367F, 199F, 367F, 244F),
    new Line2D.Float( 370F, 249F, 372F, 249F),
    new Arc2D.Float(367F, 239F, 5F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 367F, 199F, 367F, 244F),
    new Line2D.Float( 367F, 199F, 367F, 244F),
    new Line2D.Float( 370F, 249F, 372F, 249F),
    new Line2D.Float( 370F, 249F, 372F, 249F),
    new Arc2D.Float(367F, 239F, 5F, 10F, 180F, 90F, Arc2D.OPEN),
    new Arc2D.Float(367F, 239F, 5F, 10F, 180F, 90F, Arc2D.OPEN),
    new Line2D.Float( 181F, 249F, 181F, 206F),
    new Line2D.Float( 181F, 249F, 181F, 206F),
    new Line2D.Float( 181F, 249F, 181F, 206F),
    new Line2D.Float( 201F, 254F, 186F, 254F),
    new Line2D.Float( 201F, 254F, 186F, 254F),
    new Line2D.Float( 201F, 254F, 186F, 254F),
    new Line2D.Float( 181F, 269F, 181F, 259F),
    new Line2D.Float( 181F, 269F, 181F, 259F),
    new Line2D.Float( 181F, 269F, 181F, 259F),
    new Line2D.Float( 216F, 274F, 186F, 274F),
    new Line2D.Float( 216F, 274F, 186F, 274F),
    new Line2D.Float( 216F, 274F, 186F, 274F),
    new Line2D.Float( 181F, 284F, 181F, 279F),
    new Line2D.Float( 181F, 284F, 181F, 279F),
    new Line2D.Float( 181F, 284F, 181F, 279F),
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
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[0]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Graph",452, 303);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[1]);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[2]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 12));
    g.drawString( "Computer System & Network",50, 17);
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    }
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[4]);
    }
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[5]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[6]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[10]);
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[11]);
    }
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[12]);
    }
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[13]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[14]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[17]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[18]);
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[19]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[20]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[21]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[22]);
    {
    int fcolor = GeColor.getDrawtype(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[23]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[24]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[25]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[26]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Ethernet",22, 46);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Linux/Ubuntu",77, 66);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Proview Development",77, 73);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Raspberry Pi",168, 152);
    {
    int fcolor = GeColor.getDrawtype(124, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[27]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[27]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Circuit board (PCB)",243, 170);
    {
    int fcolor = GeColor.getDrawtype(228, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[28]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "AVR",251, 192);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Aurduino IO unit",236, 157);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Proview",168, 160);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Process Station",168, 169);
    {
    int fcolor = GeColor.getDrawtype(228, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[29]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[30]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[31]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[32]);
    {
    int fcolor = GeColor.getDrawtype(228, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[33]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[34]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[35]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[36]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "UART",211, 194);
    {
    int fcolor = GeColor.getDrawtype(228, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[37]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "IO",276, 192);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Soft electrical Heating System Pi",155, 136);
    g.setStroke( new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[38]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[39]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Radiators",380, 239);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Distribution box",299, 90);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Relay",317, 167);
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[40]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[41]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[42]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[43]);
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[44]);
    }
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[45]);
    }
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[46]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[47]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[48]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[49]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[50]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[51]);
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[52]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[53]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[54]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[55]);
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[56]);
    }
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[57]);
    }
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[58]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[59]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[60]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[61]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[62]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[63]);
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[64]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[65]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[66]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[67]);
    {
    int fcolor = GeColor.getDrawtype(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[68]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[69]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[70]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[71]);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "One Wire",183, 220);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "Temp. sensors",191, 240);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Outdoor",211, 257);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Indoor",226, 275);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 8));
    g.drawString( "RPi",173, 189);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zone 1",325, 180);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zone 2",342, 180);
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.PLAIN, 24));
    g.drawString( "Zone 3",360, 180);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[72]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[73]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[74]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[75]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[76]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[77]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[78]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[79]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[80]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[81]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[82]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[83]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[84]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[85]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[86]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[87]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[88]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[89]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[90]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[91]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[92]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[93]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[94]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[95]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(114, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[96]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[97]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[98]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(228, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[99]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[100]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[101]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[102]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[103]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[104]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[105]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[106]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[107]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[108]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[109]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[110]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[111]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[112]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[113]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[114]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[115]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[116]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[117]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[118]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[119]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[120]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[121]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(38, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[122]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[123]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[124]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[125]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[126]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[127]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[128]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[129]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[130]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[131]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[132]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[133]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[134]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[135]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[136]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[137]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[138]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[139]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[140]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(145, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[141]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[142]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[143]);
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
protected class pwr_contactor2 extends GeComponent {
  // Dimension size;
  public pwr_contactor2( JopSession session)
  {
    super( session);
    size = new Dimension( 34, 34);
    pages = 2;
  }
  public int original_width = 34;
  public int original_height = 34;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 30.2419F, 30.2419F),
    new Polygon( new int[] { 2, 32, 31, 4, 4, 2}, new int[] { 2, 2, 4, 4, 31, 32}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 4, 2}, new int[] { 32, 2, 4, 31, 31, 32}, 6), 
    new Rectangle2D.Float(8.04839F, 13.0887F, 18.1452F, 8.06452F),
    new Polygon( new int[] { 8, 26, 25, 9, 9, 8}, new int[] { 13, 13, 14, 14, 20, 21}, 6), 
    new Polygon( new int[] { 26, 26, 25, 25, 9, 8}, new int[] { 21, 13, 14, 20, 20, 21}, 6), 
    new Arc2D.Float(5.02419F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 10.8821F, 7.11394F, 5.22986F, 7.11394F),
    new Line2D.Float( 10.8821F, 6.71021F, 5.22986F, 6.71021F),
    new Arc2D.Float(5.02419F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(14.0968F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 19.9839F, 7.11394F, 14.3317F, 7.11394F),
    new Line2D.Float( 19.9839F, 6.71021F, 14.3317F, 6.71021F),
    new Arc2D.Float(14.0968F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(23.1694F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 29.0857F, 7.11394F, 23.4335F, 7.11394F),
    new Line2D.Float( 29.0857F, 6.71021F, 23.4335F, 6.71021F),
    new Arc2D.Float(23.1694F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(5.02419F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 10.8821F, 27.3168F, 5.22986F, 27.3168F),
    new Line2D.Float( 10.8821F, 26.913F, 5.22986F, 26.913F),
    new Arc2D.Float(5.02419F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(14.0968F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 19.9839F, 27.3168F, 14.3317F, 27.3168F),
    new Line2D.Float( 19.9839F, 26.913F, 14.3317F, 26.913F),
    new Arc2D.Float(14.0968F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(23.1694F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 29.0857F, 27.3168F, 23.4335F, 27.3168F),
    new Line2D.Float( 29.0857F, 26.913F, 23.4335F, 26.913F),
    new Arc2D.Float(23.1694F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Polygon( new int[] { 8, 7, 7, 27, 26, 8, 8}, new int[] {21, 22, 12, 12, 13, 13, 21}, 7),
    new Polygon( new int[] { 7, 8, 26, 26, 27, 27, 7}, new int[] {22, 21, 21, 13, 12, 22, 22}, 7),
    new Polygon( new int[] { 8, 9, 27, 27, 26, 26, 8}, new int[] {21, 23, 23, 14, 13, 21, 21}, 7),
    new Rectangle2D.Float(8.04839F, 13.0887F, 18.1452F, 8.06452F),
  };
  int original_width_p2 = 34;
  int original_height_p2 = 34;
  Shape[] shapes_p2 = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 30.2419F, 30.2419F),
    new Polygon( new int[] { 2, 32, 31, 4, 4, 2}, new int[] { 2, 2, 4, 4, 31, 32}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 4, 2}, new int[] { 32, 2, 4, 31, 31, 32}, 6), 
    new Rectangle2D.Float(8.04839F, 13.0887F, 18.1452F, 8.06452F),
    new Arc2D.Float(5.02419F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 10.8821F, 7.11394F, 5.22986F, 7.11394F),
    new Line2D.Float( 10.8821F, 6.71021F, 5.22986F, 6.71021F),
    new Arc2D.Float(5.02419F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(14.0968F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 19.9839F, 7.11394F, 14.3317F, 7.11394F),
    new Line2D.Float( 19.9839F, 6.71021F, 14.3317F, 6.71021F),
    new Arc2D.Float(14.0968F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(23.1694F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 29.0857F, 7.11394F, 23.4335F, 7.11394F),
    new Line2D.Float( 29.0857F, 6.71021F, 23.4335F, 6.71021F),
    new Arc2D.Float(23.1694F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(5.02419F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 10.8821F, 27.3168F, 5.22986F, 27.3168F),
    new Line2D.Float( 10.8821F, 26.913F, 5.22986F, 26.913F),
    new Arc2D.Float(5.02419F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(14.0968F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 19.9839F, 27.3168F, 14.3317F, 27.3168F),
    new Line2D.Float( 19.9839F, 26.913F, 14.3317F, 26.913F),
    new Arc2D.Float(14.0968F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(23.1694F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 29.0857F, 27.3168F, 23.4335F, 27.3168F),
    new Line2D.Float( 29.0857F, 26.913F, 23.4335F, 26.913F),
    new Arc2D.Float(23.1694F, 24.1774F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Polygon( new int[] { 8, 7, 7, 27, 26, 8, 8}, new int[] {21, 22, 12, 12, 13, 13, 21}, 7),
    new Polygon( new int[] { 7, 8, 26, 26, 27, 27, 7}, new int[] {22, 21, 21, 13, 12, 22, 22}, 7),
    new Rectangle2D.Float(8.04839F, 13.0887F, 18.1452F, 3.02419F),
    new Rectangle2D.Float(8.04839F, 16.1129F, 3.02419F, 5.04032F),
    new Rectangle2D.Float(11.0726F, 16.1129F, 15.121F, 2.01613F),
    new Rectangle2D.Float(11.0726F, 18.129F, 2.01613F, 3.02419F),
    new Rectangle2D.Float(8.04839F, 13.0887F, 18.1452F, 8.06452F),
  };
  public void paintComponent(Graphics g1) {
    switch ( page) {
      case 2 :
        paintComponent_p2(g1);
        return;
      default:
        ;
    }
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
    int fcolor = GeColor.getDrawtype(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,30.2419F,30.2419F, false,33, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    {
    int fcolor = 37;
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    } else {
    GeGradient.paint( g, gradient,2,-2,8.04839F,13.0887F,18.1452F,8.06452F, true,37, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[3]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    }
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[6]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[10]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[11]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[12]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[13]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[13]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[14]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[17]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[17]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[18]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[19]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[20]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[21]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[21]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[22]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[23]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[24]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[25]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[25]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[26]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[27]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[28]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[29]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[29]);
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(33, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(33, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[30]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(33, colorTone,
                 colorShift, colorIntensity,2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(33, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[31]);
    }
    {
    int fcolor = 37;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[32]);
    }
    {
    int fcolor = GeColor.getDrawtype(37, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[33]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public void paintComponent_p2(Graphics g1) {
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
    int fcolor = GeColor.getDrawtype(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2F,30.2419F,30.2419F, false,33, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[0]);
    }
    {
    int fcolor = 37;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[3]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[4]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[5]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[6]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[7]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[7]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[8]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[9]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[10]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[11]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[11]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[12]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[13]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[14]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[15]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[15]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[16]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[17]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[18]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[19]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[19]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[20]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[21]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[22]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[23]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[23]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[24]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[25]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[26]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[27]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[27]);
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(33, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(33, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[28]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(33, colorTone,
                 colorShift, colorIntensity,2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(33, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[29]);
    }
    {
    int fcolor = 29;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[30]);
    }
    {
    int fcolor = 29;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[31]);
    }
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[32]);
    }
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[33]);
    }
    {
    int fcolor = GeColor.getDrawtype(37, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[34]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_minicircuitbreaker3 extends GeComponent {
  // Dimension size;
  public pwr_minicircuitbreaker3( JopSession session)
  {
    super( session);
    size = new Dimension( 49, 50);
    pages = 2;
  }
  public int original_width = 49;
  public int original_height = 50;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(17.1919F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 17, 32, 32, 17, 17}, new int[] {36, 36, 40, 40, 36}, 5),
    new Arc2D.Float(21.7282F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 27.5861F, 7.15547F, 21.9339F, 7.15547F),
    new Line2D.Float( 27.5861F, 6.75174F, 21.9339F, 6.75174F),
    new Arc2D.Float(21.7282F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(21.7282F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 27.6154F, 43.4458F, 21.9631F, 43.4458F),
    new Line2D.Float( 27.6154F, 43.0421F, 21.9631F, 43.0421F),
    new Arc2D.Float(21.7282F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Rectangle2D.Float(21.2242F, 20.1452F, 7.05645F, 5.04032F),
    new Rectangle2D.Float(2.07097F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 2, 17, 17, 2, 2}, new int[] {36, 36, 40, 40, 36}, 5),
    new Arc2D.Float(6.53629F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 12.3942F, 7.15547F, 6.74196F, 7.15547F),
    new Line2D.Float( 12.3942F, 6.75174F, 6.74196F, 6.75174F),
    new Arc2D.Float(6.53629F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(6.53629F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 12.4234F, 43.4458F, 6.77119F, 43.4458F),
    new Line2D.Float( 12.4234F, 43.0421F, 6.77119F, 43.0421F),
    new Arc2D.Float(6.53629F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Rectangle2D.Float(6.10323F, 20.1452F, 7.05645F, 5.04032F),
    new Rectangle2D.Float(2.07097F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 2, 17, 16, 4, 4, 2}, new int[] { 2, 2, 4, 4, 47, 48}, 6), 
    new Polygon( new int[] { 17, 17, 16, 16, 4, 2}, new int[] { 48, 2, 4, 47, 47, 48}, 6), 
    new Rectangle2D.Float(32.3129F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 32, 47, 47, 32, 32}, new int[] {36, 36, 40, 40, 36}, 5),
    new Arc2D.Float(36.7795F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 42.6374F, 7.15547F, 36.9852F, 7.15547F),
    new Line2D.Float( 42.6374F, 6.75174F, 36.9852F, 6.75174F),
    new Arc2D.Float(36.7795F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(36.7795F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 42.6667F, 43.4458F, 37.0144F, 43.4458F),
    new Line2D.Float( 42.6667F, 43.0421F, 37.0144F, 43.0421F),
    new Arc2D.Float(36.7795F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Rectangle2D.Float(36.3452F, 20.1452F, 7.05645F, 5.04032F),
    new Rectangle2D.Float(32.3129F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 32, 47, 46, 34, 34, 32}, new int[] { 2, 2, 4, 4, 47, 48}, 6), 
    new Polygon( new int[] { 47, 47, 46, 46, 34, 32}, new int[] { 48, 2, 4, 47, 47, 48}, 6), 
    new Rectangle2D.Float(17.1919F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 17, 32, 31, 19, 19, 17}, new int[] { 2, 2, 4, 4, 47, 48}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 19, 17}, new int[] { 48, 2, 4, 47, 47, 48}, 6), 
    new Line2D.Float( 47.4339F, 14.0968F, 2.07097F, 14.0968F),
    new Line2D.Float( 47.4339F, 36.2742F, 2.07097F, 36.2742F),
    new Line2D.Float( 17.1919F, 48.371F, 17.1919F, 2F),
    new Line2D.Float( 32.3129F, 48.371F, 32.3129F, 2F),
    new Rectangle2D.Float(3.07903F, 17.121F, 43.3468F, 3.02419F),
    new Polygon( new int[] { 3, 46, 45, 4, 4, 3}, new int[] { 17, 17, 18, 18, 19, 20}, 6), 
    new Polygon( new int[] { 46, 46, 45, 45, 4, 3}, new int[] { 20, 17, 18, 19, 19, 20}, 6), 
    new Rectangle2D.Float(2.07097F, 2F, 45.3629F, 46.371F),
  };
  int original_width_p2 = 49;
  int original_height_p2 = 50;
  Shape[] shapes_p2 = new Shape[] { 
    new Rectangle2D.Float(17.1919F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 17, 32, 32, 17, 17}, new int[] {36, 36, 40, 40, 36}, 5),
    new Arc2D.Float(21.7282F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 27.5861F, 7.15547F, 21.9339F, 7.15547F),
    new Line2D.Float( 27.5861F, 6.75174F, 21.9339F, 6.75174F),
    new Arc2D.Float(21.7282F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(21.7282F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 27.6154F, 43.4458F, 21.9631F, 43.4458F),
    new Line2D.Float( 27.6154F, 43.0421F, 21.9631F, 43.0421F),
    new Arc2D.Float(21.7282F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Rectangle2D.Float(21.2242F, 19.1371F, 7.05645F, 5.04032F),
    new Rectangle2D.Float(2.07097F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 2, 17, 17, 2, 2}, new int[] {36, 36, 40, 40, 36}, 5),
    new Arc2D.Float(6.53629F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 12.3942F, 7.15547F, 6.74196F, 7.15547F),
    new Line2D.Float( 12.3942F, 6.75174F, 6.74196F, 6.75174F),
    new Arc2D.Float(6.53629F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(6.53629F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 12.4234F, 43.4458F, 6.77119F, 43.4458F),
    new Line2D.Float( 12.4234F, 43.0421F, 6.77119F, 43.0421F),
    new Arc2D.Float(6.53629F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Rectangle2D.Float(6.10323F, 19.1371F, 7.05645F, 5.04032F),
    new Rectangle2D.Float(2.07097F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 2, 17, 16, 4, 4, 2}, new int[] { 2, 2, 4, 4, 47, 48}, 6), 
    new Polygon( new int[] { 17, 17, 16, 16, 4, 2}, new int[] { 48, 2, 4, 47, 47, 48}, 6), 
    new Rectangle2D.Float(32.3129F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 32, 47, 47, 32, 32}, new int[] {36, 36, 40, 40, 36}, 5),
    new Arc2D.Float(36.7795F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 42.6374F, 7.15547F, 36.9852F, 7.15547F),
    new Line2D.Float( 42.6374F, 6.75174F, 36.9852F, 6.75174F),
    new Arc2D.Float(36.7795F, 4.01613F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Arc2D.Float(36.7795F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.PIE),
    new Line2D.Float( 42.6667F, 43.4458F, 37.0144F, 43.4458F),
    new Line2D.Float( 42.6667F, 43.0421F, 37.0144F, 43.0421F),
    new Arc2D.Float(36.7795F, 40.3065F, 6.04839F, 6.04839F, 0F, 360F, Arc2D.OPEN),
    new Rectangle2D.Float(36.3452F, 19.1371F, 7.05645F, 5.04032F),
    new Rectangle2D.Float(17.1919F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 17, 32, 31, 19, 19, 17}, new int[] { 2, 2, 4, 4, 47, 48}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 19, 17}, new int[] { 48, 2, 4, 47, 47, 48}, 6), 
    new Rectangle2D.Float(32.3129F, 2F, 15.121F, 46.371F),
    new Polygon( new int[] { 32, 47, 46, 34, 34, 32}, new int[] { 2, 2, 4, 4, 47, 48}, 6), 
    new Polygon( new int[] { 47, 47, 46, 46, 34, 32}, new int[] { 48, 2, 4, 47, 47, 48}, 6), 
    new Line2D.Float( 47.4339F, 14.0968F, 2.07097F, 14.0968F),
    new Line2D.Float( 47.4339F, 36.2742F, 2.07097F, 36.2742F),
    new Line2D.Float( 17.1919F, 48.371F, 17.1919F, 2F),
    new Line2D.Float( 32.3129F, 48.371F, 32.3129F, 2F),
    new Rectangle2D.Float(3.07903F, 24.1774F, 43.3468F, 3.02419F),
    new Polygon( new int[] { 3, 46, 45, 4, 4, 3}, new int[] { 24, 24, 25, 25, 26, 27}, 6), 
    new Polygon( new int[] { 46, 46, 45, 45, 4, 3}, new int[] { 27, 24, 25, 26, 26, 27}, 6), 
    new Rectangle2D.Float(2.07097F, 2F, 45.3629F, 46.371F),
  };
  public void paintComponent(Graphics g1) {
    switch ( page) {
      case 2 :
        paintComponent_p2(g1);
        return;
      default:
        ;
    }
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
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(32, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(32, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[1]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[2]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[4]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[6]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[10]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[11]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(32, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(32, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[12]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[13]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[14]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[17]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[18]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[19]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[20]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[20]);
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[21]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[23]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[24]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[22]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[25]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(32, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(32, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[26]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[27]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[28]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[29]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[30]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[30]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes[31]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[32]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[33]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[34]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[34]);
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[35]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[37]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[38]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[36]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[40]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[41]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(36, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[39]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[42]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(37, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[43]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[44]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[45]);
    {
    int fcolor = 39;
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[46]);
    } else {
    GeGradient.paint( g, gradient,2,-2,3.07903F,17.121F,43.3468F,3.02419F, true,39, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[46]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[47]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[48]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(39, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[49]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public void paintComponent_p2(Graphics g1) {
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
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[0]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(32, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(32, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[1]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[2]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[3]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[4]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[5]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[5]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[6]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[7]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[8]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[9]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[9]);
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[10]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[11]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(32, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(32, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[12]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[13]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[14]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[15]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[16]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[16]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[17]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[18]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[19]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[20]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[20]);
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[21]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[23]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[24]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[22]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[25]);
    }
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(32, colorTone,
                 colorShift, colorIntensity,-2, colorInverse, fillColor, dimmed);
    else
      fcolor = GeColor.getDrawtype(32, colorTone,
	          colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[26]);
    }
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[27]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[28]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[29]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[30]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[30]);
    g.setColor(GeColor.getColor(34, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed));
    g.fill( shapes_p2[31]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(31, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[32]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(29, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[33]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[34]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[34]);
    {
    int fcolor = 39;
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[35]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[37]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[38]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[36]);
    }
    {
    int fcolor = GeColor.getDrawtype(32, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[40]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[41]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[39]);
    }
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[42]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(37, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[43]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[44]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(35, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[45]);
    {
    int fcolor = 39;
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[46]);
    } else {
    GeGradient.paint( g, gradient,2,-2,3.07903F,24.1774F,43.3468F,3.02419F, true,39, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[46]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[47]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[48]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(39, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[49]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_manswitch2 extends GeComponent {
  // Dimension size;
  public pwr_manswitch2( JopSession session)
  {
    super( session);
    size = new Dimension( 34, 34);
    pages = 2;
  }
  public int original_width = 34;
  public int original_height = 34;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2.34774F, 30.2419F, 30.2419F),
    new Polygon( new int[] { 2, 32, 31, 4, 4, 2}, new int[] { 2, 2, 4, 4, 31, 33}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 4, 2}, new int[] { 33, 2, 4, 31, 31, 33}, 6), 
    new Arc2D.Float(7.04032F, 7.38806F, 20.1613F, 20.1613F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38806F, 20.1613F, 20.1613F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38806F, 20.1613F, 20.1613F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38806F, 20.1613F, 20.1613F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(8.65323F, 9.00097F, 16.9355F, 16.9355F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38806F, 20.1613F, 20.1613F, 0F, 360F, Arc2D.PIE),
    new Polygon( new int[] { 23, 23, 23, 20, 20}, new int[] {11, 11, 25, 27, 9}, 5),
    new Rectangle2D.Float(14.0968F, 7.38806F, 6.04839F, 20.1613F),
    new Polygon( new int[] { 14, 20, 19, 15, 15, 14}, new int[] { 7, 7, 9, 9, 26, 28}, 6), 
    new Polygon( new int[] { 20, 20, 19, 19, 15, 14}, new int[] { 28, 7, 9, 26, 26, 28}, 6), 
    new Line2D.Float( 17.121F, 14.4445F, 17.121F, 7.38806F),
  };
  int original_width_p2 = 34;
  int original_height_p2 = 34;
  Shape[] shapes_p2 = new Shape[] { 
    new Rectangle2D.Float(2F, 2.34476F, 30.2419F, 30.2419F),
    new Polygon( new int[] { 2, 32, 31, 4, 4, 2}, new int[] { 2, 2, 4, 4, 31, 33}, 6), 
    new Polygon( new int[] { 32, 32, 31, 31, 4, 2}, new int[] { 33, 2, 4, 31, 31, 33}, 6), 
    new Arc2D.Float(7.04032F, 7.38508F, 20.1613F, 20.1613F, 35F, 140F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38508F, 20.1613F, 20.1613F, 215F, 140F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38508F, 20.1613F, 20.1613F, -5F, 40F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38508F, 20.1613F, 20.1613F, 175F, 40F, Arc2D.PIE),
    new Arc2D.Float(8.65323F, 8.99798F, 16.9355F, 16.9355F, 0F, 360F, Arc2D.PIE),
    new Arc2D.Float(7.04032F, 7.38508F, 20.1613F, 20.1613F, 0F, 360F, Arc2D.PIE),
    new Polygon( new int[] { 24, 24, 11, 9, 26}, new int[] {24, 24, 24, 20, 20}, 5),
    new Rectangle2D.Float(7.04032F, 14.4415F, 20.1613F, 6.04839F),
    new Polygon( new int[] { 7, 27, 26, 8, 8, 7}, new int[] { 14, 14, 16, 16, 19, 20}, 6), 
    new Polygon( new int[] { 27, 27, 26, 26, 8, 7}, new int[] { 20, 14, 16, 19, 19, 20}, 6), 
    new Line2D.Float( 20.1452F, 17.4657F, 27.2016F, 17.4657F),
  };
  public void paintComponent(Graphics g1) {
    switch ( page) {
      case 2 :
        paintComponent_p2(g1);
        return;
      default:
        ;
    }
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
    int fcolor = GeColor.getDrawtype(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2.34774F,30.2419F,30.2419F, false,33, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.drawString( "0",28, 19);
    ((Arc2D)shapes[3]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[4]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[5]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[6]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes[7]).setArcType(Arc2D.PIE);
    {
    int fcolor = 36;
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
    GeGradient.paint( g, 9,2,-2,7.04032F,7.38806F,20.1613F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    GeGradient.paint( g, gradient,2,-2,7.04032F,7.38806F,20.1613F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[7]);
    }
    } else {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    } else {
    GeGradient.paint( g, gradient,2,-2,7.04032F,7.38806F,20.1613F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[8]);
    }
    }
    }
    ((Arc2D)shapes[8]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[8]);
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(36, GeColor.NO_TONE,
                 0, 0,-2, colorInverse,  GeColor.NO_COLOR, dimmed);
    else
      fcolor = GeColor.getDrawtype(36, GeColor.NO_TONE,
                 0, 0, 0, colorInverse,  GeColor.NO_COLOR, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[9]);
    }
    {
    int fcolor = 36;
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[10]);
    } else {
    GeGradient.paint( g, gradient,2,-2,14.0968F,7.38806F,6.04839F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[10]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[11]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[12]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[10]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.drawString( "1",15, 7);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[13]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public void paintComponent_p2(Graphics g1) {
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
    int fcolor = GeColor.getDrawtype(33, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,2.34476F,30.2419F,30.2419F, false,33, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[0]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[1]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[2]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[0]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.drawString( "0",28, 19);
    ((Arc2D)shapes_p2[3]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[4]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[5]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[6]).setArcType(Arc2D.PIE);
    ((Arc2D)shapes_p2[7]).setArcType(Arc2D.PIE);
    {
    int fcolor = 36;
    if ( shadow != 0) {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[3]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[4]);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[5]);
    g.fill( shapes_p2[6]);
    g.fill( shapes_p2[7]);
    } else {
    GeGradient.paint( g, 9,2,-2,7.04032F,7.38508F,20.1613F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[8]);
    GeGradient.paint( g, gradient,2,-2,7.04032F,7.38508F,20.1613F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[7]);
    }
    } else {
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[8]);
    } else {
    GeGradient.paint( g, gradient,2,-2,7.04032F,7.38508F,20.1613F,20.1613F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[8]);
    }
    }
    }
    ((Arc2D)shapes_p2[8]).setArcType(Arc2D.OPEN);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[8]);
    {
    int fcolor;
    if ( shadow != 0)
      fcolor = GeColor.getDrawtype(36, GeColor.NO_TONE,
                 0, 0,-2, colorInverse,  GeColor.NO_COLOR, dimmed);
    else
      fcolor = GeColor.getDrawtype(36, GeColor.NO_TONE,
                 0, 0, 0, colorInverse,  GeColor.NO_COLOR, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[9]);
    }
    {
    int fcolor = 36;
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes_p2[10]);
    } else {
    GeGradient.paint( g, gradient,2,-2,7.04032F,14.4415F,20.1613F,6.04839F, true,36, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes_p2[10]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes_p2[11]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes_p2[12]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[10]);
    }
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, textColor, dimmed));
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.drawString( "1",15, 7);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(3, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes_p2[13]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_framethin extends GeFrameThin {
  public pwr_framethin( JopSession session)
  {
     super(session);
  }
}
protected class pwr_elheater2 extends GeComponent {
  // Dimension size;
  public pwr_elheater2( JopSession session)
  {
    super( session);
    size = new Dimension( 24, 9);
  }
  public int original_width = 24;
  public int original_height = 9;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 20.1613F, 5.04032F),
    new Polygon( new int[] { 2, 22, 21, 3, 3, 2}, new int[] { 2, 2, 3, 3, 6, 7}, 6), 
    new Polygon( new int[] { 22, 22, 21, 21, 3, 2}, new int[] { 7, 2, 3, 6, 6, 7}, 6), 
    new Line2D.Float( 5.36021F, 7.04032F, 5.36021F, 2F),
    new Line2D.Float( 8.72043F, 7.04032F, 8.72043F, 2F),
    new Line2D.Float( 12.0806F, 7.04032F, 12.0806F, 2F),
    new Line2D.Float( 15.4408F, 7.04032F, 15.4408F, 2F),
    new Line2D.Float( 18.8011F, 7.04032F, 18.8011F, 2F),
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
    GeGradient.paint( g, gradient,2,-2,2F,2F,20.1613F,5.04032F, false,74, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[6]);
    g.setStroke( new BasicStroke(1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[7]);
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_terminal extends GeComponent {
  // Dimension size;
  public pwr_terminal( JopSession session)
  {
    super( session);
    size = new Dimension( 25, 19);
  }
  public int original_width = 25;
  public int original_height = 19;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(6.03226F, 2F, 14.1129F, 11.0887F),
    new Polygon( new int[] { 6, 20, 20, 7, 7, 6}, new int[] { 2, 2, 3, 3, 13, 13}, 6), 
    new Polygon( new int[] { 20, 20, 20, 20, 7, 6}, new int[] { 13, 2, 3, 13, 13, 13}, 6), 
    new Polygon( new int[] { 8, 18, 19, 19, 18, 8, 7, 7, 8}, new int[] {3, 3, 4, 11, 12, 12, 11, 4, 3}, 9),
    new Polygon( new int[] { 6, 3, 3, 23, 23, 20, 6}, new int[] {14, 16, 17, 17, 16, 14, 14}, 7),
    new Rectangle2D.Float(9.05645F, 13.0887F, 8.06452F, 1.00806F),
    new Polygon( new int[] { 9, 17, 17, 9, 9, 9}, new int[] { 13, 13, 13, 13, 14, 14}, 6), 
    new Polygon( new int[] { 17, 17, 17, 17, 9, 9}, new int[] { 14, 13, 13, 14, 14, 14}, 6), 
    new Polygon( new int[] { 5, 7, 17, 18, 5}, new int[] {16, 15, 15, 16, 16}, 5),
    new Polygon( new int[] { 18, 20, 21, 19, 18}, new int[] {15, 15, 16, 16, 15}, 5),
    new Polygon( new int[] { 7, 8, 9, 15, 17, 17, 15, 18, 19, 19, 18, 8, 7, 7}, new int[] {10, 11, 11, 11, 10, 4, 3, 3, 4, 11, 12, 12, 11, 10}, 14),
    new Polygon( new int[] { 9, 2}, new int[] {4, 6}, 2),
    new Polygon( new int[] { 8, 18, 19, 19, 18, 8, 7, 7, 8}, new int[] {3, 3, 4, 11, 12, 12, 11, 4, 3}, 9),
    new Rectangle2D.Float(3.00806F, 16.1129F, 20.1613F, 1.00806F),
    new Polygon( new int[] { 3, 23, 23, 3, 3, 3}, new int[] { 16, 16, 16, 16, 17, 17}, 6), 
    new Polygon( new int[] { 23, 23, 23, 23, 3, 3}, new int[] { 17, 16, 16, 17, 17, 17}, 6), 
    new Polygon( new int[] { 6, 3, 3, 23, 23, 20, 6}, new int[] {14, 16, 17, 17, 16, 14, 14}, 7),
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
    int fcolor = GeColor.getDrawtype(56, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,6.03226F,2F,14.1129F,11.0887F, false,56, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    {
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[3]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    }
    {
    int fcolor = GeColor.getDrawtype(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[4]);
    }
    {
    int fcolor = GeColor.getDrawtype(28, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[5]);
    } else {
    GeGradient.paint( g, gradient,2,-2,9.05645F,13.0887F,8.06452F,1.00806F, false,28, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[5]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[6]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[7]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[5]);
    }
    {
    int fcolor = GeColor.getDrawtype(56, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[8]);
    }
    {
    int fcolor = GeColor.getDrawtype(56, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[9]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[10]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[11]);
    }
    {
    int fcolor = GeColor.getDrawtype(2, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[12]);
    }
    {
    int fcolor = GeColor.getDrawtype(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[13]);
    } else {
    GeGradient.paint( g, gradient,2,-2,3.00806F,16.1129F,20.1613F,1.00806F, false,58, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[13]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[14]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[15]);
    }
    }
    {
    int fcolor = GeColor.getDrawtype(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
    }
    }
    if ( rounds == 2)
      g.setClip(null);
    g.setTransform(save);
  }
  public Dimension getPreferredSize() { return size;}
  public Dimension getMinimumSize() { return size;}
}
protected class pwr_pc extends GeComponent {
  // Dimension size;
  public pwr_pc( JopSession session)
  {
    super( session);
    size = new Dimension( 29, 49);
  }
  public int original_width = 29;
  public int original_height = 49;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 7.04032F, 20.1613F, 40.3226F),
    new Polygon( new int[] { 2, 22, 21, 3, 3, 2}, new int[] { 7, 7, 8, 8, 46, 47}, 6), 
    new Polygon( new int[] { 22, 22, 21, 21, 3, 2}, new int[] { 47, 7, 8, 46, 46, 47}, 6), 
    new Rectangle2D.Float(3.00806F, 8.04839F, 18.1452F, 3.02419F),
    new Polygon( new int[] { 3, 21, 21, 3, 3, 3}, new int[] { 8, 8, 8, 8, 11, 11}, 6), 
    new Polygon( new int[] { 21, 21, 21, 21, 3, 3}, new int[] { 11, 8, 8, 11, 11, 11}, 6), 
    new Rectangle2D.Float(3.00806F, 36.2742F, 18.1452F, 10.0806F),
    new Polygon( new int[] { 3, 21, 21, 4, 4, 3}, new int[] { 36, 36, 37, 37, 46, 46}, 6), 
    new Polygon( new int[] { 21, 21, 21, 21, 4, 3}, new int[] { 46, 36, 37, 46, 46, 46}, 6), 
    new Rectangle2D.Float(3.00806F, 12.0806F, 18.1452F, 6.04839F),
    new Polygon( new int[] { 3, 21, 21, 3, 3, 3}, new int[] { 12, 12, 12, 12, 18, 18}, 6), 
    new Polygon( new int[] { 21, 21, 21, 21, 3, 3}, new int[] { 18, 12, 12, 18, 18, 18}, 6), 
    new Rectangle2D.Float(2F, 7.04032F, 20.1613F, 40.3226F),
    new Polygon( new int[] { 2, 22, 21, 3, 3, 2}, new int[] { 7, 7, 8, 8, 46, 47}, 6), 
    new Polygon( new int[] { 22, 22, 21, 21, 3, 2}, new int[] { 47, 7, 8, 46, 46, 47}, 6), 
    new Polygon( new int[] { 22, 27, 27, 22, 22}, new int[] {7, 2, 37, 47, 7}, 5),
    new Polygon( new int[] { 2, 9, 27, 22, 2}, new int[] {7, 2, 2, 7, 7}, 5),
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
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[0]);
    } else {
    GeGradient.paint( g, gradient,2,-2,2F,7.04032F,20.1613F,40.3226F, false,42, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
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
    {
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[4]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[5]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(56, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[3]);
    }
    {
    int fcolor = GeColor.getDrawtype(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( gradient == GeGradient.eGradient_No) {
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[6]);
    } else {
    GeGradient.paint( g, gradient,2,-2,3.00806F,36.2742F,18.1452F,10.0806F, false,43, colorTone, colorShift, colorIntensity, colorInverse, fillColor, dimmed);
    g.fill( shapes[6]);
    }
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[7]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[8]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(56, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[6]);
    }
    {
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[10]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[11]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(56, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[9]);
    }
    {
    int fcolor = GeColor.getDrawtype(42, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    if ( shadow != 0) {
    g.setColor(GeColor.shiftColor( fcolor, -2, colorInverse));
    g.fill( shapes[13]);
    g.setColor(GeColor.shiftColor( fcolor, 2, colorInverse));
    g.fill( shapes[14]);
    }
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[12]);
    }
    {
    int fcolor = GeColor.getDrawtype(43, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[15]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[15]);
    }
    {
    int fcolor = GeColor.getDrawtype(41, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
    g.setColor(GeColor.getColor( fcolor));
    g.fill( shapes[16]);
    g.setStroke( new BasicStroke(1F));
    g.setColor(GeColor.getColor(58, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, borderColor, dimmed));
    g.draw( shapes[16]);
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
protected class pwr_conglue extends GeComponent {
  // Dimension size;
  public pwr_conglue( JopSession session)
  {
    super( session);
    size = new Dimension( 14, 14);
  }
  public int original_width = 14;
  public int original_height = 14;
  Shape[] shapes = new Shape[] { 
    new Rectangle2D.Float(2F, 2F, 10.0806F, 10.0806F),
    new Polygon( new int[] { 2, 12, 12, 3, 3, 2}, new int[] { 2, 2, 3, 3, 12, 12}, 6), 
    new Polygon( new int[] { 12, 12, 12, 12, 3, 2}, new int[] { 12, 2, 3, 12, 12, 12}, 6), 
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
    int fcolor = GeColor.getDrawtype(0, colorTone,
	 colorShift, colorIntensity, colorBrightness, colorInverse, fillColor, dimmed);
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
    new Polygon( new int[] { 7, 7, -234, -234}, new int[] { 12, 10, -137,-170}, 4),
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
}
