public class Krug {

    private String naziv;
    private double radijus;

    public Krug(String naziv, double radijus){
        this.naziv = naziv;
        this.radijus = radijus;
    }

    public String getNaziv(){
        return naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public double getRadijus(){
        return radijus;
    }

    public void setRadijus(double radijus){
        this.radijus = radijus;
    }


}
