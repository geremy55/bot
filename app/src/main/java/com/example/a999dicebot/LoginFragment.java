package com.example.a999dicebot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import dice.client.web.BeginSessionResponse;

public class LoginFragment extends Fragment implements View.OnClickListener {

    private Button loginButton;
    private BeginSessionResponse result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.login_fragment, container, false);
        loginButton=view.findViewById(R.id.btn_login);
        loginButton.setOnClickListener(this);
       // setRetainInstance(true);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()!=R.id.btn_login) return;;

        new LoginService().execute();

    }
}
