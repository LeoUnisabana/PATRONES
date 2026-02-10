package org.example.notifications.bridge;

import org.example.notifications.bridge.notifications.NotificacionAdvertencia;
import org.example.notifications.bridge.notifications.NotificacionAlerta;
import org.example.notifications.bridge.notifications.NotificacionMensaje;
import org.example.notifications.bridge.platforms.DesktopPlataforma;
import org.example.notifications.bridge.platforms.MovilPlataforma;
import org.example.notifications.bridge.platforms.WebPlataforma;

public class Main {

    public static void main(String[] args) {

        Plataforma web = new WebPlataforma();
        Plataforma movil = new MovilPlataforma();
        Plataforma desktop = new DesktopPlataforma();

        Notificacion mensaje = new NotificacionMensaje(web);
        mensaje.enviar("Hola mundo");

        Notificacion alerta = new NotificacionAlerta(movil);
        alerta.enviar("Batería baja");

        Notificacion advertencia = new NotificacionAdvertencia(desktop);
        advertencia.enviar("Espacio casi lleno");

        // Cambio dinámico de plataforma 🔥
        mensaje.setPlataforma(movil);
        mensaje.enviar("Ahora se muestra en móvil");
    }
}
