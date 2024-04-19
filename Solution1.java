public class Solution1 {
    
    public static void Leer_Numero(int numero) {
        if (numero%2 == 0){
            while (numero >=0){
                System.out.println(numero);
                numero -=2;
            }
        }

    }
      public static void main(String[] args){
          
          Solution1.Leer_Numero(64);
          Solution1.Leer_Numero(33);
      }
    
}