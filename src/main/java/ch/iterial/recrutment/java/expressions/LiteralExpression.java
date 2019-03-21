package ch.iterial.recrutment.java.expressions;

/**The class
 * that extends expression hierarchy and
 * plays role of particular object LiteralExpression
 *
 * As we see , it can also transfer it's properties.*/
public class LiteralExpression extends BaseExpression {

    private final int value;

    public LiteralExpression(int value) {
        this.value = value;
    }

    @Override
    public EvaluationResult eval() {
        return new EvaluationResult(value);
    }

    @Override
    public String print() {
        return Integer.toString(value);
    }

}
