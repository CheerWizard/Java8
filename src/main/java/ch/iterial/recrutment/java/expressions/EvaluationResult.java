package ch.iterial.recrutment.java.expressions;

/**This class plays role of transfer model ,
 * that receive appropriate type of value and give it
 * when the class is instantiated.
 * Actually , we can also add here more properties
 * or just extend from it and make some evaluation inheritance.*/
public class EvaluationResult {

    private final int value;

    public EvaluationResult(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
