import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if(this.persons.isEmpty())
            return null;

        Person string = persons.get(0);

        for(Person elem: persons){
            if(string.getHeight() > elem.getHeight())
                string = elem;
        }

        return string;
    }

    public Person take(){
        if(this.persons.isEmpty())
            return null;

        Person string = persons.get(0);

        for(Person elem: persons){
            if(string.getHeight() > elem.getHeight())
                string = elem;
        }

        this.persons.remove(string);

        return string;
    }
}
