package umn.ac.id.week4a_32761;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityEmpat extends AppCompatActivity {
    private Button btnFragmentFirst, btnFragmentSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empat);

        btnFragmentFirst = findViewById(R.id.showFragment1);
        btnFragmentSecond = findViewById(R.id.showFragment2);

        btnFragmentFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menambahkan Fragment dengan add
                //FragmentManager fm = getSupportFragmentManager();
                //fm.beginTransaction()
                //.add(R.id.containerSatu, new FragmentFirst())
                //.commit();

                // Menambahkan Fragment dengan replace
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.containerDua, new FragmentFirst());
                ft.commit();
            }
        });

        btnFragmentSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menambahkan Fragment dengan replace
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.containerDua, new FragmentSecond());
                ft.commit();
            }
        });
    }
}