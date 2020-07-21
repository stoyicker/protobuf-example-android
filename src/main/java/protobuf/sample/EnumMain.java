package protobuf.sample;

import android.util.Log;

public class EnumMain {

    public static void main(String[] args) {

        Log.i("EnumMain", "Example for Enums");

        EnumMessage.Builder builder = EnumMessage.newBuilder();

        builder.setId(345);

        // example with Enums
        builder.setDayOfTheWeek(DayOfTheWeek.FRIDAY);

        EnumMessage message = builder.build();

        Log.i("EnumMain", message.toString());
    }
}
