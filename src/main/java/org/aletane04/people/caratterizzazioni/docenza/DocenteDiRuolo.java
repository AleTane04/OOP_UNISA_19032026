package org.aletane04.people.caratterizzazioni.docenza;

import java.time.*;
import java.time.temporal.*;

public class DocenteDiRuolo extends Docente
{
    private LocalDate arruolamento;

    public DocenteDiRuolo(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, String formazione, double stipendio, LocalDate arruolamento)
    {
        super(nome, cognome, dataNascita, codiceFiscale, matricola,formazione, stipendio*3.0/2.0+1.0/10.0*ChronoUnit.DAYS.between(arruolamento, LocalDate.now()));
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
    public String getRuolo()
    {
        return "Docente di ruolo";
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Data di insediamento: " + arruolamento + "\n");
        return sb.toString();
    }


}
