import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PercolationTest {

    private static final int GRID_SIZE = 5;

    Percolation percolation;

    @Before
    public void setUp() {
        percolation = new Percolation(GRID_SIZE);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowIndexOutOfBoundsExceptionWhenOpeningRowZero() {
        percolation.open(0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowIndexOutOfBoundsExceptionWhenOpeningColumnZero() {
        percolation.open(1, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowIndexOutOfBoundsExceptionWhenOpeningRowBiggerThanGrid() {
        percolation.open(GRID_SIZE + 1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowIndexOutOfBoundsExceptionWhenOpeningColumnBiggerThanGrid() {
        percolation.open(1, GRID_SIZE + 1);
    }

    @Test
    public void shouldCreatePercolationWithEverySiteClosed() {
        for (int i = 1; i <= GRID_SIZE; i++) {
            for (int j = 1; i <= GRID_SIZE; i++) {
                assertFalse(percolation.isOpen(i, j));
            }
        }
    }

    @Test
    public void shouldOpenSite() {
        percolation.open(1, 1);

        assertTrue(percolation.isOpen(1, 1));
    }
}
