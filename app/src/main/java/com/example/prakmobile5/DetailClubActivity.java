package com.example.prakmobile5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetailClubActivity extends AppCompatActivity {
    ImageView ivImg;
    TextView tvName, tvDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club);

        ivImg = findViewById(R.id.iv_gbclub);
        tvName = findViewById(R.id.tv_clubname);
        tvDetail = findViewById(R.id.tv_detailclub);

        String clubName = getIntent().getStringExtra("club_name");
        String clubDetail = getIntent().getStringExtra("club_detail");
        int clubImage = getIntent().getIntExtra("club_image",0);

        tvName.setText(clubName);
        tvDetail.setText(clubDetail);
        Glide.with(this)
                .asBitmap()
                .load(clubImage)
                .into(ivImg);
    }
}