public abstract class GeometrijskiLik {

    private String naziv;

    public abstract double povrsina();

    public abstract double opseg();

    GeometrijskiLik(String naziv){
        super();
        this.naziv= naziv;
    }

    @Override
    public String toString(){
        return "Naziv : " + this.naziv + " , Opseg: " + opseg() + " , Povrsina: " + povrsina();
    }


}
