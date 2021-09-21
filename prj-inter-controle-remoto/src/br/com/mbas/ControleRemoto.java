package br.com.mbas;

public class ControleRemoto implements Controlador {

	private Integer volume;
	private Boolean ligado;
	private Boolean tocando;
	
	public ControleRemoto() {
		this.setVolume(30);
		this.setLigado(false);
		this.setTocando(true);
	}
	public Integer getVolume() {
		return this.volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	public Boolean getTocando() {
		return this.tocando;
	}
	public void setTocando(Boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void ligar() {
		if(!this.getLigado()) {
			System.out.println("Ligado com sucesso!");
			this.setLigado(true);
		} else {
			System.err.println("Aparelho já esta ligado!");
		}
	}
	@Override
	public void desligar() {
		if(this.getLigado()) {
			System.out.println("Até mais!!");
			this.setLigado(false);
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("Aparelho ligado!");
			System.out.println("Volume atual: ");
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
	@Override
	public void fecharMenu() {
		if(this.getLigado()) {
			System.out.println("Fechando menu!");
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
	@Override
	public void aumentarVolume() {
		
	}
	@Override
	public void diminuirVolume() {
		
	}
	@Override
	public void ligarMudo() {
		if(this.getLigado()) {
			if(this.getVolume()>0) {
				this.setVolume(0);
				System.out.println("Mudo ativado!");
			} else {
				System.err.println("O aparelho já está mudo!");
			}
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
	@Override
	public void desligarMudo() {
		if(this.getLigado()) {
			if(this.getVolume() == 0) {
				this.setVolume(50);
				System.out.println("Mudo desativado!");
			} else {
				System.err.println("O aparelho não esta mudo!");
			}
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
	@Override
	public void play() {
		if(this.getLigado()) {
			if(!this.getTocando()) {
				this.setTocando(true);
				System.out.println("PLAY...");
			} else {
				System.err.println("Play já estava ativado!");
			}
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
	@Override
	public void pause() {
		if(this.getLigado()) {
			if(this.getTocando()) {
				this.setTocando(false);
				System.out.println("PAUSE...");
			} else {
				System.err.println("Pause já esta ativado!");
			}
		} else {
			System.err.println("Nenhuma ação foi feita, aparelho desligado!");
		}
	}
}
