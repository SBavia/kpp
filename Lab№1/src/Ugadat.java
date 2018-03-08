import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ugadat extends JFrame{
	JButton button1, button2, button3;
	JLabel label1, label2, label3, label4;
	JTextField text1;
	int VvodimoeChislo;
	int RandomChislo = (int)(Math.random()*100);
	String str, str2;
	act handler = new act();
	
	public Ugadat(String s) {
		super(s);
		/*setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 2;*/

		setLayout(new FlowLayout());
		button1 = new JButton("Угадать");
		button2 = new JButton("Новое");
		button3 = new JButton("Я читер");
		label1 = new JLabel("");
		label2 = new JLabel("                                                                      ");
		label3 = new JLabel("                                                                      ");
		label4 = new JLabel("                                                                      ");
		text1 = new JTextField(10);
		//b1.setBounds(100, 100, 100, 100);

		/*constraints.gridx = 1;
		constraints.gridy = 0;*/
		//constraints.anchor = GridBagConstraints.NORTH;
		//constraints.gridwidth = 2;
		add(text1);
		
		/*constraints.gridx = 1;
		constraints.gridy = 1; 
		constraints.gridheight = 5;*/
		add(label3);add(label1);add(label2);add(label4);
		
		/*constraints.gridx = 0;
		constraints.gridy = 2; */
		add(button1);
		
		/*constraints.gridx = 2;
		constraints.gridy = 2;*/ 
		add(button2);
		
		add(button3);
		
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		str="Введите число";
		str2 = String.valueOf(RandomChislo);
		label1.setText(str);
	}
	
	public class act implements ActionListener{
		public void actionPerformed(ActionEvent gg) {
			try {
				if(gg.getSource()==button1) {
					VvodimoeChislo = Integer.parseInt(text1.getText());
					
					if (VvodimoeChislo>RandomChislo) {
						str="Ваше число больше загаданного";
						label1.setText(str);
					}
					else if(VvodimoeChislo<RandomChislo) {
						str="Ваше число меньше загаданного";
						label1.setText(str);
					}
					else {
						str="Вы угадали";
						label1.setText(str);
					}
				}
				if(gg.getSource()==button2) {
					RandomChislo = (int)(Math.random()*100);
					text1.setText(null);
					label1.setText("");
					str2 = String.valueOf(RandomChislo);
					}
				if(gg.getSource()==button3) {
					text1.setText(str2);
					}
				}catch (Exception ex) {JOptionPane.showMessageDialog(null, "Введите в поле число");}
			}
		}
	}