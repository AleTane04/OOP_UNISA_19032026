package org.aletane04.people.caratterizzazioni.docenza;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dottorando extends Docente
{
    private String campoDiRicerca;

    public Dottorando(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, String formazione, double stipendio, String campoDiRicerca)
    {
        super(nome,cognome,dataNascita,codiceFiscale,matricola,formazione,stipendio - 10.0 + ChronoUnit.DAYS.between(LocalDate.of(2026,03,01), LocalDate.now()));
        this.campoDiRicerca=campoDiRicerca;
    }

    public String getCampoDiRicerca()
    {
        return campoDiRicerca;
    }

    public void setCampoDiRicerca(String p)
    {
        this.campoDiRicerca=p;
    }

    @Override
    public String getRuolo()
    {
        return "Dottorando che lavora nell'ambito di: " + campoDiRicerca;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Campo di ricerca: " + campoDiRicerca + "\n");
        return sb.toString();
    }

}
