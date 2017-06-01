package com.hrupin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Custom_indeterminate_progressbarActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar);

        final Button stoppr = (Button) findViewById(R.id.stop);
        stoppr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               progressBar.setVisibility(View.GONE);
            }
        });

    }
}