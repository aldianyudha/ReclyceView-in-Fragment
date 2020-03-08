package com.example.prakmobile5;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView rvClub;
    private ArrayList<ClubModel> listClub = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        rvClub = view.findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);
        showReclyclerList();
        return view;
    }

    private void showReclyclerList(){
        ClubAdapter listClubAdapter = new ClubAdapter(ClubData.getClubList(),getContext());
        rvClub.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvClub.setAdapter(listClubAdapter);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
