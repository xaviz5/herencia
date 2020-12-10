package com.clearminds.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {
	
	public static void main(String[] args) {
		
		PersonaManager pm = null;;
		Properties p = new Properties();
		try {
			p.load(new FileReader("config.properties"));
			pm = new PersonaManager(p.getProperty("instancia"));
		} catch (InstanceException e) {
			e.printStackTrace();
			e.getMessage();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		pm.insertarPersona(new Persona("Lenin", "Changotasig", 26));
		
	}

}
