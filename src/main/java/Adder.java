public class Adder {

    /**
     * This is the sum of all numbers that have been added.
     */
    private double sum;

    /**
     * This is constructor will instantiate a new instance of an adder.
     */
    public Adder() {

    }

    /**
     * This constructor will instantiate a new instance of an adder with an inital sum.
     * @param initialSum This is the starting sum value.
     */
    public Adder(double initialSum) {
        sum = initialSum;
    }

    /**
     * This method will add a new number to the sum.
     * @param number This is the number to add.
     */
    public void addNumber(double number) {
        sum += number;
    }

    /**
     * This is the resulting sum.
     * @return the sum will be returned.
     */
    public double getSum() {
        return sum;
    }
}
