package poyect2;

public class Cliente extends Personas {
	private int Clienteid;

	
	
	public Cliente() {
		super();
	}



	public Cliente(String nombre, String apellido, int numeroFiscal, String email, int clienteid) {
		super(nombre, apellido, numeroFiscal, email);
		Clienteid = clienteid;
	}

	
	

}
