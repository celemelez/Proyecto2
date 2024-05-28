package poyect2;

public class Cliente extends Personas {
	private int Clienteid;
	

	
	
	public int getClienteid() {
		return Clienteid;
	}



	public void setClienteid(int clienteid) {
		Clienteid = clienteid;
	}
	



	@Override
	public String toString() {
		return "Cliente [Clienteid=" + Clienteid + "]";
	}



	public Cliente() {
		super();
	}



	public Cliente(String nombre, String apellido, int numeroFiscal, String email, int clienteid) {
		super(nombre, apellido, numeroFiscal, email);
		Clienteid = clienteid;
	}

	
	

}
