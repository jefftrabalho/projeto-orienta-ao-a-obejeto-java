package ExercicioPoo;

public class NovosClientes {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.endereço= "rua paineiras";
		c1.idade= 30;
		c1.sexo= "masculino";
		c1.pagou();
		c1.status();
		c1.compraOk();
		
		
		
		
		
		
		Cliente c2 = new Cliente();
		c2.idade= 25;
		c2.sexo= "feminino";
		c2.endereço="rua caqui";
		c2.naoPagou();
		c2.status();
		c2.compraOk();
	}

}
