
public class Camisa {
		String Modelo;
		String Cor;
		String Tamanho;
		boolean Rasgada;
		boolean Amassada;
		
		void Vestir()
		{
			if(Rasgada == true)
			{
				System.out.println("Sem Condicoes de uso");
			}
			else
			{
				System.out.println("Camisa Vestida");
			}
		};
		
		void Passar()
		{
			if(Amassada == true)
			{
				System.out.println("Necessário passar camisa");
			}
			else
			{
				System.out.println("Camisa Passada");
			}
		};
		
		void Status()
		{
			System.out.println("Classe Camisa");
			System.out.println("Cor: "+ Cor);
			System.out.println("Modelo: " + Modelo);
			System.out.println("Tamanho: " + Tamanho);
		};
	}
