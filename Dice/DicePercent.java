package Dice;

public class DicePercent {
    public static void main(String[]args){
        double sevenEleven = 0;
        double otherNums = 0;
        Dice d = new Dice();
        for (int i = 0; i<=100;){
            d.roll();
            int n = d.getTotal();
            if (n ==7 || n==11){
                sevenEleven++;
            }
            if(n==2||n==3||n==12){
                otherNums++;
            }
        i++;
        }
        System.out.println("the percent of 7 and 11's is " + sevenEleven +" and the percent of one two and twelves is " + otherNums);
        return;
    }
}
