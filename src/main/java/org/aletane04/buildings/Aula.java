package org.aletane04.buildings;

import org.aletane04.exceptions.AulaPienaException;
import org.aletane04.exceptions.AulaVuotaException;
import org.aletane04.people.Persona;

import java.util.*;

public class Aula implements Comparable<Aula>
{
    private String nome;
    private int capienza;
    private int postiResidui;
    private int numeroPersone;
    List<Persona> miaAula;

    public Aula(String nome, int capienza)
    {
        miaAula = new ArrayList<>();
        this.nome=nome;
        this.capienza=capienza;
        this.postiResidui=capienza;
        this.numeroPersone=0;
    }

    public String getNome()
    {
        return nome;
    }

    public int getCapienza()
    {
        return capienza;
    }

    public void setNome(String nome)
    {
        this.nome=nome;
    }

    public void setCapienza(int capienza)
    {
        this.capienza=capienza;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(this == o) return true;
        if(!( o instanceof Aula)) return false;
        Aula aula = (Aula) o;
        return this.capienza == (aula.capienza);
    }

    @Override
    public int hashCode()
    {
        int code;
        Integer cap = capienza;
        code = cap == null? 0 : cap.hashCode();
        return code;
    }

    @Override
    public int compareTo(Aula aula)
    {
        return Integer.compare(this.capienza, aula.capienza);
    }

    public void addPersona(Persona persona)
    {
        if(postiResidui<=0)
            throw new AulaPienaException("Spiacenti, l'aula è già piena. \n");

        miaAula.add(persona);
        postiResidui--;
        numeroPersone++;
    }

    public boolean rimuoviPersona(Persona persona)
    {
        if(postiResidui==capienza && numeroPersone==0)
        {
            throw new AulaVuotaException("Spiacenti, l'aula è già vuota. \n");
        }

        if(miaAula.remove(persona))
        {
            numeroPersone--;
            postiResidui++;
            return true;
        }
        return false;
    }


    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer("* - - AULA " + nome + " - - *" + "\n");
        sb.append("Capienza: " + capienza + " posti\n");
        sb.append("Numero di persone: " + numeroPersone + " persone\n");
        sb.append("Posti residui: " + postiResidui + " posti\n");
        return sb.toString();
    }
}
