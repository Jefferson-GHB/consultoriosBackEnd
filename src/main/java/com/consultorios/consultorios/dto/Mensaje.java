package com.consultorios.consultorios.dto;

public class Mensaje
{
    private String mensaje;

    /**
     * Constructor de la clase.
     * @param mensaje
     */
    public Mensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }

    public String getMensaje()
    {
        return mensaje;
    }

    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }
}
