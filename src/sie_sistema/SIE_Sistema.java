
package sie_sistema;


public class SIE_Sistema {

    
    public static void main(String[] args) {
       // Criando material
        Material material = new Material();
        material.descricao = "Parafuso";
        material.saldoAtual = 100;

        // Simulando entrada de estoque
        int quantidadeEntrada = 50;
        material.saldoAtual += quantidadeEntrada;

        // Saída de estoque
        int saida = 120;

        if (material.saldoAtual >= saida) {
            material.saldoAtual -= saida;
            System.out.println("Saída realizada com sucesso!");
        } else {
            System.out.println("Erro: estoque insuficiente!");
        }
        
        // Exibindo resultado
        System.out.println("Material: " + material.descricao);
        System.out.println("Novo saldo: " + material.saldoAtual);
    } 
    }
    
