
package developer.com.algoritmopontoe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by User on 1/2/2018.
 */

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName;
            imageName = getIntent().getStringExtra("image_name");

            String genero,ano,duracao;

            if(imageName.equals("Iron Man")){
                genero ="Gênero: Ação";
                ano="Ano: 2008";
                duracao="Duração: 120 min";
                setImage(imageUrl, imageName,ano,genero,duracao);
            }else if(imageName.equals("Batman")){
                        genero ="Gênero: Ação";
                        ano="Ano: 2005";
                        duracao="Duração: 140 min";
                        setImage(imageUrl, imageName,ano,genero,duracao);
                  }else {
                        genero ="Gênero: Ação";
                        ano="Ano: 2006";
                        duracao="Duração: 154 min";

                        setImage(imageUrl, imageName,ano,genero,duracao);
                        }
            }


        }



    private void setImage(String imageUrl, String imageName,String ano, String genero, String duracao){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName+"\n\n"+genero+"\n"+ano+"\n"+duracao);
        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

}


















