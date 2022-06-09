public class Fraccionario
{
    //---------------------
    //Atributos
    //-------------------
    private int numerador;
    private int denominador;


    //---------------------
    //Metodos 
    //-------------------

   
    //Constructor por defecto 
    public Fraccionario()
    {
        numerador=1;
        denominador=1;
    }

    //Constructor comun u ordinario 
    public Fraccionario(int num,int den)
    {
        this.numerador=num;
        this.denominador=den;
    }

    //constructor de copia
    public Fraccionario(Fraccionario f)
    {
        numerador = f.getNumerador();
        denominador = f.getDenominador();
    }

    //metodos de acceso  
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

  public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) 
    {
        this.denominador = denominador;
    }
    //en el metodo to string hace que se imprima los objetos de la forma que se indica en el system ot print 
    public String toString()
    {
        return numerador + "/"+ denominador;
    }

    //metodo ejecutable
    public static void main(String[] args) 
    
    {
        Fraccionario f1=new Fraccionario();
        System.out.println("objeto 1 " + f1);
        Fraccionario f2=new Fraccionario(3,7);
        System.out.println("objeto 2 " + f2);
        Fraccionario f3=new Fraccionario(f2);
        System.out.println("objeto 3 " + f3);
    }


}