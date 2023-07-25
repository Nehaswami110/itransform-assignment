package ITransformAssignmentFirst;
public class ConpoundInterest{
public static void main(String[] args) {
        double principle = 10000;
        double rate = 8;
        double time = 2;

        double SI = (principle * rate * time / 100);
        System.out.println(SI);

        double CI = principle * (Math.pow((1 + rate / 100), time)) -principle;
        System.out.println(CI);
    }
}
 