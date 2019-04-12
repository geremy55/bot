package com.example.a999dicebot;

import android.os.AsyncTask;
import android.widget.Toast;
import dice.client.web.BeginSessionResponse;
import dice.client.web.DiceWebAPI;

import static dice.client.web.DiceWebAPI.BeginSession;

public class LoginService extends AsyncTask<Void, Void, BeginSessionResponse> {
    public LoginService() {
    }

    @Override
    protected BeginSessionResponse doInBackground(Void... voids) {
        try {
            DiceWebAPI.BeginSession("1b3224cf350049c2b9b371da87eab974", "kenny555", "123456");
        } catch (Exception ex) {
        }
        return null;
    }

    @Override
    protected void onPostExecute(BeginSessionResponse responce) {
        Toast.makeText(null, responce.getSession().getBalance().toString(), Toast.LENGTH_SHORT)
                .show();
    }

    public void Login() {

    }
}
