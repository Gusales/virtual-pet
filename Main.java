import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String mensagemInicial = "Bem vindo ao Simulador de Animal de Estimação Virtual!\nDigite o nome do seu animal de estimação:";
        String nomePet = JOptionPane.showInputDialog(null, mensagemInicial,
                "Oi amigo!", JOptionPane.INFORMATION_MESSAGE);

        while (nomePet == null || nomePet.isEmpty() || nomePet.strip() == ""){
            nomePet = JOptionPane.showInputDialog(null, "Digite um nome válido para seu pet!", "erro", JOptionPane.ERROR_MESSAGE);
        }

        nomePet = nomePet.strip();

        Pet pet = new Pet(nomePet);
        while(true){
            String mensagemEscolha = "\n Escolha uma ação: \n 1. Alimentar " + nomePet + "\n 2. Brincar com " + nomePet + "\n 3. Verificar o status do Pet" + "\n 4. Sair do Virtual PET" + "\n 5. Deixar seu bixinho descansar!";

            String escolha = JOptionPane.showInputDialog(mensagemEscolha);
            if(escolha.isEmpty()){
                return;
            }
            char escolhaChar = escolha.charAt(0);

            switch (escolhaChar){
                case '1':
                    pet.alimentar();
                    break;
                case '2':
                    pet.brincar();
                    break;
                case '3':
                    pet.mostrarStatus();
                    break;
                case '4':
                    int confirmarSair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do seu bixinho virtual?", "Realmente deseja sair?", JOptionPane.OK_CANCEL_OPTION);
                    if (confirmarSair == 0){
                        JOptionPane.showMessageDialog(null, "Adeus, amigo :(");
                        return;
                    }
                case '5':
                    pet.descansar();
            }
        }
    }
}
