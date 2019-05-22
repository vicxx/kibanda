package com.hfad.restaurante;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.GridLayoutManager;



public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_home, container, false);

        String[] CategoryNames = new String[Category.categories.length];
        for (int i = 0; i < CategoryNames.length; i++) {
            CategoryNames[i] = Category.categories[i].getName();
        }
        int[] categoryImages = new int[Category.categories.length];
        for (int i = 0; i < categoryImages.length; i++) {
            categoryImages[i] = Category.categories[i].getImageResourceId();
        }
       CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(CategoryNames, categoryImages);
        pizzaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        pizzaRecycler.setLayoutManager(layoutManager);


        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), CategoryDetailActivity.class);
                intent.putExtra(CategoryDetailActivity.EXTRA_CATEGORY_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return pizzaRecycler;
    }
}