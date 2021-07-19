package application;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
public class ValenciaSandwichShop

{

	String sandwichProteins[] = { "Chicken", "Pulled Pork", "Ham & Swiss" };

	String breadTypes[] = { "White", "Wheat", "Asiago" };

	JFrame jf;

	JList protein, bread;

	JLabel proteinL, breadL, amountL;

	JTextField amountT;

	JButton amountB, doneB;
	
	JPanel p1, p2, p3, p4, mainP;

	ValenciaSandwichShop()

	{

		jf = new JFrame("Valencia Sandwich Shop");

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		mainP = new JPanel();

		protein = new JList<String>(sandwichProteins);

		bread = new JList<String>(breadTypes);

		proteinL = new JLabel("Select Protein Type");

		breadL = new JLabel("Select Bread Type");

		amountL = new JLabel("Amount: ");

		amountT = new JTextField(5);

		amountB = new JButton("Check Amount");

		doneB = new JButton("Done");

		p1.add(proteinL);

		p1.add(protein);

		p2.add(breadL);

		p2.add(bread);

		p3.add(amountL);

		p3.add(amountT);

		p4.add(amountB);

		p4.add(doneB);

		mainP.add(p1);

		mainP.add(p2);

		mainP.add(p3);

		mainP.add(p4);

		mainP.setLayout(new GridLayout(4, 1));

		jf.add(mainP);
		jf.setVisible(true);
		jf.setSize(300, 300);

		doneB.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent ae)

			{

				System.exit(0);

			}

		});

		amountB.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent ae)

			{

				int indexProtein = protein.getSelectedIndex();

				int indexBread = bread.getSelectedIndex();

				if (indexProtein == 0 && indexBread == 0)

					amountT.setText("$5.00");

				if (indexProtein == 0 && indexBread == 1)

					amountT.setText("$6.00");

				if (indexProtein == 0 && indexBread == 2)

					amountT.setText("$7.00");

				if (indexProtein == 1 && indexBread == 0)

					amountT.setText("$6.00");

				if (indexProtein == 1 && indexBread == 1)

					amountT.setText("$7.00");

				if (indexProtein == 1 && indexBread == 2)

					amountT.setText("$8.00");

				if (indexProtein == 2 && indexBread == 0)

					amountT.setText("$5.50");

				if (indexProtein == 2 && indexBread == 1)

					amountT.setText("$6.50");

				if (indexProtein == 2 && indexBread == 2)

					amountT.setText("$7.50");

			}

		});

	}
		public static void main(String[] args){

		new ValenciaSandwichShop();
		ArrayList<String> orders = new ArrayList<String>();
		orders.add("$5.00");
		System.out.println(orders);
	}
}