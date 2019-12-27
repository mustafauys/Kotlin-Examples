package com.musta.instagramcloneparse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class UploadActivity extends AppCompatActivity {

    EditText commentText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        commentText = findViewById(R.id.upload_activity_comment_text);
        imageView = findViewById(R.id.upload_activity_imageview);
    }

    public void upload (View view) {

    }
}
