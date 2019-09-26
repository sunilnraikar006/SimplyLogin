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
    private TextView mLogoTitle;
    private TextView mTitleLoginView;
    private TextView mDescriptionTitle;
    private TextView mSecondDescriptionTitle;
    private Button mVerifyButton;
    private EditText mPhoneNumberEditText;
    private EditText mOtpDigitOne;
    private EditText mOtpDigitTwo;
    private EditText mOtpDigitThree;
    private EditText mOtpDigitFour;
    private EditText mOtpDigitFive;
    private EditText mOtpDigitSix;
    private TextView mTvResend;
    private TextView mTvResendMessage;
    private ImageView mLogoView;
    private ConstraintLayout mBckground;
    private View space5;
    private View space6;
    private int digits;

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
        View v = inflater.inflate(R.layout.otplogo, this);

        initUiElements();
    }

    private void setAttributes(AttributeSet attrs) {


    }

    private void initUiElements() {

        mLogoTitle = findViewById(R.id.tv_otplogo_title);
        mBckground = findViewById(R.id.otp_background);
        mLogoView = findViewById(R.id.iv_otplogo);
        mTitleLoginView = findViewById(R.id.tv_otptitle);
        mDescriptionTitle = findViewById(R.id.tv_otp_descriptionone);
        mSecondDescriptionTitle = findViewById(R.id.tv_otp_descriptiontwo);
        mOtpDigitOne = findViewById(R.id.et1);
        mOtpDigitTwo = findViewById(R.id.et2);
        mOtpDigitThree = findViewById(R.id.et3);
        mOtpDigitFour = findViewById(R.id.et4);
        mOtpDigitFive = findViewById(R.id.et5);
        mOtpDigitSix = findViewById(R.id.et6);
        space5 = findViewById(R.id.space5);
        space6 = findViewById(R.id.space6);

        mTvResend = findViewById(R.id.tv_resend_otp);
        mTvResendMessage = findViewById(R.id.tv_message_resend);
        mVerifyButton = findViewById(R.id.btn_verify_otp);
        addUiCustomData(new LoginDta());

    }

    public void addUiCustomData(LoginDta loginDta) {

        setLogoTitle(loginDta.getLogo_Title());
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
        setOtpDigits(loginDta.getOtp_digits());
        setOtpEntryColor(loginDta.getOtp_entrycolor());


    }

    private void setOtpDigits(int otp_digits) {
        this.digits = otp_digits;
        if (otp_digits == 4) {
            otpDigitsVisibility(GONE);
        } else if (otp_digits == 6) {
            otpDigitsVisibility(VISIBLE);
        } else {
            otpDigitsVisibility(GONE);
        }
    }

    private void otpDigitsVisibility(int i) {
        mOtpDigitFive.setVisibility(i);
        mOtpDigitSix.setVisibility(i);
        space5.setVisibility(i);
        space6.setVisibility(i);
    }


    private void setLogoTitle(String logo_title) {
        if (logo_title != null && !logo_title.isEmpty()) {
            this.mLogoTitle.setText(logo_title);
            this.mLogoView.setVisibility(GONE);
        } else
            this.mLogoTitle.setVisibility(GONE);
    }


    private void setResendMessage(String resendMessage) {
        if (resendMessage != null && !resendMessage.isEmpty())
            this.mTvResendMessage.setText(resendMessage);
        else this.mTvResendMessage.setText(R.string.resendmessage);
    }

    private void setResendMessageColor(int resend_btn_color) {
        setTextTColor(mTvResendMessage, resend_btn_color, getResources().getColor(R.color.colorPrimaryDark));
    }

    private void setResendButtonColor(int resend_btn_color) {
        setTextTColor(mTvResend, resend_btn_color, getResources().getColor(R.color.colorPrimaryDark));
    }

    private void setUiBackgroundColor(int color) {
        setUiComponentBgColor(mBckground, color);
    }

    private void setUiComponentBgColor(View view, int color) {
        if (color != 0) {
            view.setBackgroundColor(color);
        } else {
            view.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        }

    }

    private void setmVerifyButton(String login_buttonTitle) {

        if (login_buttonTitle != null && !login_buttonTitle.isEmpty())
            this.mVerifyButton.setText(login_buttonTitle);
        else this.mVerifyButton.setText(R.string.verify_btn_title);
    }

    private void setmDescriptionSecond(String login_descriptionSecond) {
        if (login_descriptionSecond != null && !login_descriptionSecond.isEmpty())
            this.mSecondDescriptionTitle.setText(login_descriptionSecond);
        else this.mSecondDescriptionTitle.setText(R.string.otpdescriptiontwo);
    }

    private void setmDescription(String login_description) {

        if (login_description != null && !login_description.isEmpty())
            this.mDescriptionTitle.setText(login_description);
        else this.mDescriptionTitle.setText(R.string.otpdescriptionone);

    }

    private void setTitle(String login_title) {

        if (login_title != null && !login_title.isEmpty())
            this.mTitleLoginView.setText(login_title);
        else
            this.mTitleLoginView.setText(R.string.verification_title);
    }

    public void setmLogoView(int drawable) {

        if (drawable != 0)
            this.mLogoView.setImageResource(drawable);
        else this.mLogoView.setImageResource(R.drawable.login_screen);
    }

    public void setOtpEntryColor(int color) {
        if (color != 0) {
            setColor(color);
        } else {
            setColor(R.color.colorPrimaryDark);
        }
    }

    private void setColor(int color) {
        if (this.digits == 4) {
            this.mOtpDigitOne.setTextColor(color);
            this.mOtpDigitTwo.setTextColor(color);
            this.mOtpDigitThree.setTextColor(color);
            this.mOtpDigitFour.setTextColor(color);
        } else if (this.digits == 6) {
            this.mOtpDigitOne.setTextColor(color);
            this.mOtpDigitTwo.setTextColor(color);
            this.mOtpDigitThree.setTextColor(color);
            this.mOtpDigitFour.setTextColor(color);
            this.mOtpDigitFive.setTextColor(color);
            this.mOtpDigitSix.setTextColor(color);
        }
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
        setTextTColor(this.mTitleLoginView, color, getResources().getColor(R.color.colorPrimaryDark));

    }

    private void setTextTColor(TextView tv, int color, int defaultcolor) {

        if (color != 0)
            tv.setTextColor(color);
        else tv.setTextColor(defaultcolor);

    }

    public void setmDescriptionColor(int color) {
        setTextTColor(this.mDescriptionTitle, color, getResources().getColor(R.color.colorPrimaryDark));
    }

    public void setmDescriptionSecondColor(int color) {
        setTextTColor(this.mSecondDescriptionTitle, color, getResources().getColor(R.color.colorPrimaryDark));
    }

    public void setmVerifyButtonColor(int color) {
        setTextTColor(this.mVerifyButton, color, getResources().getColor(R.color.colorPrimaryDark));
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
