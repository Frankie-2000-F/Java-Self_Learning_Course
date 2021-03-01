import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class TableModelEvent_Example extends JFrame {
	private JTable table;
	private DefaultTableModel tableModel;
	private JTextField aTextField;
	private JTextField bTextField;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableModelEvent_Example frame = new TableModelEvent_Example();
		frame.setVisible(true);
	}
	public TableModelEvent_Example() {
		// TODO Auto-generated constructor stub
		setTitle("������ģ���¼�");
		setBounds(100, 100, 800, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		String[] columnNames = {"A", "B"};
		String[][] rowValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}, {"A4", "B4"}};
		tableModel = new DefaultTableModel(rowValues, columnNames);
		tableModel.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				int type = e.getType();
				int row = e.getFirstRow() + 1;
				int column = e.getColumn() + 1;
				if(type == TableModelEvent.INSERT) {
					System.out.println("�˴��¼��� ���� �д�����");
					System.out.println("�˴β�����ǵ�" + row + "�У�");
				}else if(type == TableModelEvent.DELETE) {
					System.out.println("�˴��¼��� ɾ�� �д�����");
					System.out.println("�˴�ɾ�����ǵ�" + row + "�У�");
				}else if(type == TableModelEvent.UPDATE) {
					System.out.println("�˴��¼��� �޸� �д�����");
					System.out.println("�˴��޸ĵ��ǵ�" + row + "�У�");
				}else
					System.out.println("�˴��¼��� ����ԭ�� ������");
			}
		});
		table = new JTable(tableModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		final JLabel aLabel = new JLabel("A�� ");
		panel.add(aLabel);
		aTextField = new JTextField(15);
		panel.add(aTextField);
		final JLabel bLabel = new JLabel("B�� ");
		panel.add(bLabel);
		bTextField = new JTextField(15);
		panel.add(bTextField);
		final JButton addButton = new JButton("���");
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String[] rowValues = {aTextField.getText(), bTextField.getText()};
				tableModel.addRow(rowValues);
				aTextField.setText(null);
				bTextField.setText(null);
			}
		});
		panel.add(addButton);
		final JButton delButton = new JButton("ɾ��");
		delButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int[] selectedRows = table.getSelectedRows();
				for(int i = 0; i < selectedRows.length; i++) {
					tableModel.removeRow(selectedRows[i] - i);
				}
			}
		});
		panel.add(delButton);
		final JButton updButton = new JButton("�޸�");
		updButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String[] rowValues = {aTextField.getText(), bTextField.getText()};
				int selectedRow = table.getSelectedRow();
				int selectedColumn = table.getSelectedColumn();
				tableModel.setValueAt(rowValues, selectedRow, selectedColumn);
			}
		});
		panel.add(updButton);
	}

}
