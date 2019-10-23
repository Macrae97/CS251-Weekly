package week5.exercises;

public class Main {

    public static void main(String[] args){

        EmpiricalAnalysis empiricalAnalysis = new EmpiricalAnalysis();

        empiricalAnalysis.run(50);
        empiricalAnalysis.run(500);
        empiricalAnalysis.run(5000);
        empiricalAnalysis.run(50000);
    }
}
