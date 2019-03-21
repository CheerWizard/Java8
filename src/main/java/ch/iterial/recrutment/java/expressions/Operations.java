package ch.iterial.recrutment.java.expressions;

import java.util.function.BiFunction;

/**The enum class with operation types.
 *
 * Using own constructor ,
 * that will save in fields representation of operation as char type ,
 * base value of integer type
 * and , actually , the operation of BiFunction type
 * that a function that accepts two arguments and produces a result.
 * As you see , all our functions have integer type*/
public enum Operations {
    /*adding numbers a and b with + operation
     * that will be recognized as '+'
     * the start value of addition is 0*/
    ADD('+', (a, b) -> a + b, 0),
    /*multiply numbers a and b with * operation
     * that will be recognized as '*'
     * the start value of multiplication is 1*/
    MUTL('*', (a, b) -> a * b, 1);
    //representation - means char view of each operations
    /*like '-' is -
     * or '*' is * */
    final char representation;
    //the BiFunction that we are realizing in each operation types
    final BiFunction<Integer, Integer, Integer> operation;
    /*the start value for each operation
     * like for addition it's 0
     * or for multiplication it's 1*/
    final int base;

    //constructor
    Operations(final char representation, final BiFunction<Integer, Integer, Integer> operation, final int base) {
        this.representation = representation;
        this.operation = operation;
        this.base = base;
    }

}