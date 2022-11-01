import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            aprovado = true;
            desafiante = l1;
            desafiado = l2;
        }else {
            aprovado = false;
            desafiado = null;
            desafiante = null;
        }
    }
    public void lutar(){

        if (aprovado == true){
            int r1;
            int r2;
            Random gerador = new Random();

            desafiado.apresenta();
            desafiante.apresenta();

            r1 = gerador.nextInt(11);
            r2 = gerador.nextInt(11);

            if (r1>r2){
                System.out.println("O lutador "+ desafiante.getNome() + " Ganhou");
                desafiante.ganharLuta();
                desafiante.perderLuta();
            }

            if (r1<r2){
                System.out.println("O lutador" + desafiado.getNome() + " Ganhou");
                desafiado.ganharLuta();
                desafiado.perderLuta();
            }

            if (r1 == r2){
                System.out.println("A luta terminou empatada");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            }

        }else{
            System.out.println("A luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
