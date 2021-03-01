import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;

public class ExampleFrame_06 extends JFrame{
	private JTable table;
	private DefaultTableModel tableModel;
	private JTextField aTextField;
	private JTextField bTextField;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleFrame_06 frame = new ExampleFrame_06();
		frame.setVisible(true);
	}
	public ExampleFrame_06() {
		super();
		setTitle("维护表格");
		setBounds(100, 100, 510, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		String[] columnNames = {"A", "B"};
		String [][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}};
		tableModel = new DefaultTableModel(tableValues, columnNames);
		table = new JTable(tableModel);
		table.setRowSorter(new TableRowSorter<>(tableModel));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
				Object oa = tableModel.getValueAt(selectedRow, 0);
				Object ob = tableModel.getValueAt(selectedRow, 1);
				aTextField.setText(oa.toString());
				bTextField.setText(ob.toString());
			}
		});
		scrollPane.setViewportView(table);
		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.add(new JLabel("A: "));
		aTextField = new JTextField("A4",10);
		panel.add(aTextField);
		panel.add(new JLabel("B: "));
		bTextField = new JTextField("B4", 10);
		panel.add(bTextField);
		final JButton addButton = new JButton("添加");
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String[] rowValues = {aTextField.getText(), bTextField.getText()};
				tableModel.addRow(rowValues);
				int rowCont = table.getRowCount() + 1;
				aTextField.setText("A" + rowCont);
				bTextField.setText("B" + rowCont);
			}
		});
		panel.add(addButton);
		final JButton updButton = new JButton("修改");
		updButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int selectedRow = table.getSelectedRow();
				if(selectedRow != -1) {
					tableModel.setValueAt(aTextField.getText(), selectedRow, 0);
					tableModel.setValueAt(bTextField.getText(), selectedRow, 1);
				}
			}
		});
		panel.add(updButton);
		final JButton delButton = new JButton("删除");
		delButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int selectedRow = table.getSelectedRow();
				if(selectedRow != -1) {
					tableModel.removeRow(selectedRow);
				}
			}
		});
		panel.add(delButton);
	}

}
