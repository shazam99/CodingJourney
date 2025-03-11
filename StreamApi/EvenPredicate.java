package StreamApi;

import java.util.function.Predicate;


/** <h1> How to use</h1> Predicate is a <a href="">functionalInterface</a>, that returns ture or false depending upon the condition we set.
 * <p>EvenPredicate ep = new EvenPredicate();</p>
 * <p>system.out.println(ep.test(2))          // true;</p>
 * <p>system.out.println(ep.negate().test(2)) // false;</p>
 */

public class EvenPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2==0;
    }

    @Override
    public Predicate<Integer> negate() {
        return Predicate.super.negate();
    }

}
