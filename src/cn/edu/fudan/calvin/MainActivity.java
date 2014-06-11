/**
 * @Title: MainACtivity.java
 * @Description: TODO
 * @author: Calvinyang
 * @date: Jun 11, 2014 2:04:54 PM
 * Copyright: Copyright (c) 2013
 * @version: 1.0
 */
package cn.edu.fudan.calvin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/**
 * @author: Calvinyang
 * @Description: TODO
 * @date: Jun 11, 2014 2:04:54 PM
 */
public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ActionSheet.show(MainActivity.this, "title", new String[] {
						"c1", "c2" }, new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						Log.e("xxx", arg2 + "");
					}

				}, new OnClickListener() {

					@Override
					public void onClick(View v) {
						Log.e("xxx", "cancel");
					}
				});
			}
		});
	}
}
