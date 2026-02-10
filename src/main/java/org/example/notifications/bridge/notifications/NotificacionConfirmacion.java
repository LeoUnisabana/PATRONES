package org.example.notifications.bridge.notifications;

import org.example.notifications.bridge.Notificacion;
import org.example.notifications.bridge.Plataforma;

public class NotificacionConfirmacion extends Notificacion {

    public NotificacionConfirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("✅ CONFIRMACION: " + mensaje);
    }
}
