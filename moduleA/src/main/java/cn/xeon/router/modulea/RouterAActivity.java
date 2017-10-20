package cn.xeon.router.modulea;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * on 2017/10/19.
 *
 * @author LinZaixiong
 */

public class RouterAActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_a);
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				ModuleARouterHub.getInstance().plug(ModuleARouterCable.ROUTER_MODULEB_ACTIVITY).navi(RouterAActivity.this);
				finish();
			}
		}, 1000* 3);
	}
}
