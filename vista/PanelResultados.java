package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


 
public class PanelResultados extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.GRAY);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 440, 50);
        add(spResultado);
       
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultado");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Borar los resultados
    public void borrar()
    {
        taResultado.setText("");
    }
    
    //Mostrar resultado
    public void mostrarResultado(long numTelefono, Object operador ,double calcularCostoPlan )
    {
        taResultado.setText("el numero es:"+numTelefono+"\nOperador: "+operador+"\nel saldo a pagar: "+ calcularCostoPlan);
    }
}
