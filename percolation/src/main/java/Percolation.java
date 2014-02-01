/**
 * The constructor should take time proportional to N^2; all methods should
 * take constant time plus a constant number of calls to the union-find
 * methods union(), find(), connected(), and count().
 */
public class Percolation {

    /**
     * Create N-by-N grid, with all sites blocked by default.
     */
    public Percolation(int N) {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Open site (row i, column j) if it is not already
     * <p/>
     * By convention, the indices _i_ and _j_ are integers between 1 and _N_,
     * where (1, 1) is the upper-left site.
     *
     * @param i row
     * @param j column
     */
    public void open(int i, int j) {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Is site (row i, column j) open?
     *
     * @param i row
     * @param j column
     * @return @code true if open, @code false otherwise
     */
    public boolean isOpen(int i, int j) {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Is site (row i, column j) full?
     *
     * @param i row
     * @param j column
     * @return @code true if site full, @code false otherwise
     */
    public boolean isFull(int i, int j) {
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Does the system percolate?
     *
     * @return @code true if system percolates, @code false otherwise
     */
    public boolean percolates() {
        throw new IllegalStateException("Not yet implemented");
    }

}
