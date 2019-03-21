package ch.iterial.recrutment.java.expressions;

import static ch.iterial.recrutment.java.expressions.Operations.ADD;
import static ch.iterial.recrutment.java.expressions.Operations.MUTL;
/**The simple factory class , that create instances of each class
 * that implements Expression interface.
 *
 * The main benefit here is the returning type of methods.
 * As we see , it returns Expression type and it means */
public class ExpressionFactory {
    //for LiteralExpression
    public static Expression literal(int value) {
        return new LiteralExpression(value);
    }
    //for OperatorExpression
    public static Expression add(Expression... expressions) {
        return new OperatorExpression(ADD, expressions);
    }
    //for OperatorExpression
    public static Expression mult(Expression... expressions) {
        return new OperatorExpression(MUTL, expressions);
    }
}
