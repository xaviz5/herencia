package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(String instancia) throws InstanceException{
		//ServicioPersonaBDD servPersBDD = new ServicioPersonaBDD();
		//ServicioPersonaArchivos servPersArch = new ServicioPersonaArchivos();
		//this.serv = servPersArch;
		Class<?> clase = null;
		try {
			clase = Class.forName(instancia);
			this.serv = (ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}

}
