package org.aletane04.people.caratterizzazioni.docenza;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DocenteEsterno extends Docente
{
    private String provenienza;

    public DocenteEsterno(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, String matricola, String formazione, double stipendio, String prov)
    {
        super(nome,cognome,dataNascita,codiceFiscale,matricola,formazione,stipendio+ChronoUnit.DAYS.between(LocalDate.of(03,03,2026), LocalDate.now()));
        this.provenienza=prov;
    }

    public String getProvenienza()
    {
        return provenienza;
    }

    public void setProvenienza(String p)
    {
        this.provenienza=p;
    }

    @Override
    public String getRuolo()
    {
        return "Docente esterno di " + provenienza + "\n";
    }



    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Università di provenienza: " + provenienza + "\n");
        return sb.toString();
    }
}
