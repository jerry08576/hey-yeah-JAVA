import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class D12MainFrame extends JFrame {
	
	
	private JButton jbtnCelsius = new JButton("Celsius");
	private JButton jbtnFahrenheit = new JButton("Fahrenheit");
	private JLabel jlb1 = new JLabel();
	private Container cp;
	private String str = "�п�J����:";
	private String str1 = "�ؤ�׬�:";
	private int count=0;
	public D12MainFrame(){
		initComp();
	}
	public void initComp(){
		cp = this.getContentPane();
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		
		
		jlb1.setBounds(50,70,250,25);
		jlb1.setText(str+count);
		cp.add(jlb1);
		
		
		 
	}


}
