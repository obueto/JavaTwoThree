package chapterFive;

import java.security.SecureRandom;

public class CoinTossing {
    private HeadAndTail headAndTail;

    public HeadAndTail getHeadAndTail() {
        return headAndTail;
    }

    public CoinTossing(HeadAndTail headAndTail) {
        this.headAndTail = headAndTail;
    }

    public static void main(String[] args) {
        ;
flip();

}
public static HeadAndTail flip(){
    int countForHeads = 0;
    int countForTails = 0;
    int coin;
    SecureRandom  secureRandom = new SecureRandom();
    System.out.println("Toss a coin:");
    for (int i = 1; i <= 50; i++ ){
        coin = 1+secureRandom.nextInt(2);
        switch(coin){
            case 1:
                countForHeads++;
                System.out.println(HeadAndTail.HEADS);
                break;
            case 2:
                countForTails++;
                System.out.println(HeadAndTail.TAILS);
                break;

        }

    }
    System.out.println("No of heads is "+ countForHeads);
    System.out.println("No of tails is "+countForTails);
    return HeadAndTail.HEADS;
}

}
