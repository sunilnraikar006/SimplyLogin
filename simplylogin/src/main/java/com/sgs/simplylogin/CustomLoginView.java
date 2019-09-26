package com.sgs.simplylogin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;


public class CustomLoginView extends ConstraintLayout {
    View v;
    private Context mContext;
    private TextView mTitleLoginView;
    private TextView mLogoTitle;
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
        View v = inflater != null ? inflater.inflate(R.layout.loginlogo, this) : null;

        initUiElements();
    }

    private void setAttributes(AttributeSet attrs) {


    }

    private void initUiElements() {

        mLogoTitle = findViewById(R.id.tv_logo_title);
        mBckground = findViewById(R.id.background_layer);
        mLogoView = findViewById(R.id.iv_logo);
        mTitleLoginView = findViewById(R.id.tv_title);
        mDescriptionTitle = findViewById(R.id.tv_description);
        mSecondDescriptionTitle = findViewById(R.id.tv_description_second);
        mPhoneNumberEditText = findViewById(R.id.et_login_number);
        mVerifyButton = findViewById(R.id.btn_get_otp);

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
        setHintText(loginDta.getHint_text());
        setButtonTextShape(loginDta.getButton_shape());


    }

    private void setButtonTextShape(int button_shape) {
        if (button_shape != 0)
            mVerifyButton.setBackgroundResource(button_shape);
        else mVerifyButton.setBackgroundResource(R.drawable.border_theme);
    }

    private void setHintText(String hint_text) {
        if (hint_text != null && !hint_text.isEmpty())
            this.mVerifyButton.setHint(hint_text);
        else this.mVerifyButton.setHint(R.string.hint_for_mobile);
    }

    private void setLogoTitle(String logo_title) {
        if (logo_title != null && !logo_title.isEmpty()) {
            this.mLogoTitle.setText(logo_title);
            this.mLogoView.setVisibility(GONE);
        } else
            this.mLogoTitle.setVisibility(GONE);
    }

    private void setmVerifyButton(String login_buttonTitle) {
        if (login_buttonTitle != null && !login_buttonTitle.isEmpty())
            this.mVerifyButton.setText(login_buttonTitle);
        else this.mVerifyButton.setText(R.string.login_btn_title);
    }

    private void setmDescriptionSecond(String login_descriptionSecond) {
        if (login_descriptionSecond != null && !login_descriptionSecond.isEmpty())
            this.mSecondDescriptionTitle.setText(login_descriptionSecond);
        else this.mSecondDescriptionTitle.setText(R.string.descriptionsecond);
    }

    private void setmDescription(String login_description) {
        if (login_description != null && !login_description.isEmpty())
            this.mDescriptionTitle.setText(login_description);
        else this.mDescriptionTitle.setText(R.string.descriptionone);
    }

    private void setTitle(String login_title) {
        if (login_title != null && !login_title.isEmpty())
            this.mTitleLoginView.setText(login_title);
        else
            this.mTitleLoginView.setText(R.string.login_title);

    }

    public void setmLogoView(int drawable) {
        if (drawable != 0)
            this.mLogoView.setImageResource(drawable);
        else this.mLogoView.setImageResource(R.drawable.login_screen);
    }

    public void setmTitleColor(int color) {
        if (color != 0)
            this.mTitleLoginView.setTextColor(getResources().getColor(color));
        else this.mTitleLoginView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    public void setmDescriptionColor(int color) {

        if (color != 0)
            this.mDescriptionTitle.setTextColor(getResources().getColor(color));
        else this.mDescriptionTitle.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    public void setmDescriptionSecondColor(int color) {
        if (color != 0)
            this.mSecondDescriptionTitle.setTextColor(getResources().getColor(color));
        else
            this.mSecondDescriptionTitle.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    public void setmVerifyButtonColor(int color) {
        if (color != 0)
            this.mVerifyButton.setTextColor(getResources().getColor(color));
        else
            this.mVerifyButton.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
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


    public EditText getmPhoneNumberEditText() {
        return mPhoneNumberEditText;
    }

    public ImageView getmLogoView() {
        return mLogoView;
    }

    public ConstraintLayout getmBckground() {
        return mBckground;
    }
}
