package activity.ctec.aboutmeandroidapp;

import android.media.Image;
import android.media.ImageReader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AboutMeActivity extends AppCompatActivity {

    //DECLARATION
    private Button startButton;
    private RelativeLayout backgroundLayout;
    private TextView firstFact;
    private TextView secondFact;
    private TextView thirdFact;
    private TextView fourthFact;
    private TextView fifthFact;
    private ImageView book;
    private ImageView city;
    private ImageView physics;
    private ImageView guitar;
    private ImageView seinfeld;
    private int clickCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        //Initializing
        startButton = (Button) findViewById(R.id.startButton);
        backgroundLayout = (RelativeLayout) findViewById(R.id.backgroundLayout);
        firstFact = (TextView) findViewById(R.id.firstFact);
        secondFact = (TextView) findViewById(R.id.secondFact);
        thirdFact = (TextView) findViewById(R.id.thirdFact);
        fourthFact = (TextView) findViewById(R.id.fourthFact);
        fifthFact = (TextView) findViewById(R.id.fifthFact);
        book = (ImageView) findViewById(R.id.book);
        city = (ImageView) findViewById(R.id.city);
        physics = (ImageView) findViewById(R.id.physics);
        guitar = (ImageView) findViewById(R.id.guitar);
        seinfeld = (ImageView) findViewById(R.id.seinfeld);
        clickCount = 0;

        //Helper method -- Should be private
        setUpListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeBackgroundColor() {
        int redColor;
        int greenColor;
        int blueColor;

        //Random Colors
        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        backgroundLayout.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));
    }

    //Changing the text visibility method
    private void changeFacts() {
        if(clickCount == 0) {
            firstFact.setVisibility(View.VISIBLE);
            secondFact.setVisibility(View.INVISIBLE);
            thirdFact.setVisibility(View.INVISIBLE);
            fourthFact.setVisibility(View.INVISIBLE);
            fifthFact.setVisibility(View.INVISIBLE);
            book.setVisibility(View.VISIBLE);
            city.setVisibility(View.INVISIBLE);
            physics.setVisibility(View.INVISIBLE);
            guitar.setVisibility(View.INVISIBLE);
            seinfeld.setVisibility(View.INVISIBLE);
            clickCount++;
        }else if(clickCount == 1) {
            firstFact.setVisibility(View.GONE);
            secondFact.setVisibility(View.VISIBLE);
            thirdFact.setVisibility(View.INVISIBLE);
            fourthFact.setVisibility(View.INVISIBLE);
            fifthFact.setVisibility(View.INVISIBLE);
            book.setVisibility(View.GONE);
            city.setVisibility(View.VISIBLE);
            physics.setVisibility(View.INVISIBLE);
            guitar.setVisibility(View.INVISIBLE);
            seinfeld.setVisibility(View.INVISIBLE);
            clickCount++;
        }else if(clickCount == 2) {
            firstFact.setVisibility(View.GONE);
            secondFact.setVisibility(View.GONE);
            thirdFact.setVisibility(View.VISIBLE);
            fourthFact.setVisibility(View.INVISIBLE);
            fifthFact.setVisibility(View.INVISIBLE);
            book.setVisibility(View.GONE);
            city.setVisibility(View.GONE);
            physics.setVisibility(View.VISIBLE);
            guitar.setVisibility(View.INVISIBLE);
            seinfeld.setVisibility(View.INVISIBLE);
            clickCount++;
        }else if(clickCount == 3) {
            firstFact.setVisibility(View.GONE);
            secondFact.setVisibility(View.GONE);
            thirdFact.setVisibility(View.GONE);
            fourthFact.setVisibility(View.VISIBLE);
            fifthFact.setVisibility(View.INVISIBLE);
            book.setVisibility(View.GONE);
            city.setVisibility(View.GONE);
            physics.setVisibility(View.GONE);
            guitar.setVisibility(View.VISIBLE);
            seinfeld.setVisibility(View.INVISIBLE);
            clickCount++;
        }else if(clickCount == 4) {
            firstFact.setVisibility(View.GONE);
            secondFact.setVisibility(View.GONE);
            thirdFact.setVisibility(View.GONE);
            fourthFact.setVisibility(View.GONE);
            fifthFact.setVisibility(View.VISIBLE);
            book.setVisibility(View.GONE);
            city.setVisibility(View.GONE);
            physics.setVisibility(View.GONE);
            guitar.setVisibility(View.GONE);
            seinfeld.setVisibility(View.VISIBLE);
            clickCount++;
        }

    }

    private void setUpListeners(){
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView){
                //Where the background changes colors
                changeBackgroundColor();
                changeFacts();
            }
        });
    }
}
