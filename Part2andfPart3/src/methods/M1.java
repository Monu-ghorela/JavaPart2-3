package methods;

public class M1 {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	public static void m1() {
		
	}
	
	public static void main(String[] args) {
		
		M1 m1=new M1();
		m1.setId(1);
		m1.setName("monu ghorela");
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		// TODO Auto-generated method stub

	}

}
