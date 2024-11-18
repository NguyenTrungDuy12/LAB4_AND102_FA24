package com.example.lab4_and102_fa24;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import com.example.lab4_and102_fa24.fragment.ContactFragment;
import com.example.lab4_and102_fa24.fragment.HomeFragment;

public class Bai1Activity extends AppCompatActivity {
        FrameLayout frameLayout;
        Button btnHome, btnContact;
        FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        frameLayout = findViewById(R.id.frmContent);
        btnHome = findViewById(R.id.btnHome);
        btnContact = findViewById(R.id.btnContact);

        fragmentManager = getSupportFragmentManager();
        HomeFragment homeFragment = new HomeFragment();
        fragmentManager.beginTransaction().add(R.id.frmContent, homeFragment).commit();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                fragmentManager.beginTransaction().replace(R.id.frmContent, homeFragment).commit();
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContactFragment contactFragment = new ContactFragment();
                fragmentManager.beginTransaction().replace(R.id.frmContent, contactFragment).commit();
            }
        });

    }
}