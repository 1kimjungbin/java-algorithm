import java.util.Random;
public class RandOOP {
    public static void main(String[] args){
        RandAlgo rnd = new RandAlgo();
        rnd.initInput();
        System.out.println(
        "최댓값은" + rnd.getMax + ","
        + "최소값은" + rnd.getMin + "입니다");
    }
}

class RandAlgo {
    int nInput = 100;
    int maxRandom = 1000;
    int[] input = new int[nInput];
    public void initInput() {
        Random rnd = new Random();
        for(int i = 0; i<nInput; i++){
            input[i] = rnd.nextInt(maxRandom)+1;
            System.out.print(input[i] + " ");
        }
        System.out.println(" ");
    }
    public int getMax() {
        int maxValue  = Integer.MIN_VALUE;
        for(int i=0; i<nInput; i++) {
            if(input[i] > maxValue){
                maxValue = input[i];
            }
        }
        return maxValue;
    }
    public int getMin() {
        int minValue  = Integer.MAX_VALUE;
        for(int i=0; i<nInput; i++) {
            if(input[i] > minValue){
                minValue = input[i];
            }
        }
        return minValue;
}