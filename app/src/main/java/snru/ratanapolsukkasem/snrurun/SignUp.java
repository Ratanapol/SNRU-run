package snru.ratanapolsukkasem.snrurun;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SignUp extends AppCompatActivity {

    //Expliert
    private EditText nameEditText, userEdirText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choiceRadioButton, choice2RdioButton, choice3RasioButton,
            choice4RadioButton, choice5RadioButton;
    private String nameString,userString,passwordString, avataString ="0";

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindWidget();

            //Radid Button Controler
        radioButtonController();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }   //main Method

    private void radioButtonController() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {

                switch (i) {
                    case R.id.radioButton:
                        avataString = "0";
                        break;
                    case R.id.radioButton2:
                        avataString = "1";
                        break;
                    case R.id.radioButton3:
                        avataString = "2";
                        break;
                    case R.id.radioButton4:
                        avataString = "3";
                        break;
                    case R.id.radioButton5:
                        avataString = "4";
                        break;
                }

            }
        });

    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEdirText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        choiceRadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RdioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RasioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
          //choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);

    }


    public void clickSignUpSign(View view) {


        //Get Value From EdiText
        nameString = nameEditText.getText().toString().trim();
        userString = userEdirText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();


        //check Space
        if (nameString.equals("")  || userString.equals("")  || passwordString.equals("")) {
            MyAlet myAlet = new MyAlet();
            myAlet.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่องค่ะ");
        }
        else {


        }

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "SignUp Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://snru.ratanapolsukkasem.snrurun/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "SignUp Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://snru.ratanapolsukkasem.snrurun/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}   //main Class
