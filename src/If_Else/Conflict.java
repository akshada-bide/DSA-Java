package If_Else;

public class Conflict {
    public static void main(String[] args){
        String[] event1 = {"01:00","02:00"};
        String[] event2 = {"03:00","04:00"};
        System.out.println(haveConflict(event1, event2));

    }
    static boolean haveConflict(String[] event1, String[] event2) {
        String startTime1 = event1[0];
        String endTime1 = event1[1];
        String startTime2 = event2[0];
        String endTime2 = event2[1];

        return startTime1.compareTo(endTime2) <= 0 && startTime2.compareTo(endTime1) <= 0;

    }
}
