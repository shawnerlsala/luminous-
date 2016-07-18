package com.example.shawnerl.luminous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton togBtn = (ToggleButton) findViewById(R.id.toggleButton);
        final ImageView image = (ImageView) findViewById(R.id.imageView);

        assert togBtn != null;
        togBtn.setOnClickListener(
                new ToggleButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (togBtn.isChecked()) {
                            image.setImageResource(R.drawable.lighton);
                        } else
                            image.setImageResource(R.drawable.lightoff);

                    }
                }
        );
    }
}