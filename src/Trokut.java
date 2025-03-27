public class Trokut {

    private String naziv;
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv,double stranicaA,double stranicaB,double stranicaC){

        this.naziv = naziv;
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;

    }

    public String getNaziv(){
        return naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public double getStranicaA(){
        return stranicaA;
    }

    public void setStranicaA(double stranicaA){
        this.stranicaA = stranicaA;
    }

    public double getStranicaB(){
        return stranicaB;
    }

    public void setStranicaB(double stranicaB){
        this.stranicaB = stranicaB;
    }

    public double getStranicaC(){
        return stranicaC;
    }

    public void setStranicaC(double stranicaC){
        this.stranicaC = stranicaC;
    }

}
