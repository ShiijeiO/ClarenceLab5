//Clarence Oriola N01573843
package com.example.fragmenttry;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ClarenceActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        // Build the AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //AlertDialog requirements
        builder.setIcon(android.R.drawable.btn_star);
        builder.setTitle(R.string.project_name);
        builder.setMessage(R.string.onBackPressed_message);

        //yes button condition
        builder.setPositiveButton(R.string.onBackPressed_yes, (dialog, which) -> {
            finish();
        });

        // no button condition
        builder.setNegativeButton(R.string.onBackPressed_no, (dialog, which) -> {
            dialog.dismiss(); //dismisses alertDialog
        });

        builder.setCancelable(false); //user cannot dismiss

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
