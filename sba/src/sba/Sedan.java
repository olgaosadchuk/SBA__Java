package sba;

class Sedan extends Car {
	int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	@Override
	double getSalePrice() {
		if (length > 20) {
			return super.getSalePrice() * 0.95; // 5% discount
		} else {
			return super.getSalePrice() * 0.9; // 10% discount
		}
	}
}
