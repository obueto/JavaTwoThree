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
        int countForHeads = 0;
        int countForTails = 0;
        SecureRandom  secureRandom = new SecureRandom();
        System.out.println("Toss a coin:");
        int coin = secureRandom.nextInt(2);
        for (int i = 1; i < 3; i++ ){
        switch(coin){
            case 1:
                System.out.println(HeadAndTail.HEADS);
                countForHeads++;
                break;
            case 2:
                System.out.println(HeadAndTail.TAILS);
                countForTails++;
                break;
            default:
                System.out.println("its either a head or tail");

         }

    }
        System.out.println(countForHeads);
        System.out.println(countForTails);


}
}
