package edu.tecii.andrioid.p7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        res=(TextView)findViewById(R.id.res);


    }

    public void calcular (View view){
        double cat1=Double.parseDouble(edit1.getText().toString());
        double cat2=Double.parseDouble(edit2.getText().toString());

        double hip= Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
        double per= hip+cat1+cat2;
        double area=(cat1*cat2)/2;
        res.setText("La hipotenusa es:" +hip+"\n El perimetro es:"+per+"\n y el area es:"+area);
        }
    }

