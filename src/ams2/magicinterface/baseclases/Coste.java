package ams2.magicinterface.baseclases;

public class Coste {
	private int llanura;
	private int isla;
	private int pantano;
	private int montana;
	private int bosque;
	private int incoloro;
	public Coste(int llanura, int isla, int pantano, int montana, int bosque, int incoloro) {
		super();
		this.llanura = llanura;
		this.isla = isla;
		this.pantano = pantano;
		this.montana = montana;
		this.bosque = bosque;
		this.incoloro = incoloro;
	}
	public Coste() {
		// TODO Auto-generated constructor stub
	}
	public int getLlanura() {
		
		return llanura;
	}
	public void setLlanura(int llanura) {
		this.llanura = llanura;
	}
	public int getIsla() {
		return isla;
	}
	public void setIsla(int isla) {
		this.isla = isla;
	}
	public int getPantano() {
		return pantano;
	}
	public void setPantano(int pantano) {
		this.pantano = pantano;
	}
	public int getMontana() {
		return montana;
	}
	public void setMontana(int montana) {
		this.montana = montana;
	}
	public int getBosque() {
		return bosque;
	}
	public void setBosque(int bosque) {
		this.bosque = bosque;
	}
	public int getIncoloro() {
		return incoloro;
	}
	public void setIncoloro(int incoloro) {
		this.incoloro = incoloro;
	}
	
	public void returnAllCosts() {
		System.out.print("Blanco: "+getLlanura()+" "+"Azul: "+getIsla()+" "+"Negro: "+getPantano()+" "+"Rojo: "+getMontana()+" "+"Verde: "+getBosque()+" "+"Incoloro: "+getIncoloro());
	}

}
