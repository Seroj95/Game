package com.example.stringadvance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url="<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/c/50457\" alt=\"Nicolas Cage\"/>\n" +
                "\t\t\t\t\t</div>";
//        Pattern pattern =Pattern.compile("Mi (.*?)pi");
//        Matcher matcher=pattern.matcher(url);
        Pattern patternImg=Pattern.compile("<img src=\"(.*?)\" ");
        Pattern paterName=Pattern.compile("alt=\" (.*?)\"");
        Matcher matcherImg=patternImg.matcher(url);
        Matcher matvherName=paterName.matcher(url);

    }
}
