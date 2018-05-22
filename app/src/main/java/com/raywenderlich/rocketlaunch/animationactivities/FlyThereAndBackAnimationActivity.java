package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ValueAnimator;
import android.renderscript.Sampler;

public class FlyThereAndBackAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ValueAnimator animator = ValueAnimator.ofFloat(0,-mScreenHeight);

    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float value = (float) valueAnimator.getAnimatedValue();
        mRocket.setTranslationY(value);
        mDoge.setTranslationY(value);
      }
    });
    animator.setRepeatMode(ValueAnimator.REVERSE);
    animator.setRepeatCount(3);
    animator.setDuration(500L);
    animator.start();
  }
}
