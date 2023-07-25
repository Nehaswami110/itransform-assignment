package ITransformAssignmentSecond;

public class Single {
		static Single instance;

		private Single() {

		}

		private static Single getInstance() {
			if (instance == null) {
				synchronized (Single.class) {
					if (instance == null) {
						instance = new Single();
					}
				}
			}
			return instance;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Single obj = Single.getInstance();
			
			Single obj2 = Single.getInstance();
			
			System.out.println(obj==obj2);
			System.out.println(obj.hashCode());
			System.out.println(obj2.hashCode());

		}



	}


