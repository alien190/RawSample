package com.example.ivanovnv.rawsample;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ivanovnv.rawsample.model.Response;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.text)).setText(getStringFromRawResource(getInputStream(R.raw.licence)));

        try {
            String responseString = getStringFromRawResource(getInputStream("resp"));
            Response response = new Gson().fromJson(responseString, Response.class);
            Toast.makeText(this, response.getGlossary().getTitle(), Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @NonNull
    private String getStringFromRawResource(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        Writer writer = new StringWriter();
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.append("\n");
            }
            bufferedReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return writer.toString();
    }

    private InputStream getInputStream(int rawId) {
        return getResources().openRawResource(rawId);
    }

    private InputStream getInputStream(String filename) throws IOException {
        return getAssets().open(filename);
    }
}
