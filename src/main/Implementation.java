package main;

public class Implementation {
	
	public static void main(String[] args) {
		
		Iphone iphone8 = new Iphone();
		
		iphone8.ligar("+55 83 9999 666");
		iphone8.atender();
		iphone8.inciarCorreioVoz();
		
		iphone8.selecionarMusica("Creeping Death - Metallica");
		iphone8.tocar();
		iphone8.pausar();
		
		iphone8.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/edit/main/desafios/poo/README.md");
		iphone8.adicionarNovaAba();
		iphone8.atualizarPagina();
		
	}

}
