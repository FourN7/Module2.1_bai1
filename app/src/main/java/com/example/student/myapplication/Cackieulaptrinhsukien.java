package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cackieulaptrinhsukien extends AppCompatActivity {

    TextView Ketqua;
    EditText SoA,SoB;
    Button Tong,Hieu,Tich,Thuong,UCL,Thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cackieulaptrinhsukien);
        SoA=findViewById(R.id.editText_soA);
        SoB=findViewById(R.id.editText_soB);
        Ketqua=findViewById(R.id.TextView_KetQua);
        Tong=findViewById(R.id.button_tong);
        Hieu=findViewById(R.id.button_hieu);
        Tich=findViewById(R.id.button_tich);
        Thuong=findViewById(R.id.button_thuong);
        UCL=findViewById(R.id.button_UCLN);
        Thoat=findViewById(R.id.button_thoat);
        Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               float a=Float.parseFloat(SoA.getText().toString());
               float b=Float.parseFloat(SoB.getText().toString());
               Tinh2so tong = new Tinh2so();
               float data=tong.tong(a,b);
               Ketqua.setText("Kết qua"+tong.tong);
            }
        });
        Hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(SoA.getText().toString());
                float b=Float.parseFloat(SoB.getText().toString());
                Tinh2so hieu = new Tinh2so();
                float data=hieu.hieu(a,b);
                Ketqua.setText("Kết qua"+hieu.hieu);
            }
        });
        Tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(SoA.getText().toString());
                float b=Float.parseFloat(SoB.getText().toString());
                Tinh2so tich = new Tinh2so();
                float data=tich.tich(a,b);
                Ketqua.setText("Kết qua"+tich.tich); }
            });
        Thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(SoA.getText().toString());
                float b=Float.parseFloat(SoB.getText().toString());
                Tinh2so thuong = new Tinh2so();
                float data=thuong.thuong(a,b);
                Ketqua.setText("Kết quả"+thuong.thuong); }
        });
        UCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(SoA.getText().toString());
                float b=Float.parseFloat(SoB.getText().toString());
                Tinh2so ucl = new Tinh2so();
                float data=ucl.ucl(a,b);
                Ketqua.setText("Kết qua"+ucl.ucl); }
        });
        Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
