import java.util.Random;

public class RandAlgorithm {
    public static void main(String arg[]) {
        Rand myRand = new Rand();
        //저장할 멤버변수 설정 (배열 형식)
    int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    //랜덤 변수 만들기
    Random rand = new Random();
    for(int i=0; i<10; i++){
        input[i] = (rand.nextInt(10) + 1);
        System.out.print(input[i] + " ");
    }
    System.out.println("1부터 10사이의 랜덤변수 : " + (rand.nextInt(10) + 1)
    );

    //랜덤 변수에서 최소값 구하기
    int minValue = 999999;
    for(int i = 0; i<10; i++){
        if(input[i] < minValue){
            minValue = input[i];
        }
    }
    }
    
}

//클래스 설계도
class Rand {
    /*
    //저장할 멤버변수 설정
    int [] input;

    //랜덤 변수 만들기
    Random rand = new Random();
    System.out.println("1부터 10사이의 랜덤변수" + (rand.nextInt(10) + 1)
    );

    //랜덤 변수에서 최소값 구하기
    */
}
