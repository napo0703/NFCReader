package moe.napo.nfcreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = new Button(this);

        Button.OnClickListener listener_w = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWriteMode(v);
            }
        };

        Button.OnClickListener listener_r = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                onReadMode(v);
            }
        };

        button.findViewById(R.id.write_mode).setOnClickListener(listener_w);
        button.findViewById(R.id.read_mode).setOnClickListener(listener_r);
    }

    public void onWriteMode(View v) {
        startActivity(new Intent(this, WriteActivity.class));
    }

    public void onReadMode(View v) {
        startActivity(new Intent(this, ReadActivity.class));
    }
}
