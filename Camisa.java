
public class Camisa {
		String Modelo;
		String Cor;
		String Tamanho;
		boolean Rasgada;
		
		void Vestir()
		{
			if(Rasgada == true)
			{
				System.out.println("Sem Condicoes de uso");
			}
			else
			{
				System.out.println("Camisa vestida");
			}
		};
		
		void Status()
		{
			System.out.println("Classe Camisa");
			System.out.println("Cor: "+ Cor);
			System.out.println("Modelo: " + Modelo);
			
		};
	}
