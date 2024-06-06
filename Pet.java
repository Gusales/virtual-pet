import javax.swing.JOptionPane;

public class Pet {
    private String nome;
    private int fome = 50;
    private int felicidade = 50;
    private int cansaco = 0;

    public Pet(String name) {
        this.nome = name;
    }

    /**
     * getters
     * */
    public void mostrarStatus(){
        String message = "Status atual de " + nome + " ;\n" + "Nível de fome: " + fome + "\n Nível de felicidade: " + felicidade + "\n Nível de cansaço: " + cansaco;
        JOptionPane.showMessageDialog(null, message);
    }

    public int mostrarNivelDeFome(){
        return this.fome;
    }

    public int mostrarNivelDeFelicidade(){
        return this.felicidade;
    }

    public String mostrarNome(){
        return this.nome;
    }

    /**
     * setters
     * */
    public void alimentar(){
        fome -= 10;
        JOptionPane.showMessageDialog(null, nome + " foi alimentado. O nível de fome diminuiu");
    }

    public void brincar(){
        if(cansaco >= 100){
            JOptionPane.showMessageDialog(null, "Seu bixinho está muito cansado para brincar!");
        }
        else{
            felicidade += 10;
            cansaco += 10;
            JOptionPane.showMessageDialog(null, nome + " está brincando e se sentindo mais feliz");
        }
    }

    public void descansar(){
        this.cansaco = 0;
        JOptionPane.showMessageDialog(null, nome + " está descansado!");
    }

    public void passarTempo() {
        fome += 5;
        felicidade -= 5;
        cansaco += 10;
        JOptionPane.showMessageDialog(null, nome + " está ficando mais faminto com o passar do tempo.");
    }
}
