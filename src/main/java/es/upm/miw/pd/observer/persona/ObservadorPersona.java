package es.upm.miw.pd.observer.persona;

import upm.jbb.IO;

public class ObservadorPersona {
    private Persona persona;
    
    public ObservadorPersona(Persona persona) {
        this.persona = persona;
        this.persona.aniadir(this);
    }
    
    void actualizar(){
        IO.out.setStatusBar(persona.toString());
    }
}
