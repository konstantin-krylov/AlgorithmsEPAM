package com.epam.algorithms.hw1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceStringCheckerTest {

    @Test
    public void testIsBalanced() {
        BalanceStringChecker balanceStringChecker = new BalanceStringChecker();
        String balanced = "{ManyManyWords(SomeWords[MoreMoreWords])}";
        assertEquals(true, balanceStringChecker.isBalanced(balanced));
    }

    @Test
    public void testIsNotBalanced() {
        BalanceStringChecker balanceStringChecker = new BalanceStringChecker();
        String notbalanced = "{ManyMa[nyWords(SomeWords[MoreMoreWords])}";
        assertEquals(false, balanceStringChecker.isBalanced(notbalanced));
    }
}