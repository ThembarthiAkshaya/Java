package com.apjfsa;

/*---------Base Class------------------*/
class ThreeDFigure {
	public void description() {
		System.out.println("it is three dimensional figur aving three dimensions");
	}

	// Method of volume
	public void volume() {
		System.out.println("The volume of three dimensional figure specififes the amount of space it occupies");
	}
}

/*-----------------------------------------------------*/
/*---------creating a class with name cube--------*/
class Cube extends ThreeDFigure {
	float side;

	public void description() {
		System.out.println("------------------Cube----------");
		System.out.println("Cube is three dimensional figure having each dimension same in measurements");
	}

	/*----overriding volume method-----*/
	public void volume() {
		side = 10;
		float v = side * side * side;
		System.out.println("Side=" + side);
		System.out.println("Volume=" + v);
	}

	public void totalSurfaceArea() {
		float tsa = 6 * side * side;
		System.out.println("Total surface area:" + tsa);
	}
}

/*-----------------------------------------------------*/
/*---------creating a class with name cuboid--------*/
class Cuboid extends ThreeDFigure {
	float length, height, width;

	public void description() {
		System.out.println("------------------Cuboid----------");
		System.out.println("Cuboid is three dimensional figure having each dimension same in measurements");

	}

	/*----overriding volume method-----*/
	public void volume() {
		length = 5;
		height = 10;
		width = 15;
		float v = length * width * height;
		System.out.println("Length:" + length);
		System.out.println("Height:" + height);
		System.out.println("Width=" + width);
		System.out.println("Volume=" + v);
	}
}

public class PolymorphicObjectExampe {

	public static void main(String[] args) {
		// polymorphic object
		ThreeDFigure figure1 = new ThreeDFigure();
		figure1.description();
		figure1.volume();
		System.out.println("----------------------------------------------");
		ThreeDFigure figure2 = new Cube(); // object has reference of base class but it has been initialized with
											// derived class
		figure2.description();
		figure2.volume();
		// figure2.totalSurfaceArea(); it shows error because it is not created in base
		// class so it is showing error
		System.out.println("----------------------------------------------");
		ThreeDFigure figure3 = new Cuboid();
		figure3.description();
		figure3.volume();
	}
}
