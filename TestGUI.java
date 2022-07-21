import java.awt.*;
import javax.swing.*;
class TestGUI
{
	public static void main(String args[])
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();
		
		FlowLayout flw=new FlowLayout();
		con.setLayout(flw);
		
		JButton btn=new JButton("Test");
		con.add(btn);
		
		frm.setSize(400,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}