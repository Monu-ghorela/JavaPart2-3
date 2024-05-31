package mock3;

public class Student {
	int id;
	String name;
	String address;
	
Student (int id,String name,String address)
{
	
	this.id=id;
	this.name=name;
	this.address=address;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "id: "+id+" name: "+name+" adress: "+address;
}

}
