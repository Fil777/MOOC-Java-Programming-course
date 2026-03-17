
public class Main {

    public static void main(String[] args) {

//        Hand hand1 = new Hand();
//
//        hand1.add(new Card(2, Suit.DIAMOND));
//        hand1.add(new Card(14, Suit.SPADE));
//        hand1.add(new Card(12, Suit.HEART));
//        hand1.add(new Card(2, Suit.SPADE));
//
//        Hand hand2 = new Hand();
//
//        hand2.add(new Card(11, Suit.DIAMOND));
//        hand2.add(new Card(11, Suit.SPADE));
//        hand2.add(new Card(11, Suit.HEART));
//
//        int comparison = hand1.compareTo(hand2);
//
//        if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0) {
//            System.out.println("better hand is");
//            hand1.print();
//        } else {
//            System.out.println("hands are equal");
//        }
//        Card first = new Card(14, Suit.HEART);
//        Card second = new Card(10, Suit.CLUB);
//        System.out.println(first + " Rank = " + first.getRank());
//        System.out.println(second + " Rank = " + second.getRank());
//        System.out.println("first > second = " + (first.compareTo(second) > 0));
//        Hand hand1 = new Hand();
//        hand1.add(new Card(12, Suit.HEART));
//        hand1.print();
//        System.out.println("Hand1 Rank = " + hand1.getRank());
//        Hand hand2 = new Hand();
//        hand2.add(new Card(3, Suit.SPADE));
//        hand2.add(new Card(9, Suit.SPADE));
//        hand2.print();
//        System.out.println("Hand1 Rank = " + hand2.getRank());
//        System.out.println("Compare = " + hand2.compareTo(hand1));

        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();

    }
}
