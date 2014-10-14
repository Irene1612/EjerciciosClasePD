package es.upm.miw.pd.observer.persona;

import java.util.HashSet;
import java.util.Set;

public class ObservablePersona {
    private final Set<ObservadorPersona> lista = new HashSet<ObservadorPersona>();

    public void aniadir(ObservadorPersona observadorPersona) {
        this.lista.add(observadorPersona);
    }

    public void quitar(ObservadorPersona observador) {
        this.lista.remove(observador);
    }

    public void notificar() {
        for (ObservadorPersona observador : lista) {
            observador.actualizar();
        }
    }
}
