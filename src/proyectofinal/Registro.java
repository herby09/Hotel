/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;

import javax.swing.JOptionPane;



public class Registro {
    
    public Clientes micliente []=new Clientes[10];
    public int contable, num=1;
    private long Clave = 123;
    private int Sumatoria;
    public String vectoro[][]; 
    public int diasvector[];
    public int b=1;
    public int contador=1, interes=1;
    public int bajo=500;
    public int eco=1000;  // Datos estipulados ya por el Hotel de sus respectivas habitaciones.
    public int big=1500;  // con un valor en dolares ($).
    public int vip=2000;
    
    
    
    
    
    public Registro() {  // Constructor por defecto.
        
    for(int a=0;a<micliente.length;a++){//Crea vector vacio
    micliente[a]=new Clientes();    
    }
    
    micliente[0]=new Clientes("Ricardo", 22222222, "Costarricense", (byte)50, (byte)4);
    
    }
    
    public void Ingreso(){
         
           micliente[contador].nombreClient=JOptionPane.showInputDialog(null, "Digite el nombre del Cliente #"+(contador)+" :");     ;  
           micliente[contador].phoneNum=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Telefono:"));
           micliente[contador].nacionalidad=JOptionPane.showInputDialog("Digite Pais de Procedencia del Cliente:");
           micliente[contador].edad=Byte.parseByte(JOptionPane.showInputDialog("Digite su edad respectiva:"));           
           micliente[contador].dias=Byte.parseByte(JOptionPane.showInputDialog("Digite los dias de estadia:"));
 
        System.out.println(micliente[contador]);   
           contador++;
           
//        String name;
//            name = );+
//           String.valueOf()); 
        
            JOptionPane.showMessageDialog(null,"Muchas gracias");
    }
   
    
    public void DespliegInfDatos(){// Tipo Recibo del Cliente.
        
        
          JOptionPane.showMessageDialog(null,"*** Recibo del Cliente ***"
                  + "\n"+micliente[b]);  
        b++;
    }
    
    
      public double sumataxs(int num1,int num2){// Respectivo calculo para el cobro al cliente con Inpuesto de venta del 13%.
              
        
        int calculodias=num1*num2;        
        double resultado=calculodias*0.13;
        double suma=resultado+calculodias; 
        
        return suma;
    }
   
  
    
    public void prueba(){ // Opcion de, toma de decision de parte del Cliente para poder escoger su habitacion.
       
        JOptionPane.showMessageDialog(null,"Resumen de Habitaciones\n1-Habitación común de 1 cuarto\n2-Habitación económica 2 cuartos\n3-Habitación grande 2 cuartos y mini bar\n4-VIP Casa equipada(Piscina, cocina y 5 cuartos con su respectivo baño.");
        int pregunta=Integer.parseInt(JOptionPane.showInputDialog(null,"Que habitacion desea ocupar en su estadia:\n1-Habitacion Normal:$500\n2-Habitacion Economica:$1000\n3-Habitacion Grande:$1500\n 4-Habitacion VIP:$2000"));
        if(pregunta==1){
                                        
             JOptionPane.showMessageDialog(null,"**Registrando**");
             JOptionPane.showMessageDialog(null,"Total a pagar es de :$" + sumataxs(bajo,micliente[interes].dias)+"\nDesgloce de pago\n$"+(bajo*micliente[interes].dias)+" más el 13% de impuesto de venta");    
             
             
             contable+=sumataxs(bajo, micliente[interes].dias);
             interes++;
        }else if(pregunta==2){
            
             JOptionPane.showMessageDialog(null,"**Registrando**");
             JOptionPane.showMessageDialog(null,"Total a pagar es de :$" + sumataxs(eco,micliente[interes].dias)+"\nDesgloce de pago\n$"+(eco*micliente[interes].dias)+" más el 13% de impuesto de venta");        
              contable+=sumataxs(eco, micliente[interes].dias);
              interes++;
        }else if(pregunta==3){
            
            
            
             JOptionPane.showMessageDialog(null,"**Registrando**");        
             JOptionPane.showMessageDialog(null,"Total a pagar es de :$" + sumataxs(big,micliente[interes].dias)+"\nDesgloce de pago\n$"+(big*micliente[interes].dias)+" más el 13% de impuesto de venta");        
              
             contable+=sumataxs(big, micliente[interes].dias);
        }else if(pregunta==4){
            
             JOptionPane.showMessageDialog(null,"**Registrando**");
             JOptionPane.showMessageDialog(null,"Total a pagar es de :$" + sumataxs(vip,micliente[interes].dias)+"\nDesgloce de pago\n$"+(vip*micliente[interes].dias)+" más el 13% de impuesto de venta");   
             contable+=sumataxs(vip, micliente[interes].dias);
        }
        
    
    }
    
    void Administracion(){//Parte administrativa, 
      
        
        int clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave de administrador"));
        if (clave == Clave) {
            int Lista = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la área administrativa\n1-Reporte contable\n2-Reinicio del sistema\n3-Cierre"));
            switch (Lista) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Reporte contable: "+contable);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Reiniciando");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Cerrando módulo de administración");
                    break;
                default:
            ;
            }
        } else {
            JOptionPane.showMessageDialog(null, "***Error***");
        }
    }
    
  
}
