import java.util.ArrayList;
import java.util.Set;

/**
 * test
 */
public class test 
{

    public static void main(String[] args) 
    {
        
    }
}

// 花色枚举，初期没什么用
public enum Suit
{
    CLUBS, DIAMONDS, HEARTS, SPADES;
    //草花，  方片，   红桃，   黑桃
}

// 大小枚举
public enum Rank
{
     R3, R4, R5, R6, R7, R8, R9, R10, RJ, RQ, RK, RA, R2,      RLJ, RBJ;
    //3,  4,  5,  6,  7,  8,  9,  10,  J,  Q,  K,  A,  2,     小王, 大王
    //                                                     Little/Big Joker
}

// 牌型枚举
public enum HandsCategory
{
    SOLO, SOLO_CHAIN, 
    // 单，顺子
    PAIR, PAIR_CHAIN, 
    // 对，连对
    TRIO, TRIO_SOLO, TRIO_PAIR, 
    // 三个， 三带一，三代二
    AIRPLANE, AIRPLANE_SOLO, AIRPLANE_PAIR,
    // 飞机，飞机带单，飞机带对
    BOMB, QUAD_DUAL_SOLO, QUAL_DUAL_PAIR,
    // 炸弹，四带二，四带两对
    ROCKET;
    // 火箭、王炸
}

// 一张牌
class Card 
{
    private Rank rank;
    private Suit suit;



    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    
    
}

// 一手牌
class Hand
{
    private HandsCategory cat;       // 牌型
    private short         length;    // 长度
    private ArrayList     content;   // 内容
    public Hand() {
    }
    
}