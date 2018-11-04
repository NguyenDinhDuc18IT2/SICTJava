package thigiuaki;

public class Model implements Comparable {
	private int maSo;
	private String name;
	private float tall;
	private int age;
	public Model() {
		name = new String("");
		maSo=0;
		tall=0;
		age=0;
	}
	public Model(int i, String m, float b, int j) {
		maSo = i;
		name = m;
		tall = b;
		age = j;
	}
	public int getMaSo() {
		return maSo;
	}
	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTall() {
		return tall;
	}
	public void setTall(float tall) {
		this.tall = tall;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
