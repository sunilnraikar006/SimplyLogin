package com.sgs.simplylogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class Controller {


    /*public static ActivityBuilder activity() {
       // return new ActivityBuilder(LoginActivity.class);
    }*/


    /**
     * Builder used for creating Image Crop Activity by user request.
     */
    public static final class ActivityBuilder {


        private Activity _activity;


        private ActivityBuilder(Activity _activity) {
            _activity = _activity;
        }


        /**
         * Start {@link LoginActivity}.
         *
         * @param activity activity to receive result
         */
        public void start(@NonNull Activity activity) {
            activity.startActivity(getIntent(activity));
        }


        /**
         * Get {@link LoginActivity} intent to start the activity.
         */
        public Intent getIntent(@NonNull Context context) {
            return getIntent(context, LoginActivity.class);
        }


        /**
         * Get {@link LoginActivity} intent to start the activity.
         */
        public Intent getIntent(@NonNull Context context, @Nullable Class<?> cls) {
            Intent intent = new Intent();
            intent.setClass(context, cls);
            return intent;
        }


        /**
         * the color of the overlay background around the crop window cover the image parts not in the
         * crop window.<br>
         * <i>Default: Color.argb(119, 0, 0, 0)</i>
         */
        public ActivityBuilder setBackgroundColor(int backgroundColor) {

            return this;
        }


        /**
         * the title of the {@link LoginActivity}.<br>
         * <i>Default: ""</i>
         */
        public ActivityBuilder setActivityTitle(CharSequence activityTitle) {
            return this;
        }

        /**
         * the color to use for action bar items icons.<br>
         * <i>Default: NONE</i>
         */
        public ActivityBuilder setActivityMenuIconColor(int activityMenuIconColor) {
            return this;
        }


        /**
         * Image resource id to use for crop icon instead of text.<br>
         * <i>Default: 0</i>
         */
        public ActivityBuilder setCropMenuCropButtonIcon(@DrawableRes int drawableResource) {

            return this;
        }
    }


}
