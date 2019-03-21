package ch.iterial.recrutment.java.expressions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static ch.iterial.recrutment.java.expressions.ExpressionFactory.add;
import static ch.iterial.recrutment.java.expressions.ExpressionFactory.literal;
import static ch.iterial.recrutment.java.expressions.ExpressionFactory.mult;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
/**Just the demonstration class.*/
public class ExpressionTest {

    private static int eval(Expression expression) {
        return expression.eval().getValue();
    }

    private static String formatUsingPrefixNotation(Expression expression) {
        return expression.toString();
    }

    /**
     * 3 + 4 * 5 = 23
     */
    @Test
    public void expression1ShouldReturn23() {
        Expression expression = add(literal(3), mult(literal(4), literal(5)));

        assertThat(eval(expression)).isEqualTo(23);
        assertThat(formatUsingPrefixNotation(expression)).isEqualTo("(+ 3 (* 4 5))");
    }

    /**
     * (3 + 4) * 5 = 35
     */
    @Test
    public void expression2ShouldReturn35() {
        Expression expression = mult(add(literal(3), literal(4)), literal(5));

        assertThat(eval(expression)).isEqualTo(35);
        assertThat(formatUsingPrefixNotation(expression)).isEqualTo("(* (+ 3 4) 5)");
    }

    /**
     * 1 + 2 * 3 + 4 = 11
     */
    @Test
    public void expression3ShouldReturn11() {
        Expression expression = add(literal(1), mult(literal(2), literal(3)), literal(4));

        assertThat(eval(expression)).isEqualTo(11);
        assertThat(formatUsingPrefixNotation(expression)).isEqualTo("(+ 1 (* 2 3) 4)");
    }

    /**
     * 8 = 8
     */
    @Test
    public void expression4ShouldReturn8() {
        Expression expression = literal(8);

        assertThat(eval(expression)).isEqualTo(8);
        assertThat(formatUsingPrefixNotation(expression)).isEqualTo("8");
    }

    /**
     * 1 + 2 + 3 + 4 = 10
     */
    @Test
    public void expression5ShouldReturn10() {
        Expression expression = add(literal(1), literal(2), literal(3), literal(4));

        assertThat(eval(expression)).isEqualTo(10);
        assertThat(formatUsingPrefixNotation(expression)).isEqualTo("(+ 1 2 3 4)");
    }

}
