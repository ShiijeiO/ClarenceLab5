//Clarence Oriola N01573843
package com.example.fragmenttry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class DefinitionFragmentClarence extends Fragment {

    public DefinitionFragmentClarence() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String c = bundle.getString("concept_array", "");
            String d = bundle.getString("definition_array", "");
            int index = bundle.getInt("index", -1);

            String indexString = " " + (index + 1);

            if (index != -1) {
                d += indexString;
            }

            TextView conceptTV = view.findViewById(R.id.clarenceConcepts);
            TextView definitionTV = view.findViewById(R.id.clarenceDefinitions);
            conceptTV.setText(c);
            definitionTV.setText(d);
        }
        return view;
    }

}