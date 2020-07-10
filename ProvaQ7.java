
package provaq7;

/**
 *
 * @author yasmi
 */
public class ProvaQ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      int numerão;
        numerão = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do numero: "));


        if(numerão >= 0){
            numerão = numerão * 2;
        JOptionPane.showMessageDialog(null, "O valor do numero foi positivo, seu valor final é: "+numero);

        }else{
            numerão = numerão * 3;
         JOptionPane.showMessageDialog(null, "O valor do numero foi negativo, então o valor final será triplicado e será de: "+numero);
        }
}
