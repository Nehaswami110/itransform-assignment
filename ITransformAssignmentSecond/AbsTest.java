package ITransformAssignmentSecond;

//if the class has abstract method we must declare class as abstract

abstract class Test{
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public abstract void print();
	
}


//if we extend a abstract class we must add the unimplemented methods
//or make the sub classes as private
class Demo extends Test{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

class AbsTest {
	
	public static void main(String[] args) {
//		cannot intantiate abstract class because abstract classes are not complete or concrete
//		Test t = new Test();
		
		
	}

}
