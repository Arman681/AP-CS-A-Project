import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//class file works with out main

public class Depot implements ActionListener
{ 
	static JTextArea display = new JTextArea(15, 30);
	static JScrollPane scroll = new JScrollPane(display);
	
	static String[] paint_types_list		= new String[] {"Basic..........$19.97", 
															"Deluxe..........&26.97",
															"Premium..........$34.95"};
	static JComboBox<String> paint_types	= new JComboBox<String>(paint_types_list);
	
	static String[] tile_styles_list		= new String[] {"Mosaic..........$3.88",
															"Wood..........$3.95",
															"Ceramic..........$4.04"};
	static JComboBox<String> tile_styles	= new JComboBox<String>(tile_styles_list);
	
	static String[] carpet_styles_list		= new String[] {"Flat.........$4.92",
															"Ridges..........$6.25",
															"Plush..........$8.25"};
	static JComboBox<String> carpet_styles	= new JComboBox<String>(carpet_styles_list);
	
	JFrame PrintEstimate_Window		= new JFrame();	
	
	static JLabel labelSlot1;
	static JLabel paintslot;
	static JLabel tileslot;
	static JLabel carpetslot;
	static JLabel calculatorslot;
	static JLabel printerslot;
	//static JLabel Livingroom1 = new JLabel("Livingroom 1");
	
	//---------------------------------------JTextFields---------------------------------------//
/**/static JTextField outputTextsub_field			=	new JTextField(15);
/**/static JTextField outputTexttax_field			=	new JTextField(15);
/**/static JTextField outputTextGT_field			=	new JTextField(15);				//Grand total
/**/static JTextField outputTextSC_field			=	new JTextField(15);
/**/
/**/static JButton butt                             =   new JButton();
/**/static JButton butt2                            =   new JButton();
/**/static JTextField bedroom1_length_field			= 	new JTextField(5);				//Bedroom1 Length Text Field
/**/static JTextField bedroom1_width_field 			= 	new JTextField(5);				//Bedroom1 Width Text Field
/**/static JTextField bedroom2_length_field			=	new JTextField(5);				//Bedroom2 Length Text Field
/**/static JTextField bedroom2_width_field			=	new JTextField(5);				//Bedroom2 Width Text Field
/**/static JTextField bedroom3_length_field			=	new JTextField(5);				//Bedroom3 Length Text Field
/**/static JTextField bedroom3_width_field			=	new JTextField(5);				//Bedroom3 Width Text Field
/**/
/**/static JTextField kitchen_length_field 			= 	new JTextField(5);				//Kitchen Length Text Field  
/**/static JTextField kitchen_width_field 			= 	new JTextField(5);				//Kitchen Width Text Field
/**/
/**/static JTextField diningroom_length_field		=	new JTextField(5);				//Dining Room Length Text Field
/**/static JTextField diningroom_width_field		=	new JTextField(5);				//Dining Room Width Text Field
/**/
/**/static JTextField familyroom_length_field		=	new JTextField(5);				//Family Room Length Text Field
/**/static JTextField familyroom_width_field 		=	new JTextField(5);				//Family Room Width Text Field
/**/
/**/static JTextField livingroom_length_field 		= 	new JTextField(5);				//Living Room Length Text Field
/**/static JTextField livingroom_width_field 		= 	new JTextField(5);				//Living Room Width Text Field
/**/
/**/static JTextField bathroom1_length_field		=	new JTextField(5);				//Bathroom1 Length Text Field
/**/static JTextField bathroom1_width_field			=	new JTextField(5);				//Bathroom1 Width Text Field
/**/static JTextField bathroom2_length_field		=	new JTextField(5);			//Bathroom2 Length Text Field
/**/static JTextField bathroom2_width_field			=	new JTextField(5);				//Bathroom2 Width Text Field
/**/
/**/static JTextField thsqft_field					= 	new JTextField(25);
/**/static JTextField nlh_field						= 	new JTextField(25);
	//---------------------------------------JTextFields---------------------------------------//
	
