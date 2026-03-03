package org.aletane04.people.caratterizzazioni.allievi;

import java.time.LocalDate;

public class StudenteInCorso extends Studente
{
    private int numeroEsamiMancanti;

    public StudenteInCorso(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, double mP, double mA, int n)
    {
        super(nome,cognome,dataNascita,codiceFiscale,matricola,mP,mA);
        this.numeroEsamiMancanti=n;
    }

    @Override
    public String getStato()
    {
        return "Studente in corso con " + numeroEsamiMancanti + "esami mancanti alla laurea.\n";
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Numero esami mancanti: " + numeroEsamiMancanti + "\n");
        return sb.toString();
    }
}
