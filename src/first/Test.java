package first;

public class Test {

    public enum WeekDay {
        MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"),
        FRIDAY("friday"), SATURDAY("saturday"), SUNDAY("sunday");

        String value;

        WeekDay(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.FRIDAY;
        System.out.println(weekDay.toString());
    }

}
