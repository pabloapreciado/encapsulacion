package modelo;

public class Celular 
{
    //---------------------
    //Atributos
    //-------------------
    private double costMin;
    private Object operador;
    private long numTelefono;
    private int cantMinut;


    //---------------------
    //Metodos 
    //-------------------
    double costoTotal;
    
    //Constructor por defecto 
    public Celular()
    {
    }

    //Constructor comun u ordinario 
    public Celular(String op,int cosMinu,Long numTel,int cMint)
    {
        this.costMin=cosMinu;
        this.operador=op;
        this.numTelefono=numTel;
        this.cantMinut=cMint;
    }

    //constructor de copia
    public Celular(Celular C)
    {
        costMin = C.getCostMin();
        operador = C.getOperador();
        numTelefono= C.getNumTelefono();
        cantMinut=(int) C.getCantMinut();
    }

    //Metodos de acceso
    public int getCantMinut() {
        return cantMinut;
    }

    public void setCantMinut(int cantMinut) {
        this.cantMinut = cantMinut;
    }
     public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Long numTelefono) {
        this.numTelefono = numTelefono;
    } 
    public Object getOperador() {
        return operador;
    }

    public void setOperador(Object operador) {
        this.operador = operador;
    } 
    public void setCostMin(Double costMin) 
    {
        this.costMin = costMin;
    }
    public Double getCostMin() {
        return costMin;
    }

    public double calcularCostoPlan()
     {
         costoTotal = costMin *cantMinut;
         if(operador.equals("movilujos"))
         {
             costoTotal = costoTotal * 0.5;
         }
         return costoTotal;
    }

    public String toString()
    {
        return cantMinut + "/"+ numTelefono + "/"+ operador + "/"+ costoTotal;
    }

   

    //metodo ejecutable
    public static void main(String[] args) 
    /** 
    {
        Celular c1 = new Celular();
        c1.setNumTelefono(314454656l);
        c1.setCantMinut(15);
        c1.setOperador("movilujos");
        System.out.println(c1);
        System.out.println("el numero de celular es " +c1.getNumTelefono() + " el saldo total es de : " + c1.calcularCostoPlan());
    }
    /**/
}
