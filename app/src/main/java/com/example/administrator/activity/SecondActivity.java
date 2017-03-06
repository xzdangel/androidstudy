package com.example.administrator.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Administrator on 2017/2/25.
 */

public class SecondActivity extends BaseActivity {
    public static void  actionStart(Context context, String data1, String data2){
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
        Log.d("xzdangel","zhiixngziji");
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
        String a = getIntent().getStringExtra("param1");
        String b = getIntent().getStringExtra("param2");
        Log.d("xzdangel",a);
        Log.d("xzdangel",b);
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity", data);
//        Button button2 = (Button) findViewById(R.id.button_2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                SecondActivity.actionStart(SecondActivity.this, "data1","data2");
////              Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
////                startActivity(intent);
////              intent.putExtra("data_return", "Hello FirstActivity");
////                setResult(RESULT_OK, intent);
////                finish();
//            }
//        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
