package org.aletane04.people.caratterizzazioni.docenza;

import java.time.*;
import java.time.temporal.*;

public class DocenteDiRuolo extends Docente
{
    private LocalDate arruolamento;
    private double stipendioBase;
    public DocenteDiRuolo(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, String d, double stipendio, LocalDate arruolamento)
    {
        super(nome, cognome, dataNascita, codiceFiscale, matricola,d, stipendio);
        stipendioBase=stipendio;
        this.arruolamento = arruolamento;
    }

    private LocalDate getArruolamento()
    {
        return arruolamento;
    }

    private void setArruolamento(LocalDate arr)
    {
        this.arruolamento = arr;
    }

    @Override
    public double getStipendio()
    {
        return stipendioBase*3.0/2.0+1.0/10.0*ChronoUnit.DAYS.between(arruolamento, LocalDate.now())
    }


}
