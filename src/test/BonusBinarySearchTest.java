package test;

//TODO: import JUnit, assertion methods
import org.junit.Test;
import static org.junit.Assert.*;
//TODO: import BonusBinarySearch class from main package
import main.BonusBinarySearch;

public class BonusBinarySearchTest {
    //TODO: Initialize reusable arrays of sorted integers to use as test data
    int[] positiveNumArray = {2, 5, 7, 18, 29, 44, 86};
    int[] negativeNumArray = {-47, -24, -1, 0, 14, 63, 99};
    int[] singleNumArray = {50};
    int[] emptyArray = {};

    //Positive test cases
    //TODO: Test a number being found somewhere in the first half of the array
    @Test
    public void firstHalf(){
        String message = "a number in the first half of the array is found";
        int testNum = 7;
        int expected = 2;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);

    }

    //TODO: Test a number being found somewhere in the second half of the array

    //TODO: Test a number being found exactly in the middle of the array

    //TODO: Test a number being found at the very beginning of the array

    //TODO: Test a number being found at the very end of the array

    //TODO: Test a number being found somewhere in the first half of the array


}
