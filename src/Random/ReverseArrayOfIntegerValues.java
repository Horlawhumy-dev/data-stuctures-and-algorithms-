package Random;

public class ReverseArrayOfIntegerValues {
    private int[] arrayOfInteger;

    public ReverseArrayOfIntegerValues() {
    }

    public void setArrayOfInteger(int[] array) {
        this.arrayOfInteger = array;
    }

    public int[] getArrayOfInteger() {
        return this.arrayOfInteger;
    }

    public int[] reverseArrayOfIntegers() {
        int[] arr = this.getArrayOfInteger();
        int[] result = new int[arr.length];
        int j = 0;

        for(int i = arr.length - 1; i >= 0 && j != arr.length; --i) {
            result[j] = arr[i];
            ++j;
        }

        return result;
    }
}
