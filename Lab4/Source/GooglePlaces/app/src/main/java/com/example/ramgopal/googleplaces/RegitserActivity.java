package com.example.ramgopal.googleplaces;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegitserActivity extends AppCompatActivity {

            public Button butt;
            public EditText eu;
            public EditText ep;
            public EditText em;
            public void hello(){
                butt=(Button)findViewById(R.id.buttonLogin);
                butt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public boolean onCreateOptionsMenu(Menu menu) {
                        // Inflate the menu; this adds items to the action bar if it is present.
                        return true;
                    }

                    @Override
                    public boolean onOptionsItemSelected(MenuItem item) {
                        // Handle action bar item clicks here. The action bar will
                        // automatically handle clicks on the Home/Up button, so long
                        // as you specify a parent activity in AndroidManifest.xml.
                        int id = item.getItemId();

                        return super.onOptionsItemSelected(item);
                    }

                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.RegitserActivity);
                    }

                    public void login(View v)
                    {
                        Intent loginPage = new Intent(RegitserActivity.this,MainActivity.class);
                        startActivity(loginPage);
                    }

                    public boolean validate() {
                        boolean valid = true;

                        if (username.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
                            Toast.makeText(getApplicationContext(), "Enter a valid email address", Toast.LENGTH_SHORT).show();
                            valid = false;
                        } else {
                            errorText.setError(null);
                        }

                        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
                            Toast.makeText(getApplicationContext(), "Password should be atleast 4-6 alphanumeric", Toast.LENGTH_SHORT).show();
                            valid = false;
                        } else {
                            errorText.setError(null);
                        }
                        if (confirmPassword.isEmpty() || confirmPassword.length() < 4 || confirmPassword.length() > 10) {
                            Toast.makeText(getApplicationContext(), "Password should be atleast 4-6 alphanumeric", Toast.LENGTH_SHORT).show();
                            valid = false;
                        } else {
                            errorText.setError(null);
                        }

                        if(!password.equals(confirmPassword)){
                            valid=false;
                            Toast.makeText(getApplicationContext(), "Passwords do not match", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            errorText.setError(null);
                        }

                        return valid;
                    }
                    public void newUser(View v){

                        EditText usernameCtrl = (EditText) findViewById(R.id.txt_email);
                        EditText passwordCtrl = (EditText) findViewById(R.id.txt_Pwd);
                        EditText confirmPasswordCtrl = (EditText) findViewById(R.id.txt_ConfirmPwd);

                        errorText = (TextView) findViewById(R.id.sign_error);
                        userName = usernameCtrl.getText().toString();
                        password = passwordCtrl.getText().toString();
                        confirmPassword = confirmPasswordCtrl.getText().toString();

                        if (validate()) {
                            Intent goTonextPage = new Intent(SignUp.this,WordSearch.class);
                            startActivity(goTonextPage);
                        }
                    }
                }
