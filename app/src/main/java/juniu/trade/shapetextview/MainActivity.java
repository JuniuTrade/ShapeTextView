package juniu.trade.shapetextview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import juniu.trade.library.ShapeTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeTextView tv = findViewById(R.id.tv);
        tv.setBackground(ContextCompat.getColor(this,R.color.colorPrimaryDark),2);
    }
}
