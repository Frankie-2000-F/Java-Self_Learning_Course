package item;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {63, 4, 24, 1, 3, 15};
		SelectSort sorter = new SelectSort();
		sorter.sort(array);
	}
	
	/**
	 * ֱ��ѡ������
	 * 
	 * @param array
	 * Ҫ���������
	 */
	public void sort(int[] array) {
		int index;
		for(int i = 1; i < array.length; i++) {
			index = 0;
			for(int j = 1; j <= array.length - i; j++) {
				if(array[j] > array[index]) {
					index = j;
				}
			}
			int temp = array[array.length - i];
			array[array.length - i] = array[index];
			array[index] = temp;
		}
		showArray(array);
	}
	
	/**
	 * ��ʾ����������Ԫ��
	 * 
	 * @param array
	  * Ҫ��ʾ������
	 */
	public void showArray(int[] array) {
		for(int i : array) {
			System.out.print(" >" + i);
		}
		System.out.println();
	}


}
