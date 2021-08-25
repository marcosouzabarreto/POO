class Carro {
    private Integer velocidade = 0;
    private String marca = "";
    private String cor = "";

    void acelera() {
        this.velocidade += 10;
    }

    void mostraTudo(){
        System.out.println("Marca = " + this.marca);
        System.out.println("Cor = " + this.cor);
        System.out.println("Velocidade = " + this.velocidade);
    }


    Carro(String cor, String marca){
        this.cor = cor;
        this.marca = marca;
    }
}

public class Introducao {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Preto", "Ferrari");
        carro1.acelera();
        carro1.mostraTudo();
    }
}
