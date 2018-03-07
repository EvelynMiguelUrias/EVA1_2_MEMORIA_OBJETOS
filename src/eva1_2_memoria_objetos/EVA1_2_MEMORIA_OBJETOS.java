/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_memoria_objetos;

/**
 *
 * @author Evelyn
 */
public class EVA1_2_MEMORIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//OBJETOS AL HEAP Y SE ACCEDE ATRAVES DE LA DIRECCION LA CUAL ESTA ALMACENADA EN EL STACK
        int iOtroVal = 10;
        double dSalario = 500.50;
        Preuba pObj = new Preuba();//pobj ES LA REFERENCIA Y EL new CREA EL ONJETO
        System.out.println("iOtroVal = " + iOtroVal);
        System.out.println("dSalario = " + dSalario);
        System.out.println("pObj = " + pObj);//IMPRIME LA DIRECCION DONDE ESTA EL OBJETO(DIRECCION DE MEMORIA)
        System.out.println("Valor de iVal = " + pObj.iVal);
    }
    
}
class Preuba{
    int iVal = 5;
}