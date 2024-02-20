package Ficha1;

import java.util.Scanner;

public class ExercicioFinal {
    public static void main(String[] args) {

        // ler variaveis

        double ven_dia =40, sub_dia=5, reten=0.1, seguranca_social = 0.11, encargo_func=0.2375, valor_iliquido, total_sub_ali, valor_rete_irs, total_valor_seg_social, valor_liquido;

        int codigo, numero_dias;

        //ler valores de entrada
        Scanner input_= new Scanner( System.in);
        System.out.println("Código do funcionário : ");
        codigo= input_.nextInt();
        System.out.println("Indique o número de dias que trabalhou : ");
        numero_dias= input_.nextInt();

        valor_iliquido=(numero_dias*(ven_dia+sub_dia));

        total_sub_ali = sub_dia*numero_dias;
        valor_rete_irs = numero_dias*ven_dia*reten;
        total_valor_seg_social = numero_dias*ven_dia*seguranca_social + numero_dias*ven_dia*encargo_func;
        valor_liquido = valor_iliquido-((((numero_dias)*(sub_dia+ven_dia))*reten)+ (((numero_dias)*(sub_dia+ven_dia))*seguranca_social));
        System.out.printf(" valor iliquido : " + valor_iliquido + "\n total subsidio de alimentaçao : " + total_sub_ali +
                "\n valor retencao de irs : " + valor_rete_irs+
                "\n valor total a Seg.Social : " + total_valor_seg_social+
                "\n valor liquido : " + valor_liquido );






    }
}
