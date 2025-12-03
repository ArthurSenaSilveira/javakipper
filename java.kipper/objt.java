public class objt {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW");
        Carro meuCarro2 = new Carro("AUDI");
        Carro meuCarro3 = new Carro("FERRARI");

        meuCarro.acelerar();
        meuCarro2.acelerar();
        meuCarro3.acelerar();
    }
}

class Carro {

    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro. O modelo do carro é: " + this.modelo);
    }
}