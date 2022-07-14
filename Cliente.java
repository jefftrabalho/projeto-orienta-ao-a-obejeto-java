package ExercicioPoo;

public class Cliente {

	//atributos
	int idade ;
	String sexo;
	String endereço;
	boolean pagar;
	//metodos açao do objeto
		
		void status () {
			
			System.out.println("a idade é " + this.idade );
			System.out.println("o sexo é " + this.sexo );
			System.out.println("o endereço é " + this.endereço );
			System.out.println("pagamento foi aprovado ? " + this.pagar);
		}
		
	
		void naoPagou () {
			this.pagar=false;
		}
		 
		void pagou() {
			this.pagar=true; 
		}
		void compraOk() {
			if(this.pagar==true) {
				System.out.println("compra aprovada volte sempre");
				
			}else {
				System.out.println("infelizmente seu pagamento nao foi aprovado tente outra forma de pagamento'");
			}
		}
}
