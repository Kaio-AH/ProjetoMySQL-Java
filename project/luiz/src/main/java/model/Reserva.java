package model;

public class Reserva {

	private int idReserva;
	private int quarto;
	private int andar;
	private String DataCheckin;
	private String DataCheckout;
	
	public Reserva(int quarto, int andar, String dataCheckin, String DataCheckout) {
		this.quarto = quarto;
		this.andar = andar;
		this.DataCheckin = dataCheckin;
		this.DataCheckout = DataCheckout;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getDataCheckin() {
		return DataCheckin;
	}

	public void setDataCheckin(String dataCheckin) {
		DataCheckin = dataCheckin;
	}

	public String getDataCheckout() {
		return DataCheckout;
	}

	public void setDataCheckout(String dataCheckout) {
		DataCheckout = dataCheckout;
	}
}