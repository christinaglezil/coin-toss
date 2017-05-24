
package coin.toss;

import java.util.Random;


public class CoinToss {
    
    
    public String tossACoin(){//create a method
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0){
            return "HEADS";
        } else {
            return "TAILS";
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        //create an instance
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        
    }
    
}
