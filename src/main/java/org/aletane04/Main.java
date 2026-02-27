package org.aletane04;
import org.aletane04.*;
import org.aletane04.people.Persona;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Giovanni", "Persone", LocalDate.of(2004,07,22), "PETRGVN20040722SANOCK");
        System.out.print(p1.toString());
    }
}