/**
 * Created by kapila on 8/20/15.
 */
public class Cal {
    double tot=0;
    public double sum(double a,double b){
        tot=a+b;
        return tot;
    }
    public double sub(double a,double b){
        tot=a-b;
        System.out.println("_____________________________________");
        return tot;
    }
    public double div(double a,double b){
        tot=a/b;
        System.out.println("_____________________________________");
        return tot;
    }
    public double mul(double a,double b){
        tot=a*b;
        System.out.println("_____________________________________");
        return tot;
    }
}
