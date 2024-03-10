package classesAndObjects;

public class Complex {
	int real, imag;

	void print() {
		System.out.println(real + "+i" + imag);
	}

	Complex(int r, int i) {
		real = r;
		imag = i;
	}

	void add(Complex c) {
		real = real + c.real;
		imag = imag + c.imag;
	}
}
