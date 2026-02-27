package org.aletane04.people;
import java.io.Serializable;
import java.time.*;
import java.util.*;

public class Persona implements Comparable<Persona>, Serializable
{
    private static int count = 0;
    private int number;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String codiceFiscale;

    public Persona(String nome, String cognome, LocalDate dataNascita, String codiceFiscale)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.dataNascita=dataNascita;
        this.codiceFiscale=codiceFiscale;
        this.number = ++count;
    }

    /* Metodi getter */
    public String getNome()
    {
        return nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public LocalDate getDataNascita()
    {
        return dataNascita;
    }

    public String getCodiceFiscale()
    {
        return codiceFiscale;
    }

    public int getNumber()
    {
        return number;
    }

    /* Metodi setter */

    public void setNome(String nome)
    {
        this.nome=nome;
    }

    public void setCognome(String cognome)
    {
        this.cognome=cognome;
    }

    public void setDataNascita(LocalDate dataNascita)
    {
        this.dataNascita=dataNascita;
    }

    public void setCodiceFiscale(String codiceFiscale)
    {
        this.codiceFiscale=codiceFiscale;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
            return true;
        if (!(obj instanceof Persona))
            return false;
        /* Downcast per poter operare su p */
        Persona p = (Persona) obj;

        return this.codiceFiscale.equals(p.codiceFiscale);
    }

    @Override
    public int hashCode()
    {
        /*return Objects.hash(this.codiceFiscale); */
        int code = codiceFiscale == null ? 0 : codiceFiscale.hashCode();
        return code;
    }

    @Override
    public int compareTo(Persona p)
    {
        if(this.nome.equals(p.nome))
        {
            if(this.cognome.equals(p.cognome))
            {
                if(this.dataNascita.equals(p.dataNascita))
                {
                    return this.codiceFiscale.compareTo(p.codiceFiscale);
                }
                return this.dataNascita.compareTo(p.dataNascita);
            }
            return this.cognome.compareTo(p.cognome);
        }
        return this.nome.compareTo(p.nome);
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("* - - - Anagrafica Persona - - - *\n");
        sb.append("Nome: " + nome + "\n");
        sb.append("Cognome: " + cognome + "\n");
        sb.append("Codice Fiscale: " + codiceFiscale + "\n");
        sb.append("Data di nascita: " + dataNascita + "\n");
        sb.append("Numero progressivo: " + number + "\n");
        return sb.toString();
    }



}
