package org.aletane04.people.caratterizzazioni.allievi;

import java.time.LocalDate;

public class StudenteErasmus extends Studente
{
    private String nazionalita;

    public StudenteErasmus(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, double mP, double mA, String n)
    {
        super(nome,cognome,dataNascita,codiceFiscale,matricola,mP*3,mA*3);
        this.nazionalita = n;
    }

    public String getNazionalita()
    {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita)
    {
        this.nazionalita = nazionalita;
    }
    @Override
    public String getStato()
    {
        return "Studente di una università estera frequentante in Italia";
    }
    @Override
    public String getRuolo()
    {
        return "Studente Erasmus";
    }

    @Override
    public double getMediaPonderata()
    {
        return super.getMediaPonderata()/3;
    }

    @Override
    public double getMediaAritmetica()
    {
        return super.getMediaAritmetica()/3;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Nazionalità: " + nazionalita + "\n");
        return sb.toString();
    }
}
