package com.learn.calu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.util.Stack;

public class mainpage extends AppCompatActivity {
ImageView del;
TextView one;
TextView two;
TextView three;
TextView four;
TextView five;
TextView six;
TextView seven;
TextView eight;
TextView nine;
TextView zero;
TextView dot;
TextView ac;
TextView mod;
TextView div;
TextView mul;
TextView sub;
TextView add;
TextView equal;
TextView show;
TextView output;
String s1="";
String ans="";
Stack<Character> s;
boolean bool=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        ac = findViewById(R.id.AC);
        mod = findViewById(R.id.mod);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);
        equal = findViewById(R.id.equal);
        show = findViewById(R.id.show);
        output = findViewById(R.id.output);
        del = findViewById(R.id.del);
        s=new Stack<>();
        final MediaPlayer md=MediaPlayer.create(this,R.raw.sound);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.isEmpty()) {
                    show.setText("");
                    output.setText("");
                    s1 = "";
                    ans = "";
                    Toast.makeText(mainpage.this, "already empty", Toast.LENGTH_SHORT).show();
                } else {
                    char c=s1.charAt(s1.length()-1);
                    s1 = s1.substring(0, s1.length() - 1);
                    show.setText(s1);
                    if( s.isEmpty())
                    {
                        output.setText("");
                    }
                    else {
                        char p = s1.charAt(s1.length() - 1);
                        if (p == '/' || p == '*' || p == '-' || p == '+' || p == '%' ) {
                            output.setText("");
                        } else {
                            if (c== '/' || c == '*' || c == '-' || c== '+' || c == '%' ) {
                                s.pop();

                            }
                            if( s.isEmpty())
                            {
                                output.setText("");
                            }
                            else
                            solve();
                        }
                    }
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
               int co= count();
               if(co==15)
               {
                   Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
               }
               else {
                   set("1");
                   if (!s.isEmpty()) {
                       solve();
                   }
               }
            }}
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("2");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("3");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("4");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("5");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("6");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("7");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("8");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("9");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set("0");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int co= count();
                    if(co==15)
                    {
                        Toast.makeText(mainpage.this, "Can't enter more then 15 digits.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        set(".");
                        if (!s.isEmpty()) {
                            solve();
                        }
                    }
                }}

        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("");
                output.setText("");
                s1 = "";
                ans = "";
                s=new Stack<>();
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{

                        set("%");
                            solve();
                    }
                }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{

                    set("/");
                    solve();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{

                    set("*");
                    solve();
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{

                    set("-");
                    solve();
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.length()==200)
                {
                    Toast.makeText(mainpage.this, "Can't enter more then 200 Characters.", Toast.LENGTH_SHORT).show();
                }
                else{

                    set("+");
                    solve();
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               s1=ans;
               show.setText(s1);
               output.setText("");
               s=new Stack<>();
            }
        });



    }
    void set(String str1){
       char c=str1.charAt(0);
       if(c=='.')
       {
           int i=s1.length()-1;
           boolean flag=false;
           while (i>=0 && s1.charAt(i)!='+' && s1.charAt(i)!='-' && s1.charAt(i)!='*' && s1.charAt(i)!='/'&& s1.charAt(i)!='%')
           {
               if(s1.charAt(i)=='.')
               {
                   flag=true;
                   break;
               }
               i--;
           }
           if(!flag)
           {
               if(s1.isEmpty() || s1.charAt(s1.length()-1)=='+' || s1.charAt(s1.length()-1)=='-' ||s1.charAt(s1.length()-1)=='*' ||s1.charAt(s1.length()-1)=='/' ||s1.charAt(s1.length()-1)=='%' )
               s1+= "0"+str1;
               else
                   s1+=str1;

               show.setText(s1);
           }
           else show.setText(s1);

       }
       else if(Character.isDigit(c) )
       {
           s1+=str1;

           show.setText(s1);

       }
       else {
           if(s1.isEmpty()) {
               show.setText("");
               output.setText("");
               s1="";
               ans="";
               Toast.makeText(mainpage.this, "Invalid format used", Toast.LENGTH_SHORT).show();

           }
           else {
               char p = s1.charAt(s1.length() - 1);
               if (p == '/' || p == '*' || p == '-' || p == '+' || p == '%' ) {

                   s1 = s1.substring(0, s1.length() - 1) + str1;
                   s.pop();
                   s.add(str1.charAt(0));

               } else {
                   s1 += str1;
                   s.add(str1.charAt(0));
               }

               show.setText(s1);
           }
       }
    }
    public void solve()
    {
        try {
            char p=s1.charAt(s1.length()-1);
            if(p=='/' || p=='*' || p=='-' || p=='+'||p=='%') {
                bool = false;
                return;
            }
            else
            {
                bool=true;
            }
            BigDecimal result=null;
            Expression expression=new Expression(s1);
            result=expression.eval(); // 1.333333
            // Lowering the precision.
            expression.setPrecision(5);
            result=expression.eval(); // 1.3
            result= BigDecimal.valueOf(result.doubleValue());
            output.setText(String.valueOf(result));
            ans=String.valueOf(result);
        }
        catch (Exception e){
            show.setText("");
            output.setText("0");
            s1="";
            ans="";
        }
    }
    public int count()
    {
        int i=s1.length()-1;
        int c=0;
        while (i>=0 && s1.charAt(i)!='+' && s1.charAt(i)!='-' && s1.charAt(i)!='*' && s1.charAt(i)!='/'&& s1.charAt(i)!='%')
        {
           c++;
            i--;
        }
        return c;
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}