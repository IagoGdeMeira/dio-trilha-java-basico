package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JUNIOR", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;

        int candidatoAtual = 0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: R$%.2f\n", candidato, salarioPretendido);
            
            if(salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga\n", candidato);
                candidatosSelecionados++;
            }
            
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JUNIOR", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++)
            System.out.printf("O candidato de nº%d é o %s\n", (indice + 1), candidatos[indice]);
        
        System.out.println("Forma abreviada de interação for each");

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
}
