package org.example.desafio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConverterHora {
    public String  converterSegundoParaHora(long segundos){
        Date data = new Date(segundos*1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(data);
    }
}
