//Created by Chevoy j. Ingram
//Version 2.1
//Last Modified : 10/9/2022

public abstract class Frac_Master {

    private int n, d;
    private float f;

    private String frac;

    //Abstract class
    void Frac_Master(){
    }

    //Setters
    public void setD(int d) {
        this.d = d;
    }

    public void setF(float f) {
        this.f = f;
    }
    public void setN(int n) {
        this.n = n;
    }


    //Getters

    void frac_to_String(){
        this.frac = this.n + "/" + this.d;
    }

    public String getFrac() {
        return frac;
    }

    public float getF() {
        return f;
    }

    public int getD() {
        return d;
    }

    public int getN() {
        return n;
    }


    //Helper Functions

    void Frac_to_Float(){
        this.f = (float) this.n/this.d;
        System.out.println("Fraction " + getFrac() + " = " + f);
    }

    public int lcm(int d1, int d2) {
        int cd1 = 1, cd2 = 1;
        while (true) {
            if (d2 > d1) {
                if (d1 * cd1 == d2 * cd2) {
                    return d2 * cd2;
                } else {
                    cd1++;
                    if (d1 * cd1 > d2 * cd2) {
                        cd2++;
                    }
                }
            }
        }
    }

    int gcf(){
        int gcf = 1;

        if(n<=d){
            for(int i = 1; i <= this.n; i++){
                if(((this.n % i) == 0 && ((this.d % i) == 0))){
                    gcf = i;
                }
            }
        }else{
            for(int i = 1; i <= this.d; i++){
                if(((this.n % i) == 0 && ((this.d % i) == 0))){
                    gcf = i;
                }
            }
        }

        return gcf;
    }


    public int[] breakdown(String input){
        int[] fraction = new int[2];
        int split = input.indexOf("/");
        fraction[0] = Integer.parseInt(input.substring(0,split));
        fraction[1] = Integer.parseInt(input.substring(split+1));
        return fraction;
    }

    public String arrayToString(int[] fraction){
        return fraction[0] + "/" + fraction[1];
    }

    void rational_BA(){
        float f1,f2, result;
        String in;
        System.out.println("input first value");
        in = System.console().readLine();
        f1 = Float.parseFloat(in);

        System.out.println("input second  value");
        in = System.console().readLine();
        f2 = Float.parseFloat(in);

        System.out.println("What basic operation would you like to use = | \"+\" | \"-\" | \"/\" | x \"|\"");
        in = System.console().readLine();
        if(in.equals("+")){
            result = f1 + f2;
            System.out.println("the value of : " + f1 + " + " + f2 + " = " + result+ " \n ");
        }
        else if(in.equals("-")){
            result = f1 - f2;
            System.out.println("the value of : " + f1 + " - " + f2 + " = " + result + " \n ");
        }
        else if(in.equals("/")){
            result = f1 / f2;
            System.out.println("the value of : " + f1 + " / " + f2 + " = " + result + " \n ");
        }
        else if(in.equals("x")){
            result = f1 * f2;
            System.out.println("the value of : " + f1 + " * " + f2 + " = " + result + " \n ");
        }else{
            System.out.println("Invalid operation input");
        }

    }

    void lowest_terms(){
        int originN = this.n, originD = this.d;
        int gcf = gcf(); this.n /= gcf; this.d /= gcf;
        System.out.println( originN +" / " + originD + " in lowest terms = " + this.n +" / " + this.d + " \n ");

    }


}
