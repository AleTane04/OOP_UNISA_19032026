package org.aletane04.people.caratterizzazioni.docenza;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DocenteEsterno extends Docente
{
    @Override
    public double getStipendio()
    {
        return stipendioBase*1.0/2.0+1.0/10.0* ChronoUnit.DAYS.between(arruolamento, LocalDate.now())
    }
}
