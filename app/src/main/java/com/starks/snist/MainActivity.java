package com.starks.snist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    WebView webView;

  ScrollView reportframe;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;

    //WebView web=(WebView)findViewById(R.id.web);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reportframe=(ScrollView) findViewById(R.id.report_layout);

        webView = (WebView)findViewById(R.id.web);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://www.sreenidhi.edu.in/");
        webView.setWebViewClient(new WebViewClient());


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    public void setSupportActionBar(Toolbar toolbar) {

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }
    private void setWebviewTransparency(final boolean transparent) {
        final int color = transparent ? 0 : Color.WHITE;
        webView.setBackgroundColor(color);
    }




    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        reportframe=(ScrollView) findViewById(R.id.report_layout);
        int id = item.getItemId();

        if (id == R.id.reports) {

            reportframe.setVisibility(View.VISIBLE);
            b1=(Button)findViewById(R.id.btn1);
            b2=(Button)findViewById(R.id.btn2);
            b3=(Button)findViewById(R.id.btn3);
            b4=(Button)findViewById(R.id.btn4);
            b5=(Button)findViewById(R.id.btn5);
            b6=(Button)findViewById(R.id.btn6);
            b7=(Button)findViewById(R.id.btn7);
            b8=(Button)findViewById(R.id.btn8);
            b9=(Button)findViewById(R.id.btn9);
            b10=(Button)findViewById(R.id.btn10);
            b11=(Button)findViewById(R.id.btn11);
            b12=(Button)findViewById(R.id.btn12);
            b13=(Button)findViewById(R.id.btn13);
            b14=(Button)findViewById(R.id.btn14);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebSettings webSettings = webView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    webView.loadUrl("http://103.15.62.28/");
                    webView.setWebViewClient(new WebViewClient());
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebSettings webSettings = webView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    webView.loadUrl("http://103.15.62.28/reports/report_student.php");
                    webView.setWebViewClient(new WebViewClient());
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebSettings webSettings = webView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    webView.loadUrl("http://103.15.62.28/reports/gradehistory.php");
                    webView.setWebViewClient(new WebViewClient());
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebSettings webSettings = webView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    webView.loadUrl("http://103.15.62.28/reports/getsemattendance.php");
                    webView.setWebViewClient(new WebViewClient());
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebSettings webSettings = webView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    webView.loadUrl("http://103.15.62.28/reports/coursemarks.php");
                    webView.setWebViewClient(new WebViewClient());
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WebSettings webSettings = webView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    webView.loadUrl("http://103.15.62.28/reports/cmm_student.php");
                    webView.setWebViewClient(new WebViewClient());
                }
            });

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
