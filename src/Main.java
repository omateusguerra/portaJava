public class Main {
    public static void main(String[] args) {

        Porta p1 = new Porta("Marrom", false, 2.1, 0.9, 0.06);

        System.out.println(p1.getCor());
        System.out.println(p1.getAltura());
        System.out.println(p1.getComprimento());
        System.out.println(p1.getLargura());

        p1.abre();
        p1.fecha();

        p1.setCor("azul");
        System.out.println(p1.getCor());

        p1.setAltura(2.8);
        System.out.println(p1.getAltura());

        p1.setComprimento(1.2);
        System.out.println(p1.getComprimento());

        p1.setLargura(0.1);
        System.out.println(p1.getLargura());

        p1.estaAberta();

    }
}