import javax.swing.JOptionPane;

public class Pet {
    private String nome;
    private int fome = 50;
    private int felicidade = 50;

    public Pet(String name) {
        this.nome = name;
    }

    /**
     * getters
     * */
    public void mostrarStatus(){
        String message = "Status atual de " + nome + " ;\n" + "Nível de fome: " + fome + "\n Nível de felicidade: " + felicidade;
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
        felicidade += 10;
        JOptionPane.showMessageDialog(null, nome + " está brincando e se sentindo mais feliz");
    }

    public void passarTempo() {
        fome += 5;
        JOptionPane.showMessageDialog(null, nome + " está ficando mais faminto com o passar do tempo.");
    }
}
