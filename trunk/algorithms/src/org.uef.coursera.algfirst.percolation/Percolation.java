package org.uef.coursera.algfirst.percolation;

import edu.princeton.cs.algs4.UF;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Percolation {

    // create N-by-N grid, with all sites blocked
    public Percolation(int N) {

    }

    // open site (row i, column j) if it is not open already
    public void open(int i, int j) {

    }

    // is site (row i, column j) open?
    public boolean isOpen(int i, int j) {
        return false;
    }

    // is site (row i, column j) full?
    public boolean isFull(int i, int j) {
        return false;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    // test client (optional)
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
