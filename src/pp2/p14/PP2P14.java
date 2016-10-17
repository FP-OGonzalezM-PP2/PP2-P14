/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p14;
//no ocupamos Scanner
/**
 *
 * @author Alumno
 */
public class PP2P14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // main de solo 2 renglones
        int[][] arreglo = new int[7][7];
        llenarArreglo(arreglo);
    }
    //solo un metodo void para todo el programa
    public static void llenarArreglo(int [][]a){
        int i,j,p=0;
        for(i=0;i<7;i++){
              for(j=0;j<7;j++){
                  if(i==j){
                      //solo se escribira un 1 cuando i y j son iguales
                      p=1;
                  }else{
                      p=0;
                  }
                  System.out.print(p +"\t");
                  //Usando el comando "\t" para tabular
            }
              System.out.println("\n");
              //Aqui va el salto de lineas porque salta cada vez que evalua j
        }
        
    }
}
