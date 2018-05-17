import java.util.*;

/**
 * Created by heh2 on 4/26/18.
 */
public class TestInsertionSort {

    private static boolean isSorted(int[] x){
        for(int i = 1; i < x.length; i++){
            if( x[i] < x[i-1]){
                return false;
            }
        }
        return true;
    }
    private static boolean sameElements(int[] arrayX, int[] arrayY) {

        if(arrayX.length != arrayY.length){

            return false;
        }

        HashMap<Integer,Integer> arrayXMap = putArrayIntoHashmap(arrayX);
        HashMap<Integer,Integer> arrayYMap = putArrayIntoHashmap(arrayY);

        if(arrayXMap.equals(arrayYMap)){

            return true;

        }
    return false;
    }

    public static HashMap<Integer,Integer> putArrayIntoHashmap(int[] array){
        HashMap<Integer, Integer> createNewMap = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> hashMap = createNewMap;
        for(int b = 0; b < array.length; b++){
               createNewMap.put(array[b],b);

        }
        return hashMap ;
    }


    private static void testFromConsole(){

        Scanner scan= new Scanner(System.in);
        InsertionSort sort = new InsertionSort();
        TestInsertionSort check = new TestInsertionSort();

        while(true) {
            System.out.println("Type a list of integers with space in between each input");
            String input = scan.nextLine();
            String[] StringArray = input.split(" ");
            int[] intArray = new int[StringArray.length];

            for (int x = 0; x < StringArray.length; x++) {
                intArray[x] = Integer.parseInt(StringArray[x]);

            }

            int[] newSortedArray = sort.insertionSort(intArray);

            if(check.isSorted(newSortedArray) == check.sameElements(intArray, newSortedArray) ){
                System.out.println("Passed Test");
                System.out.print("");
            }
            else{
                System.out.println("Failed test");
                System.out.print("");
            }
        }
    }
    private static void shuffleTest(int N){

        int[] createInteger = new int[N];

        int[] copyArray = createInteger;
        List<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < createInteger.length; i++ ){
            createInteger[i]= i;

        }

        for(int x = 0; x < copyArray.length; x++){
            arrayList.add(copyArray[x]);

        }

        Collections.shuffle(arrayList);


        for(int x = 0; x < copyArray.length; x++){
            copyArray[x] = arrayList.get(x);
        }

        InsertionSort sort = new InsertionSort();
        int[] sortedArray = sort.insertionSort(copyArray);

        if(Arrays.equals(sortedArray,createInteger)){
            System.out.println("Passed Test");
            System.out.print("");
        }
        else{
            System.out.println("Failed Test");
            System.out.print("");

        }

    }


    public static void main(String[] args){
        TestInsertionSort test = new TestInsertionSort();

        String[] commandLineString = args;
        int[] CommandLineIntArray = new int[args.length];
        for(int x = 0; x < args.length; x++){
            CommandLineIntArray[x] = Integer.parseInt(commandLineString[x]);
        }

        if(commandLineString.length == 0) {
            test.testFromConsole();

        }
        else{
            for(int i = 0; i < CommandLineIntArray.length; i++) {
                test.shuffleTest(CommandLineIntArray[i]);
            }
        }
    }
}