	//---------------------------------------JLabels---------------------------------------//
/**/static JLabel bedroom1							=	new JLabel("Bedroom 1"); 
/**/static JLabel bedroom1_length 					= 	new JLabel("Length");			//Bedroom1 Length
/**/static JLabel bedroom1_width 					= 	new JLabel("Width");			//Bedroom1 Width
/**/
/**/static JLabel bedroom2 							= 	new JLabel("Bedroom 2"); 
/**/static JLabel bedroom2_length 					= 	new JLabel("Length");			//Bedroom2 Length
/**/static JLabel bedroom2_width					= 	new JLabel("Width");			//Bedroom2 Width
/**/
/**/static JLabel bedroom3 							= 	new JLabel("Bedroom 3");
/**/static JLabel bedroom3_length 					= 	new JLabel("Length");			//Bedroom3 Length
/**/static JLabel bedroom3_width 					= 	new JLabel("Width");			//Bedroom3 Width
/**/
/**/static JLabel kitchen 							= 	new JLabel("Kitchen");
/**/static JLabel kitchen_length 					= 	new JLabel("Length");			//Kitchen Length
/**/static JLabel kitchen_width 					= 	new JLabel("Width");			//Kitchen Width
/**/
/**/static JLabel diningroom 						= 	new JLabel("Dining Room");
/**/static JLabel diningroom_length 				= 	new JLabel("Length");			//Dining Room Length
/**/static JLabel diningroom_width 					= 	new JLabel("Width");			//Dining Room Width
/**/
/**/static JLabel familyroom						= 	new JLabel("Family Room");
/**/static JLabel familyroom_length					= 	new JLabel("Length");			//Family Room Length
/**/static JLabel familyroom_width 					= 	new JLabel("Width");			//Family Room Width
/**/
/**/static JLabel livingroom 						= 	new JLabel("Living Room");
/**/static JLabel livingroom_length					= 	new JLabel("Length");			//Living Room Length
/**/static JLabel livingroom_width 					= 	new JLabel("Width");			//Living Room Width
/**/
/**/static JLabel bathroom1 						= 	new JLabel("Bathroom 1");
/**/static JLabel bathroom1_length 					= 	new JLabel("Length");			//Bathroom Length
/**/static JLabel bathroom1_width 					= 	new JLabel("Width");			//Bathroom Width
/**/
/**/static JLabel bathroom2 						= 	new JLabel("Bathroom 2");
/**/static JLabel bathroom2_length 					= 	new JLabel("Length");			//Bathroom2 Length
/**/static JLabel bathroom2_width 					= 	new JLabel("Width");			//Bathroom2 Width
/**/
/**/static JLabel thsqft 							= 	new JLabel ("Total Home Square Footage");
/**/static JLabel nlh 								= 	new JLabel("Number of Labor Hours");
/**/static JLabel pt 								= 	new JLabel("Paint Type");
/**/static JLabel ts 								= 	new JLabel("Tile Style");
/**/static JLabel cs 								= 	new JLabel("Carpet Style");
/**/
/**/static JLabel sub 								= 	new JLabel("Subtotal");			//Sub-total
/**/static JLabel tax 								= 	new JLabel("Tax");				//Tax
/**/static JLabel gt 								= 	new JLabel("Grand Total");		//Grant Total
/**/static JLabel sc 								= 	new JLabel("Surcharge");		//Surcharge
/**/
/**/static JLabel calcprice							= 	new JLabel("Calculate Price");
/**/static JLabel printestimate						=	new JLabel("Print Estimate");
	//---------------------------------------JLabels---------------------------------------//
	
	//---------------------------------------JRadioButtons---------------------------------------//
/**/JRadioButton bedroom1_tile 						= 	new JRadioButton("Tile", false);			//Bedroom1 Tile Button
/**/JRadioButton bedroom1_carpet 					= 	new JRadioButton("Carpet", false);			//Bedroom1 Carpet Button
/**/JRadioButton bedroom2_tile 						= 	new JRadioButton("Tile", false);			//Bedroom2 Tile Button
/**/JRadioButton bedroom2_carpet 					= 	new JRadioButton("Carpet", false);			//Bedroom2 Carpet Button
/**/JRadioButton bedroom3_tile 						= 	new JRadioButton("Tile", false);			//Bedroom3 Tile Button
/**/JRadioButton bedroom3_carpet 					= 	new JRadioButton("Carpet", false);			//Bedroom3 Carpet Button
/**/
/**/JRadioButton kitchen_tile 						= 	new JRadioButton("Tile", false);			//Kitchen Tile Button
/**/JRadioButton kitchen_carpet 					= 	new JRadioButton("Carpet", false);			//Kitchen Carpet Button
/**/
/**/JRadioButton diningroom_tile 					= 	new JRadioButton("Tile", false);			//Dining Room Tile Button
/**/JRadioButton diningroom_carpet 					= 	new JRadioButton("Carpet", false);			//Dining Room Carpet Button
/**/
/**/JRadioButton familyroom_tile 					= 	new JRadioButton("Tile", false);			//Family Room Tile Button
/**/JRadioButton familyroom_carpet 					= 	new JRadioButton("Carpet", false);			//Family Room Carpet Button
/**/
/**/JRadioButton livingroom_tile 					= 	new JRadioButton("Tile", false);			//Living Room Tile Button
/**/JRadioButton livingroom_carpet 					= 	new JRadioButton("Carpet", false);			//Living Room Carpet Button
/**/
/**/JRadioButton bathroom1_tile 					= 	new JRadioButton("Tile", false);			//Bathroom1 Tile Button
/**/JRadioButton bathroom1_carpet 					= 	new JRadioButton("Carpet", false);			//Bathroom1 Carpet Button
/**/JRadioButton bathroom2_tile 					= 	new JRadioButton("Tile", false);			//Bathroom2 Tile Button
/**/JRadioButton bathroom2_carpet 					= 	new JRadioButton("Carpet", false);			//Bathroom2 Carpet Button
/**/
/**/JRadioButton thsqft_tile 						= 	new JRadioButton("Tile", false);			//Total Square Foot Tile Button
/**/JRadioButton thsqft_carpet 						= 	new JRadioButton("Carpet", false);			//Total Square Foot Carpet Button
/**/
/**/ButtonGroup bedroom1Group = new ButtonGroup();
/**/boolean bedroom1Tile = false;
/**/ButtonGroup bedroom2Group = new ButtonGroup();
/**/boolean bedroom2Tile = false;
/**/ButtonGroup bedroom3Group = new ButtonGroup();
/**/boolean bedroom3Tile = false;
/**/ButtonGroup kitchenGroup = new ButtonGroup();
/**/boolean kitchenTile = false;
/**/ButtonGroup diningroomGroup = new ButtonGroup();
/**/boolean diningroomTile = false;
/**/ButtonGroup familyroomGroup = new ButtonGroup();
/**/boolean familyroomTile = false;
/**/ButtonGroup livingroomGroup = new ButtonGroup();
/**/boolean livingroomTile = false;
/**/ButtonGroup bathroom1Group = new ButtonGroup();
/**/boolean bathroom1Tile = false;
/**/ButtonGroup bathroom2Group = new ButtonGroup();
/**/boolean bathroom2Tile = false;
/**/ButtonGroup thsqftGroup = new ButtonGroup();
/**/boolean thsqftTile = false;
/**/

