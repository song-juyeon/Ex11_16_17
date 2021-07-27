package kr.hs.emirim.w2034.ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] poster = {R.drawable.movie1, R.drawable.movie2, R.drawable.movie3, R.drawable.movie4, R.drawable.movie5, R.drawable.movie6, R.drawable.movie7, R.drawable.movie8, R.drawable.movie9, R.drawable.movie10};
    String[] itemArrs = {"기생충", "겟아웃", "조커", "라라랜드", "뷰티인사이드", "겨울왕국2", "침입자", "크루엘라", "알라딘", "보헤미안 랩소디"};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너와 영화포스터");
        Spinner spinner1 = findViewById(R.id.spinner1);
        imgv = findViewById(R.id.imgv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, itemArrs);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgv.setImageResource(poster[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}