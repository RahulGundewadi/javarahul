package lecture;

public class student {
	int id;
	String name;
	
	public	student (int i,String n)
	{
		id=i;
		name=n;
	}
	

void display()
{
	System.out.println(id+" "+name);	
}
public static void main(String args[])
{
	student s1 = new student(19 , "rdt");
	
	s1.display();
	
	

	}
	

}
