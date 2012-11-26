package com.lostmind.e_vote;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Hasil extends Activity {

	ProgressBar pb1, pb2, pb3;
	TextView tv1, tv2, tv3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hasil);

		pb1 = (ProgressBar) findViewById(R.id.progressBar1);
		pb2 = (ProgressBar) findViewById(R.id.progressBar2);
		pb3 = (ProgressBar) findViewById(R.id.progressBar3);
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);

		Bundle bundle = this.getIntent().getExtras();

		Integer sby = bundle.getInt("votesby");
		Integer mega = bundle.getInt("votemega");
		Integer pra = bundle.getInt("votepra");
		Integer pemilih = bundle.getInt("total");

		pb1.setProgress((sby * 100) / pemilih);
		pb2.setProgress((mega * 100) / pemilih);
		pb3.setProgress((pra * 100) / pemilih);

		tv1.setText("SBY sebanyak: "+(String.valueOf(sby)));
		tv2.setText("Megawati sebanyak: "+String.valueOf(mega));
		tv3.setText("Prabowo sebanyak: "+String.valueOf(pra));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_vote, menu);
		return true;
	}
}
