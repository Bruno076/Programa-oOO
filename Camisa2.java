
public class Camisa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camisa c1;
		c1 = new Camisa();
		c1.Cor= "Preto";
		c1.Modelo= "Nike";
		c1.Rasgada= false;
		c1.Amassada= false;
		c1.Tamanho= "G";
		
		//Métodos
		c1.Vestir();
		c1.Passar();
		c1.Status();
	}
}