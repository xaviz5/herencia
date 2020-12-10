package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(){
		ServicioPersonaBDD servPersBDD = new ServicioPersonaBDD();
		this.serv = servPersBDD;
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}

}
