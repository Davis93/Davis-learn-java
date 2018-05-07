/**
 * Date:2018/5/7
 * Author:Zhangfan
 * Description: problem not solved
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class EventDemo1 {
	public static void main(String[] args)
	{
		JFrame jf=new JFrame("EventDemo");
		jf.setLayout(new FlowLayout());//set layout format
		JTextField jtf=new JTextField(10);
		jtf.setText("Initializing content");
		jf.add(jtf); //add a text window
		//add a button
		JButton btn=new JButton("My Button");
		jf.add(btn);// add button to window
		//Listening the action
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame jf=new JFrame("EventDemo");
				JTextField jtf1=new JTextField(10);
				jf.add(jtf1);
				jtf1.setText("it was clicked");
			}
		});
		showMe(jf);
	}
	private static void showMe(JFrame jf)
	{
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(200,200);
		jf.setVisible(true);
	}

}
