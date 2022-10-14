/* The Fraction Class */
public class Mod_Frac extends Frac_Master{

    public Mod_Frac() {
    }

    public Mod_Frac(int i) {
        setD(i);
        setN(i);
        frac_to_String();
        System.out.println(getFrac());
    }

    public Mod_Frac(int i, int j) {
        setD(j);
        setN(i);
        frac_to_String();
        System.out.println(getFrac());
    }

    public Mod_Frac(float n){
        setF(n);
        System.out.println("Value = " + getF());
    }

    public void args_BA(String[] args){
    int[] result = new int[2];
    if(args.length == 3){
        int[] frac1 = breakdown(args[0]); int[] frac2 = breakdown(args[2]);
        int lcm = lcm(frac1[1],frac2[1]); int lcm1,lcm2;
        switch (args[1]){
            case "+":
                lcm1 = lcm/frac1[1];
                lcm2 = lcm/frac2[1];
                result[0] = frac1[0]*lcm1 + frac2[0]*lcm2;
                result[1] = lcm;
                break;

            case "-":
                lcm = lcm(frac1[1],frac2[1]);
                lcm1 = lcm/frac1[1];
                lcm2 = lcm/frac2[1];
                result[0] = frac1[0]*lcm1 - frac2[0]*lcm2;
                result[1] = lcm;
                break;

            case "x":
                result[0] = frac1[0] * frac2[0];
                result[1] = frac1[1] * frac2[1];
                break;

            case "/":
                result[0] = frac1[0] * frac2[1];
                result[1] = frac1[1] * frac2[0];
                break;

            default:
                System.console().printf("Invalid Input");

        }
        System.console().printf(args[0] + " " + args[1] + " " + args[2] + " = " + arrayToString(result));
    }
    else{
        System.console().printf("Invalid Input. only 3 argument allowed");
    }

    }

}

