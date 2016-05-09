package com.example.yulian.mathematicsbench;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.example.yulian.mathematicsbench.Calculator;
import com.example.yulian.mathematicsbench.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager fTrans = getSupportFragmentManager();
    Calculator calculator = new Calculator();
    MediaPlayer mPlayerstart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setTitle(" Calculator ");

        fTrans.beginTransaction()
                .replace(R.id.fragreplace, calculator).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_calc)
        {
            setTitle(" Calculator ");
            fTrans.beginTransaction()
                    .replace(R.id.fragreplace, calculator).commit();
            Context context = getApplicationContext();
            mPlayerstart = MediaPlayer.create(context, R.raw.welcome);
            mPlayerstart.start();
            Intent notificationIntent = new Intent();
            PendingIntent contentIntent = PendingIntent.getActivity(context,
                    0, notificationIntent,
                    PendingIntent.FLAG_CANCEL_CURRENT);
            NotificationManager nm = (NotificationManager) context
                    .getSystemService(Context.NOTIFICATION_SERVICE);
            Resources res = context.getResources();
            Notification.Builder builder = new Notification.Builder(context);
            // Uri ringURI = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            long[] vibrate = new long[] { 1000, 1000, 1000, 1000 };
            builder.setContentIntent(contentIntent)
                    .setTicker(" Welcome ;) !!! ")
                    .setSmallIcon(R.drawable.mathb)
                    .setWhen(System.currentTimeMillis())
                    //  .setSound(ringURI)
                    .setVibrate(vibrate)
                    .setContentTitle(" Notification ")
                    .setContentText(" You chose calculator");
            Notification notification = builder.build();
            notification.defaults = Notification.DEFAULT_SOUND |
                    Notification.DEFAULT_VIBRATE;
            notification.flags = notification.flags | Notification.FLAG_SHOW_LIGHTS;
            notification.flags = notification.flags | Notification.FLAG_INSISTENT;
            Notification n = builder.getNotification();
            nm.notify(1, n);
        }
        else if (id == R.id.nav_square)
        {
            setTitle(" Quadratic equation ");
            Context context1 = getApplicationContext();
            mPlayerstart = MediaPlayer.create(context1, R.raw.welcome);
            mPlayerstart.start();
            Intent notificationIntent = new Intent();
            PendingIntent contentIntent1 = PendingIntent.getActivity(context1,
                    0, notificationIntent,
                    PendingIntent.FLAG_CANCEL_CURRENT);
            NotificationManager nm1 = (NotificationManager) context1
                    .getSystemService(Context.NOTIFICATION_SERVICE);
            Resources res = context1.getResources();
            Notification.Builder builder1 = new Notification.Builder(context1);
            // Uri ringURI = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            long[] vibrate1 = new long[] { 1000, 1000, 1000, 1000 };
            builder1.setContentIntent(contentIntent1)
                    .setTicker(" Welcome ;) !!! ")
                    .setSmallIcon(R.drawable.mathb)
                    .setWhen(System.currentTimeMillis())
                    //  .setSound(ringURI)
                    .setVibrate(vibrate1)
                    .setContentTitle(" Notification ")
                    .setContentText(" You chose quadratic equation");
            Notification notification1 = builder1.build();
            notification1.defaults = Notification.DEFAULT_SOUND |
                    Notification.DEFAULT_VIBRATE;
            notification1.flags = notification1.flags | Notification.FLAG_SHOW_LIGHTS;
            notification1.flags = notification1.flags | Notification.FLAG_INSISTENT;
            Notification n1 = builder1.getNotification();
            nm1.notify(1, n1);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
