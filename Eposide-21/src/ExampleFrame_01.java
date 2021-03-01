
import javax.swing.*;

public class ExampleFrame_01 extends JFrame{
	public static void main(String args[]) {
		ExampleFrame_01 frame = new ExampleFrame_01();
		frame.setVisible(true);
	}
	public ExampleFrame_01() {
		super();
		setTitle("创建可以滚动的表格");
		setBounds(500, 400, 480, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] columnNames = {"A", "B"};
		String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}, {"A4", "B4"}, {"A5", "B5"}};
		JTable table = new JTable(tableValues, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		this.getContentPane().add(scrollPane);
	}
}
