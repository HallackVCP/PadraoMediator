package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private static Hotel instancia = new Hotel();

    private Hotel(){}

    public static Hotel getInstancia() {
        return instancia;
    }

    public String receberReserva(String nmCliente, Integer nrQuarto){
        return "Reserva do quarto:  " +nrQuarto+ " para o cliente: " + nmCliente + " realizada";
    }

    public String cancelarReserva(String nmCliente, Integer nrQuarto){
        return "Reserva do quarto:  " +nrQuarto+ " para o cliente: " + nmCliente + " cancelada";
    }
}
