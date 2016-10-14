package com.malviya.demoprogressbar;

import android.app.Dialog;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn = (Button)findViewById(R.id.button);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
           switch (view.getId()){
               case R.id.button:
                   callPopupWindow();
                   break;
           }
    }

    private void callPopupWindow() {
        Dialog dialog = new Dialog(MainActivity.this,android.R.style.Theme_Holo_Dialog_NoActionBar);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animationdialog;
        dialog.show();
    }
}
