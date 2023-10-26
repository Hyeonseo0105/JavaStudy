import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass_2 extends JFrame implements ItemListener{
	JComboBox box=new JComboBox();
	public MainClass_2()
	{
		box.addItem("황미애");
		box.addItem("김철");
		box.addItem("모진섭");
		add("North",box);
		setSize(300,150);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_2();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=box.getSelectedItem().toString();
			              //-----------------Object
			System.out.println(name);
		}
	}

}
