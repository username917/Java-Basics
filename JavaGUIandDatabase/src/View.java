import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class View {

	private JFrame frame;
	private JTextField txtAdd;
	private JTextField txtEditIndex;
	private JTextField txtIndex;
	private JTextField txtRelease;
	private JTextField txtEditTitle;
	private JTextField txtEditRelease;
	private JTextField txtDelIndex;
	
	JList list = new JList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 285);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Title");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel.setBounds(37, 136, 101, 31);
		frame.getContentPane().add(lblNewLabel);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(132, 65, 96, 19);
		frame.getContentPane().add(txtAdd);
		txtAdd.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Create a Record");
		lblNewLabel_1.setBounds(127, 17, 101, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Create makeMe = new Create();
				
				makeMe.setIdx(txtIndex.getText());
				makeMe.setMovie(txtAdd.getText());
				makeMe.setRelease(txtRelease.getText());
	
				makeMe.writeDatatoMySQL();
			}
		});
		btnNewButton.setBounds(142, 94, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Edit a Record");
		
		
		lblNewLabel_2.setBounds(127, 125, 90, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtEditIndex = new JTextField();
		txtEditIndex.setBounds(258, 170, 73, 19);
		frame.getContentPane().add(txtEditIndex);
		txtEditIndex.setColumns(10);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Read a Record");
		lblNewLabel_3.setBounds(404, 17, 113, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Read All Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				ArrayList<String> week = new ArrayList<String>();
//				week.add("Monday");
//				week.add("Tuesday");
//			
//				list.setListData(week.toArray());
				
				Read readMe = new Read();
				
				readMe.readData();
			}
		});
		btnNewButton_1.setBounds(414, 40, 103, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Delete Record");
		lblNewLabel_4.setBounds(430, 146, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Delete deleteMe = new Delete();
				
				deleteMe.setIdx(txtDelIndex.getText());
				
				deleteMe.deleteFromDVDDatabase();
				
				
			}
		});
		btnNewButton_1_1.setBounds(414, 200, 85, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Edit");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Edit editMe = new Edit();
				
				editMe.setIdx(txtEditIndex.getText());
				editMe.setTitle(txtEditTitle.getText());
				editMe.setRelease(txtEditRelease.getText());
				
				editMe.updateDatabaseForDVDs();
				
			}
		});
		btnNewButton_1_2.setBounds(142, 200, 85, 21);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JLabel lblIndex = new JLabel("Index");
		lblIndex.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblIndex.setBounds(258, 136, 101, 31);
		frame.getContentPane().add(lblIndex);
		
		txtIndex = new JTextField();
		txtIndex.setColumns(10);
		txtIndex.setBounds(37, 65, 73, 19);
		frame.getContentPane().add(txtIndex);
		
		JLabel lblReleaseDate = new JLabel("Release Date");
		lblReleaseDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblReleaseDate.setBounds(147, 136, 101, 31);
		frame.getContentPane().add(lblReleaseDate);
		
		txtRelease = new JTextField();
		txtRelease.setColumns(10);
		txtRelease.setBounds(238, 65, 96, 19);
		frame.getContentPane().add(txtRelease);
		
		txtEditTitle = new JTextField();
		txtEditTitle.setColumns(10);
		txtEditTitle.setBounds(37, 170, 96, 19);
		frame.getContentPane().add(txtEditTitle);
		
		txtEditRelease = new JTextField();
		txtEditRelease.setColumns(10);
		txtEditRelease.setBounds(144, 170, 96, 19);
		frame.getContentPane().add(txtEditRelease);
		
		JLabel lblNewLabel_5 = new JLabel("Movie Title");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(132, 40, 101, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblReleaseDate_1 = new JLabel("Release Date");
		lblReleaseDate_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblReleaseDate_1.setBounds(236, 40, 101, 31);
		frame.getContentPane().add(lblReleaseDate_1);
		
		JLabel lblIndex_1 = new JLabel("Index");
		lblIndex_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblIndex_1.setBounds(37, 40, 101, 31);
		frame.getContentPane().add(lblIndex_1);
		
		
		list.setBounds(383, 71, 155, 67);
		frame.getContentPane().add(list);
		
		txtDelIndex = new JTextField();
		txtDelIndex.setBounds(440, 170, 96, 19);
		frame.getContentPane().add(txtDelIndex);
		txtDelIndex.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Index");
		lblNewLabel_6.setBounds(385, 173, 45, 13);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
