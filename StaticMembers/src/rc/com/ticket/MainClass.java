package rc.com.ticket;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name="Umesh";
		Ticket t = p.issuing();
		System.out.println(" Conductor "+p.name+" issuing ticket from "+t.from+" to "+t.to+".");

	}
	
}

