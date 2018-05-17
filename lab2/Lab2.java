/**
 * Created by heh2 on 4/20/18.
 */
public class Lab2 {
    public static void main(String[] args){
        RecordCollection run = new RecordCollection();
        run.addToCollection("test");
        run.collectionNames();
        run.decrementingCopies("test");
        run.incrementingCopies("test");
        run.recordMatchingByArtist("test");
        run.recordMatchingByYear(2014);
    }
}
