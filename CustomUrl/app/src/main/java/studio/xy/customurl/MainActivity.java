package studio.xy.customurl;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = getIntent().getData();
        if (uri != null) {
            String userName = uri.getQueryParameter("UserName");
            String sessionId = uri.getQueryParameter("SessionId");

            TextView infoView = (TextView) findViewById(R.id.info_textview);
            infoView.setText(String.format("%s%s%s%s%s%s%s",
                    infoView.getText(), "\n\n",
                    "UserName = ", userName, "\n",
                    "Session ID = ", sessionId));
        }
    }
}
