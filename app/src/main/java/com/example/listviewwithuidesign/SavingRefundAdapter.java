package com.example.listviewwithuidesign;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SavingRefundAdapter extends ArrayAdapter<SavingsRefund> {
    private Context context;
    private ArrayList<SavingsRefund> savingsRefunds;

    public SavingRefundAdapter(@NonNull Context context, int resource, @NonNull ArrayList<SavingsRefund> savingsRefunds) {
        super(context, resource, savingsRefunds);
        this.context =context;
        this.savingsRefunds = savingsRefunds;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.demo_row_second_table,parent,false);

            TextView orgNumber = view.findViewById(R.id.voCode_demo_second);
            TextView orgMemNumber =view.findViewById(R.id.memNumber_demo_second);
            TextView memberName =view.findViewById(R.id.memName_demo_second);
            TextView mobNumber =view.findViewById(R.id.mobNumber_demo_second);
            TextView savBalance=view.findViewById(R.id.save_balance_demo_second);
            TextView withDrawPro=view.findViewById(R.id.withDraw_demo_second);
            TextView bKashNo =view.findViewById(R.id.bKahNumber_demo_second);

            SavingsRefund savingsRefund = savingsRefunds.get(position);
            if(position== (savingsRefunds.size()-1))
            {
                ImageView crossImage = view.findViewById(R.id.imageViewId_demo_second);
                crossImage.setImageDrawable(null);
                orgMemNumber.setText("");
                orgNumber.setText("");
                memberName.setText("Total");
                Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.BOLD);
                memberName.setTypeface(boldTypeface);
                mobNumber.setText("");
                savBalance.setText("");
                withDrawPro.setText("Calculate");
                withDrawPro.setTypeface(boldTypeface);
                bKashNo.setText("");
                view.setBackgroundColor(Color.parseColor("#DEB5FF"));

            }
            else
            {
                orgMemNumber.setText(savingsRefund.getOrgMemNumber());
                orgNumber.setText(savingsRefund.getOrgNumber());
                memberName.setText(savingsRefund.getMemberName());
                mobNumber.setText(savingsRefund.getPhoneNumber());
                savBalance.setText(String.valueOf(savingsRefund.getSavingBalance()));
                withDrawPro.setText(String.valueOf(savingsRefund.getSavingsRefundAmount()));
                bKashNo.setText(savingsRefund.getWalletNumber());
            }



        return view;
    }
}
