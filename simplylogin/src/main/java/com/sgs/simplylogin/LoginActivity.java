package com.sgs.simplylogin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private ImageView mLogoView;
    private TextView mTitleView;
    private TextView mDescription;
    private TextView mDescriptionSecond;
    private EditText mMobileNumberText;
    private Button mVerifyButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        getSupportActionBar().hide();
        intialiseUserControls();

        getIntentData();

    }

    private void getIntentData() {
        Intent intent = getIntent();
        LoginDta loginDta = intent.getParcelableExtra("Login_Dta");


        setTitle(loginDta.getLogin_Title());
        setmDescription(loginDta.getLogin_Description());
        setmDescriptionSecond(loginDta.getLogin_DescriptionSecond());
        setmVerifyButton(loginDta.getLogin_ButtonTitle());
        setmLogoView(loginDta.getmLogoDrawable());
        setmTitleColor(loginDta.getTitle_Color());
        setmDescriptionColor(loginDta.getDescription_Color());
        setmDescriptionSecondColor(loginDta.getDescription_SecondColor());
        setmVerifyButtonColor(loginDta.getButton_TextColor());


    }

    public LoginActivity() {

    }

    private void intialiseUserControls() {

        mLogoView = findViewById(R.id.iv_logo);
        mTitleView = findViewById(R.id.tv_title);
        mDescription = findViewById(R.id.tv_description);
        mDescriptionSecond = findViewById(R.id.tv_description_second);
        mMobileNumberText = findViewById(R.id.et_login_number);
        mVerifyButton = findViewById(R.id.btn_get_otp);


    }

    public ImageView getmLogoView() {
        return mLogoView;
    }

    public void setmLogoView(int drawable) {
        this.mLogoView.setImageResource(drawable);
    }

    public void setmTitleColor(int color) {
        this.mTitleView.setTextColor(getResources().getColor(color));
    }

    public void setmDescriptionColor(int color) {
        this.mDescription.setTextColor(getResources().getColor(color));
    }

    public void setmDescriptionSecondColor(int color) {
        this.mDescriptionSecond.setTextColor(getResources().getColor(color));
    }

    public void setmVerifyButtonColor(int color) {
        this.mVerifyButton.setTextColor(getResources().getColor(color));
    }

    public void setmTitleFontSize(float size) {
        this.mTitleView.setTextSize(size);
    }

    public void setmDescriptionFontSize(float size) {
        this.mDescription.setTextSize(size);
    }

    public void setmDescriptionSecondFontSize(float size) {
        this.mDescriptionSecond.setTextSize(size);
    }

    public void setmVerifyButtonFontSize(float size) {
        this.mVerifyButton.setTextSize(size);
    }


    public void setmTitleViewFontStyle(float size) {
        Typeface tf = Typeface.createFromAsset(getAssets(),"font/muliblack.ttf");
        mTitleView.setTypeface(tf,Typeface.BOLD);
    }


   /* public void setmTitleView(TextView mTitleView) {
        this.mTitleView = mTitleView;
    }

    public void setmTitleView(TextView mTitleView) {
        this.mTitleView = mTitleView;
    }

    public void setmTitleView(TextView mTitleView) {
        this.mTitleView = mTitleView;
    }

    public void setmTitleView(TextView mTitleView) {
        this.mTitleView = mTitleView;
    }

    public void setmTitleView(TextView mTitleView) {
        this.mTitleView = mTitleView;
    }*/

    public TextView getmTitleView() {
        return mTitleView;
    }

    public void setmTitleView(String mTitle) {
        this.mTitleView.setText(mTitle);
    }

    public TextView getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription.setText(mDescription);
    }

    public TextView getmDescriptionSecond() {
        return mDescriptionSecond;
    }

    public void setmDescriptionSecond(String mDescriptionSecond) {
        this.mDescriptionSecond.setText(mDescriptionSecond);
    }

    public EditText getmMobileNumberText() {
        return mMobileNumberText;
    }

    public void setmMobileNumberText(String mMobileNumberText) {
        this.mMobileNumberText.setText(mMobileNumberText);
    }

    public Button getmVerifyButton() {
        return mVerifyButton;
    }

    public void setmVerifyButton(String mVerifyButton) {
        this.mVerifyButton.setText(mVerifyButton);
    }
}
