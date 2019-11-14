package com.example.regischarles.nestedrecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView parentRecycler;
    ParentAdapter parentAdapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parentAdapter=new ParentAdapter(this,populateParentArray());
        parentRecycler=findViewById(R.id.parentRecycler);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("App Store");
        parentRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        parentRecycler.setAdapter(parentAdapter);
        parentRecycler.setItemAnimator(new DefaultItemAnimator());
    }
    public ArrayList<ParentModel> populateParentArray(){

        String[] popularApps={"Pubg","Cod","Risk","Joyride"};
        String[] trendingApps={"Instagra","Amazon","Tinder","Redit"};
        String[] editorchoiece={"poker","prime","Candy Crush","Angry Bird 2"};
        String[] topGrossing={"Uno","2048","SimCity","Pokemon Go"};
        String[] topCharts={"Ludo King","Carrom","Subway Surfers","Fun Race"};
        String[] recommendedApps={"snapchat","Tinder","Cod","YouTube"};
        String[] newlyArrived={"Cars","Clash","Cod","Redit","YouTube"};
        int[] iconDrawable={R.drawable.pubg,R.drawable.callofduty,R.drawable.risk,R.drawable.joyride};
        int[] trendingAppIcon={R.drawable.pubg,R.drawable.amazon,R.drawable.callofduty,R.drawable.whatsapp};
        int[] editorChoieceIcon={R.drawable.poker,R.drawable.prime,R.drawable.callofduty,R.drawable.truecaller};
        int[] recommendedAppsIcon={R.drawable.snapchat,R.drawable.tinder,R.drawable.callofduty,R.drawable.youtube};
        String[] title={"Popular Apps","Trending Apps","Editor's Choice","Top Grossing","Top Charts","Recommeded Apps","Previously Installed","Newly Arrived"};
        ArrayList<ParentModel> parentModel=new ArrayList<>();
        for (int i=0;i<8;i++){
            ArrayList<ChildModel> childModels=new ArrayList<>();
            for(int j=0;j<4;j++){
               switch(i){
                   case 0:
                       childModels.add(new ChildModel(popularApps[j],"10mb","4.2",iconDrawable[j]));
                       break;
                   case 1:
                       childModels.add(new ChildModel(trendingApps[j],"18mb","4.9",trendingAppIcon[j]));
                       break;
                   case 2:
                       childModels.add(new ChildModel(editorchoiece[j],"35mb","4.9",editorChoieceIcon[j]));
                       break;
                   case 3:
                       childModels.add(new ChildModel(topGrossing[j],"185mb","4.9",trendingAppIcon[j]));
                       break;
                   case 4:
                       childModels.add(new ChildModel(topCharts[j],"15mb","4.9",trendingAppIcon[j]));
                       break;
                   case 5:
                       childModels.add(new ChildModel(recommendedApps[j],"115mb","4.9",recommendedAppsIcon[j]));
                       break;
                   case 6:
                       childModels.add(new ChildModel(newlyArrived[j],"125mb","4.9",trendingAppIcon[j]));
                       break;
                     default:
                         childModels.add(new ChildModel(popularApps[j],"50mb","4.5",R.drawable.prime));
                        break;
               }

            }
            parentModel.add(new ParentModel(title[i],childModels));
        }
        return parentModel;


    }
}
