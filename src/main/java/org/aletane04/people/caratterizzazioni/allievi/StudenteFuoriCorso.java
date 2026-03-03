package org.aletane04.people.caratterizzazioni.allievi;

import java.time.LocalDate;

public class StudenteFuoriCorso extends Studente
{
    private int numeroMesiFuoriCorso;

    public StudenteFuoriCorso(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, double mP, double mA, int n)
    {
        super(nome,cognome,dataNascita,codiceFiscale,matricola,mP,mA);
        this.numeroMesiFuoriCorso=n;
    }

    @Override
    public String getStato()
    {
        return "Studente fuori corso da " + numeroMesiFuoriCorso + "mesi.\n";
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Numero di mesi da fuoricorso: " + numeroMesiFuoriCorso + "\n");
        return sb.toString();
    }


}
