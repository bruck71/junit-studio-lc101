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
        assertEquals(message, expected, actual);
    }

    //TODO: Test a number being found somewhere in the second half of the array
    @Test
    public void secondHalf(){
        String message = "a number in the second half of the array is found";
        int testNum = 44;
        int expected = 5;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //TODO: Test a number being found exactly in the middle of the array
    @Test
    public void middleNum(){
        String message = "a number in the middle of the array is found";
        int testNum = 18;
        int expected = 3;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //TODO: Test a number being found at the very beginning of the array
    @Test
    public void firstIndex(){
        String message = "a number in the first index of the array is found";
        int testNum = 2;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //TODO: Test a number being found at the very end of the array
    @Test
    public void lastIndex(){
        String message = "a number in the last index of the array is found";
        int testNum = 86;
        int expected = 6;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //TODO: Test an array that includes negative numbers
    @Test
    public void negativeNumbers() {
        String message = "a negative number is found";
        int testNum = -24;
        int expected = 1;
        int actual = BonusBinarySearch.binarySearch(negativeNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    //Negative Test Cases
    //TODO: Test a number not being found in an array
    @Test
    public void notFound() {
        String message = "a number not found in the array";
        int testNum = 100;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //Edge Cases
    //TODO: Test find a number in an array of length 1
    @Test
    public void lengthOne() {
        String message = "a number in an array with length one is found";
        int testNum = 50;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //TODO: Test find a number that is not in an array of length 1
    @Test
    public void lengthOneNotFound() {
        String message = "a number not in an array with length one is not found";
        int testNum = 90;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(message, expected, actual);
    }
    //TODO: Test an empty array
    @Test
    public void emptyArray() {
        String message = "an array with length 0";
        int testNum = 50;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(emptyArray, testNum);
        assertEquals(message, expected, actual);
    }

}
