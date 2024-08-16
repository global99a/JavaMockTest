
public class Number {

	
    public static void main(String[] args) {
        NumberPredicate positive=(num)->num>0;
        NumberPredicate negative=(num)->num<0;
        NumberPredicate even=(num)->num%2==0;
        
        System.out.println("Checking if a number is positive : "+ positive.check(10));
        System.out.println("Checking if a number is negative : "+ negative.check(10));
        System.out.println("Checking if a number is even : "+ even.check(10));
    }
}


