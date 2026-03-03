package org.aletane04.people.caratterizzazioni.allievi;

import org.aletane04.people.PersonaUniversità;

import java.time.LocalDate;

public abstract  class Studente extends PersonaUniversità
{
    private double mediaPonderata;
    private double mediaAritmetica;

    public Studente(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, double mP, double mA)
    {
        super(nome,cognome,dataNascita,codiceFiscale,matricola);
        if(mP < 18 || mA < 18 || mA > 30 || mP > 30)
            throw new IllegalArgumentException("Range non consentito. Riprova.");
        this.mediaPonderata = mP;
        this.mediaAritmetica = mA;
    }

    public double getMediaPonderata()
    {
        return mediaPonderata;
    }

    public double getMediaAritmetica()
    {
        return mediaAritmetica;
    }
    public void setMediaPonderata(double mPonderata)
    {
        this.mediaPonderata = mPonderata;
    }

    public void setMediaAritmetica(double mAritmetica)
    {
        this.mediaAritmetica = mAritmetica;
    }

    public abstract String getStato();

    @Override
    public String getRuolo()
    {
        return "Studente";
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Media Ponderata: " + getMediaPonderata() + "\n");
        sb.append("Media Aritmetica: " + getMediaAritmetica() + "\n");
        return sb.toString();

    }
}
