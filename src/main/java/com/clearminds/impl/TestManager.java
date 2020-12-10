package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {
	
	public static void main(String[] args) {
		
		PersonaManager pm = new PersonaManager();
		
		pm.insertarPersona(new Persona("Lenin", "Changotasig", 26));
		
		
	}

}
