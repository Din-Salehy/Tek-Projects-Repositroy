package inheritence;

public class OverridingMain {

	public static void main(String[] args) {
		
		OverridingRogers obj = new OverridingRogers();
		System.out.println("Rogers data plane --->"+ obj.dataPlane());
		
		OverrdingFido fido= new OverrdingFido();
		System.out.println("Fido data plane ---> "+ fido.dataPlane());
		
		
	}
}
