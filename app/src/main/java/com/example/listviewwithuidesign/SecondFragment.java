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

public class SecondFragment extends Fragment {
    private ListView listViewSecond;
    private SavingRefundAdapter savingAdapter;
    private ArrayList<SavingsRefund> refundArrayList;
    public SecondFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment_layout,container,false);

        init(view);
        createMemberListForSecondTable();
        setAdapterForSecondTable();
        return view;
    }

    private void createMemberListForSecondTable() {
        refundArrayList = new ArrayList<>();
        refundArrayList.add(new SavingsRefund());
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));
        refundArrayList.add(refundArrayList.size()-1,new SavingsRefund("2057","121","Aklima Khatun",10000,"01768924976","83748574737574",2000));


    }


    private void setAdapterForSecondTable() {
        savingAdapter = new SavingRefundAdapter(getActivity(),R.layout.demo_row_second_table,refundArrayList);
        listViewSecond.setAdapter(savingAdapter);
    }

    private void init(View view) {
        listViewSecond = view.findViewById(R.id.listView_id_for_second_table);
    }
}
