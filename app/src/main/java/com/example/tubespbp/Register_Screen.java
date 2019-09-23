package com.example.tubespbp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register_Screen extends AppCompatActivity {

    private EditText emailTV, passwordTV, usernameTV, phoneTV;
    private RadioGroup mRadiogroup;
    private RadioButton mJenis_kelamin;
    private Button regBtn;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__screen);

        mAuth = FirebaseAuth.getInstance();

        initializeUI();

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerNewUser();
            }
        });
    }

    private void registerNewUser() {

        String email, password;
        email = emailTV.getText().toString();
        password = passwordTV.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Registration successful!", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent(Register_Screen.this, Login_Screen.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Registration failed! Please try again later", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        int selectedId = mRadiogroup.getCheckedRadioButtonId();
        mJenis_kelamin=findViewById(selectedId);
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<String> UsersDAOCALL = apiService.create(usernameTV.getText().toString(),
                emailTV.getText().toString(),passwordTV.getText().toString(),
                mJenis_kelamin.getText().toString(),phoneTV.getText().toString());
        UsersDAOCALL.enqueue(new Callback<String>(){
            public void onResponse(Call<String> call, Response<String> response){
                Toast.makeText(Register_Screen.this,"Success",Toast.LENGTH_SHORT).show();
            }
            public void onFailure(Call<String> call,Throwable t){
                Toast.makeText(Register_Screen.this,"Connection Problemd",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeUI() {
        emailTV = findViewById(R.id.txtEmailReg);
        passwordTV = findViewById(R.id.txtPassReg);
        mRadiogroup = findViewById(R.id.radioGroup);
        usernameTV=findViewById(R.id.txtUserReg);
        phoneTV=findViewById(R.id.txtNoReg);
        int selectedId = mRadiogroup.getCheckedRadioButtonId();
        mJenis_kelamin = findViewById(selectedId);
        regBtn = findViewById(R.id.btnSaveReg);
    }

}
