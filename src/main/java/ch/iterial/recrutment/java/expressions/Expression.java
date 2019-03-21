package ch.iterial.recrutment.java.expressions;

/**The interface that mark , which object has expression functionality.
 * As it is an interface , we can lightly enter here all methods ,
 * that we wanna see in expression objects.*/
public interface Expression {
    //method that will make the evaluation in each class
    //in some classes it will just return the object of EvaluationResult class
    EvaluationResult eval();
    //prints the format of each expression
    String print();

}
