package com.alienske.msconnect;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends ActionBarActivity  implements View.OnClickListener{

    Button bLogin;
    EditText etUsername, etPassword;
    TextView registration;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        registration =(TextView) findViewById(R.id.registration);

        bLogin.setOnClickListener(this);
        registration.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
               case R.id.bLogin:
                   String username = etUsername.getText().toString();
                   String password = etPassword.getText().toString();

                   User user = new User(username,password);

                   authenticate(user);


                break;
            case R.id.registration:
               startActivity(new Intent(this, Register.class));
                break;
        }

    }
    private void authenticate(User user){
        ServerRequests serverRequests = new ServerRequests(this);
        serverRequests.fetchUserDataInBackground(user, new GetUserCallBack() {
            @Override
            public void done(User returnedUser) {
                if(returnedUser == null){
                     showErrorMessage();
                }else{
                    logUserIn(returnedUser);
                }
            }
        });
    }
 private void showErrorMessage(){
     AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(Login.this);
     dialogBuilder.setMessage("Incorrect User Details");
     dialogBuilder.setPositiveButton("Ok", null);
     dialogBuilder.show();
 }
    private void logUserIn(User returnedUser){

        userLocalStore.storeUserData(returnedUser);
        userLocalStore.setUserLoggedIn(true);
        startActivity(new Intent(this, Curriculum.class));
    }
}
