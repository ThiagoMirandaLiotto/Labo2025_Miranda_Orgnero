package sistemaAlmuerzos;

import fechas.Fecha;
import personas.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private Fecha fecha_crecion;
    private ArrayList<Plato> Platos;
    private Persona solicitante;
    private int hora_entrega;
    private String estado;

    public Pedido(Fecha fecha_crecion, ArrayList<Plato> platos, Persona solicitante, int hora_entrega, String estado) {
        this.fecha_crecion = fecha_crecion;
        Platos = platos;
        this.solicitante = solicitante;
        this.hora_entrega = hora_entrega;
        this.estado = estado;
    }

    public Fecha getFecha_crecion() {
        return fecha_crecion;
    }

    public void setFecha_crecion(Fecha fecha_crecion) {
        this.fecha_crecion = fecha_crecion;
    }

    public ArrayList<Plato> getPlatos() {
        return Platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        Platos = platos;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public int getHora_entrega() {
        return hora_entrega;
    }

    public void setHora_entrega(int hora_entrega) {
        this.hora_entrega = hora_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }





}
