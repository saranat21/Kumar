package polymorphism1;

public class Led55 extends Lcd32 {

	@Override
		public void screensize() {
			
			System.out.println("55 inches");
		}
	@Override
	public void resolution() {
		System.out.println("4080p");
	}

public static void main (String []args) {
	Led55 l = new Led55();
	l.Software();
	l.screensize();
	l.resolution();
}
}
