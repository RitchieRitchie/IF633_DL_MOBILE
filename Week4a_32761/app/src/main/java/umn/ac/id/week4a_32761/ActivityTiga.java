package umn.ac.id.week4a_32761;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTiga extends AppCompatActivity {
    private Button btnFragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        btnFragment1 = findViewById(R.id.showFragmentFirst);

        btnFragment1.setOnClickListener(new View.OnClickListener() {
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
                ft.replace(R.id.containerSatu, new FragmentFirst());
                ft.commit();
            }
        });
    }
}