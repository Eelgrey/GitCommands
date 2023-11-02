package GitTest.commands.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	public Student(int id, String name, String add, double marks) {
		this.id = id;
		this.name = name;
		this.add = add;
		this.marks = marks;
		
	}
	private Integer id;
	private String name;
	private String add;
	private Double marks;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + ", marks=" + marks + "]";
	}
	
	

}
