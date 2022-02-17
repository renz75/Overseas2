package example.com.overseas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // declaring buttons objects
    Button inchButton, feetButton, cmsButton, mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText amount;
        final TextView result;

        // find references for buttons objects
        inchButton = findViewById(R.id.buttonToInches);
        feetButton = findViewById(R.id.buttonToFeet);
        cmsButton = findViewById(R.id.buttonToCentimeters);
        mButton = findViewById(R.id.buttonToMeters);

        // find references for constants
        amount = (EditText) findViewById(R.id.amountEditText);
        result = (TextView) findViewById(R.id.convertTextView);

        // adding interface to objects
        inchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double convert =
                        Double.parseDouble(amount.getText().toString());
                result.setText(String.valueOf(convert*12));

                result.setTextColor(Color.RED);
            }
        });

        feetButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double convert =
                        Double.parseDouble(amount.getText().toString());
                result.setText(String.valueOf(convert*0.3048));

                result.setTextColor(Color.RED);
            }
        });

        cmsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double convert =
                        Double.parseDouble(amount.getText().toString());
                result.setText(String.valueOf(convert*30.48));

                result.setTextColor(Color.RED);
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double convert =
                        Double.parseDouble(amount.getText().toString());
                result.setText(String.valueOf(convert*0.3048));

                result.setTextColor(Color.RED);
            }
        });






    }// end of onCreate method

}// end of main class

