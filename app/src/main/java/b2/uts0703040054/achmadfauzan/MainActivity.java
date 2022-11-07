package b2.uts0703040054.achmadfauzan;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednama, ednilai, edsks, edhasil, edhuruf;
    Button bthitung;
    Double vnilai, vsks, vhasil;
    String vnama, vhuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednama = (EditText)findViewById(R.id.ednama);
        ednilai = (EditText)findViewById(R.id.ednilai);
        edsks = (EditText)findViewById(R.id.edsks);
        edhasil = (EditText)findViewById(R.id.edhasil);
        edhuruf = (EditText)findViewById(R.id.edhuruf);
        bthitung = (Button) findViewById(R.id.bthitung);
    }

    public void hitung(View view) {
        vnilai = Double.parseDouble(ednilai.getText().toString());
        vsks = Double.parseDouble(edsks.getText().toString());

        vhasil = vnilai * 3 / 3 ;


        if (vhasil >= 86 && vhasil <= 100) {
            vhuruf = "A";
        } else if (vhasil >= 81 && vhasil <= 85) {
            vhuruf = "A-";
        } else if (vhasil >= 76 && vhasil <= 80) {
            vhuruf = "B+";
        }
        else if (vhasil >= 71 && vhasil <= 75) {
            vhuruf = "B";
        }
        else if (vhasil >= 66 && vhasil <= 70) {
            vhuruf = "B-";
        }
        else if (vhasil >= 61 && vhasil <= 65) {
            vhuruf = "C+";
        }
        else if (vhasil >= 56 && vhasil <= 60) {
            vhuruf = "C";
        }
        else if (vhasil >= 41 && vhasil <= 55) {
            vhuruf = "D";
        }
        else {
            vhuruf = "E";
        }
        edhasil.setText(""+vhasil);
        edhuruf.setText(""+vhuruf);
    }
}