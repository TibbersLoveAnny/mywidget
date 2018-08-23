package com.xy.mywidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xy.mylibrary.ActionSheetDialog;
import com.xy.mylibrary.XYProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // showProgress();
                showDialog();
            }
        });
    }


    private void showProgress() {
        if (!XYProgressBar.isShowing()) {
            XYProgressBar.showSuccinctProgress(this, "", 2, false, true);
        }
    }

    private void showDialog() {
        new ActionSheetDialog(MainActivity.this)
                .builder()
                .setCancelable(false)
                .setCanceledOnTouchOutside(true)
                .addSheetItem("相机", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                                Toast.makeText(MainActivity.this, "相机", Toast.LENGTH_SHORT).show();
                            }
                        })
                .addSheetItem("相册", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "相册", Toast.LENGTH_SHORT).show();
                            }
                        }).show();

    }
}
