//Clarence Oriola N01573843
package com.example.fragmenttry;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ClarenceActivity5 extends AppCompatActivity {

    private static final int REQUEST_CODE_ASK_PERMISSIONS = 0;

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
        builder.setPositiveButton(R.string.onBackPressed_yes, (dialog, which) -> finish());

        // no button condition
        builder.setNegativeButton(R.string.onBackPressed_no, (dialog, which) -> {
            dialog.dismiss(); //dismisses alertDialog
        });
//comment
        builder.setCancelable(false); //user cannot dismiss

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.menu_help) {
            Intent intent = new Intent(this, OriolaActivity2.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
