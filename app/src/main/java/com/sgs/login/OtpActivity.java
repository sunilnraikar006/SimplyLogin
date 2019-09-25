package com.sgs.login;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sgs.simplylogin.CustomOtpView;
import com.sgs.simplylogin.LoginDta;

public class OtpActivity extends AppCompatActivity implements View.OnClickListener {

    private CustomOtpView customOtpView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);

        customOtpView = findViewById(R.id.otp_viewlayout);



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


        customOtpView.getmVerifyButton().setTypeface(tf);
        customOtpView.getmVerifyButton().setOnClickListener(this);
        customOtpView.getmBckground().setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        customOtpView.getmDescriptionTitle().setTypeface(tf);
        customOtpView.getmDescriptionTitle().setTextSize(20);
        customOtpView.addUiCustomData(loginDta);

    }

    @Override
    public void onClick(View view) {

    }
}
