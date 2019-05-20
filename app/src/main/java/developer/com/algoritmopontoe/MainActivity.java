package developer.com.algoritmopontoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/pt/0/00/Iron_Man_poster.jpg");
        mNames.add("Iron Man");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/pt/thumb/1/1b/Batman_begins.jpg/250px-Batman_begins.jpg");
        mNames.add("Batman");

        mImageUrls.add("https://1.bp.blogspot.com/-R1JkBRnoVug/VS5r3mWWL3I/AAAAAAAAEpQ/C4kM0MxjOL4/s1600/Superman%2BO%2BRetorno%2B-%2BCapa%2BFilme%2BDVD.jpg");
        mNames.add("Super Man");



        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}






















