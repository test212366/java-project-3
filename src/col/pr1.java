package col;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class okno extends JFrame{
	private JTextArea text;
	private JLabel lab;
	private void btnClick(JButton btn) {
		JOptionPane.showMessageDialog(null,"привет");
	}
	public okno() {
	panel pan=new panel();
	Container con=getContentPane();
	pan.setLayout(null);
	Font btnFont=new Font("serif",1,20);
	Font labFont=new Font("arial",2,30);
	Font textFont=new Font("arial",3,30);
	JButton []btn=new JButton[17];
	for (int i=0;i<17;i++) {
btn[i]=new JButton();
btn[i].setSize(100,25);
btn[i].setFont(btnFont);
btn[i].setLocation(0,i*30);
btn[i].setForeground(new Color(i*15,100,i));
btn[i].addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btnClick((JButton)e.getSource());
	}
});
pan.add(btn[i]);
}
	for(int i=0;i<10;i++) {
		btn[i].setText(""+i);
	}
	btn[10].setText("+");
	btn[11].setText("-");
	btn[12].setText("/");
	btn[13].setText("*");
	btn[14].setText("=");
	btn[15].setText("C");
	btn[16].setText("Exit");
	
	text=new JTextArea();
	text.setFont(textFont);
	text.setBounds(110,50,300,35);
	text.setForeground(new Color(0,0,100));
	text.setBackground(Color.white);
	pan.add(text);
	JLabel lab=new JLabel("Результат");
	lab.setFont(labFont);
	lab.setBounds(160,0,300,50);
	lab.setForeground(Color.black);
	pan.add(lab);
	
	con.add(pan);
	setTitle("Окно");
	setBounds(30,30,440,550);
	setVisible(true);
	}
}
class panel extends JPanel{
public panel() {
	
}
	
}
public class pr1 {

	public static void main(String[] args) {
	okno win=new okno();

	}

}
