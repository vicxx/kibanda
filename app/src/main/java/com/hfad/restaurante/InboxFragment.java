package com.hfad.restaurante;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;



public class InboxFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        RecyclerView foodRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_inbox, container, false);

        String[] foodNames = new String[Food.feed.length];
        for (int i = 0; i < foodNames.length; i++) {
            foodNames[i] = Food.feed[i].getName();
        }

        int[] foodImages = new int[Food.feed.length];
        for (int i = 0; i < foodImages.length; i++) {
            foodImages[i] = Food.feed[i].getImageResourceId();
        }

        String[] foodDescs = new String[Food.feed.length];
        for (int i = 0; i < foodDescs.length; i++) {
            foodDescs[i] = Food.feed[i].getshortDescription();
        }

        int[] foodPrices = new int[Food.feed.length];
        for (int i = 0; i < foodPrices.length; i++) {
            foodPrices[i] = Food.feed[i].getPrice();
        }

        return foodRecycler;
    }

}
