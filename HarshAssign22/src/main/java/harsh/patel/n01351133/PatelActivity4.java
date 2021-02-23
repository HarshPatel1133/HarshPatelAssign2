package harsh.patel.n01351133;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PatelActivity4 extends AppCompatActivity {
    TextView typetxt, sizetxt, topptxt, nametxt, addtxt, creditxt, provincetxt;
    Button checkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel4);
        typetxt = findViewById(R.id.harshPType);
        sizetxt = findViewById(R.id.harshPSize);
        topptxt = findViewById(R.id.harshPTopp);

        nametxt = findViewById(R.id.harshUname);
        addtxt = findViewById(R.id.harshUadd);
        creditxt = findViewById(R.id.harshUcredit);
        provincetxt = findViewById(R.id.harshUProvince);


        typetxt.setText(getIntent().getStringExtra("type"));
        sizetxt.setText(getIntent().getStringExtra("size"));
        topptxt.setText(getIntent().getStringExtra("topp"));

        nametxt.setText(getIntent().getStringExtra("uname"));
        addtxt.setText(getIntent().getStringExtra("uaddr"));
        creditxt.setText(getIntent().getStringExtra("ucredit"));
        provincetxt.setText(getIntent().getStringExtra("uprov"));

        checkBtn = findViewById(R.id.harshCheckTBtn);
        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(PatelActivity4.this);
                alert.setTitle("Android studio");
                alert.setMessage("your order number is 1356 and pick up time is 8 pm");
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(PatelActivity4.this, HarshActivity.class));
                        System.exit(0);
                    }
                });
                
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(PatelActivity4.this,
                                R.string.toast_message,
                                Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });

    }
}

    
