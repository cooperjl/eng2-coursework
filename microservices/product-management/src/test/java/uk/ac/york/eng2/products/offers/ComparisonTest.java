package uk.ac.york.eng2.products.offers;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Even though this class mostly consists of library functions, it is still
// worth ensuring the expected comparators are used correctly in the class.
public class ComparisonTest {
    @Test
    public void compareEqual() {
        Comparison comparison = Comparison.EQUAL;

        assertTrue(comparison.compare(BigDecimal.ONE, BigDecimal.ONE));
        assertFalse(comparison.compare(BigDecimal.ONE, BigDecimal.TEN));
    }
    @Test
    public void compareNotEqual() {
        Comparison comparison = Comparison.NOT_EQUAL;

        assertFalse(comparison.compare(BigDecimal.ONE, BigDecimal.ONE));
        assertTrue(comparison.compare(BigDecimal.ONE, BigDecimal.TEN));
    }
    @Test
    public void compareLessThan() {
        Comparison comparison = Comparison.LESS_THAN;

        assertTrue(comparison.compare(BigDecimal.ONE, BigDecimal.TEN));
        assertFalse(comparison.compare(BigDecimal.TEN, BigDecimal.ONE));
        assertFalse(comparison.compare(BigDecimal.ONE, BigDecimal.ONE));
    }
    @Test
    public void compareLessThanEqual() {
        Comparison comparison = Comparison.LESS_THAN_EQUAL;

        assertTrue(comparison.compare(BigDecimal.ONE, BigDecimal.TEN));
        assertFalse(comparison.compare(BigDecimal.TEN, BigDecimal.ONE));
        assertTrue(comparison.compare(BigDecimal.ONE, BigDecimal.ONE));
    }
    @Test
    public void compareGreaterThan() {
        Comparison comparison = Comparison.GREATER_THAN;

        assertFalse(comparison.compare(BigDecimal.ONE, BigDecimal.TEN));
        assertTrue(comparison.compare(BigDecimal.TEN, BigDecimal.ONE));
        assertFalse(comparison.compare(BigDecimal.ONE, BigDecimal.ONE));
    }
    @Test
    public void compareGreaterThanEqual() {
        Comparison comparison = Comparison.GREATER_THAN_EQUAL;

        assertFalse(comparison.compare(BigDecimal.ONE, BigDecimal.TEN));
        assertTrue(comparison.compare(BigDecimal.TEN, BigDecimal.ONE));
        assertTrue(comparison.compare(BigDecimal.ONE, BigDecimal.ONE));
    }
}
