import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		for(int i = 0; i < a.size(); i++) {
			System.out.println("��ȡArrayList������ֵ��" + a.get(i));
		}
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(int i = 0; i < 5; i++) {
			m.put(i, "��Ա" + i);
		}
		for(int i = 0; i < m.size(); i++) {
			System.out.println("��ȡMap������ֵ" + m.get(i));
		}
		
		Vector<String> v = new Vector<String>();
		for(int i = 0; i < 5; i++) {
			v.addElement("��Ա" + i);
		}
		for(int i = 0; i < v.size(); i++) {
			System.out.println("��ȡVector������ֵ" + v.get(i));
		}
	}

}
