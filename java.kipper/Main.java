import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000l;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = false;
        String str = "Arthur";

        for(int j = 100; j >= f; j --){
            System.out.println();
        }

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Arthur");
        nomes.add("Henrique");
        nomes.add("Sena");
        nomes.add("Silveira");
        nomes.add("Edna");
        nomes.add("ana");
        nomes.add("julia");
        nomes.add("gui");
        nomes.remove("gui");

        for(int t = 0; t <= nomes.size(); t++){
           // System.out.println(nomes.get(t));
        }
        

        double resultado = 0.0; 
        int resultadoInt = (int) resultado;

        int meuInt = 20;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);
    }
}