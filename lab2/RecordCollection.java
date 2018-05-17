/**
 * Created by heh2 on 4/20/18.
 */
public class RecordCollection {
    private RecordCollectionNode head;
    private RecordCollectionNode modifyList;

    public RecordCollection(){

        //head = new RecordCollectionNode(head.getRecordName());


    }
    public String addToCollection(String name){
        System.out.println("Called method addToCollection");
        return "";
    }
    public int incrementingCopies(String name){
        System.out.println("Called method incrementingCopies");
        return 0;
    }
    public int decrementingCopies(String name){
        System.out.println("Called method decrementingCopies");
        return 0;
    }
    public void collectionNames(){
        System.out.println("Called method collectionSize");
    }

    public String recordMatchingByArtist(String name){
        System.out.println("Called method recordsMatchingByArtist");
        return "";
    }

    public int recordMatchingByYear(int year){
        System.out.println("Called method recordMatchingByYear");
        return 0;
    }

}
