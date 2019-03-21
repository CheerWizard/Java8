package ch.iterial.recrutment.java.expressions;

/**The abstraction , that is written with goal to wrap
 * a field of expression array , injection in constructor
 * and also override toString method.
 *
 * As you see , that is so convenient class.
 * If we need to make those properties and methods in other
 * classes that implement Expression interface , we don't need
 * to copy it several time , as we can just extend from this class.*/
public abstract class BaseExpression implements Expression {

    protected final Expression[] expressions;

    public BaseExpression(final Expression... expressions) {
        this.expressions = expressions;
    }

    public String toString() {
        return print();
    }

}
