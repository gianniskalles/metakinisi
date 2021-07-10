package com.learn.metakinisi2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.learn.metakinisi2.R;

public class MainActivity extends AppCompatActivity {
    Button button1, button3, button4, button5, button6, button2 ;
    private EditText name, address,arithmos;
    InterstitialAd interstitialAd;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-5459227708998411/4745251297");
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd =new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-5459227708998411/4745251297");
        interstitialAd.loadAd(new AdRequest.Builder().build());


        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                    Manifest.permission.SEND_SMS)) {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.SEND_SMS}, 1);
            } else {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.SEND_SMS}, 1);
            }
        } else {
            // do nothing
        }

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        arithmos = findViewById(R.id.arithmos);
        imageView = (ImageView) findViewById(R.id.imageView);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/e.service4u"));
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = arithmos.getText().toString();
                String sms = name.getText().toString() + " " + address.getText().toString();
                interstitialAd.show();

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, '1' + " " + sms, null, null);
                    Toast.makeText(MainActivity.this, "Στάλθηκε!", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Αποτυχία αποστολής!", Toast.LENGTH_SHORT).show();

                }

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = arithmos.getText().toString();
                String sms = name.getText().toString() + " " + address.getText().toString();
                interstitialAd.show();

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, '2' + " " + sms, null, null);
                    Toast.makeText(MainActivity.this, "Στάλθηκε!", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Αποτυχία αποστολής!", Toast.LENGTH_SHORT).show();

                }

            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = arithmos.getText().toString();
                String sms = name.getText().toString() + " " + address.getText().toString();
                interstitialAd.show();
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, '3' + " " + sms, null, null);
                    Toast.makeText(MainActivity.this, "Στάλθηκε!", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Αποτυχία αποστολής!", Toast.LENGTH_SHORT).show();

                }

            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = arithmos.getText().toString();
                String sms = name.getText().toString() + " " + address.getText().toString();
                interstitialAd.show();

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, '4' + " " + sms, null, null);
                    Toast.makeText(MainActivity.this, "Στάλθηκε!", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Αποτυχία αποστολής!", Toast.LENGTH_SHORT).show();

                }

            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = arithmos.getText().toString();
                String sms = name.getText().toString() + " " + address.getText().toString();
                interstitialAd.show();

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, '5' + " " + sms, null, null);
                    Toast.makeText(MainActivity.this, "Στάλθηκε!", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Αποτυχία αποστολής!", Toast.LENGTH_SHORT).show();

                }

            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = arithmos.getText().toString();
                String sms = name.getText().toString() + " " + address.getText().toString();
                interstitialAd.show();

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, '6' + " " + sms, null, null);
                    Toast.makeText(MainActivity.this, "Στάλθηκε!", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Αποτυχία αποστολής!", Toast.LENGTH_SHORT).show();

                }

            }

        });


    }



    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResuits) {
        switch (requestCode) {
            case 1: {
                if (grantResuits.length > 0 && grantResuits[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "Δόθηκε άδεια!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "Δεν δόθηκε άδεια!", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}