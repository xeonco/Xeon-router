package cn.xeon.router.app;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.xeon.router.MainRouterHub;
import cn.xeon.router.modulea.ModuleARouterHub;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View tv_test = this.findViewById(R.id.tv_test);
        tv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        MainRouterHub.getInstance().plug(ModuleBRouterCable.ROUTER_MODULEA_ACTIVITY).navi(MainActivity.this);
                    }
                }, 1000* 3);
            }
        });
    }

//    public void onJump(View view){
//
//    }
}
