package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String msg = "a single set of balanced brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), msg);
    }
    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String msg = "balance brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }
    @Test
    public void singleBracketsAroundOtherCharacters() {
        String msg = "balance brackets around other characters return true";
        String testData = "[LaunchCode]";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }
    @Test
    public void singleBracketsAmongOtherCharacters() {
        String msg = "balance brackets among other characters return true";
        String testData = "Launch[Code]";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }
    @Test
    public void tripleBalancedBrackets() {
        String msg = "three consecutive pairs of brackets return true";
        String testData = "[][][]";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }
    @Test
    public void tripleNestedBalancedBrackets() {
        String msg = "three nested pairs of brackets return true";
        String testData = "[[[]]]";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }
    @Test
    public void singleOpeningBracket() {
        String msg = "a single opening bracket returns false";
        String testData = "[";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results, msg);
    }
    @Test
    public void singleClosingBracket() {
        String msg = "a single closing bracket returns false";
        String testData = "]";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results, msg);
    }
    @Test
    public void reversedBrackets() {
        String msg = "a set of reversed brackets returns false";
        String testData = "][";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results, msg);
    }

    @Test
    public void singleBracketWithOtherCharacters() {
        String msg = "a single opening bracket with other characters returns false";
        String testData = "[LaunchCode";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results, msg);
    }
    @Test
    public void unbalanceBracketsAmongOtherCharacters() {
        String msg = "unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results, msg);
    }
    @Test
    public void mixOfUnbalanceBrackets() {
        String msg = "a mix of unbalanced brackets returns false";
        String testData = "[[]][[]";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results, msg);
    }
    @Test
    public void stringOfCharactersWithoutBrackets() {
        String msg = "a string of characters without brackets returns true";
        String testData = "LaunchCode";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }
    @Test
    public void emptyString() {
        String msg = "an empty string returns true";
        String testData = "";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, msg);
    }

}




