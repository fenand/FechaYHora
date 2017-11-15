
/**
 * Write a description of class FechaYHora2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaYHora2
{
    // instance variables - replace the example below with your own
    private CalendarioBasico calendario;
    private ClockDisplay reloj;

    /**
     * Constructor for objects of class FechaYHora2
     */
    public FechaYHora2()
    {
        calendario = new CalendarioBasico();
        reloj = new ClockDisplay();
    }

    public String getFechaYHora()
    {
        return calendario.obtenerFecha() + " " +reloj.getTime();
    }

    public void fijarFechaYHora(int dia, int mes, int año,int hora,int minutos)
    {
        calendario.fijarFecha(dia,mes,año);
        reloj.setTime(hora,minutos);
    }

    public void avanzar()
    {
        reloj.timeTick();
        if(reloj.getTime().equals("00:00")){
            calendario.avanzarFecha();
        }
    }
}
