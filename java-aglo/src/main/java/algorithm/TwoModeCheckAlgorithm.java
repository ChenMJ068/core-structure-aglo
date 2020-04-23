package algorithm;

/**
 *      //////////////////////////////////////
 *     //（MOD11.10）双模校验码系统校验算法
 *     //
 *     //mod1110(code)
 *     //input  string  length> =1
 *     //output string
 *     //////////////////////////////////////////
 *
 * 双模校验算法
 * @author ChenMJ
 * @version TwoModeCheckAlgorithm.class, v 0.1 2020/4/14 9:29  Exp$
 */
public class TwoModeCheckAlgorithm {

    private static String mod1110(String code){

        int i, Ai, Si, MSi, Pi, MPi, A;
        char cc =  code.charAt(0);
        Ai = code.charAt(0) - '0';

        //when i=1
        Si  = 10 + Ai;
        MSi = Si %  10;
        if  ( MSi == 0 ){
            Pi = 10 * 2;
        } else{
            Pi = MSi * 2;
        }
        MPi = Pi % 11;

        //when i> 1
        for (i = 1;i <  code.length();i++){
            Si = MPi + (code.charAt(i)) - '0';
            MSi = Si % 10;
            if ( MSi == 0 ){
                Pi = 10 * 2;
            }else{
                Pi = MSi * 2;
            }
            MPi = Pi % 11;
        }

        switch  (MPi){
            case 0:
                A = 1;
                break;
            case 1:
                A = 0;
                break;
            default:
                A = 11 - MPi;
        }
        //A = A - '0';
        return code + A;
    }

    public static void main(String[] args) {
        String str = "300000000123420200414100033448";
        System.out.println(mod1110(str));
    }
}
