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
    
    public void calentar()
    {
        if(temperatura>minimo && temperatura<maximo)
        {
            temperatura=temperatura+incremento;
        }
        
        
    }
    public void enfriar()
    {
        if(temperatura>minimo && temperatura<maximo)
        {
            temperatura=temperatura-incremento;
        }
        
    }
    public void mostrar()
    {
        System.out.println("temperatura:"+temperatura);
    }
    
}