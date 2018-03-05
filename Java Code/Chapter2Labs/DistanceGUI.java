import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.Font;
import java.lang.Math;
public class DistanceGUI extends JFrame
{
	//****************************************
	//** GUI Structure
	//** Title: Holston Middle School
	//** Weight prompt (jlabel, jtext)
	//** planet pulldown
	//** Weight on planet (jlabel, jtext)
	//** calculate button
	//****************************************
	public JTextField entry1, entry2, entry3, entry4, output1;
	public JLabel label1, label2, label3, label4, label5;
	public JButton CalculateButton;
	public String mtitle, cmessage;

	private static final long serialVersionUID = 42l;

	public DistanceGUI()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

		//initialization of all text fields
		label1 = new JLabel("x1");
		add(label1);
		entry1 = new JTextField(8);
		add(entry1);

		label2 = new JLabel("x2");
		add(label2);
		entry2 = new JTextField(8);
		add(entry2);

		label3 = new JLabel("y1");
		add(label3);
		entry3 = new JTextField(8);
		add(entry3);

		label4 = new JLabel("y2");
		add(label4);
		entry4 = new JTextField(8);
		add(entry4);

		label5 = new JLabel("Distance");
		add(label5);
		output1 = new JTextField(8);
		add(output1);
		output1.setEnabled(false);
		setEnabled(true);
		setVisible(true);

		//Calculate Button
		CalculateButton = new JButton("Calculate");
		add(CalculateButton);
		CalculateButton.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				String entry1string = entry1.getText();
				Double e1value = Double.valueOf(entry1string);
				String entry2string = entry2.getText();
				Double e2value = Double.valueOf(entry2string);
				String entry3string = entry3.getText();
				Double e3value = Double.valueOf(entry3string);
				String entry4string = entry4.getText();
				Double e4value = Double.valueOf(entry4string);
				double distance = Math.sqrt((Math.pow((e1value - e2value), 2) + Math.pow((e3value - e4value), 2)));
				DecimalFormat fmt = new DecimalFormat("####.##");
				String outstring = fmt.format(distance);
				output1.setText(outstring);
			}//** actionPerformed
		}); //** Action Listener
		} //** DistanceGUI constructor

		public static void main(String[] args)
		{
			DistanceGUI frame = new DistanceGUI();
			frame.setTitle("Distance Calculator");
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(600, 300);
			frame.setBackground(Color.black);
			frame.getContentPane().setBackground(Color.gray);
			frame.setVisible(true);
		} //** main
} //** class
