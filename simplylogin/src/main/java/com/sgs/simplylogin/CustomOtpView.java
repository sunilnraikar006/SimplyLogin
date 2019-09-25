package com.sgs.simplylogin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class CustomOtpView extends ConstraintLayout {
    View v;
    private Context mContext;
    private TextView mTitleLoginView;
    private TextView mDescriptionTitle;
    private TextView mSecondDescriptionTitle;
    private Button mVerifyButton;
    private EditText mPhoneNumberEditText;
    private EditText mOtpDigitOne;
    private EditText mOtpDigitTwo;
    private EditText mOtpDigitThree;
    private EditText mOtpDigitFour;
    private TextView mTvResend;
    private TextView mTvResendMessage;
    private ImageView mLogoView;
    private ConstraintLayout mBckground;

    public CustomOtpView(Context context) {
        super(context);
        initControl(context);
    }

    public CustomOtpView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initControl(context);
    }

    public CustomOtpView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl(context);
    }


    private void initControl(Context context) {
        mContext = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.otpview, this);

        initUiElements();
    }

    private void setAttributes(AttributeSet attrs) {


    }

    private void initUiElements() {

        mBckground = findViewById(R.id.otp_background);
        mLogoView = findViewById(R.id.iv_otplogo);
        mTitleLoginView = findViewById(R.id.tv_otptitle);
        mDescriptionTitle = findViewById(R.id.tv_otp_descriptionone);
        mSecondDescriptionTitle = findViewById(R.id.tv_otp_descriptiontwo);
        mOtpDigitOne = findViewById(R.id.et1);
        mOtpDigitTwo = findViewById(R.id.et2);
        mOtpDigitThree = findViewById(R.id.et3);
        mOtpDigitFour = findViewById(R.id.et4);
        mTvResend = findViewById(R.id.tv_resend_otp);
        mTvResendMessage = findViewById(R.id.tv_message_resend);
        mVerifyButton = findViewById(R.id.btn_verify_otp);

    }

    public void addUiCustomData(LoginDta loginDta) {

        setTitle(loginDta.getLogin_Title());
        setmDescription(loginDta.getLogin_Description());
        setmDescriptionSecond(loginDta.getLogin_DescriptionSecond());
        setmVerifyButton(loginDta.getLogin_ButtonTitle());
        setmLogoView(loginDta.getmLogoDrawable());
        setmTitleColor(loginDta.getTitle_Color());
        setmDescriptionColor(loginDta.getDescription_Color());
        setmDescriptionSecondColor(loginDta.getDescription_SecondColor());
        setmVerifyButtonColor(loginDta.getButton_TextColor());
        setResendButtonColor(loginDta.getResend_btn_color());
        setResendMessage(loginDta.getResendMessage());
        setResendMessageColor(loginDta.getResend_message_color());
        setUiBackgroundColor(loginDta.getBackground_color());


    }

    private void setResendMessage(String resendMessage) {
        mTvResendMessage.setText(resendMessage);
    }

    private void setResendMessageColor(int resend_btn_color) {
        setComponentTextColor(mTvResendMessage, resend_btn_color);
    }

    private void setResendButtonColor(int resend_btn_color) {
        // this.mTvResend.setTextColor(resend_btn_color);
        setComponentTextColor(mTvResend, resend_btn_color);
    }

    private void setComponentTextColor(TextView mTvResend, int color) {

        if (color != 0) {
            mTvResend.setTextColor(color);
        } else {
            mTvResend.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        }


    }

    private void setUiBackgroundColor(int color) {

        setUiComponentBgColor(mBckground, color);
        //this.mBckground.setBackgroundColor(color);
    }

    private void setUiComponentBgColor(View view, int color) {
        if (color != 0) {
            view.setBackgroundColor(color);
        } else {
            view.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        }

    }

    private void setmVerifyButton(String login_buttonTitle) {
        this.mVerifyButton.setText(login_buttonTitle);
    }

    private void setmDescriptionSecond(String login_descriptionSecond) {
        this.mSecondDescriptionTitle.setText(login_descriptionSecond);
    }

    private void setmDescription(String login_description) {
        this.mDescriptionTitle.setText(login_description);
    }

    private void setTitle(String login_title) {
        this.mTitleLoginView.setText(login_title);
    }

    public void setmLogoView(int drawable) {
        this.mLogoView.setImageResource(drawable);
    }

    public void setOtpEntryColor(int color) {
        if (color != 0) {
            setColor(color);
        } else {
            setColor(R.color.colorPrimaryDark);
        }
    }

    private void setColor(int color) {
        this.mOtpDigitOne.setTextColor(color);
        this.mOtpDigitTwo.setTextColor(color);
        this.mOtpDigitThree.setTextColor(color);
        this.mOtpDigitFour.setTextColor(color);
    }

    public String getOtp() {
        String otp = "";
        String et1 = mOtpDigitOne.getText().toString().trim();
        String et2 = mOtpDigitTwo.getText().toString().trim();
        String et3 = mOtpDigitThree.getText().toString().trim();
        String et4 = mOtpDigitFour.getText().toString().trim();
        otp = et1 + et2 + et3 + et4;
        return otp;
    }

    public void setmTitleColor(int color) {
        this.mTitleLoginView.setTextColor(getResources().getColor(color));
    }

    public void setmDescriptionColor(int color) {
        this.mDescriptionTitle.setTextColor(getResources().getColor(color));
    }

    public void setmDescriptionSecondColor(int color) {
        this.mSecondDescriptionTitle.setTextColor(getResources().getColor(color));
    }

    public void setmVerifyButtonColor(int color) {
        this.mVerifyButton.setTextColor(getResources().getColor(color));
    }

    public TextView getmTitleLoginView() {
        return mTitleLoginView;
    }

    public void setmTitleLoginView(TextView mTitleLoginView) {
        this.mTitleLoginView = mTitleLoginView;
    }

    public TextView getmDescriptionTitle() {
        return mDescriptionTitle;
    }

    public void setmDescriptionTitle(TextView mDescriptionTitle) {
        this.mDescriptionTitle = mDescriptionTitle;
    }

    public TextView getmSecondDescriptionTitle() {
        return mSecondDescriptionTitle;
    }

    public void setmSecondDescriptionTitle(TextView mSecondDescriptionTitle) {
        this.mSecondDescriptionTitle = mSecondDescriptionTitle;
    }

    public Button getmVerifyButton() {
        return mVerifyButton;
    }

    public void setmVerifyButton(Button mVerifyButton) {
        this.mVerifyButton = mVerifyButton;
    }

    public EditText getmPhoneNumberEditText() {
        return mPhoneNumberEditText;
    }

    public void setmPhoneNumberEditText(EditText mPhoneNumberEditText) {
        this.mPhoneNumberEditText = mPhoneNumberEditText;
    }

    public ImageView getmLogoView() {
        return mLogoView;
    }

    public void setmLogoView(ImageView mLogoView) {
        this.mLogoView = mLogoView;
    }

    public ConstraintLayout getmBckground() {
        return mBckground;
    }
}
