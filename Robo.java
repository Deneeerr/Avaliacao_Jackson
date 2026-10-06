
public class Robo {
    public int codigo;
    public String nome;
    public int ataque;
    public int defesa;
    public int energia;
    public int win;
    public int lose;
    public int ponto;
    

    Robo(int codigo, String nome, int ataque, int defesa, int energia, int win, int lose, int ponto){
        
        this.codigo = codigo;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.energia = energia;
        this.win = win;
        this.lose = lose;
        this.ponto = ponto;
    }
    
public void Consultar() {

        System.out.println("Código: " + (codigo));
        System.out.println("Nome: " + nome);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Energia " + energia);
        System.out.println("Ponto " + ponto);
        
    }


}
