
/**
 * @author Raul Gonzalez Gonzalez
 * @version 3.5.1
 */
public class Calentador
{
    private int temperatura;
    private int incremento;
    private int minimo;
    private int maximo;
    public Calentador(int min,int max)
    {
        temperatura=15;
        incremento=3;
        minimo=min;
        maximo=max;
    }
    /**
     * metodo que permite calentar la temperatura del calentador.
     */
    public void calentar()
    {
        if(temperatura>minimo && temperatura<maximo)
        {
            temperatura=temperatura+incremento;
        }
        
        
    }
    /**
     * metodo que permite enfriar la temperatura del calentador.
     */
    public void enfriar()
    {
        if(temperatura>minimo && temperatura<maximo)
        {
            temperatura=temperatura-incremento;
        }
        
    }
    /**
     * metodo que permite mostrar la temperatura registrada.
     */
    public int mostrar()
    {
        return temperatura;
    }
    /**
     * @param metodo que recibe como parametro el valor del incremento que se 
     * desea en el calentador.
     */
    public void modIncremento(int modIncre)
    {
        if(modIncre>0)
        {
            incremento=modIncre;
        }
    }
    
}