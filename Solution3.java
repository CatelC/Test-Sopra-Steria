public class Solution3 {
    
    public double salario(int horasTrabajadas, double tarifa){
        double salario=0;

        if (horasTrabajadas < 40){
            salario += horasTrabajadas * tarifa;
        }
        else{
            int horasSupp = horasTrabajadas - 40;
            salario += 40*tarifa + horasSupp*tarifa*1.5;
        }


        return salario;
    }


    public static void main(String[] args){

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.salario(55, 12.5));

    }
}
