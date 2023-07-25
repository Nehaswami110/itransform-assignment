package ITransformAssignmentSecond;

public class IceCream extends DessertItem{

	private double iceCreamPrice;
	public IceCream(double iceCreamPrice,double tax) {
		super(tax);
		this.iceCreamPrice = iceCreamPrice;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return iceCreamPrice;
	}
}