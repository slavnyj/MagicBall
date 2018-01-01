package xyz.a3rdeye.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

      final ImageView tr = (ImageView) findViewById(R.id.imageView7);
      final ImageView ball = (ImageView) findViewById(R.id.imageView6);

      tr.setVisibility(View.INVISIBLE);

      final int[] ballArray = new int[] {
              R.drawable.tr1,
              R.drawable.tr2,
              R.drawable.tr3
      };

     ball.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Random randomGenerator = new Random();
              int number = randomGenerator.nextInt(3);
              Log.d("ball", "The number is " + number);
              tr.setVisibility(View.VISIBLE);
              int imaageRecourceId = ballArray[number];
              tr.setImageResource(imaageRecourceId);


          }
      });













    }
}
