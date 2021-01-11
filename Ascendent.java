import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;

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
		
		JLabel lblAsc = new JLabel("");
		lblAsc.setBounds(440, 21, 322, 353);
		contentPane.add(lblAsc);
		
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
				}catch(NumberFormatException e) {
					System.out.println("Въведете число моля");
				}catch(InputMismatchException e) {
					System.out.println("Не може да бъде сведено до цяло число");
				}
				
			}
		});
		startbtn.setBounds(438, 395, 141, 35);
		contentPane.add(startbtn);
		
		JComboBox GMT = new JComboBox();
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
	}
	
	private void Formula() {
		
	}
	
}
