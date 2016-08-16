package com.example.android.wtmcoursework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleQuiz1(View view) {
        View viewQuiz1 = findViewById(R.id.relative_layout1);
        if (viewQuiz1.getVisibility() == View.GONE)
            viewQuiz1.setVisibility(View.VISIBLE);
        else if (viewQuiz1.getVisibility() == View.VISIBLE)
            viewQuiz1.setVisibility(View.GONE);
    }

    public void toggleQuiz2(View view) {
        View viewQuiz2 = findViewById(R.id.relative_layout2);
        if (viewQuiz2.getVisibility() == View.GONE)
            viewQuiz2.setVisibility(View.VISIBLE);
        else if (viewQuiz2.getVisibility() == View.VISIBLE)
            viewQuiz2.setVisibility(View.GONE);
    }

    public void toggleQuiz3(View view) {
        View viewQuiz3 = findViewById(R.id.relative_layout3);
        if (viewQuiz3.getVisibility() == View.GONE)
            viewQuiz3.setVisibility(View.VISIBLE);
        else if (viewQuiz3.getVisibility() == View.VISIBLE)
            viewQuiz3.setVisibility(View.GONE);
    }

    public void toggleQuiz4(View view) {
        View viewQuiz4 = findViewById(R.id.relative_layout4);
        if (viewQuiz4.getVisibility() == View.GONE)
            viewQuiz4.setVisibility(View.VISIBLE);
        else if (viewQuiz4.getVisibility() == View.VISIBLE)
            viewQuiz4.setVisibility(View.GONE);
    }

    public void toggleQuiz5(View view) {
        View viewQuiz5 = findViewById(R.id.relative_layout5);
        if (viewQuiz5.getVisibility() == View.GONE)
            viewQuiz5.setVisibility(View.VISIBLE);
        else if (viewQuiz5.getVisibility() == View.VISIBLE)
            viewQuiz5.setVisibility(View.GONE);
    }

    public void clickOnMore(View view) {
        if (view.getId() == R.id.moreButton1) {
            openWebPage("http://www.dailymail.co.uk/news/article-2594153/Britains-oldest-red-postbox-use-161-YEARS-bears-Queen-Victorias-initials.html");
        }
    }

//           else if (view.getId()==R.id.moreButton2) {
//           openWebPage("https://www.facebook.com");
//       }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void clickOnMore2(View view) {
        if (view.getId() == R.id.moreButton2) {
            openWebPage2("http://www.guinnessworldrecords.com/world-records/most-expensive-letter-sold-at-auction/");
        }

    }

    public void openWebPage2(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    public void clickOnMore3(View view) {
        if (view.getId() == R.id.moreButton3) {
            openWebPage3("http://www.telegraph.co.uk/news/worldnews/centralamericaandthecaribbean/costarica/11801361/Drug-trafficking-carrier-pigeon-detained-in-Costa-Rica.html");
        }

    }

    public void openWebPage3(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    public void clickOnMore4(View view) {
        if (view.getId() == R.id.moreButton4) {
            openWebPage4("http://www.abc.net.au/news/2014-04-09/ten-most-famous-message-in-a-bottle-discoveries/5376040");
        }

    }

    public void openWebPage4(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    public void clickOnMore5(View view) {
        if (view.getId() == R.id.moreButton5) {
            openWebPage5("http://www.ebay.com/bhp/penny-black");
        }

    }

    public void openWebPage5(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


        //String url = "https://www.google.de";
        //Intent i = new Intent(Intent.ACTION_VIEW);
        //i.setData(Uri.parse(url));
        //startActivity(i);
        //
        //


    }
}
