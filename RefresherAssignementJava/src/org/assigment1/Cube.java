package org.assigment1;

public class Cube implements Shape {
	String col;
	int length, breadth, height;
	
	public Cube(String col, int length, int breadth, int height){
		this.col = col;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	@Override
	public String display() {
		return col;
	}

	@Override
	public int volume() {
		int multip = length*breadth*height;
		return multip;
	}

	public static void main(String[] args) {
		Cube cube = new Cube("Black", 10, 8, 15);
		cube.display();
		System.out.println(cube.volume());
	}

}
