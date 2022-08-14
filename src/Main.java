public class Main {
    public static void main(String[] args) {
        App hi = new App();
        Date date =  new Date(2,12,2022);
        int[] time = {8,30};
        hi.event = new Event("Meeting with Mike", date,
                "Descuss marketing strategy", "Kiyevyan Str.", time);
        int[] times = hi.calculateTimeLeft(date, time);
    }
}
