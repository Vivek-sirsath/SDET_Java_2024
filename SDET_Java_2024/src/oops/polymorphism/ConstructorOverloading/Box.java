// Session 12

package oops.polymorphism.ConstructorOverloading;

public class Box {

	double height, width, depth;

	Box() {

//		height = 0;
//		width = 0;
//		depth = 0;

		height = width = depth = 0;
	}

	Box(double h, double w, double d) {
		height = h;
		width = w;
		depth = d;
	}

	Box(double len) {
		height = width = depth = len;
	}

	double volume() {
		return (height * width * depth);
	}

}
