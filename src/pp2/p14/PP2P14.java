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
    //solo un metodo void
    public static void llenarArreglo(int [][]a){
        int i,j,p=0;
        for(i=0;i<7;i++){
              for(j=0;j<7;j++){
                  if(i==j){
                      p=1;
                  }else{
                      p=0;
                  }
                  System.out.print(p +"\t");
            }
              System.out.println("\n");
        }
        
    }
}
