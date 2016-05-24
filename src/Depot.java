import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
import java.awt.Scrollbar;
import javax.swing.*;

//class file works with out main

public class Depot
	{ 
	static JLabel labelSlot1;
	static JLabel Livingroom1 = new JLabel("Livingroom 1");
	
	/////////////////////////////////////// JTextFields ///////////////////////////////////////
/**/static JTextField outputTextsub_field			=	new JTextField(15);
/**/static JTextField outputTexttax_field			=	new JTextField(15);
/**/static JTextField outputTextGT_field			=	new JTextField(15);				//Grand total
/**/static JTextField outputTextSC_field			=	new JTextField(15);
/**/
/**/static JTextField bedroom1_length_field			= 	new JTextField(5);				//Bedroom1 Length Text Field
/**/static JTextField bedroom1_width_field 			= 	new JTextField(5);				//Bedroom1 Width Text Field
/**/static JTextField bedroom2_length_field			=	new JTextField(5);				//Bedroom2 Length Text Field
/**/static JTextField bedroom2_width_field			=	new JTextField(5);				//Bedroom2 Width Text Field
/**/static JTextField bedroom3_length_field			=	new JTextField(5);				//Bedroom3 Length Text Field
/**/static JTextField bedroom3_width_field			=	new JTextField(5);				//Bedroom3 Width Text Field

/**/static JTextField kitchen_length_field 			= 	new JTextField(5);				//Kitchen Length Text Field  
/**/static JTextField kitchen_width_field 			= 	new JTextField(5);				//Kitchen Width Text Field

/**/static JTextField diningroom_length_field		=	new JTextField(5);				//Dining Room Length Text Field
/**/static JTextField diningroom_width_field		=	new JTextField(5);				//Dining Room Width Text Field

/**/static JTextField familyroom_length_field		=	new JTextField(5);				//Family Room Length Text Field
/**/static JTextField familyroom_width_field 		=	new JTextField(5);				//Family Room Width Text Field

/**/static JTextField livingroom_length_field 		= 	new JTextField(5);				//Living Room Length Text Field
/**/static JTextField livingroom_width_field 		= 	new JTextField(5);				//Living Room Width Text Field

/**/static JTextField bathroom1_length_field		=	new JTextField(5);				//Bathroom1 Length Text Field
/**/static JTextField bathroom1_width_field			=	new JTextField(5);				//Bathroom1 Width Text Field
/**/static JTextField bathroom2_length_field			=	new JTextField(5);			//Bathroom2 Length Text Field
/**/static JTextField bathroom2_width_field			=	new JTextField(5);				//Bathroom2 Width Text Field

/**/static JTextField thsqft_field					= 	new JTextField(25);
/////////////////////////////////////// JTextFields ///////////////////////////////////////
	
///////////////////////////////////////// JLabels /////////////////////////////////////////
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
/**/static JLabel bedroom3_width 						= 	new JLabel("Width");			//Bedroom3 Width
/**/
/**/static JLabel kitchen 							= 	new JLabel("Kitchen");
/**/static JLabel kitchen_length 					= 	new JLabel("Length");			//Kitchen Length
/**/static JLabel kitchen_width 					= 	new JLabel("Width");			//Kitchen Width
/**/
/**/static JLabel diningroom 						= 	new JLabel("Dining Room");
/**/static JLabel diningroom_length 				= 	new JLabel("Length");			//Dining Room Length
/**/static JLabel diningroom_width 					= 	new JLabel("Width");			//Dining Room Width
/**/
/**/static JLabel familyroom	 					= 	new JLabel("Family Room");
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
/**/
/**/static JLabel nlh 								= 	new JLabel("Number of Labor Hours");
/**/static JLabel pt 								= 	new JLabel("Paint Type");
/**/static JLabel ts 								= 	new JLabel("Tile Style");
/**/static JLabel cs 								= 	new JLabel("Carpet Style");
/**/
/**/static JLabel sub 								= 	new JLabel("Subtotal");			//Sub-total
/**/static JLabel tax 								= 	new JLabel("Tax");				//Tax
/**/static JLabel gt 								= 	new JLabel("Grand Total");		//Grant Total
/**/static JLabel sc 								= 	new JLabel("Surcharge");		//Surcharge
///////////////////////////////////////// JLabels /////////////////////////////////////////
	
///////////////////////////////////////// JRadioButtons ////////////////////////////////////////
/**/JRadioButton bedroom1_tile 							= 	new JRadioButton("Tile");			//Bedroom1 Tile Button
/**/JRadioButton bedroom1_carpet 						= 	new JRadioButton("Carpet");			//Bedroom1 Carpet Button
/**/JRadioButton bedroom2_tile 							= 	new JRadioButton("Tile");			//Bedroom2 Tile Button
/**/JRadioButton bedroom2_carpet 						= 	new JRadioButton("Carpet");			//Bedroom2 Carpet Button
/**/JRadioButton bedroom3_tile 							= 	new JRadioButton("Tile");			//Bedroom3 Tile Button
/**/JRadioButton bedroom3_carpet 						= 	new JRadioButton("Carpet");			//Bedroom3 Carpet Button

/**/JRadioButton kitchen_tile 							= 	new JRadioButton("Tile");			//Kitchen Tile Button
/**/JRadioButton kitchen_carpet 						= 	new JRadioButton("Carpet");			//Kitchen Carpet Button

/**/JRadioButton diningroom_tile 						= 	new JRadioButton("Tile");			//Dining Room Tile Button
/**/JRadioButton diningroom_carpet 						= 	new JRadioButton("Carpet");			//Dining Room Carpet Button

/**/JRadioButton familyroom_tile 						= 	new JRadioButton("Tile");			//Family Room Tile Button
/**/JRadioButton familyroom_carpet 						= 	new JRadioButton("Carpet");			//Family Room Carpet Button

/**/JRadioButton livingroom_tile 						= 	new JRadioButton("Tile");			//Living Room Tile Button
/**/JRadioButton livingroom_carpet 						= 	new JRadioButton("Carpet");			//Living Room Carpet Button

/**/JRadioButton bathroom1_tile 						= 	new JRadioButton("Tile");			//Bathroom1 Tile Button
/**/JRadioButton bathroom1_carpet 						= 	new JRadioButton("Carpet");			//Bathroom1 Carpet Button
/**/JRadioButton bathroom2_tile 						= 	new JRadioButton("Tile");			//Bathroom2 Tile Button
/**/JRadioButton bathroom2_carpet 						= 	new JRadioButton("Carpet");			//Bathroom2 Carpet Button

/**/JRadioButton tsqfttile 								= 	new JRadioButton("Tile");			//Total Square Foot Tile Button
/**/JRadioButton tsqftcarpet 							= 	new JRadioButton("Carpet");			//Total Square Foot Carpet Button

/**/ButtonGroup radioGroup;	
///////////////////////////////////////// JRadioButtons ////////////////////////////////////////
		
	static  Container c;

	//----------------------------------Image Names----------------------------------//
	public static   String carpetnames[]=
		{
		"carpet1.gif","carpet2.gif","carpet3.gif"
		};
	public static   String paintnames[]=
		{
		"paint.jpg", "paint1.jpg","paint2.jpg","paint3.jpg"
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

	//----------------------------------Icons----------------------------------//
	public static Icon HomeReno[]=
		{
			new ImageIcon(carpetnames[0]),
			new ImageIcon(carpetnames[1]),
			new ImageIcon(carpetnames[2]),
			new ImageIcon(paintnames[0]),
			new ImageIcon(paintnames[1]),
			new ImageIcon(paintnames[2]),
			new ImageIcon(paintnames[3]),
			new ImageIcon(tilenames[0]),
			new ImageIcon(tilenames[1]),
			new ImageIcon(tilenames[2]),
			new ImageIcon(iconnames[0]),
			new ImageIcon(iconnames[1]),
			new ImageIcon(iconnames[2]),
			new ImageIcon(iconnames[3]),
			new ImageIcon(iconnames[4])
			
		};
	//----------------------------------Icons----------------------------------//
	
	public Depot() //Begin constructor
		{

		//c  =getContentPane();
		//c.setLayout( new FlowLayout());
		final JRadioButton round = new JRadioButton("",true);
		
	
	JPanel panel = new JPanel(new FlowLayout())
		{

			public void paint(Graphics g) 
			{
				round.setLocation(50, 650);
				
				labelSlot1.setLocation(0, 0);							//"Home Renovation Estimate" Banner
				
				thsqft.setLocation(380, 110);							//"Total Home Square Footage"
				thsqft_field.setLocation(340, 130);						//"Total Home Square Footage" JTextField
				
				sub.setLocation(66, 600);
				outputTextsub_field.setLocation(6, 620);
				tax.setLocation(310, 600);
				outputTexttax_field.setLocation(240, 620);
				gt.setLocation(550, 600);
				outputTextGT_field.setLocation(500, 620);
				sc.setLocation(800, 600);
				outputTextSC_field.setLocation(750, 620);
				
				//Column 1
				bedroom1.setLocation(10, 110);
				bedroom1_length.setLocation(19,135);
				bedroom1_length_field.setLocation(10, 155);
				bedroom1_width.setLocation(23, 175);
				bedroom1_width_field.setLocation(10, 195);
				
				kitchen.setLocation(115, 110);
				kitchen_length.setLocation(116, 135);
				kitchen_length_field.setLocation(107, 155);
				kitchen_width.setLocation(120, 175);
				kitchen_width_field.setLocation(107, 195);
				
				livingroom.setLocation(210, 110);
				livingroom_length.setLocation(219, 135);
				livingroom_length_field.setLocation(210, 155);
				livingroom_width.setLocation(223, 175);
				livingroom_width_field.setLocation(210, 195);
				
				//Column 2
				bedroom2.setLocation(10, 340);
				bedroom2_length.setLocation(19, 365);
				bedroom2_length_field.setLocation(10, 385);
				bedroom2_width.setLocation(21, 405);
				bedroom2_width_field.setLocation(10, 425);
				
				diningroom.setLocation(100, 340);
				diningroom_length.setLocation(115, 365);
				diningroom_length_field.setLocation(106, 385);
				diningroom_width.setLocation(117, 405);
				diningroom_width_field.setLocation(106, 425);
				
				bathroom1.setLocation(205, 340);
				bathroom1_length.setLocation(217, 365);
				bathroom1_length_field.setLocation(208, 385);
				bathroom1_width.setLocation(220, 405);
				bathroom1_width_field.setLocation(208, 425);
				
				//Column 3
				bedroom3.setLocation(10, 490);
				bedroom3_length.setLocation(19, 515);
				bedroom3_length_field.setLocation(10, 535);
				bedroom3_width.setLocation(21, 555);
				bedroom3_width_field.setLocation(10, 575);
				
				familyroom.setLocation(100, 490);
				familyroom_length.setLocation(115, 515);
				familyroom_length_field.setLocation(106, 535);
				familyroom_width.setLocation(119, 555);
				familyroom_width_field.setLocation(106, 575);
				
				bathroom2.setLocation(205, 490);
				bathroom2_length.setLocation(217, 515);
				bathroom2_length_field.setLocation(208, 535);
				bathroom2_width.setLocation(222, 555);
				bathroom2_width_field.setLocation(208, 575);
				
				super.paint(g);
			}
		};
		
		JFrame frame = new JFrame( );
		
		

		JTextField text = new JTextField(20);
		JTextField text1 = new JTextField(20);
		
		labelSlot1 = new JLabel(HomeReno[10]);
		
		panel.setOpaque(false);
		text.setOpaque(false);
		text1.setOpaque(false);
		

		//panel.add(round);
		
		panel.add(thsqft);
		panel.add(thsqft_field);
		
		panel.add(sub);													//"Sub Total"
		panel.add(outputTextsub_field);									//"Sub Total" JTextField
		panel.add(tax);													//"Tax"
		panel.add(outputTexttax_field);									//"Tax" JTextField
		panel.add(gt);													//"Grand Total"
		panel.add(outputTextGT_field);									//"Grand Total" JTextField
		panel.add(sc);													//"Surcharge"
		panel.add(outputTextSC_field);									//"Surcharge" JTextField
		
		panel.add(labelSlot1);
		
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
		
		//c.add(panel);
		frame.pack();
		frame.setSize(950, 700);
		frame.setVisible(true );
		frame.getContentPane().add(panel);
		frame.setBackground(Color.red);
		panel.show();
		}// end constructor
	}// end class	
//}






