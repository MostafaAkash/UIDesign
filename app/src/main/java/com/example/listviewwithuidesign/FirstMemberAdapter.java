package com.example.listviewwithuidesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FirstMemberAdapter extends ArrayAdapter<Member> {
    private Context context;
    private ArrayList<Member>memberArrayList;
    private int resource;
    public FirstMemberAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Member> memberArrayList) {
        super(context, resource, memberArrayList);
        this.resource = resource;
        this.context = context;
        this.memberArrayList = memberArrayList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = null;
        if(position== (memberArrayList.size()-1) )
        {
            view = layoutInflater.inflate(R.layout.footer,parent,false);
            final TextView total = view.findViewById(R.id.total_textViewId_footer);
            total.setText("Total");
            TextView totalAmount = view.findViewById(R.id.total_amount_textViewId_footer);
            totalAmount.setText("12000");

            total.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    total.setText("Position: "+position);
                }
            });

        }
        else
        {
             view = layoutInflater.inflate(R.layout.demo_member_row,parent,false);
            TextView voCode = view.findViewById(R.id.voCode_textViewId_demo_member);
            TextView memberNumber = view.findViewById(R.id.memNumber_textViewId_demo_member);
            TextView memberName = view.findViewById(R.id.memName_textViewId_demo_member);

            Member currentMember = memberArrayList.get(position);
            voCode.setText(currentMember.getVoCode());
            memberName.setText(currentMember.getMemberName());
            memberNumber.setText(String.valueOf(currentMember.getMemberNumber()));
        }

        return view;

    }

}
