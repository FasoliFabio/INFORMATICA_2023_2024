
/**
 * Date in input due date,dire quanti giorni intercorrono tra loro
 * 
 * @author Fabio Fasoli
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
public class Es2
{
    public static void main(String[]args){
         int a,a2; 
         int m,m2; 
         int g=-1,g2=-1;
         int i,i2;
         int gt,gt2; //gt vuol dire "giorni trascorsi"
         int diff;
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
            
         do{
             a2=Integer.parseInt(JOptionPane.showInputDialog("Dammi l'anno della seconda data:  "));
         }while(a2<=0);
         do{
             m2=Integer.parseInt(JOptionPane.showInputDialog("Dammi il mese della seconda data:  "));
         }while(m2<1||m2>12);
         if(m2==1||m2==3||m2==5||m2==7||m2==8||m2==10||m2==12){
                  do{
             g2=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della seconda data:  "));
             }while(g2<1||g2>31);
         }
         else if(m2==4||m2==6||m2==9||m2==11){
                  do{
             g2=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della seconda data:  "));
             }while(g2<1||g2>30);
         }
         else if(m2==2){
             if(a2%4==0){
                    do{
                 g2=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della seconda data:  "));
                 }while(g2<1||g2>29);    
             }
             else{
                     do{
                 g2=Integer.parseInt(JOptionPane.showInputDialog("Dammi il giorno della seconda data:  "));
                 }while(g2<1||g2>28);
             }
            }
         gt2=g2;
         for (i2=1;i2<m2;i2++){
             if(i2==1||i2==3||i2==5||i2==7||i2==8||i2==10||i2==12){
                 gt2+=31;
             } 
             else if(i2==4||i2==6||i2==9||i2==11){
                    gt2+=30;  
             } 
             else if(i2==2){
                if(a2%4==0){
                    gt2+=29;
                 } else{
                    gt2+=28;
                 }
             }
            }
         if(gt>gt2){
             diff=gt-gt2;
         }
         else{
             diff=gt2-gt;
         }
         System.out.println("Tra le due date intercorrono "+diff+" giorni.");
    }
}
