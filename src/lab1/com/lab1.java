package lab1.com;

import com.example.androidgiaodien.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class lab1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);
		String doc="https://drive.google.com/open?id=0B_lhNfypvxRBeUFKV3hDN3E0TTg";
		WebView wv=(WebView)findViewById(R.id.fileWebView);
		
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		
		wv.loadUrl(doc);
	}
}
