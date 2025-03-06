package controller;

import model.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaController {

	private List<Reserva> reservas;
	private int nextId;
	
	public ReservaController() {
		this.reservas = new ArrayList<>();
		this.nextId = 1;
	}
	
	public void adicionarReserva(Reserva reserva) {
		reserva.setIdReserva(nextId++);
		reservas.add(reserva);
	}
	
	public List<Reserva> listarReservas() {
		return reservas;
	}
}