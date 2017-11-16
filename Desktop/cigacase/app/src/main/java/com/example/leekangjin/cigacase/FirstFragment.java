package com.example.leekangjin.cigacase;
import android.database.Cursor;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by LeeKangJin on 2017-11-03.
 */

public class FirstFragment extends android.support.v4.app.Fragment
{
   UseSQLCommand sqlCommand;

    public FirstFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.frgment_first, container, false);
        sqlCommand = new UseSQLCommand(this.getActivity());

        Button select = (Button)layout.findViewById(R.id.selectButton);
        Button insert = (Button)layout.findViewById(R.id.insertButton);

        final TextView id = (TextView)layout.findViewById(R.id.id);
        final TextView challenge = (TextView)layout.findViewById(R.id.challenge);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor dbInfo = sqlCommand.selectUserTable();

                if(dbInfo.getCount() > 0) {
                    dbInfo.moveToFirst();
                    id.setText(dbInfo.getString(0));
                    challenge.setText(dbInfo.getString(1));

                    dbInfo.close();
                }
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sqlCommand.insertUserTable();
            }
        });

        return layout;
    }
}
