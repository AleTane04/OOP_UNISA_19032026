package org.aletane04.buildings;
import org.aletane04.exceptions.EdificioPienoException;
import org.aletane04.exceptions.EdificioVuotoException;

import java.util.*;

public class Edificio
{
    private String id;
    private String nome;
    private int numeroAule;
    private int capienzaEdificio;
    private int postiResidui;
    Set<Aula> aule;


    public Edificio(String id, String nome, int capienzaEdificio)
    {
        aule = new TreeSet<>();
        this.numeroAule=0;
        this.id = id;
        this.nome = nome;
        this.capienzaEdificio = capienzaEdificio;
        this.postiResidui=capienzaEdificio;
    }



    /* Id */
    public void setId()
    {
        this.id=id;
    }

    public String getId()
    {
        return id;
    }

    /* Nome */

    public String getNome()
    {
        return nome;
    }
    public void setNome()
    {
        this.nome=nome;
    }

    /* Gestione aule */
    public int getNumeroAule()
    {
        return numeroAule;
    }

    public void addAula(Aula aula)
    {
        /*Edificio Pieno*/
        if(postiResidui - aula.getCapienza() < 0)
            throw new EdificioPienoException("Spiacente, l'edificio non supporta ulteriori studenti. Riprovare con un'aula più piccola. \n");
        /*Ci sono posti */
        if(!aule.add(aula))
            return;
        /*Aggiorno la capienza*/
        postiResidui-=aula.getCapienza();
        /* Aggiorno il numero delle aule */
        numeroAule++;
    }

    public boolean removeAula(Aula aula)
    {
        if(numeroAule==0)
            throw new EdificioVuotoException("Spiacente, l'edificio non ha alcuna aula al suo interno. \n");

        if(aule.remove(aula))
        {
            numeroAule--;
            return true;
        }

        return false;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("* - - EDIFICIO " + nome + " - - *\n");
        sb.append("ID: " + id + "\n");
        sb.append("NOME: " + nome + "\n");
        sb.append("CAPIENZA: " + capienzaEdificio + "\n");
        sb.append("POSTI RESIDUI: " + postiResidui + "\n");
        for(Aula aula : aule)
        {
            sb.append(aula + "\n");
        }
        return sb.toString();
    }







}
