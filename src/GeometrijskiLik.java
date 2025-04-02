public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private String naziv;

    public abstract double povrsina();

    public abstract double opseg();

    GeometrijskiLik(String naziv){
        this.naziv= naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString(){
        return "Naziv : " + this.naziv + " , Opseg: " + opseg() + " , Povrsina: " + povrsina();
    }

    @Override
    public  int compareTo(GeometrijskiLik drugi){
        return Double.valueOf(this.povrsina()).compareTo(Double.valueOf(drugi.povrsina()));
    }

}
