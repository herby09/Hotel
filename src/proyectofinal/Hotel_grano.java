/*
 * Simulamos una clase de recepcion donde se le pide al Usuario cierta informacion
 * Este programa esta con el fin de simular dicho proyecto de recepcion.
 */

package proyectofinal;


import javax.swing.JOptionPane;

public class Hotel_grano {

    Registro misdatos=new Registro();
    

    public Hotel_grano(){
    }
 
    public void DespleguMenu(){ // Metodo que efectua o simula un menu real.
//        try{
//                                   
//        
//        int preg2;
//        
//        do{
//        
       JOptionPane.showMessageDialog(null,"*** Bienvenido Usuario ***");
               
        
            int pregunta =Integer.parseInt(JOptionPane.showInputDialog(null,"HOTEL GRANO DE ORO\n1- Ingresar datos del cliente : \n2- Realizar Check-in : \n3-Administracion: \n4- Finalizar : "));
//            preg2=Integer.parseInt(pregunta);
            while(pregunta!=4){
            
            if (pregunta<4){
            switch(pregunta){               
            case 1:
                
                misdatos.Ingreso();
                                
                break;
                            
                
            case 2:
                
                misdatos.prueba();
                misdatos.DespliegInfDatos();
                
                break;
                
            case 3:
               
                misdatos.Administracion();
                
                break;    
            }
            } else{
             JOptionPane.showMessageDialog(null, "***Error de digitación\nVuelva a intentar***");
                    }   
            pregunta =Integer.parseInt(JOptionPane.showInputDialog(null,"HOTEL GRANO DE ORO\n1- Ingresar datos del cliente : \n2- Realizar Check-in : \n3-Administracion: \n4- Finalizar : "));
            }
         
            
             JOptionPane.showMessageDialog(null, "A salido exitósamente del programa");   
          
      
        }
                  

        }
    
                     
  
       


