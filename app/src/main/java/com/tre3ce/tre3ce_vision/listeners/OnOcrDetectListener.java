package com.tre3ce.tre3ce_vision.listeners;

import com.google.android.gms.vision.text.TextBlock;

/**
 * Created by heriberto on 30/08/17.
 */

public interface OnOcrDetectListener {
    void onOcrDetectorResult(TextBlock textBlock);
}
