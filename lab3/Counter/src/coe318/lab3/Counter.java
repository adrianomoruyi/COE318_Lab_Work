/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int modData;
    Counter leftData;
    int digitData;
    int counterData;
    
    public Counter(int modulus, Counter left) {
        leftData = left;
        modData = modulus;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.modData;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        
        if (leftData == null)
        {
            return null;
        }
        else
        {
            return leftData;
        }
        
        
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digitData;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        digitData = digit;
        
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        digitData++;
      
        if (digitData == modData)
        {
            digitData = 0;
            if (leftData != null)
            {
                leftData.digitData++;
            }
        }
        if (leftData == null)
        {
            counterData = digitData;
        }
        else
        {
            counterData = ((leftData.digitData*(int)(Math.pow(4, 1))) + (digitData*(int)(Math.pow(4, 0))));
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        return counterData;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
