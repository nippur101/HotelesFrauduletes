package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
        /// Prueba ordenamiento RegistroHuesped por id y por idCliente

        RegistroHuesped h1 = new RegistroHuesped("35140802", 201, LocalDate.of(2018, 10, 30),LocalDate.of(2018, 10, 30));
        RegistroHuesped h2 = new RegistroHuesped("34185634", 201, LocalDate.of(2018, 10, 30),LocalDate.of(2018, 10, 30));
        RegistroHuesped h3 = new RegistroHuesped("35140802", 201, LocalDate.of(2018, 10, 30),LocalDate.of(2018, 10, 30));
        RegistroHuesped h4 = new RegistroHuesped("37415963", 201, LocalDate.of(2018, 10, 30),LocalDate.of(2018, 10, 30));

        List <RegistroHuesped> registro = new ArrayList<RegistroHuesped>();

        registro.add(h4);
        registro.add(h2);
        registro.add(h3);
        registro.add(h1);

        for (RegistroHuesped a : registro) {
            System.out.println(a.toString());
        }

        Collections.sort(registro);

        for (RegistroHuesped a : registro) {
            System.out.println(a.toString());
        }

        for (RegistroHuesped a : registro) {
            if(a.equals(h4)){
                System.out.print(a.toString());
            }
        }

        System.out.println(registro.indexOf(h1));
         */

        Hotel hotel = new Hotel();

        Administrador admin = new Administrador("35140802", "Mariano Lopez", "3 de Febrero 4070","mariano@gmail.com", "2235-166113","1234");
        Recepcionista recep1 = new Recepcionista("34159762", "Matias Moreno", "Catelli 4561","matias@gmail.com", "2235-154689","1234");
        hotel.agregarUsuarioHotel(admin);
        hotel.agregarUsuarioHotel(recep1);
        System.out.println(hotel.getListaUsuarioHotel().size());

        System.out.println(hotel.getListaUsuarioHotel().get(0).toString());
        System.out.println(hotel.getListaUsuarioHotel().get(1).toString());

        hotel.logIn("35140802", "1234");


    }
}
