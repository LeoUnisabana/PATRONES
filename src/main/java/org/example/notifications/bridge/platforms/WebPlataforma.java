package org.example.notifications.bridge.platforms;

import org.example.notifications.bridge.Plataforma;

public class WebPlataforma implements Plataforma {

    @Override
    public void mostrar(String mensaje) {
        System.out.println("[WEB] " + mensaje);
    }
}
