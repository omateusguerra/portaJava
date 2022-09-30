public class Porta {

    private boolean aberta;
    private String cor;
    private double altura;
    private double comprimento;
    private double largura;

    public Porta(String cor, boolean aberta, double altura, double comprimento, double largura){
        this.cor = cor;
        this.aberta = aberta;
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public String getCor(){

        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getAltura(){

        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getComprimento() {

        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public double getLargura(){

        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public void abre(){
        this.aberta = true;
    }

    public void fecha(){

        this.aberta = false;
    }

    public void estaAberta(){
        if(aberta == true){
            System.out.println("A porta está aberta.");
        }else if (aberta == false){
            System.out.println("A porta está fechada.");
        }else {
            System.out.println("Valor não identificado!");
        }
    }
}
