package ch.iterial.recrutment.java.expressions;

import java.util.stream.Stream;

/**The class
 * that extends expression hierarchy and also
 * plays role of particular object OperatorExpression
 *
 * As we see , can just simply create OperatorExpression object as the operation object
 * between several expressions , entering and saving here Operations object.
 *
 * It's unbelievable useful , as we don't need to write several Expression classes like
 * MultiplyExpression , AdditionExpression , etc. The only one thing what we need is to create the instance of
 * Operations enum , using it's constructor and entering few parameters , that you need.
 *
 * Also this code will demonstrate the best way of resolving similar tasks
 * !
 * Firstly , we use Java 8 and it's lambda expressions.
 * It means , that it is easy to understand what is written ,
 * and all code looks more convenient.
 * !
 * Secondly , we use optimized classes like Stream that has already written
 * methods of Map Reduce pattern.
 * !
 * Map method can be used in any topic of task and reduce method too.(Ex : calculator , string filter , translator , etc.)*/
public class OperatorExpression extends BaseExpression {
    //reference to Operations enumeration
    private final Operations operations;
    //constructor
    protected OperatorExpression(final Operations operations, final Expression... expressions) {
        //saving expressions to super class
        super(expressions);
        //saving the operation object in field
        this.operations = operations;
    }
    //overrides print method
    @Override
    public String print() {
        return "("
                //just entering global var
                //maybe in future it is better to use getters rather than direct getting
            + operations.representation
                /*call method from global Stream class , to make a stream object of expressions.
                * after we call map method for mapping each expression
                * in it's format , calling from it print method.
                * after we call reduce method that receives first and next formats , default identity
                * and in our case makes the string concatenation
                * like reduce("", )*/
            + Stream.of(expressions).map(Expression::print).reduce("", (base, next) -> base + " " + next)
            + ")";
    }
    //overrides eval method
    @Override
    public EvaluationResult eval() {
        return new EvaluationResult(Stream.of(expressions)
                /*call method from global class Stream to make a stream object of expressions.
                * after we call map method and enter the actual value of it for mapping.*/
            .map(expression -> expression.eval().getValue())
                /* after we call reduce method and enter default value of result of each operation ,
                 * and using lambda expression we call apply method from each operation bi function.*/
            .reduce(operations.base, operations.operation::apply));
    }

}
