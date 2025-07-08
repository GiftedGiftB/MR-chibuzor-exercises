package Subtraction;

public class Subtraction {
    private int i;
    private int z;

    public int mysubtraction(int i, int z) {
        if (i < z) {
            int p = z;
            z = i;
            i = p;
        }
        return i - z;
        }
    }