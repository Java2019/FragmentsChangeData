package com.samples.ui.fragmentschangedata;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by use on 20.06.17.
 */
public class Fragment2 extends Fragment implements View.OnClickListener{

    private TextView text;
    private EditText edit;
    private Button bGet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        text = (TextView)getActivity().findViewById(R.id.Text);
        edit = (EditText)getActivity().findViewById(R.id.edit);
        bGet = (Button)getActivity().findViewById(R.id.bGetText);

        bGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        text.setText(edit.getText());
    }
}
