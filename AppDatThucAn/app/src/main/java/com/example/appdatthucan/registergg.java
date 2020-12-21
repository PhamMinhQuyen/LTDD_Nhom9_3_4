package com.example.appdatthucan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.regex.Pattern;

public class registergg extends AppCompatActivity {
    Button bt_dk;
    EditText musn,mpass;
    ImageView trve;

    ProgressDialog progressDialog;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registergg);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("Tạo tài khoản");

        //actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.setDisplayShowHomeEnabled(true);

        musn = findViewById(R.id.usn);
        mpass = findViewById(R.id.pass);
        bt_dk= findViewById(R.id.bt_dk);

        mAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Đang đăng ký tài khoản...");

        bt_dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = musn.getText().toString().trim();
                String password = mpass.getText().toString().trim();

                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    musn.setError("Không có giá trị!");
                    musn.setFocusable(true);
                }
                else if(password.length()<6){
                    mpass.setError("Mật khẩu phải nhiều hơn 6 ký tự!");
                    mpass.setFocusable(true);
                }
                else {
                    registerUser(email,password);
                }
            }
        });
        trve=(ImageView) findViewById(R.id.back);
        trve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registergg.this,Login.class);
                startActivity(intent);
            }
        });
    }

    private void registerUser(String email, String password) {
        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(registergg.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            progressDialog.dismiss();

                            FirebaseUser user = mAuth.getCurrentUser();

                            /*String email = user.getEmail();
                            String uid = user.getUid();

                            HashMap<Object,String> hashMap = new HashMap<>();
                            hashMap.put("email",email);
                            hashMap.put("uid",uid);
                            hashMap.put("name","");
                            hashMap.put("phone","");
                            hashMap.put("image","");

                            FirebaseDatabase database = FirebaseDatabase.getInstance();
                            DatabaseReference reference = database.getReference("Users");
                            reference.child(uid).setValue(hashMap);*/

                            Toast.makeText(registergg.this, "Đã đăng ký...\n"+user.getEmail(), Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(registergg.this,Login.class));
                            finish();
                        } else {
                            progressDialog.dismiss();
                            Toast.makeText(registergg.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}