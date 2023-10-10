public class Duck {
    private String firstname, lastname;
    private Duck next;

    public Duck(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.next = null;
    }

    public void setNext(Duck nextDuck){
        this.next = nextDuck;
    }

    public Duck getNext(){
        return this.next;
    }

    public String toString(){
        return firstname + " " + lastname;
    }

}