package com.example.imagechange10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_1;
    private EditText edt_1;
    private Button btn_1;
    private ImageView img_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int image[] = {
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
                R.drawable.k};


        tv_1=findViewById(R.id.tv_1);
        btn_1=findViewById(R.id.bt_1);
        edt_1=findViewById(R.id.edt_1);
        img_1=findViewById(R.id.img_1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt_1.getText().toString().matches(""))
                {
                    Toast toast = Toast.makeText(MainActivity.this, "欄位不能是空白", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    int imageID = Integer.parseInt(edt_1.getText().toString());
                    if (imageID > 10 || imageID < 1) {
                        Toast toast = Toast.makeText(MainActivity.this, "請輸入1~10", Toast.LENGTH_LONG);
                        toast.show();
                    }
                    else {
                        img_1.setImageResource(image[imageID-1]);
                    }

                }




            }
        });



    }
}
