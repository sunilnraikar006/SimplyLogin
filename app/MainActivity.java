package com.sgs.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sgs.simplylogin.CustomLoginView;
import com.sgs.simplylogin.LoginDta;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CustomLoginView customLoginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Objects.requireNonNull(getSupportActionBar()).hide();
        customLoginView = findViewById(R.id.login_viewlayout);

        bindUi();
    }

    private void bindUi() {

        LoginDta loginDta = new LoginDta();
        loginDta.setmLogoDrawable(R.drawable.default_profile);
        loginDta.setLogin_Title("LOGIN");
        loginDta.setTitle_Color(R.color.colorPrimary);
        loginDta.setLogin_Description("descrption1");
        loginDta.setDescription_Color(R.color.colorAccent);
        loginDta.setLogin_DescriptionSecond("descrption2");
        loginDta.setDescription_SecondColor(R.color.colorPrimaryDark);
        loginDta.setLogin_ButtonTitle("Verify");
        loginDta.setButton_TextColor(R.color.colorAccent);
        Typeface tf = Typeface.createFromAsset(getAssets(), "font/muliblack.ttf");


        customLoginView.getmVerifyButton().setTypeface(tf);
        customLoginView.getmVerifyButton().setOnClickListener(this);
        customLoginView.getmBckground().setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        customLoginView.getmDescriptionTitle().setTypeface(tf);
        customLoginView.getmDescriptionTitle().setTextSize(20);
        customLoginView.addUiCustomData(loginDta);

    }


    @Override
    public void onClick(View view) {
        String mMobileNumber = customLoginView.getmPhoneNumberEditText().getText().toString().trim();
        Toast.makeText(this, mMobileNumber, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OtpActivity.class);
        startActivity(intent);

    }
}
