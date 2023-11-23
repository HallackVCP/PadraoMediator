package org.example;

public class Cliente {

    public String realizarReserva(String nmCliente, Integer nrQuarto){
        return Recepcao.getInstancia().receberReservaHotel(nmCliente, nrQuarto);
    }

    public String cancelarReserva(String nmCliente, Integer nrQuarto){
        return Recepcao.getInstancia().cancelarReservaHotel(nmCliente, nrQuarto);
    }
}
