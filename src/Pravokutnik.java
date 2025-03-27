public class Pravokutnik {

    private String naziv;
    private double stranicaA;
    private double stranicaB;

    public Pravokutnik(String naziv, double stranicaA, double stranicaB){

        this.naziv = naziv;
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
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



}
