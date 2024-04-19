import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution2 {

    public class Personas {
        String sexo;
        int edad;

        public Personas( String sexo, int edad){
            this.sexo = sexo;
            this.edad = edad;
        }
    }
    
    public static void Leer_Personas(List<Personas> clasificacion) {
        int numeroPersonas = clasificacion.size();
        int numeroMayores = 0;
        int numeroHombres = 0;
        int numeroHMayor = 0;
        int numeroMMayor = 0;

        for (Personas persona : clasificacion){
            if (persona.sexo=="H"){
                numeroHombres++;
            }
            if(persona.edad >=18){
                numeroMayores++;
                if (persona.sexo=="H"){numeroHMayor++;}
                else {numeroMMayor++;}
            }
        }

        System.out.println("a. La cantidad de personas mayoras de edad es de "+numeroMayores+" personas");
        System.out.println("b. La cantidad de personas menores de edad es de "+(numeroPersonas-numeroMayores)+" personas");
        System.out.println("c. La cantidad de personas masculinas mayores de edad es de "+numeroHMayor+" personas");
        System.out.println("d. La cantidad de personas femeninas mayores de edad es de "+numeroMMayor+" personas");
        double porcentajeMayor = numeroMayores * 1.0 / numeroPersonas;
        System.out.println("e. El porcentaje de personas mayores de edad es de "+porcentajeMayor+"%");
        double porcentajeMujeres = (numeroPersonas - numeroHombres) * 1.0 / numeroPersonas;
        System.out.println("f. El porcentaje de mujeres es de "+porcentajeMujeres+"%");
        
    }
      public static void main(String[] args){

        Solution2 solution2 = new Solution2();
          
        List<Personas> personas = new ArrayList<Personas>();
        List<String> sexos = new ArrayList<String>();
        sexos.add("H");
        sexos.add("M");
        
        Random ran = new Random();
        for (int i=0; i <50; i++){
            int index = ran.nextInt(2);
            Personas persona = solution2.new Personas(sexos.get(index),ran.nextInt(100));
            personas.add(persona);
            System.out.println(persona.edad +" "+ persona.sexo);
        }
        Solution2.Leer_Personas(personas);
      }
}


