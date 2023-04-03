package day07.mypac;

// Ãß»óÅ¬·¡½º 
public abstract class Human {
	private String name;
	private int age;
	
	public void say() {
		System.out.println("¸»À» ÇØ¿ä!");
	}
	
	public abstract void useFire();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}