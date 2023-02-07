package test;

import org.junit.Test;

import static org.junit.Assert.*;

//TODO: Import BalanceBrackets class from main package.
import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here

    // Positive Test Cases
    //TODO: Refactor example test from instructions to use AAA pattern and message parameter.
    @Test
    public void onlyBracketsReturnsTrue() {
        String spec = "a single set of balanced brackets returns true.";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    //TODO: Test balanced brackets in front of other characters - "[]LaunchCode"
    @Test
    public void bracketsInFrontOfCharsReturnsTrue() {
        String spec = "a single set of balanced brackets returns true when placed in front of other string characters.";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    //TODO: Test balanced brackets around other characters - "[LaunchCode]"
    @Test
    public void bracketsAroundOtherCharsReturnsTrue() {
        String spec = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    //TODO: Test Balanced brackets within other characters - "Launch[Code]"
    @Test
    public void bracketsWithinOtherCharsReturnsTrue() {
        String spec = "balanced brackets within other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    //TODO: Test multiple consecutive pairs of balanced brackets - "[][][]"
    @Test
    public void multipleConsecutiveBracketPairsReturnsTrue() {
        String spec = "multiple consecutive pairs of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    //TODO: Test multiple nested balanced brackets - "[[[]]]"
    @Test
    public void multipleNestedBracketsReturnsTrue() {
        String spec = "multiple nested balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }


    //Negative Test Cases
    //TODO: test a single opening bracket - "["
    @Test
    public void singleOpeningBracketReturnsFalse() {

        String spec = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    //TODO: test a single closing bracket - "]"
    @Test
    public void singleClosingBracketReturnsFalse() {

        String spec = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    //TODO: test a pair of reversed brackets - "]["
    @Test
    public void reverseBracketsReturnsFalse() {

        String spec = "a pair of reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    //TODO: the first bracket cannot be a closed bracket ] returns false
    @Test
    public void firstBracketClosedReturnsFalse() {

        String spec = "a starting closed bracket returns false";
        String testData = "]LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    //TODO: the last bracket cannot be an open bracket [ returns false
    @Test
    public void lastBracketOpenReturnsFalse() {

        String spec = "a ending open bracket returns false";
        String testData = "[LaunchCode[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }


    //TODO: test a single bracket with other characters in the string - "[LaunchCode"
    @Test
    public void singleBracketWithOtherCharsReturnsFalse() {

        String spec = "a single bracket with other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }


    //TODO: test an unbalanced set of brackets - "[[]"
    @Test
    public void unbalancedBracketsReturnsFalse() {

        String spec = "a set of unbalanced brackets returns false";
        String testData = "[[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }




}
