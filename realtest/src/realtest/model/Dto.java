package realtest.model;

import java.util.Date;

public class Dto {
	
	private String name;
	private int num;

	public Dto() {
		System.out.println("DTO생성!");
		this.name = "guest";
		this.num = 20;
	}
	
	public Dto(String name) {
		this.name=name;
		this.num=20;
	}
	
	public Dto(String name, int num) {
		this.name=name;
		this.num=num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

}
