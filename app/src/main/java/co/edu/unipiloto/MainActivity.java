package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindSignal(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.signalType);
        String signalType = String.valueOf(color.getSelectedItem());

        String signalsSuggestion = SignalExpert.getBrands(signalType);
        brands.setText(signalsSuggestion);
    }
}