public class DucksInARow {

    public static void main(String[] args) {
        Duck first = new Duck("Daffy", "Duck");
        //Duck second = new Duck("Donald", "Duck");
        //Duck third = new Duck("Scrooge", "McDuck");
        //Duck fourth = new Duck("Darkwing", "McDuck");

        first.setNext(new Duck("Donald", "Duck"));
        first.getNext().setNext(new Duck("Scrooge", "McDuck"));
        first.getNext().setNext(new Duck("Darkwing", "McDuck"));

        Duck temp = new Duck("howard", "the duck");

        temp.setNext(first);
        first = temp;

        // first -> Daffy -> Donald -> Scrooge -> Darkwing -> null

        //System.out.println(first); //daffy
        //System.out.println(first.getNext()); //donald
        //System.out.println(first.getNext().getNext()); //scrooge
        //System.out.println(first.getNext().getNext().getNext()); //darkwing

        // How you loop through a linearly-linked structure
        Duck current = first;

        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
        
    }
    
}
