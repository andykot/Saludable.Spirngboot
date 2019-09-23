package com.saludable.Controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.modelo.Alimentacion;
import com.saludable.modelo.Paciente;
import com.saludable.repos.AlimentacionRep;
import com.saludable.servicio.AlimentacionServ;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AlimentacionController implements AlimentacionServ {

	ArrayList<Alimentacion> listacomidas;
	
	
	public AlimentacionController() {
		
		listacomidas= new ArrayList<Alimentacion>();
		
	}
	
		AlimentacionRep aliRep;


		@PostMapping(value = "nuevaComida")
		public Alimentacion nuevoComida(Alimentacion comida) {
			// TODO Auto-generated method stub
			return aliRep.save(comida);
		}

		
		@GetMapping (value = "comidasPaciente")
		public Iterable<Alimentacion> listarTodasComidas(@RequestParam(value = "dni") String dni) {
			
			ArrayList<Alimentacion> comidasPaciente = new ArrayList<Alimentacion>();
			
			listacomidas.addAll((Collection<? extends Alimentacion>) this.aliRep.findAll());
			
			
			for (int i=0; i<listacomidas.size();i++) {
				if (listacomidas.get(i).getDni().equals(dni)){
					
				comidasPaciente.add(listacomidas.get(i));	
					
				}
			}	
			
			return comidasPaciente;
		}
		
		
		
				
				
				
				
				
	
}
