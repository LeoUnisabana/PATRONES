package org.example.notifications.bridge.notifications;

import org.example.notifications.bridge.Notificacion;
import org.example.notifications.bridge.Plataforma;

public class NotificacionMensaje extends Notificacion {

    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Mensaje: " + mensaje);
    }
}
