public class Event {
    //Attributes
    String name;
    Date date;
    String description;
    String place;
    int[] time;   // the time array has the length 2, e.g. 22:30 would mean {22,30}

    //constructor for Event
    public Event(String name, Date date, String description, String place, int[] time) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.place = place;
        this.time = time;
    }


    //Functionality
    public void addEvent(){

    }
    public void deleteEvent(){

    }
    public void editEvent(){

    }

}


