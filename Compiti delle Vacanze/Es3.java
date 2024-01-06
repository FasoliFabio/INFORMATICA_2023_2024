 
/**
 * Dato in ingresso n, dare in output il suo corrispondete numero di Fibonacci.
 * 
 * @author Fabio Fasoli
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
public class Es3
{
 public static void main(String[] args){
     int n;
     int i;
     int somma=0;
     int add1=1;
     int add0=0;
     do{
         n=Integer.parseInt(JOptionPane.showInputDialog("Dammi n: "));
     }while(n<0);
     if(n==0){
         System.out.print("0");
     }
     else if(n==1){
         System.out.print("1");
     }
     if(n>1){
      for(i=2;i<=n ;i++){
          somma=add0+add1;
          if(i==(n-2)){
              System.out.print(somma+"+");
          }
          else if(i==(n-1)){
              System.out.print(somma+"=");
          }
          add0=add1;
          add1=somma;
      }
      System.out.print(somma);
     }
 }
}
