package main;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorNaInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico{
	
	public Iphone() {
		
	}

	//AparelhoTelefonico-----------------------------------------------------//
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para:" +numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
		
	}

	@Override
	public void inciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz.");
	}

	
	//ReprodutorMusical-------------------------------------------------------//
	@Override
	public void tocar() {
		System.out.println("Tocando música.");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionada música: "+musica);
		
	}
	
	//NavegadorNaInternet--------------------------------------------------//
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página.");
		
	}

}
