package com.lostmind.e_vote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Vote extends Activity {
	RadioButton sby, mega, prabo;
	Integer hasilsby, hasilmega, hasilpra, pemilih;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vote);
		sby = (RadioButton) findViewById(R.id.radio0);
		mega = (RadioButton) findViewById(R.id.radio1);
		prabo = (RadioButton) findViewById(R.id.radio2);

		hasilsby = 25;
		hasilmega = 30;
		hasilpra = 21;

	}

	public void Pilih(View v) {

		if (sby.isChecked()) {
			hasilsby = hasilsby + 1;
			Toast.makeText(this, "Anda Memilih SBY dan telah dihitung",
					Toast.LENGTH_LONG).show();

		}
		if (mega.isChecked()) {

			hasilmega = hasilmega + 1;
			Toast.makeText(this, "Anda Memilih Mega dan telah dihitung",
					Toast.LENGTH_LONG).show();

		}
		if (prabo.isChecked()) {
			hasilpra = hasilpra + 1;
			Toast.makeText(this, "Anda Memilih Prabowo dan telah dihitung",
					Toast.LENGTH_LONG).show();
		}
	}

	public void Hasil(View v) {
		Intent i = new Intent(this, Hasil.class);
		Bundle b = new Bundle();
		b.putInt("votesby", hasilsby);
		b.putInt("votemega", hasilmega);
		b.putInt("votepra", hasilpra);
		b.putInt("total", hasilsby + hasilmega + hasilpra);
		i.putExtras(b);
		startActivity(i);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_vote, menu);
		return true;
	}
}
