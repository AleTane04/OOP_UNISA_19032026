package org.aletane04.people;

import org.aletane04.people.caratterizzazioni.allievi.Studente;

import java.time.LocalDate;

public abstract class PersonaUniversità extends Persona
{
    String matricola;
    public PersonaUniversità(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola)
    {
        super(nome, cognome, dataNascita, codiceFiscale);
        this.matricola = matricola;
    }

    public String getMatricola()
    {
        return matricola;
    }

    public String setMatricola()
    {
        return this.matricola=matricola;
    }

    public abstract String getRuolo();



    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Ruolo: " + getRuolo() + "\n");
        sb.append("Matricola: " + matricola + "\n");
        return sb.toString();

    }


}
