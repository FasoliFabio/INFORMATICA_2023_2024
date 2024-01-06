
/**
 * Data in ingresso una data, dire se è ammissibile, e contare quanti giorni sono trascorsi dall'inizio dell'anno
 * 
 * @author Fabio Fasoli
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
public class Es1
{
 public static void main (String[] args){
     int a;
     int m;
     int g=-1;
     int i;
     int gt; //gt vuol dire "giorni trascorsi"
     do{
         a=Integer.parseInt(JOptionPane.showInputDialog("Dammi l'anno della data:  "));
     }while(a<=0);
     do{
         m=Integer.parseInt(JOptionPane.showInputDialog("Dammi il mese della data:  "));
     }while(m<1||m>12);
     if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
              do{
         g=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della data:  "));
         }while(g<1||g>31);
     }
     else if(m==4||m==6||m==9||m==11){
              do{
         g=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della data:  "));
         }while(g<1||g>30);
     }
     else if(m==2){
         if(a%4==0){
                do{
             g=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della data:  "));
             }while(g<1||g>29);    
         }
         else{
                 do{
             g=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della data:  "));
             }while(g<1||g>28);
         }
        }
     gt=g;
     for (i=1;i<m;i++){
         if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
             gt+=31;
         } 
         else if(i==4||i==6||i==9||i==11){
             gt+=30;  
         } 
         else if(i==2){      
             if(a%4==0){
                 gt+=29;
             } else{
                 gt+=28;
             }
         }
        }
        System.out.println("Sono passati " +gt+" giorni dall'inizio dell'anno.");
    }
}
