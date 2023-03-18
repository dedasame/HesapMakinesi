package com.dedasame.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button clear,plus,minus,multiply,division,equal,point;
    TextView solution,result;

    boolean bplus=false,bminus=false,bmulti=false,bdiv=false;
    float num1,num2;

    /*
    int count1=0,count2=0;
    int cntrlopr=0;

    int controloperation=0;
    List<Integer> sayi1=new ArrayList<Integer>();
    List<Integer> sayi2=new ArrayList<Integer>();

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        solution=findViewById(R.id.solution);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);

        clear=findViewById(R.id.clear);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        division=findViewById(R.id.division);
        equal=findViewById(R.id.equal);
        point=findViewById(R.id.point);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
                solution.setText(result.getText());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
                solution.setText(result.getText());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "3");
                solution.setText(result.getText());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                solution.setText(result.getText());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                solution.setText(result.getText());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                solution.setText(result.getText());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                solution.setText(result.getText());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                solution.setText(result.getText());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                solution.setText(result.getText());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
                solution.setText(result.getText());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+",");
                solution.setText(result.getText());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                solution.setText("");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){

                    result.setText("");
                }
                else{
                    num1=Float.parseFloat(result.getText()+"");
                    bplus=true;
                    result.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    num1=Float.parseFloat(result.getText()+"");
                    bminus=true;
                    result.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    num1=Float.parseFloat(result.getText()+"");
                    bmulti=true;
                    result.setText(null);
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }

                else{
                    num1=Float.parseFloat(result.getText()+"");
                    bdiv=true;
                    result.setText(null);
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num2=Float.parseFloat(result.getText()+"");

                if(bplus==true){
                    result.setText(num1+num2+"");
                    solution.setText(num1+"+"+num2);
                    bplus=false;
                }
                if(bminus==true){
                    result.setText(num1-num2+"");
                    solution.setText(num1+"-"+num2);
                    bminus=false;
                }
                if(bmulti==true){
                    result.setText(num1*num2+"");
                    solution.setText(num1+"X"+num2);
                    bmulti=false;
                }
                if(bdiv==true){
                    result.setText(num1/num2+"");
                    solution.setText(num1+"÷"+num2);
                    bdiv=false;
                }
            }
        });
    }
}


    /*
    public void numberClick(View view) {

        if(cntrlopr==0){
            count1++;
            switch (view.getId()){
                case R.id.one:
                    sayi1.add(1);
                    break;
                case R.id.two:
                    sayi1.add(2);
                    break;
                case R.id.three:
                    sayi1.add(3);
                    break;
                case R.id.four:
                    sayi1.add(4);
                    break;
                case R.id.five:
                    sayi1.add(5);
                    break;
                case R.id.six:
                    sayi1.add(6);
                    break;
                case R.id.seven:
                    sayi1.add(7);
                    break;
                case R.id.eight:
                    sayi1.add(8);
                    break;
                case R.id.nine:
                    sayi1.add(9);
                    break;
                case R.id.zero:
                    sayi1.add(0);
                    break;
            }
        }

        else{
            count2++;

            switch (view.getId()){
                case R.id.one:
                    sayi2.add(1);
                    break;
                case R.id.two:
                    sayi2.add(2);
                    break;
                case R.id.three:
                    sayi2.add(3);
                    break;
                case R.id.four:
                    sayi2.add(4);
                    break;
                case R.id.five:
                    sayi2.add(5);
                    break;
                case R.id.six:
                    sayi2.add(6);
                    break;
                case R.id.seven:
                    sayi2.add(7);
                    break;
                case R.id.eight:
                    sayi2.add(8);
                    break;
                case R.id.nine:
                    sayi2.add(9);
                    break;
                case R.id.zero:
                    sayi2.add(0);
                    break;
            }
        }
    }


    public void operatorClick(View view) {

        switch (view.getId()) {
            case R.id.plus:
                controloperation=1;
                break;
            case R.id.minus:
                controloperation=2;
                break;
            case R.id.multiply:
                controloperation=3;
                break;
            case R.id.division:
                controloperation=4;
                break;
        }
        cntrlopr=1;

    }

    public void equalClick(View view) {
        int num1 = 0, num2 = 0;

        for (Integer sayi : sayi1) {
            num1 = (int) (sayi * Math.pow(10, count1));
            count1--;
        }
        for (Integer sayi : sayi2) {
            num2 = (int) (sayi * Math.pow(10, count2));
            count2--;
        }

        if(controloperation==1) result.setText(num1+num2);
        else if (controloperation==2) result.setText(num1-num2);
        else if (controloperation==3) result.setText(num1*num2);
        else result.setText(num1/num2);

    }

    public void clearClick(View view) {
        result.setText("0");
        number.setText("0");
        count1=0;
        count2=0;

    }
    */


