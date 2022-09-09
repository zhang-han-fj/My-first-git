package ou.zh.day01.demo01;

/*
 * 
 */
public class Student {

	private String name;
	private String age;

	public Student() { 

	}

	public Student(String name, String age) {

		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
