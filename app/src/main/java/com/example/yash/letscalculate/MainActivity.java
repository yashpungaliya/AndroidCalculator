package com.example.yash.letscalculate;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , button10 , buttonC , buttonEqual ;

    TextView edt1 ;
    int flag=0;
    int dot=0;
    float mValueOne , mValueTwo ;

    TextView hist1;
    TextView hist2;
    TextView hist3;
    TextView hist4;
    TextView hist5;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    //PriorityQueue<String> hist=new PriorityQueue<String>();
//    ArrayList<String> histList;
    LinkedList<String> hlink=new LinkedList<>();;
    //String[] histList;
    String[] histarr=new String[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        histList=new ArrayList<>();4
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        edt1 = (TextView) findViewById(R.id.edt1);

        hist1 = (TextView)findViewById(R.id.hist1);
        hist2 = (TextView)findViewById(R.id.hist2);
        hist3 = (TextView)findViewById(R.id.hist3);
        hist4 = (TextView)findViewById(R.id.hist4);
        hist5 = (TextView)findViewById(R.id.hist5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag==1) {

                    edt1.setText(edt1.getText() + "-1");
                }
                else {

                    edt1.setText(edt1.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {

                    edt1.setText(edt1.getText() + "-2");
                }
                else {

                    edt1.setText(edt1.getText() + "2");
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(flag==1) {

                    edt1.setText(edt1.getText() + "-3");
                }
                else {

                    edt1.setText(edt1.getText() + "3");
                }

                }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {

                    edt1.setText(edt1.getText() + "-4");
                }
                else {

                    edt1.setText(edt1.getText() + "4");
                }
        }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {

                    edt1.setText(edt1.getText() + "-5");
                }
                else {

                    edt1.setText(edt1.getText() + "5");
                }
        }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {

                    edt1.setText(edt1.getText() + "-6");
                }
                else {

                    edt1.setText(edt1.getText() + "6");
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {

                    edt1.setText(edt1.getText() + "-7");
                }
                else {

                    edt1.setText(edt1.getText() + "7");
                }
        }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {

                    edt1.setText(edt1.getText() + "-8");
                } else {

                    edt1.setText(edt1.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        if(flag==1) {

            edt1.setText(edt1.getText() + "-9");
        }
        else {

            edt1.setText(edt1.getText() + "9");
        }

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().equals("")){
                    edt1.setText(null);
                }else {

                if(flag==1) {

                    mValueOne = Float.parseFloat(edt1.getText() + "");

                    edt1.setText(edt1.getText() + "+ "+ flag);
                }
                else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    edt1.setText(edt1.getText() + "+ "+ flag);
                }
//                    edt1.setText(edt1.getText() + "+");

                    mAddition = true;
                    edt1.setText(null);

                    flag=0;
//                   edt1.setText(edt1.getText() + "+");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().equals("")) {
                    edt1.setText(null);
//                    edt1.setText(edt1.getText() + "-");
                    flag = 1;

                } else {
                    if (flag == 1)
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                    else
                        mValueOne = Float.parseFloat(edt1.getText() + "");

                    flag = 0;
                    dot=0;
                    mSubtract = true;
                    edt1.setText(null);
//                    edt1.setText(edt1.getText() + "-");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().equals("")) {
                    edt1.setText(null);
                } else {
                    if (flag == 1)
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                    else
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                    flag = 0;
                    dot = 0;
                    mMultiplication = true;
                    edt1.setText(null);
//                edt1.setText(edt1.getText() + "x");
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().equals("")) {
                    edt1.setText(null);
                } else {
                    if (flag == 1)
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                    else
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                    flag = 0;
                    dot = 0;
                    mDivision = true;
                    edt1.setText(null);
//                edt1.setText(edt1.getText() + "/");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().equals("")){
                    edt1.setText(null);
                }else {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true) {
                    float ans = mValueOne + mValueTwo;

                    dot = 1;
                    edt1.setText(ans + "");

                    hlink.addFirst("->" + mValueOne + '+' + mValueTwo + '=' + ans);

                    mAddition = false;
                }


                if (mSubtract == true) {
                    float ans = mValueOne - mValueTwo;

                    dot = 1;
                    edt1.setText(ans + "");

                    hlink.addFirst("->" + mValueOne + '-' + mValueTwo + '=' + ans);

                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    float ans = mValueOne * mValueTwo;

                    dot = 1;
                    edt1.setText(ans + "");

                    hlink.addFirst("->" + mValueOne + 'x' + mValueTwo + '=' + ans);
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    if (mValueTwo == 0) {
                        edt1.setText("division by zero error.Press C");

                    } else {
                        float ans = mValueOne / mValueTwo;

                        dot = 1;
                        edt1.setText(ans + "");

                        hlink.addFirst("->" + mValueOne + '/' + mValueTwo + '=' + ans);
                        mDivision = false;
                    }
                }
                //histList = hist.toArray(histarr);
                if (hlink.size() >= 1)
                    hist1.setText((hlink.get(0)));
                if (hlink.size() >= 2)
                    hist2.setText(hlink.get(1));
                if (hlink.size() >= 3)
                    hist3.setText(hlink.get(2));
                if (hlink.size() >= 4)
                    hist4.setText(hlink.get(3));
                if (hlink.size() >= 5)
                    hist5.setText(hlink.get(4));

            }
        }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                dot=0;
                flag=0;
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dot==0) {
                    edt1.setText(edt1.getText() + ".");
                    dot = 1;
                }
                else
                {
                    edt1.setText("decimal error. Press C");


                }
                flag=0;
            }
        });
    }



}