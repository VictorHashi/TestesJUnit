package sqlGenerator;

public class Main {

    public static void main(String[] args) {
        Gerador gerador = new Gerador("Cargo","String",true,false);
        System.out.println(gerador.gerar());
    }

}
