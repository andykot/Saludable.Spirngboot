package com.saludable.servicio;

import com.saludable.modelo.Alimentacion;

public interface AlimentacionServ {

	public Alimentacion nuevoComida(Alimentacion comida);
	
	public Iterable<Alimentacion> listarTodasComidas(String dni);
	
	
	
}
