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


    //provjerava se da li je trokut
    public static boolean isValidTriangle(double stranicaA, double stranicaB, double stranicaC) {
        return (stranicaA + stranicaB > stranicaC) && (stranicaA + stranicaC > stranicaB) && (stranicaB + stranicaC > stranicaA);
    }

    @Override
    public double povrsina() {
        if(isValidTriangle(stranicaA, stranicaB, stranicaC)){
            double opseg = stranicaA + stranicaB + stranicaC;
            double poluOpseg = opseg / 2;
            return Math.sqrt(poluOpseg * (poluOpseg - stranicaA) * (poluOpseg - stranicaB) * (poluOpseg - stranicaC));
        }else {
            return 0;
        }
    }

    @Override
    public double opseg() {
        if(isValidTriangle(stranicaA, stranicaB, stranicaC)) {
            return stranicaA + stranicaB + stranicaC;
        }else {
            return 0;
        }
    }
}
