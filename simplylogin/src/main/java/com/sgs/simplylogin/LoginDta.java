package com.sgs.simplylogin;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

public class LoginDta implements Parcelable {
    private String hint_text;
    private String login_Title;
    private String logo_Title;
    private String login_Description;
    private String login_DescriptionSecond;
    private String login_ButtonTitle;
    private int mLogoDrawable;
    private int title_Color;
    private int description_Color;
    private int description_SecondColor;
    private int button_TextColor;
    private int otp_entrycolor;
    private int background_color;
    private int button_color;
    private int resend_btn_color;
    private int resend_message_color;
    private String resendMessage;
    private int buttonbackground_color;
    private int background_tint_color;
    private int button_shape;
    private int otp_digits;


    public LoginDta() {
    }

    protected LoginDta(Parcel in) {

        hint_text = in.readString();
        logo_Title = in.readString();
        background_tint_color = in.readInt();
        otp_digits = in.readInt();
        resend_message_color = in.readInt();
        resendMessage = in.readString();
        otp_entrycolor = in.readInt();
        background_color = in.readInt();
        button_color = in.readInt();
        resend_btn_color = in.readInt();
        mLogoDrawable = in.readInt();
        title_Color = in.readInt();
        description_Color = in.readInt();
        description_SecondColor = in.readInt();
        button_TextColor = in.readInt();
        login_Title = in.readString();
        login_Description = in.readString();
        login_DescriptionSecond = in.readString();
        login_ButtonTitle = in.readString();
    }

    public static final Creator<LoginDta> CREATOR = new Creator<LoginDta>() {
        @Override
        public LoginDta createFromParcel(Parcel in) {
            return new LoginDta(in);
        }

        @Override
        public LoginDta[] newArray(int size) {
            return new LoginDta[size];
        }
    };


    public int getTitle_Color() {
        return title_Color;
    }

    public void setTitle_Color(int title_Color) {
        this.title_Color = title_Color;
    }

    public int getDescription_Color() {
        return description_Color;
    }

    public void setDescription_Color(int description_Color) {
        this.description_Color = description_Color;
    }

    public int getDescription_SecondColor() {
        return description_SecondColor;
    }

    public void setDescription_SecondColor(int description_SecondColor) {
        this.description_SecondColor = description_SecondColor;
    }

    public int getButton_TextColor() {
        return button_TextColor;
    }

    public void setButton_TextColor(int button_TextColor) {
        this.button_TextColor = button_TextColor;
    }

    public int getmLogoDrawable() {
        return mLogoDrawable;
    }

    public void setmLogoDrawable(int mLogoDrawable) {
        this.mLogoDrawable = mLogoDrawable;
    }

    public String getLogin_Title() {
        return login_Title;
    }

    public void setLogin_Title(String login_Title) {
        this.login_Title = login_Title;
    }

    public String getLogin_Description() {
        return login_Description;
    }

    public void setLogin_Description(String login_Description) {
        this.login_Description = login_Description;
    }

    public String getLogin_DescriptionSecond() {
        return login_DescriptionSecond;
    }

    public void setLogin_DescriptionSecond(String login_DescriptionSecond) {
        this.login_DescriptionSecond = login_DescriptionSecond;
    }

    public String getLogin_ButtonTitle() {
        return login_ButtonTitle;
    }

    public void setLogin_ButtonTitle(String login_ButtonTitle) {
        this.login_ButtonTitle = login_ButtonTitle;
    }


    public int getOtp_entrycolor() {
        return otp_entrycolor;
    }

    public void setOtp_entrycolor(int otp_entrycolor) {
        this.otp_entrycolor = otp_entrycolor;
    }

    public int getBackground_color() {
        return background_color;
    }

    public void setBackground_color(int background_color) {
        this.background_color = background_color;
    }

    public int getButton_color() {
        return button_color;
    }

    public void setButton_color(int button_color) {
        this.button_color = button_color;
    }

    public int getResend_btn_color() {
        return resend_btn_color;
    }

    public void setResend_btn_color(int resend_btn_color) {
        this.resend_btn_color = resend_btn_color;
    }

    public String getResendMessage() {
        return resendMessage;
    }

    public void setResendMessage(String resendMessage) {
        this.resendMessage = resendMessage;
    }

    public int getResend_message_color() {
        return resend_message_color;
    }

    public void setResend_message_color(int resend_message_color) {
        this.resend_message_color = resend_message_color;
    }

    public int getButtonbackground_color() {
        return buttonbackground_color;
    }

    public void setButtonbackground_color(int buttonbackground_color) {
        this.buttonbackground_color = buttonbackground_color;
    }

    public int getButton_shape() {
        return button_shape;
    }

    public void setButton_shape(int button_shape) {
        this.button_shape = button_shape;
    }

    public int getBackground_tint_color() {
        return background_tint_color;
    }

    public void setBackground_tint_color(int background_tint_color) {
        this.background_tint_color = background_tint_color;
    }

    public String getLogo_Title() {
        return logo_Title;
    }

    public void setLogo_Title(String logo_Title) {
        this.logo_Title = logo_Title;
    }

    public String getHint_text() {
        return hint_text;
    }

    public void setHint_text(String hint_text) {
        this.hint_text = hint_text;
    }

    public int getOtp_digits() {
        return otp_digits;
    }

    public void setOtp_digits(int otp_digits) {
        this.otp_digits = otp_digits;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(hint_text);
        parcel.writeString(logo_Title);
        parcel.writeInt(otp_digits);
        parcel.writeInt(background_tint_color);
        parcel.writeInt(resend_message_color);
        parcel.writeString(resendMessage);
        parcel.writeInt(otp_entrycolor);
        parcel.writeInt(background_color);
        parcel.writeInt(button_color);
        parcel.writeInt(resend_btn_color);
        parcel.writeInt(mLogoDrawable);
        parcel.writeInt(title_Color);
        parcel.writeInt(description_Color);
        parcel.writeInt(description_SecondColor);
        parcel.writeInt(button_TextColor);
        parcel.writeString(login_Title);
        parcel.writeString(login_Description);
        parcel.writeString(login_DescriptionSecond);
        parcel.writeString(login_ButtonTitle);
    }
}