	//---------------------------------------JRadioButtons---------------------------------------//
		
	//----------------------------------Image Names----------------------------------//
	public static   String carpetnames[]=
	{
		"carpet1.gif","carpet2.gif","carpet3.gif"
	};
	public static   String paintnames[]=
	{
		"paint.jpg", "paint1.jpg","paint2.jpg","paint3.jpg","paint3.gif"
	};
	public static   String tilenames[]=
	{
		"tile1.gif","tile2.gif","tile3.gif"
	};
	public static   String iconnames[]=
	{
		"1.jpg","2.jpg","Calculator.gif","header.jpg","Printer.gif"
	};
	//----------------------------------Image Names----------------------------------//

	//-------------------------------------Icons-------------------------------------//
	public static Icon HomeReno[]=
	{
		new ImageIcon(carpetnames[0]),					//Index[0]
		new ImageIcon(carpetnames[1]),					//Index[1]
		new ImageIcon(carpetnames[2]),					//Index[2]
		new ImageIcon(paintnames[0]),					//Index[3]
		new ImageIcon(paintnames[1]),					//Index[4]
		new ImageIcon(paintnames[2]),					//Index[5]
		new ImageIcon(paintnames[3]),					//Index[6]
		new ImageIcon(paintnames[4]),					//Index[7]
		new ImageIcon(tilenames[0]),					//Index[8]
		new ImageIcon(tilenames[1]),					//Index[9]
		new ImageIcon(tilenames[2]),					//Index[10]
		new ImageIcon(iconnames[0]),					//Index[11]
		new ImageIcon(iconnames[1]),					//Index[12]
		new ImageIcon(iconnames[2]),					//Index[13]
		new ImageIcon(iconnames[3]),					//Index[14]
		new ImageIcon(iconnames[4]),					//Index[15]	
	};
	//----------------------------------Icons----------------------------------//
	
