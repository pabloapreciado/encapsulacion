package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Celular;
import vista.VentanaPrincipal;




    public class Controlador implements ActionListener
    {
    
        //Atributos
        private VentanaPrincipal venPrin;
        private Celular model;
        
        
        public Controlador(VentanaPrincipal pVenPrin,Celular pModel)
        {
            this.venPrin = pVenPrin;
            this.model = pModel;
            this.venPrin.miPanelOperaciones.btCalcular.addActionListener(this);
            this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
            this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
            this.venPrin.miPanelEntradaDatos.op.addActionListener(this);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) 
        {
             String comando = e.getActionCommand();
            
            if(comando.equals("calcular"))
           {
                model.setOperador((venPrin.miPanelEntradaDatos.getOperador()));
                model.setNumTelefono(Long.parseLong(venPrin.miPanelEntradaDatos.getnumTelefono()));
                model.setCostMin(Integer.parseInt(venPrin.miPanelEntradaDatos.getcostMin()));
                model.setCantMinut(Integer.parseInt(venPrin.miPanelEntradaDatos.getcantMinut()));
                model.calcularCostoPlan();
                venPrin.miPanelResultado.mostrarResultado(model.getNumTelefono(), model.getOperador(), model.getCostoPlan());
                
           }
            if(comando.equals("borrar"))
            {
                this.venPrin.miPanelEntradaDatos.borrar();
                this.venPrin.miPanelResultado.borrar();
            }
            
            if(comando.equals("salir"))
            {
                System.exit(0);
            }
            } 
}
