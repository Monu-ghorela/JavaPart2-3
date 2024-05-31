package upcastingDowncasting;

class Student extends College{
int id;
String name;


public static void main(String[] args){


College c=new Student();//upcastong
System.out.println(c);

Student s=(Student)c;//downcasting
System.out.println(s);
Student  s1=(Student)new College();//class cast exception

}

}
