
public class ArrayClass<T> {
	private T[] array;
	public void SetT(T[] array) {
		this.array=array;
	}
	public T[] getT() {
		return this.array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayClass<String> a =new ArrayClass<String>();
		String[] array = {"��Ա1", "��Ա2", "��Ա3", "��Ա4", "��Ա5"};
		a.SetT(array);
		for(int i = 0; i < a.getT().length; i++) {
			System.out.println(a.getT()[i]);
		}
	}

}
