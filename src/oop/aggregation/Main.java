package oop.aggregation;

public class Main {

    public static void main(String[] args) {

        Racket racket = new Racket("AAA", 2.5);
        TennisPlayer player = new TennisPlayer("Punnawit", racket);

        System.out.println(player.getName() + " " + racket);

    }
}
