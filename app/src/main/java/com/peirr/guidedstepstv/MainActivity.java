package com.peirr.guidedstepstv;
import android.app.Activity;
import android.os.Bundle;
import android.support.v17.leanback.app.GuidedStepFragment;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(null == savedInstanceState) {
            GuidedStepFragment.addAsRoot(this, new DetailsEnteryFormFragment(), android.R.id.content);
        }
    }

}
