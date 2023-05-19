package uta.fisei.juan_alejandro_prueba_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button siguiente;
    private Button cerrar;
    private EditText a;
    private EditText b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = findViewById(R.id.button);
        cerrar = findViewById(R.id.button2);
        cerrar.setEnabled(false);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_segundo_alejandro);
                cerrar = findViewById(R.id.button2);
                cerrar.setEnabled(false);
            }
        });

    }
    

}

