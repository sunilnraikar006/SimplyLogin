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


public class CustomLoginView extends ConstraintLayout {
    View v;
    private Context mContext;
    private TextView mTitleLoginView;
    private TextView mDescriptionTitle;
    private TextView mSecondDescriptionTitle;
    private Button mVerifyButton;
    private EditText mPhoneNumberEditText;
    private ImageView mLogoView;
    private ConstraintLayout mBckground;

    public CustomLoginView(Context context) {
        super(context);
        initControl(context);
    }

    public CustomLoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initControl(context);
    }

    public CustomLoginView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl(context);
    }


    private void initControl(Context context) {
        mContext = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.loginview, this);

        initUiElements();
    }

    private void setAttributes(AttributeSet attrs) {


    }

    private void initUiElements() {

        mBckground = findViewById(R.id.background_layer);
        mLogoView = findViewById(R.id.iv_logo);
        mTitleLoginView = findViewById(R.id.tv_title);
        mDescriptionTitle = findViewById(R.id.tv_description);
        mSecondDescriptionTitle = findViewById(R.id.tv_description_second);
        mPhoneNumberEditText = findViewById(R.id.et_login_number);
        mVerifyButton = findViewById(R.id.btn_get_otp);

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
