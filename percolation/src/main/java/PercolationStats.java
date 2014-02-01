public class PercolationStats {

    /**
     * Perform T independent computational experiments on an N-by-N grid
     *
     * @param N number rows and columns of the grid
     * @param T number of experiments
     */
    public PercolationStats(int N, int T) {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Sample mean of percolation threshold
     *
     * @return mean of percolation threshold
     */
    public double mean() {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Sample standard deviation of percolation threshold
     *
     * @return standard deviation of percolation threshold
     */
    public double stddev() {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Lower bound of the 95% confidence interval
     *
     * @return lower bound of the 95% confidence interval
     */
    public double confidenceLo() {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Upper bound of the 95% confidence interval
     *
     * @return upper bound of the 95% confidence interval
     */
    public double confidenceHi() {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Take two command-line arguments _N_ and _T_, perform _T_ independent
     * computational experiments (discussed above) on an _N_-by-_N_ grid,
     * and prints out the mean, standard deviation, and the _95% confidence
     * interval_ for the percolation threshold. Use _standard random_ from
     * our standard libraries to generate random numbers; use
     * _standard statistics_ to compute the sample mean and standard deviation.
     * <p/>
     * <p/>
     * <code><pre>
     *      % **java PercolationStats 200 100
     *      mean                    = 0.5929934999999997
     *      stddev                  = 0.00876990421552567
     *      95% confidence interval = 0.5912745987737567, 0.5947124012262428
     * <p/>
     *      % java PercolationStats 200 100
     *      mean                    = 0.592877
     *      stddev                  = 0.009990523717073799
     *      95% confidence interval = 0.5909188573514536, 0.5948351426485464
     * <p/>
     *      % java PercolationStats 2 10000
     *      mean                    = 0.666925
     *      stddev                  = 0.11776536521033558
     *      95% confidence interval = 0.6646167988418774, 0.6692332011581226
     * <p/>
     *      % java PercolationStats 2 100000
     *      mean                    = 0.6669475
     *      stddev                  = 0.11775205263262094
     *      95% confidence interval = 0.666217665216461, 0.6676773347835391
     * </pre></code>
     *
     * @param args two command-line arguments, fist the size of the grid,
     *             the second the number of experiments
     */
    public static void main(String[] args) {
        throw new IllegalStateException("Not yet implemented");
    }

}
