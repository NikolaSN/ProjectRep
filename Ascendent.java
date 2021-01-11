import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class Ascendent extends JFrame {

	private JPanel contentPane;
	private JTextField Day;
	private JTextField Month;
	private JTextField Year;
	private JTextField Hours;
	private JTextField Minutes;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascendent frame = new Ascendent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ascendent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textZodiq = new TextArea();
		textZodiq.setBackground(Color.WHITE);
		textZodiq.setEditable(false);
		textZodiq.setBounds(27, 357, 343, 108);
		contentPane.add(textZodiq);
		
		TextArea textAsc = new TextArea();
		textAsc.setBackground(Color.WHITE);
		textAsc.setEditable(false);
		textAsc.setBounds(418, 10, 343, 359);
		contentPane.add(textAsc);
		
		Day = new JTextField();
		Day.setBounds(21, 71, 110, 32);
		contentPane.add(Day);
		Day.setColumns(10);
		
		Month = new JTextField();
		Month.setBounds(163, 71, 110, 32);
		contentPane.add(Month);
		Month.setColumns(10);
		
		Year = new JTextField();
		Year.setBounds(299, 71, 110, 32);
		contentPane.add(Year);
		Year.setColumns(10);
		
		Hours = new JTextField();
		Hours.setBounds(21, 189, 110, 32);
		contentPane.add(Hours);
		Hours.setColumns(10);
		
		Minutes = new JTextField();
		Minutes.setBounds(163, 189, 110, 32);
		contentPane.add(Minutes);
		Minutes.setColumns(10);
		
		JButton startbtn = new JButton("Ascedent!");
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int day, month, year, hour, minutes;
				try {
					day= Integer.parseInt(Day.getText());
					month= Integer.parseInt(Month.getText());
					year= Integer.parseInt(Year.getText());
					hour= Integer.parseInt(Hours.getText());
					minutes= Integer.parseInt(Minutes.getText());
					ValidationClass obj = new ValidationClass(day, month, year, hour, minutes);
					textZodiq.setText(obj.getError());
				}catch(NumberFormatException e) {
					textZodiq.setText("Vuvedete chislo molq");
				}catch(InputMismatchException e) {
					textZodiq.setText("Ne moje da bude svedeno do cqlo chislo");
				}
				
			}
		});
		startbtn.setBounds(438, 395, 141, 35);
		contentPane.add(startbtn);
		
		JComboBox GMT = new JComboBox();
		GMT.setModel(new DefaultComboBoxModel(new String[] {"GMT", "GMT+1", "GMT-1"}));
		GMT.setBounds(21, 286, 121, 32);
		contentPane.add(GMT);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(21, 38, 92, 26);
		contentPane.add(lblDay);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(163, 38, 92, 26);
		contentPane.add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(299, 38, 92, 26);
		contentPane.add(lblYear);
		
		JLabel lblWarning = new JLabel("Please use valid numbers");
		lblWarning.setBounds(21, 0, 388, 26);
		contentPane.add(lblWarning);
		
	
		
		
	}
	
	


}