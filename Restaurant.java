import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class Restaurant extends JFrame {
	
	JLabel Customer,Name,Contact,Food,Drinks,Desserts,Type, label,image,imahe,Border;
	JTextField tcustomer,tcontact,tname;
	JComboBox c1,c2,c3;
	JRadioButton b1,b2;
	JTextArea area1;
	JButton reset,print,receipt;
	
	
	
    Restaurant() {
    	
    	ImageIcon icon = new ImageIcon("11012021banner800x414-removebg-preview.png");
    	ImageIcon icon2 = new ImageIcon("Untitled_design-removebg-preview (1).png");
    	ImageIcon icon3 = new ImageIcon("Untitled_design-removebg-preview (1).png");
    	
    	imahe = new JLabel();
    	imahe.setIcon(icon3);
    	imahe.setBounds(-410,505,100,100);
    	imahe.setSize(700,120);
    	
    	image = new JLabel();
    	image.setIcon(icon2);
    	image.setBounds(100,500,100,100);
    	image.setSize(700,120);
    	
    	label = new JLabel();
    	label.setIcon(icon);
    	label.setBounds(1,20,650,120);
    	
    	
    	Customer = new JLabel("Customer No: ");
		Customer.setBounds(20, 130, 120, 30);
		Customer.setForeground(new Color(20 ,51,160));
		Customer.setFont(new Font("MV Boli", Font.BOLD,15));
		
		
		Name = new JLabel("Name: ");
		Name.setBounds(20, 180, 120, 30);
		Name.setForeground(new Color(20 ,51,160));
		Name.setFont(new Font("MV Boli", Font.BOLD,15));
		
		Contact = new JLabel("Contact No: ");
		Contact.setBounds(20, 230, 120, 30);
		Contact.setForeground(new Color(20 ,51,160));
		Contact.setFont(new Font("MV Boli", Font.BOLD,15));
		
		Food = new JLabel("Foods: ");
		Food.setBounds(20, 280, 120, 30);
		Food.setForeground(new Color(20 ,51,160));
		Food.setFont(new Font("MV Boli", Font.BOLD,15));
		
		Drinks = new JLabel("Drinks: ");
		Drinks.setBounds(20, 330, 120, 30);
		Drinks.setForeground(new Color(20 ,51,160));
		Drinks.setFont(new Font("MV Boli", Font.BOLD,15));
		
		
		Desserts = new JLabel("Desserts: ");
		Desserts.setBounds(20, 380, 120, 30);
		Desserts.setForeground(new Color(20 ,51,160));
		Desserts.setFont(new Font("MV Boli", Font.BOLD,15));
		
		Type = new JLabel("Mode of payment: ");
		Type.setBounds(20, 450, 120, 30);
		Type.setForeground(new Color(20 ,51,160));
		Type.setFont(new Font("Calibri", Font.BOLD,15));
		
		
		
		tcustomer = new JTextField ();
		tcustomer.setBounds(150, 130, 200, 30);
		
		tcontact = new JTextField ();
		tcontact.setBounds(150, 180, 200, 30);
		
		tname = new JTextField ();
		tname.setBounds(150, 230, 200, 30);
		
		
		String Puds [] = {"Pizza", "Chicken", "Burger","Fries", "Steak"};
		c1 = new JComboBox(Puds);
		c1.setBounds(150, 280, 120, 30);
		c1.setSize(200,30);
		
		String Inom [] = {"Coke", "Sprite", "Water", "Pineapple Juice", "Nestea"};
		c2 = new JComboBox(Inom);
		c2.setBounds(150, 330, 120, 30);
		c2.setSize(200,30);
		
		String Serts [] = {"Cake", "Salad", "Muffins", "Cheesecakes", "Candies"};
		c3 = new JComboBox(Serts);
		c3.setBounds(150, 380, 120, 30);
		c3.setSize(200,30);
		
		
		b1 = new JRadioButton("GCASH");
		b2 = new JRadioButton("Cash");
		b1.setOpaque(false);
		b2.setOpaque(false);
		b1.setBounds(200, 450, 120, 30);
		b2.setBounds(300, 450, 100, 30);
		
		
		
	
		
		area1 = new JTextArea();
		area1.setBounds(400, 180, 80, 40);
		area1.setSize(260, 290);
		
		reset = new JButton("Reset");
		reset.setBounds(400, 130, 80, 40);
		reset.setForeground(new Color(20 ,51,160));
		
		
		print = new JButton("Print");
		print.setBounds(490, 130, 80, 40);
		print.setForeground(new Color(20 ,51,160));
		
		receipt = new JButton("Receipt");
		receipt.setBounds(580, 130, 80, 40);
		receipt.setForeground(new Color(20 ,51,160));
		
		
		getContentPane().add(area1);
		getContentPane().add(reset);
		getContentPane().add(print);
		getContentPane().add(receipt);
		getContentPane().add(Customer);
		getContentPane().add(Name);
		getContentPane().add(Contact);
		getContentPane().add(Food);
		getContentPane().add(Drinks);
		getContentPane().add(Desserts);
		getContentPane().add(tcustomer);
		getContentPane().add(tcontact);
		getContentPane().add(tname);
		getContentPane().add(c1);
		getContentPane().add(c2);
		getContentPane().add(c3);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(Type);
		getContentPane().add(label);
		getContentPane().add(image);
		getContentPane().add(imahe);
		
		
		ImageIcon image = new ImageIcon("Burger_King_logo_(1999).svg.png");
	
	
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		setTitle("BURGER KING");
		setResizable(false);
		setIconImage(image.getImage());
		getContentPane().setBackground(new Color(242,169, 0));
		setLocationRelativeTo(null);
		
		
		
		HashMap<String, Double> foodPrices = new HashMap<String, Double>();
		foodPrices.put("Pizza", 200.00);
		foodPrices.put("Chicken", 80.00);
		foodPrices.put("Burger", 60.00);
		foodPrices.put("Fries", 60.00);
		foodPrices.put("Steak", 300.00);

		HashMap<String, Double> drinkPrices = new HashMap<String, Double>();
		drinkPrices.put("Coke", 30.00);
		drinkPrices.put("Sprite", 30.00);
		drinkPrices.put("Water", 20.00);
		drinkPrices.put("Pineapple Juice", 45.00);
		drinkPrices.put("Nestea", 35.00);
		
		HashMap<String, Double> dessertPrices = new HashMap<String, Double>();
		dessertPrices.put("Cake", 130.00);
		dessertPrices.put("Salad", 100.00);
		dessertPrices.put("Muffins", 70.00);
		dessertPrices.put("Cheesecakes", 70.00);
		dessertPrices.put("Candies", 50.00);
		
		
		
		
	        
	        
	       reset.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					tname.setText("");
					tcontact.setText("");
					tcustomer.setText("");
					
					
				}
			});
			
			print.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try {
					area1.print();
					}
					catch(PrinterException ex)
					{
					System.out.println(ex.getMessage());
					
				}}
			});
			
			receipt.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					area1.setText("Customer's Name: " +tcontact.getText()+"\nCustomer's Contacts: " +tname.getText()+"\nCustomer's Number: " + tcustomer.getText());
					
					String selectedFood = (String) c1.getSelectedItem();
				    String selectedDrink = (String) c2.getSelectedItem();
				    String selectedDesserts = (String) c3.getSelectedItem();
				    
				   double foodPrice = foodPrices.get(selectedFood);
				   double drinkPrice = drinkPrices.get(selectedDrink);
				   double dessertPrice = dessertPrices.get(selectedDesserts);
				   area1.append("\nFood's ordered: " + selectedFood + ": " + foodPrice + "\n");
				   area1.append("Drink's ordered: " + selectedDrink + ": " + drinkPrice + "\n");
				   area1.append("Dessert's ordered: " + selectedDesserts + ": " + dessertPrice + "\n");
				   
				}
			});
			  
			
			}
	
	

	public static void main (String args [])
	{
		new Restaurant();
	}



	}





   
	

		

  


				
	
	
	

				
				
				


