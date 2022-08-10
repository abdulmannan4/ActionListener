import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI{
public static void main(String args[]){
JFrame frm = new JFrame("THIS IS TITLE");
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setSize(400,500);
frm.setLayout(null);
frm.setVisible(true);
JButton btn=new JButton("this is button");
frm.add(btn);
btn.setBounds(100,100,100,40);
JLabel ll=new JLabel("this is label");
ll.setBounds(100,100,100,100);
frm.add(ll);
btn.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent aee){
	btn.setText("Button text change");
	ll.setText("Label change");
}}
);
}
}
