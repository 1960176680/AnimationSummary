package com.zhouwenguang.hz.animationsummary;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 动画xml资源位于：res\drawable\frame.xml
 * 使用：
 * AnimationDrawable animationDrawable= (AnimationDrawable) imageView.getBackground();
 *animationDrawable.start();
 */
public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image);
        button=findViewById(R.id.btn);
        final AnimationDrawable animationDrawable= (AnimationDrawable) imageView.getBackground();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();
            }
        });
    }
}
