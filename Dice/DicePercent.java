package Dice;

public class DicePercent {
    public static void main(String[]args){
        double sevenEleven = 0;
        double otherNums = 0;
        Dice d = new Dice();
        for (int i = 0; i<=100; i++){
            d.roll();
            int n = d.getTotal();
            if (n ==7 || n==11){
                sevenEleven++;
            }
            if(n==2||n==3||n==12){
                otherNums++;
            }
        double sevenPercent = sevenEleven/100;
        double otherPercent = otherNums/100;
        return sevenPercent,otherPercent;
        }
    }
}
