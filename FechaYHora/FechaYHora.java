public class FechaYHora
{
    private NumberDisplay hours;
    private NumberDisplay minutes; 
    private NumberDisplay dia;
    private NumberDisplay mes;
    private NumberDisplay año;
    // Cadena FINAL de fdededededecha + hora
    private String displayString;

    public FechaYHora(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        dia = new NumberDisplay(31);
        mes = new NumberDisplay(13); 
        año = new NumberDisplay(100); 
    }

    public String getFechaYHora(){

        return  dia.getDisplayValue() + "-" + mes.getDisplayValue() + "-" + año.getDisplayValue() 
        + " " + hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    // Permita fijar una fecha y hora a través de un método llamado fijarFechaYHora que 
    //requiere de 5 parámetros enteros (dia, mes, año, hora y minutos). 
    //Asumimos que los parámetros que nos pasan tienen valores legales. 

    public void fijarFechaYHora(int dii, int mesi, int añi, int hori, int minuti)
    {
        dia.setValue(dii);
        mes.setValue(mesi);
        año.setValue(añi);
        hours.setValue(hori);
        minutes.setValue(minuti);
    }

    public void avanzar(){
        minutes.increment();
        if (minutes.getValue() == 0){
            hours.increment();
            if (hours.getValue() == 0){
                dia.increment();
                if (dia.getValue() == 1){
                    mes.increment();
                    if (mes.getValue() == 1){
                        año.increment();
                    }
                }
            }
        }
    }

}

