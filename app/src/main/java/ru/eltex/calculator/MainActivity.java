/**
 * Simple Integer Calculator.
*  @author Vadim Chernyavsky
*  @version v1.0
*/

package ru.eltex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Calculator main class.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * a - the first variable.
     */
    Integer a = 0;
    /**
     * b - the second variable.
     */
    Integer b = 0;
    /**
     * Operation symbol.
     */
    String operation = "=";
    /**
     * The error message.
     */
    String ERROR_MESSAGE = "Error!";
    /**
     * The null string.
     */
    String NULL_STRING = "";
    /**
     * The Zero number.
     */
    String ZERO_NUMBER = "0";
    @Override
    /**
    * The first method from which the execution of the activity begins.
     * @param savedInstanceState
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST_DEBUG_ON_CREATE", "onCreate() method call");
        calculating();
    }

    /**
     * Method of calculating.
     */
    public void calculating() {
        Log.d("TEST_METHOD_CALCULATING", "Calculating() method call");
        //Number buttons
        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button zero = (Button)findViewById(R.id.zero);
        //Operations buttons
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button multiple = (Button)findViewById(R.id.multiple);
        Button div = (Button)findViewById(R.id.div);
        Button equal = (Button)findViewById(R.id.equal);
        Button clear = (Button)findViewById(R.id.clear);
        //TextView of results
        TextView out = (TextView)findViewById(R.id.output);
        //Clicks on number buttons
        one.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "1");
            } else {
                out.setText("1");
            }
            Log.d("TEST_DEBUG_BUTTON_1", "Set number 1");
        });
        two.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "2");
            } else {
                out.setText("2");
            }
            Log.d("TEST_DEBUG_BUTTON_2", "Set number 2");
        });
        three.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "3");
            } else {
                out.setText("3");
            }
            Log.d("TEST_DEBUG_BUTTON_3", "Set number 3");
        });
        four.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "4");
            } else {
                out.setText("4");
            }
            Log.d("TEST_DEBUG_BUTTON_4", "Set number 4");
        });
        five.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "5");
            } else {
                out.setText("5");
            }
            Log.d("TEST_DEBUG_BUTTON_5", "Set number 5");
        });
        six.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "6");
            } else {
                out.setText("6");
            }
            Log.d("TEST_DEBUG_BUTTON_6", "Set number 6");
        });
        seven.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "7");
            } else {
                out.setText("7");
            }
            Log.d("TEST_DEBUG_BUTTON_7", "Set number 7");
        });
        eight.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "8");
            } else {
                out.setText("8");
            }
            Log.d("TEST_DEBUG_BUTTON_8", "Set number 8");
        });
        nine.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE && out.getText() != ZERO_NUMBER) {
                out.setText(out.getText() + "9");
            } else {
                out.setText("9");
            }
            Log.d("TEST_DEBUG_BUTTON_9", "Set number 9");
        });
        zero.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE) {
                out.setText(out.getText() + ZERO_NUMBER);
            } else {
                out.setText(ZERO_NUMBER);
            }
            Log.d("TEST_DEBUG_BUTTON_0", "Set number 0");
        });
        //clicks on operations buttons
        plus.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE) {
                a = Integer.valueOf(String.valueOf(out.getText()));
                operation = "+";
                out.setText(NULL_STRING);
            } else {
                a = 0;
                out.setText(NULL_STRING);
            }
            Log.d("TEST_DEBUG_PLUS_BUTTON", "Set plus operation");
        });
        minus.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE) {
                a = Integer.valueOf(String.valueOf(out.getText()));
                operation = "-";
                out.setText(NULL_STRING);
            } else {
                a = 0;
                out.setText(NULL_STRING);
            }
            Log.d("TEST_DEBUG_MINUS_BUTTON", "Set minus operation");
        });
        multiple.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE) {
                a = Integer.valueOf(String.valueOf(out.getText()));
                operation = "*";
                out.setText(NULL_STRING);
            } else {
                a = 0;
                out.setText(NULL_STRING);
            }
            Log.d("TEST_DEBUG_MULTI_BUTTON", "Set multiple operation");
        });
        div.setOnClickListener( view ->{
            if (out.getText() != ERROR_MESSAGE) {
                a = Integer.valueOf(String.valueOf(out.getText()));
                operation = "/";
                out.setText(NULL_STRING);
            } else {
                a = 0;
                out.setText(NULL_STRING);
            }
            Log.d("TEST_DEBUG_DIV_BUTTON", "Set divide operation");
        });
        equal.setOnClickListener( view ->{
            if (out.getText() != NULL_STRING && out.getText() != ERROR_MESSAGE) {
                Integer b = Integer.valueOf(String.valueOf(out.getText()));
                switch (operation) {
                    case "+":
                        out.setText(String.valueOf(a+b));
                        operation = "=";
                        Log.d("TEST_DEBUG_PLUS", "Performing plus operation");
                        break;
                    case "-":
                        out.setText(String.valueOf(a-b));
                        operation = "=";
                        Log.d("TEST_DEBUG_MINUS", "Performing minus operation");
                        break;
                    case "*":
                        out.setText(String.valueOf(a*b));
                        Log.d("TEST_DEBUG_MULTI", "Performing multiple operation");
                        operation = "=";
                        break;
                    case "/":
                        if (b != 0) {
                            out.setText(String.valueOf(a/b));
                        } else {
                            out.setText(ERROR_MESSAGE);
                        }
                        operation = "=";
                        Log.d("TEST_DEBUG_DIV", "Performing divide operation");
                        break;
                }
            } else {
                out.setText(ZERO_NUMBER);
                Log.d("TEST_DEBUG_ZERO", "Set zero number after error div by 0 or null string");
            }
        });
        //click on clear button
        clear.setOnClickListener(view -> {
            a = 0;
            b = 0;
            out.setText(ZERO_NUMBER);
            Log.d("TEST_DEBUG_CLEAR", "Set clear string with zero number");
        });
    }
}