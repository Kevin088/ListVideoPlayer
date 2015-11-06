package com.example.textureviewdemo;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class VideoActivity extends Activity {

	RecyclerView rlVideoList;
	List<String> videos=new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		rlVideoList=(RecyclerView) findViewById(R.id.rv_vieo_list);
		LinearLayoutManager layoutManager=new LinearLayoutManager(VideoActivity.this);
		layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
		rlVideoList.setLayoutManager(layoutManager);
		videos.add("视频地址");
		videos.add("视频地址");
		videos.add("视频地址");
		videos.add("视频地址");
		videos.add("视频地址");
		videos.add("视频地址");
		VideoAdapter adapter=new VideoAdapter(VideoActivity.this, videos);
		rlVideoList.setAdapter(adapter);
	}
}
