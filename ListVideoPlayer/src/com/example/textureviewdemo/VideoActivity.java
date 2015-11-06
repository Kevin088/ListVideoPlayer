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
		
		/**故意报错**/
		=================/**请填充url地址**/======================;
		=================/**请填充url地址**/======================;
		=================/**请填充url地址**/======================;
		/**故意报错**/
		videos.add("");
		videos.add("");
		videos.add("");
		videos.add("");
		videos.add("");
		videos.add("");
		VideoAdapter adapter=new VideoAdapter(VideoActivity.this, videos);
		rlVideoList.setAdapter(adapter);
	}
}
