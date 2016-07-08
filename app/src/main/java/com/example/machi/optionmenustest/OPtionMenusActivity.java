package com.example.machi.optionmenustest;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class OPtionMenusActivity extends Activity implements View.OnClickListener {

    private Button openButton = null;
    private Button closeButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menus);

        openButton = (Button)findViewById(R.id.btn_open);
        openButton.setOnClickListener(this);
        closeButton = (Button)findViewById(R.id.btn_close);
        closeButton.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        // メニューアイテムの追加
        menu.add("アイテム A");
        menu.add("アイテム B");

        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_open) {
            openOptionsMenu();
        }
        else {
            closeOptionsMenu();
        }
    }
}
