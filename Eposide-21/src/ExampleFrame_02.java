import java.util.Vector;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;

public class ExampleFrame_02 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleFrame_02 frame = new ExampleFrame_02();
		frame.setVisible(true);
	}
	public ExampleFrame_02() {
		super();
		setTitle("创建不可滚动的表格");
		setBounds(500, 400, 480, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Vector<String> columnNameV = new Vector<>();
		columnNameV.add("A");
		columnNameV.add("B");
		columnNameV.add("C");
		Vector<Vector<String>> tableValueV = new Vector<>();
		for(int row = 1; row< 6; row++) {
			Vector<String> rowV = new Vector<>();
			rowV.add("A" + row);
			rowV.add("B" + row);
			rowV.add("C" + row);
			tableValueV.add(rowV);
		}
		JTable table = new JTable(tableValueV, columnNameV);
		getContentPane().add(table, BorderLayout.CENTER);
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setReorderingAllowed(false);
		getContentPane().add(tableHeader, BorderLayout.NORTH);
	}
}
