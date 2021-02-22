package harsh.patel.n01351133;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
           public void showAlertDialog(view v){
               alert.setTitle("android studio");

           }
        });

    }
}
    }
}