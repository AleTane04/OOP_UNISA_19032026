package org.aletane04.people.caratterizzazioni.docenza;

import org.aletane04.people.PersonaUniversità;

import java.time.LocalDate;

public abstract class Docente extends PersonaUniversità
{
    private String formazione;
    private double stipendio;
    public Docente(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, String f, double stipendio)
    {
        super(nome, cognome, dataNascita, codiceFiscale, matricola);
        this.stipendio = stipendio;
        this.formazione=formazione;
    }
    public abstract double getStipendio();

    public String getFormazione()
    {
        return formazione;
    }

    public void setFormazione(String d)
    {
        this.formazione = d;
    }

    @Override
    public String getRuolo()
    {
        return "Studente";
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Università in cui ha studiato: " + formazione + "\n");
        sb.append("Stipendio: " + getStipendio() + "\n");
        return sb.toString();
    }
}