	public void actionPerformed(ActionEvent e)
	{
		String str = "";
		double carpetMult = 1;
		double tilesMult = 1;
		if(tile_styles.getSelectedIndex() == 0)
			tilesMult = 3.88;
		else if(tile_styles.getSelectedIndex() == 1)
			tilesMult = 3.95;
		else if(tile_styles.getSelectedIndex() == 2)
			tilesMult = 4.04;
		double paintMult = 1;
		if(carpet_styles.getSelectedIndex() == 0)
			carpetMult = 4.92;
		else if(carpet_styles.getSelectedIndex() == 1)
			carpetMult = 6.25;
		else if(carpet_styles.getSelectedIndex() == 2)
			carpetMult = 8.25;
		if(paint_types.getSelectedIndex() == 0)
			paintMult = 19.97/400.0;
		else if(paint_types.getSelectedIndex()== 1)
			paintMult = 26.97/400.0;
		else if(paint_types.getSelectedIndex() == 2)
			paintMult = 34.95/400.0;
		
		double Sub_Total = 0;
		double bedroom1Total = 0;
		if(bedroom1Tile)
		bedroom1Total = (Integer.parseInt(bedroom1_length_field.getText()) * Integer.parseInt(bedroom1_width_field.getText()) * tilesMult);
		else
		bedroom1Total = Integer.parseInt(bedroom1_length_field.getText()) * Integer.parseInt(bedroom1_width_field.getText()) * carpetMult;
		double bedroom1_floor_total;
		double bedroom1_paint_total = paintMult*8*(Integer.parseInt(bedroom1_length_field.getText()) * 2 + Integer.parseInt(bedroom1_width_field.getText()) *2);
		double bedroom1_floorarea = Integer.parseInt(bedroom1_length_field.getText()) * Integer.parseInt(bedroom1_width_field.getText());
		double bedroom1_wallarea = 8*(Integer.parseInt(bedroom1_length_field.getText()) * 2 + Integer.parseInt(bedroom1_width_field.getText()) *2);
		bedroom1_floor_total = bedroom1Total;
		bedroom1Total += bedroom1_paint_total;
		Sub_Total += bedroom1Total;

		double bedroom2Total = 0;
		if(bedroom2Tile)
		bedroom2Total = (Integer.parseInt(bedroom2_length_field.getText()) * Integer.parseInt(bedroom2_width_field.getText()) * tilesMult);
		else
		bedroom2Total = Integer.parseInt(bedroom2_length_field.getText()) * Integer.parseInt(bedroom2_width_field.getText()) * carpetMult;
		double bedroom2_floor_total;
		double bedroom2_paint_total = paintMult*8*(Integer.parseInt(bedroom2_length_field.getText()) * 2 + Integer.parseInt(bedroom2_width_field.getText()) *2);
		double bedroom2_floorarea = Integer.parseInt(bedroom2_length_field.getText()) * Integer.parseInt(bedroom2_width_field.getText());
		double bedroom2_wallarea = 8*(Integer.parseInt(bedroom2_length_field.getText()) * 2 + Integer.parseInt(bedroom2_width_field.getText()) *2);
		bedroom2_floor_total = bedroom2Total;
		bedroom2Total += bedroom2_paint_total;
		Sub_Total += bedroom2Total;
		
		double bedroom3Total = 0;
		if(bedroom3Tile)
		bedroom3Total = (Integer.parseInt(bedroom3_length_field.getText()) * Integer.parseInt(bedroom3_width_field.getText()) * tilesMult);
		else
		bedroom3Total = Integer.parseInt(bedroom3_length_field.getText()) * Integer.parseInt(bedroom3_width_field.getText()) * carpetMult;
		double bedroom3_floor_total;
		double bedroom3_paint_total = paintMult*8*(Integer.parseInt(bedroom3_length_field.getText()) * 2 + Integer.parseInt(bedroom3_width_field.getText()) *2);
		double bedroom3_floorarea = Integer.parseInt(bedroom3_length_field.getText()) * Integer.parseInt(bedroom3_width_field.getText());
		double bedroom3_wallarea = 8*(Integer.parseInt(bedroom3_length_field.getText()) * 2 + Integer.parseInt(bedroom3_width_field.getText()) *2);
		bedroom3_floor_total = bedroom3Total;
		bedroom3Total += bedroom3_paint_total;
		Sub_Total += bedroom3Total;
		
		double kitchenTotal = 0;
		if(kitchenTile)
		kitchenTotal = (Integer.parseInt(kitchen_length_field.getText()) * Integer.parseInt(kitchen_width_field.getText()) * tilesMult);
		else
		kitchenTotal = Integer.parseInt(kitchen_length_field.getText()) * Integer.parseInt(kitchen_width_field.getText()) * carpetMult;
		double kitchen_floor_total;
		double kitchen_paint_total = paintMult*8*(Integer.parseInt(kitchen_length_field.getText()) * 2 + Integer.parseInt(kitchen_width_field.getText()) *2);
		double kitchen_floorarea = Integer.parseInt(kitchen_length_field.getText()) * Integer.parseInt(kitchen_width_field.getText());
		double kitchen_wallarea = 8*(Integer.parseInt(kitchen_length_field.getText()) * 2 + Integer.parseInt(kitchen_width_field.getText()) *2);
		kitchen_floor_total = kitchenTotal;
		kitchenTotal += kitchen_paint_total;
		Sub_Total +=kitchenTotal;
		
		double diningroomTotal = 0;
		if(diningroomTile)
		diningroomTotal = (Integer.parseInt(diningroom_length_field.getText()) * Integer.parseInt(diningroom_width_field.getText()) * tilesMult);
		else
		diningroomTotal = Integer.parseInt(diningroom_length_field.getText()) * Integer.parseInt(diningroom_width_field.getText()) * carpetMult;
		double diningroom_floor_total;
		double diningroom_paint_total = paintMult*8*(Integer.parseInt(diningroom_length_field.getText()) * 2 + Integer.parseInt(diningroom_width_field.getText()) *2);
		double diningroom_floorarea = Integer.parseInt(diningroom_length_field.getText()) * Integer.parseInt(diningroom_width_field.getText());
		double diningroom_wallarea = 8*(Integer.parseInt(diningroom_length_field.getText()) * 2 + Integer.parseInt(diningroom_width_field.getText()) *2);
		diningroom_floor_total = diningroomTotal;
		diningroomTotal += diningroom_paint_total;
		Sub_Total += diningroomTotal;
		
		double familyroomTotal = 0;
		if(familyroomTile)
		familyroomTotal = (Integer.parseInt(familyroom_length_field.getText()) * Integer.parseInt(familyroom_width_field.getText()) * tilesMult);
		else
		familyroomTotal = Integer.parseInt(familyroom_length_field.getText()) * Integer.parseInt(familyroom_width_field.getText()) * carpetMult;
		double familyroom_floor_total;
		double familyroom_paint_total = paintMult*8*(Integer.parseInt(familyroom_length_field.getText()) * 2 + Integer.parseInt(familyroom_width_field.getText()) *2);
		double familyroom_floorarea = Integer.parseInt(familyroom_length_field.getText()) * Integer.parseInt(familyroom_width_field.getText());
		double familyroom_wallarea = 8*(Integer.parseInt(familyroom_length_field.getText()) * 2 + Integer.parseInt(familyroom_width_field.getText()) *2);
		familyroom_floor_total = familyroomTotal;
		familyroomTotal += familyroom_paint_total;
		Sub_Total += familyroomTotal;
		
		double livingroomTotal = 0;
		if(livingroomTile)
		livingroomTotal = (Integer.parseInt(livingroom_length_field.getText()) * Integer.parseInt(livingroom_width_field.getText()) * tilesMult);
		else
		livingroomTotal = Integer.parseInt(livingroom_length_field.getText()) * Integer.parseInt(livingroom_width_field.getText()) * carpetMult;
		double livingroom_floor_total;
		double livingroom_paint_total = paintMult*8*(Integer.parseInt(livingroom_length_field.getText()) * 2 + Integer.parseInt(livingroom_width_field.getText()) *2);
		double livingroom_floorarea = Integer.parseInt(livingroom_length_field.getText()) * Integer.parseInt(livingroom_width_field.getText());
		double livingroom_wallarea = 8*(Integer.parseInt(livingroom_length_field.getText()) * 2 + Integer.parseInt(livingroom_width_field.getText()) *2);
		livingroom_floor_total = livingroomTotal;
		livingroomTotal += livingroom_paint_total;
		Sub_Total += livingroomTotal;
		
		double bathroom1Total = 0;
		if(bathroom1Tile)
		bathroom1Total = (Integer.parseInt(bathroom1_length_field.getText()) * Integer.parseInt(bathroom1_width_field.getText()) * tilesMult);
		else
		bathroom1Total = Integer.parseInt(bathroom1_length_field.getText()) * Integer.parseInt(bathroom1_width_field.getText()) * carpetMult;
		double bathroom1_floorarea = Integer.parseInt(bathroom1_length_field.getText()) * Integer.parseInt(bathroom1_width_field.getText());
		double bathroom1_wallarea = 8*(Integer.parseInt(bathroom1_length_field.getText()) * 2 + Integer.parseInt(bathroom1_width_field.getText()) *2);
		double bathroom1_floor_total;
		double bathroom1_paint_total = paintMult*8*(Integer.parseInt(bathroom1_length_field.getText()) * 2 + Integer.parseInt(bathroom1_width_field.getText()) *2);
		bathroom1_floor_total = bathroom1Total;
		bathroom1Total += bathroom1_paint_total;
		Sub_Total += bathroom1Total;
		
		double bathroom2Total = 0;
		if(bathroom2Tile)
		bathroom2Total = (Integer.parseInt(bathroom2_length_field.getText()) * Integer.parseInt(bathroom2_width_field.getText()) * tilesMult);
		else
		bathroom2Total = Integer.parseInt(bathroom2_length_field.getText()) * Integer.parseInt(bathroom2_width_field.getText()) * carpetMult;
		double bathroom2_floor_total;
		double bathroom2_paint_total = paintMult*8*(Integer.parseInt(bathroom2_length_field.getText()) * 2 + Integer.parseInt(bathroom2_width_field.getText()) *2);
		double bathroom2_floorarea = Integer.parseInt(bathroom2_length_field.getText()) * Integer.parseInt(bathroom2_width_field.getText());
		double bathroom2_wallarea = 8*(Integer.parseInt(bathroom2_length_field.getText()) * 2 + Integer.parseInt(bathroom2_width_field.getText()) *2);
		bathroom2_floor_total = bathroom2Total;
		bathroom2Total += bathroom2_paint_total;
		Sub_Total += bathroom2Total;
		
		double thsqftTotal = 0;
		if(thsqftTile)
		thsqftTotal = (Integer.parseInt(thsqft_field.getText())* tilesMult);
		else
		thsqftTotal = Integer.parseInt(thsqft_field.getText())* carpetMult;
		Sub_Total +=thsqftTotal;
		
		double tax = Sub_Total * .06;
		double surcharge = .1*(bedroom1_floor_total + bedroom2_floor_total + bedroom3_floor_total + kitchen_floor_total + diningroom_floor_total + livingroom_floor_total + familyroom_floor_total + bathroom1_floor_total + bathroom2_floor_total + thsqftTotal + Integer.parseInt(nlh_field.getText()) * 25);
		double grand_total = tax + Sub_Total + surcharge;
		
		str += "Bedroom1\nFloor Area: " + bedroom1_floorarea + "\nWall Area: " + bedroom1_wallarea  + "\nPaint Cost: " + bedroom1_paint_total + "\nFlooring Cost: " + bedroom1_floor_total + "\nTotal Cost: " + bedroom1Total + "\n\n";
		str += "Bedroom2\nFloor Area: " + bedroom2_floorarea + "\nWall Area: " + bedroom2_wallarea  + "\nPaint Cost: " + bedroom2_paint_total + "\nFlooring Cost: " + bedroom2_floor_total + "\nTotal Cost: " + bedroom2Total + "\n\n";
		str += "Bedroom3\nFloor Area: " + bedroom3_floorarea + "\nWall Area: " + bedroom3_wallarea  + "\nPaint Cost: " + bedroom3_paint_total + "\nFlooring Cost: " + bedroom3_floor_total + "\nTotal Cost: " + bedroom3Total + "\n\n";
		str += "Kitchen\nFloor Area: " + kitchen_floorarea + "\nWall Area: " + kitchen_wallarea  + "\nPaint Cost: " + kitchen_paint_total + "\nFlooring Cost: " + kitchen_floor_total + "\nTotal Cost: " + kitchenTotal + "\n\n";
		str += "Dining Room\nFloor Area: " + diningroom_floorarea + "\nWall Area: " + diningroom_wallarea  + "\nPaint Cost: " + diningroom_paint_total + "\nFlooring Cost: " + diningroom_floor_total + "\nTotal Cost: " + diningroomTotal + "\n\n";
		str += "Family Room\nFloor Area: " + familyroom_floorarea + "\nWall Area: " + familyroom_wallarea  + "\nPaint Cost: " + familyroom_paint_total + "\nFlooring Cost: " + familyroom_floor_total + "\nTotal Cost: " + familyroomTotal + "\n\n";
		str += "Living Room\nFloor Area: " + livingroom_floorarea + "\nWall Area: " + livingroom_wallarea  + "\nPaint Cost: " + livingroom_paint_total + "\nFlooring Cost: " + livingroom_floor_total + "\nTotal Cost: " + livingroomTotal + "\n\n";
		str += "Bathroom1\nFloor Area: " + bathroom1_floorarea + "\nWall Area: " + bathroom1_wallarea  + "\nPaint Cost: " + bathroom1_paint_total + "\nFlooring Cost: " + bathroom1_floor_total + "\nTotal Cost: " + bathroom1Total + "\n\n";
		str += "Bathroom2\nFloor Area: " + bathroom2_floorarea + "\nWall Area: " + bathroom2_wallarea  + "\nPaint Cost: " + bathroom2_paint_total + "\nFlooring Cost: " + bathroom2_floor_total + "\nTotal Cost: " + bathroom2Total + "\n\n";
		str += "Labor price: " + Integer.parseInt(nlh_field.getText()) * 25 + "\n\n";
		str += "Subtotal: " + ((int)(Sub_Total*100))/100.0 + "\n";
		str += "Tax: " + tax + "\n";
		str += "Surcharge: " + surcharge + "\n";
		str += "Grand Total: " + grand_total;

		display.setText(str);
		outputTextsub_field.setText(""+((int)(Sub_Total*100))/100.0);
		outputTexttax_field.setText("" + tax);
		outputTextGT_field.setText("" + grand_total);
		outputTextSC_field.setText("" + surcharge);	
	}
	
	
	
	
	@SuppressWarnings({ "deprecation", "serial" })
	public Depot() //Begin constructor
	{		
			JPanel panel = new JPanel(new FlowLayout())
			{
				public void paint(Graphics g) 
				{
				
					labelSlot1.setLocation(0, 0);							//"Home Renovation Estimate" Banner
					calculatorslot.setLocation(550, 420);
					printerslot.setLocation(750, 420);
					
					paint_types.setLocation(355, 320);
					tile_styles.setLocation(355, 420);
					carpet_styles.setLocation(355, 520);
					
					thsqft.setLocation(370, 110);							//"Total Home Square Footage"
					thsqft_field.setLocation(300, 130);						//"Total Home Square Footage" JTextField
					thsqft_tile.setLocation(300, 150);
					thsqft_carpet.setLocation(300, 170);
					nlh.setLocation(370, 210);
					nlh_field.setLocation(300, 230);
					
					butt.setLocation(515,350);
					butt.setSize(200,250);
					butt.setIcon(HomeReno[13]);
					butt.setText("Calculate Price");
					
					butt2.setLocation(720, 350);
					butt2.setSize(200,250);
					butt2.setIcon(HomeReno[15]);
					butt2.setText("Print Estimate");
				
					calcprice.setLocation(625, 445);
					printestimate.setLocation(825, 445);
					
					pt.setLocation(390, 260);
					paintslot.setLocation(390, 280);
				
					ts.setLocation(390, 360);
					tileslot.setLocation(390, 380);
				
					cs.setLocation(390, 460);
					carpetslot.setLocation(390, 480);
									
					sub.setLocation(66, 600);
					outputTextsub_field.setLocation(6, 620);
					tax.setLocation(310, 600);
					outputTexttax_field.setLocation(240, 620);
					gt.setLocation(550, 600);
					outputTextGT_field.setLocation(500, 620);
					sc.setLocation(800, 600);
					outputTextSC_field.setLocation(750, 620);
				
					//------------------------------Column 1------------------------------//
					bedroom1.setLocation(10, 110);
					bedroom1_length.setLocation(19,135);
					bedroom1_length_field.setLocation(10, 155);
					bedroom1_width.setLocation(23, 175);
					bedroom1_width_field.setLocation(10, 195);
					bedroom1_tile.setLocation(10, 215);
					bedroom1_carpet.setLocation(10, 235);
				
					kitchen.setLocation(115, 110);
					kitchen_length.setLocation(116, 135);
					kitchen_length_field.setLocation(107, 155);
					kitchen_width.setLocation(120, 175);
					kitchen_width_field.setLocation(107, 195);
					kitchen_tile.setLocation(107, 215);
					kitchen_carpet.setLocation(107, 235);
				
					livingroom.setLocation(210, 110);
					livingroom_length.setLocation(219, 135);
					livingroom_length_field.setLocation(210, 155);
					livingroom_width.setLocation(223, 175);
					livingroom_width_field.setLocation(210, 195);
					livingroom_tile.setLocation(210, 215);
					livingroom_carpet.setLocation(210, 235);
					//------------------------------Column 1------------------------------//
				
					//------------------------------Column 2------------------------------//
					bedroom2.setLocation(10, 270);
					bedroom2_length.setLocation(19, 295);
					bedroom2_length_field.setLocation(10, 315);
					bedroom2_width.setLocation(21, 335);
					bedroom2_width_field.setLocation(10, 355);
					bedroom2_tile.setLocation(10, 375);
					bedroom2_carpet.setLocation(10, 395);
				
					diningroom.setLocation(100, 270);
					diningroom_length.setLocation(115, 295);
					diningroom_length_field.setLocation(106, 315);
					diningroom_width.setLocation(117, 335);
					diningroom_width_field.setLocation(106, 355);
					diningroom_tile.setLocation(106, 375);
					diningroom_carpet.setLocation(106, 395);
				
					bathroom1.setLocation(205, 270);
					bathroom1_length.setLocation(217, 295);
					bathroom1_length_field.setLocation(208, 315);
					bathroom1_width.setLocation(220, 335);
					bathroom1_width_field.setLocation(208, 355);
					bathroom1_tile.setLocation(208, 375);
					bathroom1_carpet.setLocation(208, 395);
					//------------------------------Column 2------------------------------//
				
					//------------------------------Column 3------------------------------//
					bedroom3.setLocation(10, 430);
					bedroom3_length.setLocation(19, 455);
					bedroom3_length_field.setLocation(10, 475);
					bedroom3_width.setLocation(21, 495);
					bedroom3_width_field.setLocation(10, 515);
					bedroom3_tile.setLocation(10, 535);
					bedroom3_carpet.setLocation(10, 555);
				
					familyroom.setLocation(100, 430);
					familyroom_length.setLocation(115, 455);
					familyroom_length_field.setLocation(106, 475);
					familyroom_width.setLocation(119, 495);
					familyroom_width_field.setLocation(106, 515);
					familyroom_tile.setLocation(106, 535);
					familyroom_carpet.setLocation(106, 555);
				
					bathroom2.setLocation(205, 430);
					bathroom2_length.setLocation(217, 455);
					bathroom2_length_field.setLocation(208, 475);
					bathroom2_width.setLocation(222, 495);
					bathroom2_width_field.setLocation(208, 515);
					bathroom2_tile.setLocation(208, 535);
					bathroom2_carpet.setLocation(208, 555);
					//------------------------------Column 3------------------------------//
				
					scroll.setLocation(600,105);
					scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
					scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
					scroll.setForeground(Color.PINK);
				
					super.paint(g);
				}
			};
		
			JFrame frame					= new JFrame();
			
			labelSlot1			= new JLabel(HomeReno[11]);
			paintslot			= new JLabel(HomeReno[7]);
			tileslot			= new JLabel(HomeReno[8]);
			carpetslot			= new JLabel(HomeReno[0]);
			calculatorslot		= new JLabel(HomeReno[13]);
			printerslot			= new JLabel(HomeReno[15]);
			
			panel.setOpaque(false);
			display.setEditable(false);
			
			panel.add(labelSlot1);
			panel.add(scroll);
			panel.add(butt);
			butt.setBackground(Color.LIGHT_GRAY);
			butt.addActionListener(this);
			panel.add(butt2);
			butt2.setBackground(Color.LIGHT_GRAY);
			butt2.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							JLabel pic = new JLabel(HomeReno[14]);
							pic.setLocation(400, 400);
							pic.setSize(600, 100);
							
							PrintEstimate_Window.getContentPane().add(pic);
							PrintEstimate_Window.setSize(600, 600);
							PrintEstimate_Window.show();
							PrintEstimate_Window.setVisible(true);		
						}
					}
					);
			
			bedroom1Group.add(bedroom1_tile);
			bedroom1Group.add(bedroom1_carpet);
			bedroom2Group.add(bedroom2_tile);
			bedroom2Group.add(bedroom2_carpet);
			bedroom3Group.add(bedroom3_tile);
			bedroom3Group.add(bedroom3_carpet);
			
			kitchenGroup.add(kitchen_tile);
			kitchenGroup.add(kitchen_carpet);
			
			diningroomGroup.add(diningroom_tile);
			diningroomGroup.add(diningroom_carpet);
			
			familyroomGroup.add(familyroom_tile);
			familyroomGroup.add(familyroom_carpet);
			
			livingroomGroup.add(livingroom_tile);
			livingroomGroup.add(livingroom_carpet);
			
			bathroom1Group.add(bathroom1_tile);
			bathroom1Group.add(bathroom1_carpet);
			bathroom2Group.add(bathroom2_tile);
			bathroom2Group.add(bathroom2_carpet);
			
			thsqftGroup.add(thsqft_tile);
			thsqftGroup.add(thsqft_carpet);			

			panel.add(paint_types);
			panel.add(tile_styles);
			panel.add(carpet_styles);
		
			panel.add(thsqft);
			panel.add(thsqft_field);
			
			panel.add(thsqft_tile);
			thsqft_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							thsqftTile =  true;
						}
					}
					
					);
			panel.add(thsqft_carpet);
			thsqft_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							thsqftTile =  false;
						}
					}
					
					);
			panel.add(nlh);
			panel.add(nlh_field);
			
			panel.add(calcprice);
			panel.add(printestimate);
		
			panel.add(pt);
			panel.add(paintslot);
		
			panel.add(ts);
			panel.add(tileslot);
		
			panel.add(cs);
			panel.add(carpetslot);
		
			panel.add(sub);													//"Sub Total"
			panel.add(outputTextsub_field);									//"Sub Total" JTextField
			panel.add(tax);													//"Tax"
			panel.add(outputTexttax_field);									//"Tax" JTextField
			panel.add(gt);													//"Grand Total"
			panel.add(outputTextGT_field);									//"Grand Total" JTextField
			panel.add(sc);													//"Surcharge"
			panel.add(outputTextSC_field);									//"Surcharge" JTextField
		
			//------------------------------Column 1 Buttons------------------------------//
			panel.add(bedroom1_tile);
			bedroom1_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bedroom1Tile =  true;
						}
					}
					
					);
			panel.add(bedroom1_carpet);
			bedroom1_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bedroom1Tile =  false;
						}
					}
					
					);
			panel.add(kitchen_tile);
			kitchen_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							kitchenTile =  true;
						}
					}
					
					);
			panel.add(kitchen_carpet);
			kitchen_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							kitchenTile =  false;
						}
					}
					
					);
			panel.add(livingroom_tile);
			livingroom_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							livingroomTile =  true;
						}
					}
					
					);
			panel.add(livingroom_carpet);
			livingroom_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							livingroomTile = false;
						}
					}
					
					);
			//------------------------------Column 1 Buttons------------------------------//
		
			//------------------------------Column 2 Buttons------------------------------//
			panel.add(bedroom2_tile);
			bedroom2_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bedroom2Tile =  true;
						}
					}
					
					);
			panel.add(bedroom2_carpet);
			bedroom2_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bedroom2Tile =  false;
						}
					}
					
					);
			panel.add(diningroom_tile);
			diningroom_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							diningroomTile =  true;
						}
					}
					
					);
			panel.add(diningroom_carpet);
			diningroom_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							diningroomTile =  false;
						}
					}
					
					);
			panel.add(bathroom1_tile);
			bathroom1_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bathroom1Tile =  true;
						}
					}
					
					);
			panel.add(bathroom1_carpet);
			bathroom1_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bathroom1Tile =  false;
						}
					}
					
					);
			//------------------------------Column 2 Buttons------------------------------//
		
			//------------------------------Column 3 Buttons------------------------------//
			panel.add(bedroom3_tile);
			bedroom3_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bedroom3Tile =  true;
						}
					}
					
					);
			panel.add(bedroom3_carpet);
			bedroom3_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bedroom3Tile =  false;
						}
					}
					
					);
			panel.add(familyroom_tile);
			familyroom_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							familyroomTile =  true;
						}
					}
					
					);
			panel.add(familyroom_carpet);
			familyroom_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							familyroomTile = false;
						}
					}
					
					);
			panel.add(bathroom2_tile);
			bathroom2_tile.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bathroom2Tile =  true;
						}
					}
					
					);
			panel.add(bathroom2_carpet);
			bathroom2_carpet.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							bathroom2Tile = false;
						}
					}
					
					);
			//------------------------------Column 3 Buttons------------------------------//
			
			//------------------------------Column 1 Labels & Fields------------------------------//
			panel.add(bedroom1);
			panel.add(bedroom1_length);
			panel.add(bedroom1_length_field);
			panel.add(bedroom1_width);
			panel.add(bedroom1_width_field);
		
			panel.add(kitchen);
			panel.add(kitchen_length);
			panel.add(kitchen_length_field);
			panel.add(kitchen_width);
			panel.add(kitchen_width_field);
		
			panel.add(livingroom);
			panel.add(livingroom_length);
			panel.add(livingroom_length_field);
			panel.add(livingroom_width);
			panel.add(livingroom_width_field);
			//------------------------------Column 1 Labels & Fields------------------------------//
			
			//------------------------------Column 2 Labels & Fields------------------------------//
			panel.add(bedroom2);
			panel.add(bedroom2_length);
			panel.add(bedroom2_length_field);
			panel.add(bedroom2_width);
			panel.add(bedroom2_width_field);
		
			panel.add(diningroom);
			panel.add(diningroom_length);
			panel.add(diningroom_length_field);
			panel.add(diningroom_width);
			panel.add(diningroom_width_field);
		
			panel.add(bathroom1);
			panel.add(bathroom1_length);
			panel.add(bathroom1_length_field);
			panel.add(bathroom1_width);
			panel.add(bathroom1_width_field);
			//------------------------------Column 2 Labels & Fields------------------------------//
			
			//------------------------------Column 3 Labels & Fields------------------------------//
			panel.add(bedroom3);
			panel.add(bedroom3_length);
			panel.add(bedroom3_length_field);
			panel.add(bedroom3_width);
			panel.add(bedroom3_width_field);
			
			panel.add(familyroom);
			panel.add(familyroom_length);
			panel.add(familyroom_length_field);
			panel.add(familyroom_width);
			panel.add(familyroom_width_field);
		
			panel.add(bathroom2);
			panel.add(bathroom2_length);
			panel.add(bathroom2_length_field);
			panel.add(bathroom2_width);
			panel.add(bathroom2_width_field);
			//------------------------------Column 3 Labels & Fields------------------------------//
						
			frame.pack();
			frame.setSize(950, 700);
			frame.setVisible(true);
			frame.getContentPane().add(panel);
			frame.setBackground(Color.red);
			panel.show();
			
	}// end constructor
}// end class
