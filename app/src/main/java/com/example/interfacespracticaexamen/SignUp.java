package com.example.interfacespracticaexamen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        ImageView mSea=findViewById(R.id.backviewSignUp);
        Glide.with(this)
                .load(R.drawable.momo2)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                //.diskCacheStrategy(DiskCacheStrategy.ALL)
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.azulO)))
                //.circleCrop()
                .into(mSea);
    }

    public void cancel(View v){
        Intent intent=new Intent(SignUp.this, Login.class);
        startActivity(intent);
    }

    public void openMainFromSignUp(View v){
        Intent intent=new Intent(SignUp.this, MainActivity.class);
        startActivity(intent);
    }
}