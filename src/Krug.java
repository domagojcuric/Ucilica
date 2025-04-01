public class Krug extends GeometrijskiLik {

    private double radijus;

    public Krug(String naziv, double radijus){
        super(naziv);
        this.radijus = radijus;
    }

    public double getRadijus(){
        return radijus;
    }

    public void setRadijus(double radijus){
        this.radijus = radijus;
    }


    @Override
    public double povrsina() {
        return (Math.pow(radijus,2) * Math.PI);
    }

    @Override
    public double opseg() {
        return 2 * radijus * Math.PI;
    }
}
