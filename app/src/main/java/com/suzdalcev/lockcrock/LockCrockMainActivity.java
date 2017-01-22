package com.suzdalcev.lockcrock;

import android.support.v4.app.Fragment;

/**
 * Created by suzdalcev on 22.01.17.
 */

public class LockCrockMainActivity extends
        SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return LockCrockFragment.newInstance();
    }
}
