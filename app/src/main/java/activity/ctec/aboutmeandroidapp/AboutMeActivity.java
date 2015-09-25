package activity.ctec.aboutmeandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {

    //DECLARATION
    private Button startButton;
    private RelativeLayout backgroundLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        //Initializing
        startButton = (Button) findViewById(R.id.startButton);
        backgroundLayout = (RelativeLayout) findViewById(R.id.backgroundLayout);

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

    private void setUpListeners(){
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView){
                //Where the background changes colors
                changeBackgroundColor();

            }
        });
    }
}
