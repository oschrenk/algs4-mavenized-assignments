import org.junit.Test;

public class PercolationStatsTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIfGridSizeSmallerThanZero() {
        new PercolationStats(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIfNumberOfExperimentSmallerThanZero() {
        new PercolationStats(1, -1);
    }

}
