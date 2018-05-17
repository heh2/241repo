/**
 * Created by heh2 on 4/20/18.
 */
public class RecordCollectionNode {
    private String recordName;
    private RecordCollectionNode next;

    public RecordCollectionNode(String recordName){
        this.recordName = recordName;
    }

    public String getRecordName(){
        System.out.println("Call method getRecordName");
        return recordName;
    }

    public RecordCollectionNode getNext(){
        System.out.println("Called method getNext");
        return next;
    }

    public void setRecordName(String recordName){
        System.out.println("called method setRecordName");
        this.recordName = recordName;
    }
    public void setNext(RecordCollectionNode next){
        System.out.println("Called method setNext");
        this.next = next;

    }
}
