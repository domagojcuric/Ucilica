public class Trokut extends GeometrijskiLik {

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv,double stranicaA,double stranicaB,double stranicaC){

        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;

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

    @Override
    public double povrsina() {
        return 0;
    }

    @Override
    public double opseg() {
        return 0;
    }
}
