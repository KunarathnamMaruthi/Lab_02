package com.example.lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static Toast makeText (Context context,
                                  int resId,
                                  int duration)


    Context context = getApplicationContext();
    CharSequence text = "You just clicked the OK button";
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);
toast.show();
Toast.makeText(context,text,duration).

};


protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    LayoutInflater li = getLayoutInflater();
    View layout = li.inflate(R.layout.customtoast,
        (ViewGroup)    findViewById(R.id.custom_toast_layout));                //Creating the Toast object             Toast toast = new Toast(getApplicationContext());             toast.setDuration(Toast.LENGTH_SHORT);             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);             toast.setView(layout);//setting the view of custom toast layout
        toast.show();
}
}

