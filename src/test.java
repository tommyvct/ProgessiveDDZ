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
public enum Category
{
    SOLO, SOLO_CHAIN, 
    // 单，顺子
    PAIR, PAIR_CHAIN, 
    // 对，连对
    TRIO, TRIO_SOLO, TRIO_PAIR, 
    // 三个，三带一，三代二
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

    public Suit getSuit() {
        return suit;
    }
    
    
}

// 一手牌
class Hand
{
    private Category            category;  // 牌型
    private int                 length;    // 长度
    private ArrayList<Card>     content;   // 内容

    public Hand(Category cat, int length, ArrayList<Card> content) 
    {
        this.category = cat;
        this.length = length;
        this.content = content;
    }

    /**
     * 比较两手牌的大小
     * 
     * @param toCompare 要比较的一手牌
     * @return {@code 0}为类型不匹配，负数为小于，正数为大于
     */
    public final int compareTo(Hand toCompare) 
    {
        if (toCompare.getCategory() != this.getCategory())
        {
            return 0;
        }

        switch (this.category) {
            // 比较单牌
            case SOLO:
                return (int) toCompare.getContent().get(0).getRank() - (int) this.getContent().get(0).getRank();
                break;
            
            // 比较顺子
            case SOLO_CHAIN:
                // 如果长度不一样就不用比
                if (toCompare.getLength() != this.getLength()) 
                {
                    return 0;
                } 
                else 
                {
                    
                }
            default:
                break;
        }

        return category.compareTo(o);
    }

    public Category getCategory() {
        return category;
    }


    public int getLength() {
        return length;
    }


    public ArrayList<Card> getContent() {
        return content;
    }


    
    
}