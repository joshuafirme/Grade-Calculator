package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoView = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.start_ur_dreams);

        MediaController controller = new MediaController(this);
        controller.setAnchorView(videoView);

        videoView.setMediaController(controller);
        videoView.start();
    }
}
