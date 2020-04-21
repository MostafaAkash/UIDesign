package com.example.listviewwithuidesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private ListView listViewFirst;
    private FirstMemberAdapter firstMemberAdapter;
    private ArrayList<Member> memberArrayList;

    public FirstFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.first_fragment_layout, container, false);

        init(view);
        createMemberListForFirstTable();
        setAdapterForFirstTable();

        return view;

    }

    private void setAdapterForFirstTable() {

        firstMemberAdapter = new FirstMemberAdapter(getActivity(), R.layout.demo_member_row, memberArrayList);
        listViewFirst.setAdapter(firstMemberAdapter);

    }

    private void createMemberListForFirstTable() {
        memberArrayList = new ArrayList<>();
        memberArrayList.add(new Member());
        memberArrayList.add(memberArrayList.size() - 1, new Member("124536", 15678, "Golam Mostafa"));
        memberArrayList.add(memberArrayList.size() - 1, new Member("124536", 15678, "Golam Mostafa"));
        memberArrayList.add(memberArrayList.size() - 1, new Member("124536", 15678, "Golam Mostafa"));
        memberArrayList.add(memberArrayList.size() - 1, new Member("124536", 15678, "Golam Mostafa"));
        memberArrayList.add(memberArrayList.size() - 1, new Member("124536", 15678, "Golam Mostafa"));
        memberArrayList.add(memberArrayList.size() - 1, new Member("124536", 15678, "Hi Akash"));

    }

    private void init(View view) {
        listViewFirst = view.findViewById(R.id.listView_id_for_first_table);
    }
}
