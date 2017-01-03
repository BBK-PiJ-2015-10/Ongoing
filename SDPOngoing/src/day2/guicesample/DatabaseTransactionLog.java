package day2.guicesample;

public class DatabaseTransactionLog implements TransactionLog {
    public String toString(){
        return getClass().getName();
    }
}
