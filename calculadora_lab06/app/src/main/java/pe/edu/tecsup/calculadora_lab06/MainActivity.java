package pe.edu.tecsup.calculadora_lab06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_four;
    private Button btn_five;
    private Button btn_six;
    private Button btn_seven;
    private Button btn_eight;
    private Button btn_nine;
    private Button btn_zero;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_divicion;
    private Button btn_limpiar;
    private Button btn_eliminar;
    private Button btn_igual;

    private ImageButton img_btn_borrar;

    private TextView text_info;
    private TextView text_result;

    private final char PUNTO = '.';
    private final char SUMA = '+';
    private final char RESTA = '-';
    private final char MULTIPLACACION = '*';
    private final char DIVISION = '/';
    private final char IGUAL = 0;
    private Double val1 = Double.NaN;
    private Double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        setupUIViews();

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "0");

            }
        });

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "2");

            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(text_result.getText().toString() + "9");
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operaciones();
                ACTION = RESTA;
                text_info.setText(String.valueOf(val1) + "-");
                text_result.setText(null);
            }
        });

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operaciones();
                ACTION = SUMA;
                text_info.setText(String.valueOf(val1) + "+");
                text_result.setText(null);
            }
        });

        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operaciones();
                ACTION = MULTIPLACACION;
                text_info.setText(String.valueOf(val1) + "*");
                text_result.setText(null);
            }
        });

        btn_divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operaciones();
                ACTION = DIVISION;
                text_info.setText(String.valueOf(val1) + "/");
                text_result.setText(null);
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operaciones();
                ACTION = IGUAL;
                text_result.setText(String.valueOf(val1));
                text_info.setText(null);
            }
        });

        img_btn_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence name = text_result.getText().toString();
                text_result.setText(name.subSequence(0, name.length()-1));
            }
        });

        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Double.NaN;
                text_result.setText(null);
            }
        });

        btn_eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                text_info.setText(null);
                text_result.setText(null);
            }
        });

    }

    private void setupUIViews(){

        btn_one = (Button)findViewById(R.id.btn_one);
        btn_zero = (Button)findViewById(R.id.btn_zero);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_five = (Button)findViewById(R.id.btn_five);
        btn_six = (Button)findViewById(R.id.btn_six);
        btn_seven = (Button)findViewById(R.id.btn_seven);
        btn_eight = (Button)findViewById(R.id.btn_eight);
        btn_nine = (Button)findViewById(R.id.btn_nine);
        btn_suma = (Button)findViewById(R.id.btn_suma);
        btn_resta = (Button)findViewById(R.id.btn_resta);
        btn_multiplicacion = (Button)findViewById(R.id.btn_multiplicacion);
        btn_divicion = (Button)findViewById(R.id.btn_divicion);
        btn_igual = (Button)findViewById(R.id.btn_igual);
        text_info = (TextView)findViewById(R.id.text_info);
        text_result = (TextView)findViewById(R.id.text_result);
        btn_limpiar = (Button)findViewById(R.id.btn_limpiar);
        btn_eliminar = (Button)findViewById(R.id.btn_eliminar);
        img_btn_borrar = (ImageButton)findViewById(R.id.img_btn_borrar);
    }

    private void operaciones(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(text_result.getText().toString());

            switch(ACTION){
                case SUMA:
                    val1 = val1 + val2;
                    break;
                case RESTA:
                    val1 = val1 - val2;
                    break;
                case MULTIPLACACION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case IGUAL:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(text_result.getText().toString());
        }
    }


}
