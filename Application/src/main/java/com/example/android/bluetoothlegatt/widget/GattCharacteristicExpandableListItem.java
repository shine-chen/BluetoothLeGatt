package com.example.android.bluetoothlegatt.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by shinechen on 12/22/15.
 */
public class GattCharacteristicExpandableListItem extends RelativeLayout {
    public GattCharacteristicExpandableListItem(Context context) {
        this(context, null);
    }

    public GattCharacteristicExpandableListItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GattCharacteristicExpandableListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
