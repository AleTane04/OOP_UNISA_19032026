package org.aletane04;
import org.aletane04.*;
import org.aletane04.people.Persona;
import org.aletane04.people.caratterizzazioni.docenza.*;
import org.aletane04.people.caratterizzazioni.docenza.DocenteDiRuolo;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Armando", "Persone", LocalDate.of(2004,07,22), "PERSARM20040722SANOCK");
        System.out.print(p1.toString());

        //String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, String formazione, double stipendio, LocalDate arruolamento
        Docente d1 = new DocenteDiRuolo("Giovanni","Petrone",LocalDate.of(1960,01,01), "PTRNGVN19600302ROCK", "06127089989", "Università di Napoli", 2000, LocalDate.of(2009,8,19));
        System.out.println(d1.toString());

        Docente d2 = new Dottorando("Amedeo","Scorcioni",LocalDate.of(2009,1,1), "SCRNAMD20090101", "0612708848", "Università degli Studi del Sannio", 2000, "Ingegneria Elettronica");
        System.out.println(d2.toString());


    }
}