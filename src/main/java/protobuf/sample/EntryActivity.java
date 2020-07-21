package protobuf.sample;

import android.app.Activity;
import android.os.Bundle;

public final class EntryActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SimpleMain.main(null, this);
        ComplexMain.main(null);
        EnumMain.main(null);
        OptionsMain.main(null);
    }
}
