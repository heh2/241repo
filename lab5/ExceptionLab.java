/* ExceptionLab.java
 * 
 * A simple class that triggers various exceptions.
 *
 * In the CSCI 241 Exception Handling Lab, you will modify this code to
 * catch these exceptions.
 *
 * Usage:
 *
 * java ExceptionLab x1 x2 .. xN
 *
 * where each xi are integers
 *
 */

import java.util.Arrays;

class ExceptionLab {
    // define constants to avoid "magic numbers" later in the code
    private static final int sliceLower = 3; // lower bound on array slice
    private static final int sliceUpper = 8; // upper bound on array slice
    private static final String out_fn = ".tmp.lab5.txt"; // output filename

    // Perform a series of (contrived) operations on the args array 
    public static void main(String[] args) {
         int[] x = null;
        try {
            // convert string array to int array
             x = makeArray(args);
            System.out.println(Arrays.toString(x));

            // convert int array to itself in an artificial/strange way
            x = identity(x);
            System.out.println(Arrays.toString(x));
        }
        catch (java.lang.ArithmeticException n){
            System.err.println("identity threw exception: "+ n);
            System.exit(1);
        }
        catch (java.lang.NumberFormatException l){
            System.err.println("makeArray threw exception: "+ l);
            System.exit(1);
        }
        try {
            // retrieve just elements from index sliceLower (inclusive)
            // to sliceUpper (exclusive)
            int[] s = slice(x, sliceLower, sliceUpper);
            System.out.println(Arrays.toString(s));
        }
        catch (java.lang.ArrayIndexOutOfBoundsException p){
            System.err.println("slice threw exception: "+ p);
        }
        try {
            // like slice but flat out broken
            int[] s2 = buggierSlice(x, sliceLower, sliceUpper);
            System.out.println(Arrays.toString(s2));
        }
        catch(java.lang.NullPointerException v){
            System.err.println("buggierSlice threw exception: "+ v);
        }
        try {
            // write array x to out_fn
            writeArrayToFile(x, out_fn);

        }
        catch (java.io.FileNotFoundException e){
            System.out.println("writeArrayToFile threw exception: "+ e);
        }

        return;
    }

    private static int[] makeArray(String[] args) {
        int[] result = new int[args.length];
        for( int i=0; i<args.length; i++ ) {
            result[i] = Integer.parseInt(args[i]);
        }
        return result;
    }

    private static int[] identity(int[] x) {
        int[] result = new int[x.length];
        for( int i=0; i<x.length; i++ ) {
            result[i] = (x[i]*x[i])/x[i];
        }
        return result;
    }

    private static int[] slice(int[] x, int startIdx, int endIdx ) {
        int[] result = new int[endIdx-startIdx];

        for( int i=startIdx; i<endIdx; i++ ) {
            result[i-startIdx] = x[i];
        }

        return result;
    }

    private static int[] buggierSlice(int[] x, int startIdx, int endIdx ) {
        int[] result = null;

        for( int i=startIdx; i<endIdx; i++ ) {
            result[i-startIdx] = x[i];
        }

        return result;
    }

    private static void writeArrayToFile(int[] x, String fn) throws java.io.FileNotFoundException {

            java.io.File outFile = new java.io.File(fn);
            java.io.PrintStream out = new java.io.PrintStream(outFile);
            for (int i = 0; i < x.length; i++) {
                out.println(Arrays.toString(x));
        }

    }


}
