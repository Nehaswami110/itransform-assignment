package ITransformAssignmentSecond;

public class Cookie extends DessertItem {

	private double cookiePrice;
	public Cookie(double cookiePrice,double tax) {
		super(tax);
		this.cookiePrice = cookiePrice;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cookiePrice*70;
	}

}
