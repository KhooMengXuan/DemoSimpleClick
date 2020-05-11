package sg.edu.rp.c346.id18016446.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Declare a variable
    Button btnClick;
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the variable to the respective UI element
        btnClick = findViewById(R.id.buttonDisplay);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        toggleButton = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText((stringResponse));
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    etInput.setEnabled(true);
            } else {
                    etInput.setEnabled(false);
                }
        };

        });

        //btnClick.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
             //   Toast.makeText(context: MainActivity.this, resId: "The button has been clicked", Toast.LENGTH_SHORT).show());
           // }
       // });
    }
}
