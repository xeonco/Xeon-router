package cn.xeon.moduleb;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.xeon.router.MainRouterHub;

/**
 * on 2017/10/20.
 *
 * @author LinZaixiong
 */

public class ModuleBActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_b);
		MainRouterHub.getInstance().addCable(new ModuleBRouterCable());
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				MainRouterHub.getInstance().plug(ModuleBRouterCable.ROUTER_MODULEA_ACTIVITY).navi(ModuleBActivity.this);
			}
		}, 1000* 3);
	}
}
