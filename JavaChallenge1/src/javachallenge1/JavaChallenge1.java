
package javachallenge1;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jairo
 */
public class JavaChallenge1 {

    public static void main(String[] args) {
        
        String opciones1[]={"Conversor de Monedas","Conversor de Temperatura"};
        
        String monedas[]={"Peso a Dolar","Peso a Euro","Peso a Libras Esterlinas","Peso a Yen Japones"
        ,"Peso a Won sul-coreano","Dolar a Peso COP","Euro a Peso COP","Libras Esterlinas a Peso COP"
        ,"Yen Japones a Peso COP","Won sur-coreano a Peso COP"};
        
        String temperaturas[]={"Celsius a Fahrenheit","Celsius a Kelvin","Farenheit a Celsius","Farenheit a Kelvin","Kelvin a Celsius","Kevin a Farenheit"};
        
        DecimalFormat formato=new DecimalFormat("#.###");
        
        String botones[]={"Si","No"};
        
        int decision=0;
        int cantidad=0;
        int temperatura=0;
        String palabra="";
        String palabra2="";
        double valor=0;
        while(decision==0){
            Object seleccion1=JOptionPane.showInputDialog(null,"Selecciona un opción de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,opciones1,opciones1[0]);
        
            String opcion=seleccion1.toString();
        
        if(opcion.equals("Conversor de Monedas")){
            boolean paso=true;
            while(paso){
                try{
                    cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a convertir"));
                    paso=false;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Valor ingresado no valido");
                }
            }
            String seleccionMoneda=(JOptionPane.showInputDialog(null,"Selecciona la moneda de conversion","Elegir",JOptionPane.QUESTION_MESSAGE,null,monedas,monedas[0])).toString();
            double conversion=0;
            switch(seleccionMoneda){
                case "Peso a Dolar":
                    conversion=0.00021;
                    palabra="Dolares";
                    break;
                case "Peso a Euro":
                    conversion=0.00020;
                    palabra="Euros";
                    break;
                case "Peso a Libras Esterlinas":
                    conversion=0.00017;
                    palabra="Libras Esterlinas";
                    break;
                case "Peso a Yen Japones":
                    conversion=0.028;
                    palabra="Yenes Japoneses";
                    break;
                case "Peso a Won sur-coreano":
                    conversion=0.27;
                    palabra="Wones sur coreanos";
                    break;
                case "Dolar a Peso COP":
                    conversion=4763.02;
                    palabra="Pesos Colombianos";
                    break;
                case "Euro a Peso COP":
                    conversion=5031.29;
                    palabra="Pesos Colombianos";
                    break;
                case "Libras Esterlinas a Peso COP":
                    conversion=5840.53;
                    palabra="Pesos Colombianos";
                    break;
                case "Yen Japones a Peso COP":
                    conversion=35.13;
                    palabra="Pesos Colombianos";
                    break;
                case "Won sul-coreano a Peso COP":
                    conversion=3.67;
                    palabra="Pesos Colombianos";
                    break;
            }
            conversion=conversion*cantidad;
            JOptionPane.showMessageDialog(null, "Tienes "+"$"+formato.format(conversion)+palabra);
        }else{
            boolean paso2=true;
            while(paso2){
                try{
                    temperatura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la temperatura a convertir"));
                    paso2=false;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Valor ingresado no valido");
                }
            }
            
             String seleccionTemp=(JOptionPane.showInputDialog(null,"Selecciona el tipo de temperatura a convertir","Elegir",JOptionPane.QUESTION_MESSAGE,null,temperaturas,temperaturas[0])).toString();
             switch(seleccionTemp){
                 case "Celsius a Fahrenheit":
                     valor=(temperatura*(9/5))+32;
                     palabra2=" °F";
                     break;
                 case "Celsius a Kelvin":
                     valor=temperatura+273.15;
                     palabra2=" K";
                     break;
                 case "Farenheit a Celsius":
                     palabra2=" °C";
                     valor=(temperatura-32)*5/9;
                     break;
                 case "Farenheit a Kelvin":
                     palabra2=" K";
                     valor=(temperatura-32)*5/9;
                     valor+=273.15;
                     break;
                 case "Kelvin a Celsius":
                     valor=temperatura-273.15;
                     palabra2=" °C";
                     break;
                 case "Kevin a Farenheit":
                     valor=((temperatura-273.15)*(9/5))+32;
                     palabra2=" °F";
                     break;
             }
             
             JOptionPane.showMessageDialog(null,"Tu temperatura es de:  "+formato.format(valor)+palabra2);
            
            
        }
        decision=(JOptionPane.showOptionDialog(null,"¿Quieres realizar otras conversiones?","Decision",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,botones,botones[0]));
     }
        
        
    }
    
}
