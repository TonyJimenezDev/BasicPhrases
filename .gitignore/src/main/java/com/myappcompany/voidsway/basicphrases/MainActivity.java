package com.myappcompany.voidsway.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void PlayPhrase(View view) {

        Button buttonPressed = (Button) view;
        TextView textView = findViewById(R.id.textView3);
        Button hello = findViewById(R.id.hello);
        Button goodEvening = findViewById(R.id.good_evening);
        Button howAreYou = findViewById(R.id.how_are_you);
        Button imGreat = findViewById(R.id.im_very_good);
        Button thankYou = findViewById(R.id.thank_you);
        Button youreWelcome = findViewById(R.id.you_are_welcome);
        Button goodbye = findViewById(R.id.goodbye);
        Button fuckYou = findViewById(R.id.fuck_you);

        final MediaPlayer mediaPlayer = MediaPlayer.create(
                this, getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));


        if( buttonPressed == hello)
        {
            phrase = "Chinese characters: 你好 " + System.getProperty("line.separator") +
                    "English text: Nǐ hǎo";
        } else if(buttonPressed == goodEvening)
        {
            phrase = "Chinese characters: 晚上好 " +
                    System.getProperty("line.separator") +
                    "English text: Wǎnshàng hǎo";
        } else if(buttonPressed == howAreYou)
        {
            phrase = "Chinese characters: 你好吗 " +
                    System.getProperty("line.separator") +
                    "English text: Nǐ hǎo ma";
        } else if(buttonPressed == imGreat)
        {
            phrase = "Chinese characters: 我很好 " +
                    System.getProperty("line.separator") +
                    "English text: Wǒ hěn hǎo";
        } else if(buttonPressed == thankYou)
        {
            phrase = "Chinese characters: 谢谢 " +
                    System.getProperty("line.separator") +
                    "English text: Xiè xiè";
        } else if(buttonPressed == youreWelcome){
            phrase = "Chinese characters: 别客气" +
                    System.getProperty("line.separator") +
                    "English text: Bié kèqì";
        } else if (buttonPressed == goodbye)
        {
            phrase = "Chinese characters: 再见 " +
                    System.getProperty("line.separator") +
                    "English text: Zàijiàn";
        } else if (buttonPressed == fuckYou)
        {
            phrase = "Chinese characters: ┌∩┐(◣_◢)┌∩┐ " +
                    System.getProperty("line.separator") +
                    "English text: Wǒ Cǎo";
        }
        textView.setText(phrase);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release(); // finish current activity
            }
        });
    }


}
