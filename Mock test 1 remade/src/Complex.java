
public class Complex {
	private double real;
	private double imaginary;

	//Constructor 
	//Builds a complex number with two parts, a real one and an imaginary one
	// z = x + yi, where x is the real part and yi is the imaginary part.
	public Complex(double real, double imaginary) {

	}

	//Getters
	
	
	// absolute returns the total length of the complex number z = 
	// It is calculated as r = |z| = (x^2 + y^2) ^(1/2)
	public double absolute() {
		return 0;   

	}
	
	// Complex numbers are added by separately adding the real and imaginary parts of the summands
	// (a + bi) + (c + di) = (a + c) + (b + d)i
	public Complex add(Complex c2) {
		return null;
	}
	
	//The multiplication of two complex numbers is defined by the following formula
	// (a + bi)(c + di) = (ac - bd) + (bc + ad)i
	public Complex multiply(Complex c2) {
		return null;
	}
	
	//The reciprocal of a complex number is given by the following formula:
	// 1 / z = x / (x^2 + y^2) - y / (x^2 + y^2) * i
	public Complex reciprocal() {
		return null;
	}
	
	//Subtraction works in a similar manner to addition
	// (a + bi) - (c + di) = (a - c) + (b - d)i
	public Complex subtraction(Complex c2) {
		return null;
	}
	
	// The formula for dividing complex numbers is as follows
	// (a + bi) / (c + di) = ((ac +bd) / (c^2 + d^2)) + ((bc - ad) / (c^2 + d^2))i
	public Complex division(Complex c2) {
		return null;
	}

	// table method will return a list that includes all the calculation methods for the complex number c2
	// Optional exercise
	public Complex[] table(Complex c2) {
		return null;	
	}
}
