package es.upm.miw.pd.observer.persona;

import upm.jbb.IO;

public class MainObserver {

    private MainObserver() {
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Paco Pérez", 23, 956621847);
        new ObservadorPersona(persona);        
        IO.in.addModel(persona);       
        IO.out.setStatusBar(persona.toString());
    }
}
