package protobuf.sample;

import android.util.Log;

import java.util.Arrays;

public class ComplexMain {


    public static void main(String[] args) {

        Log.i("ComplexMain", "Complex example");

        DummyMessage oneDummy = newDummyMessage(55, "one dummy message");

        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        // singular message field
        builder.setOneDummy(oneDummy);

        // repeated field
        builder.addMultipleDummy(newDummyMessage(66, "second dummy"));
        builder.addMultipleDummy(newDummyMessage(67, "third dummy"));
        builder.addMultipleDummy(newDummyMessage(68, "fourth dummy"));

        builder.addAllMultipleDummy(Arrays.asList(
                newDummyMessage(69, "other dummy"),
                newDummyMessage(70, "other other dummy")
        ));

        ComplexMessage message = builder.build();

        Log.i("ComplexMain", message.toString());


        // GET EXAMPLE
        // message.getMultipleDummyList();

    }

    public static DummyMessage newDummyMessage(Integer id, String name) {
        // same learning as "SimpleMain"
        DummyMessage.Builder dummyMessageBuilder = DummyMessage.newBuilder();
        DummyMessage message = dummyMessageBuilder.setName(name)
                .setId(id)
                .build();

        return message;
    }

}
