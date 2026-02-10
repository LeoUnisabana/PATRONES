package org.example.notifications.bridge;

public abstract class Notificacion {

    protected Plataforma plataforma;

    public Notificacion(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviar(String mensaje);

    // Permite cambiar la plataforma en runtime
    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
}
