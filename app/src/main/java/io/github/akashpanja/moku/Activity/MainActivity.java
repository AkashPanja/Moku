package io.github.akashpanja.moku.Activity;

import android.os.Build;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import io.github.akashpanja.moku.R;
import io.github.akashpanja.moku.resource.FontManager;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;

    //Content Main
    TextView TitleLibrary,TitleBar;

    //Library
    Button LibraryPlaylist,LibraryAlbum,LibraryArtist,LibrarySongs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find our drawer view
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(
                this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

//        Content Main
        TitleLibrary=(TextView)findViewById(R.id.TitleLibrary);


        //Library
        LibraryPlaylist=(Button)findViewById(R.id.LibraryPlaylist);
        LibraryAlbum=(Button)findViewById(R.id.LibraryAlbum);
        LibraryArtist=(Button)findViewById(R.id.LibraryArtist);
        LibrarySongs=(Button)findViewById(R.id.LibrarySongs);

    }

}
