public class PersonP{

	private String name;
	private int age;

	public PersonP(String name, int age){
		this.name = name;
		this.age = age;

		}

	public void sayHello(){
	System.out.print("Hi, my name is " + name + " and i am " + age + " years old.");
	}

	public static void main(String[] args){
		PersonP object = new PersonP("Gifted Gift", 25);
		object.sayHello();

	}




}