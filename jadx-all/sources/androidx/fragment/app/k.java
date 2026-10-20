package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f1952e;

    /* JADX WARN: Code duplicated, block: B:74:0x00f3 A[Catch: RuntimeException -> 0x00f9, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00f9, blocks: (B:72:0x00ed, B:74:0x00f3), top: B:85:0x00ed }] */
    public final h0 c(Context context) {
        int enterAnim;
        h0 h0Var;
        Animator animatorLoadAnimator;
        int iH0;
        if (this.f1951d) {
            return this.f1952e;
        }
        s1 s1Var = this.f1964a;
        d0 d0Var = s1Var.f2025c;
        boolean z10 = s1Var.f2023a == 2;
        int nextTransition = d0Var.getNextTransition();
        if (this.f1950c) {
            enterAnim = z10 ? d0Var.getPopEnterAnim() : d0Var.getPopExitAnim();
        } else {
            enterAnim = z10 ? d0Var.getEnterAnim() : d0Var.getExitAnim();
        }
        d0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = d0Var.mContainer;
        h0 h0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            d0Var.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = d0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = d0Var.onCreateAnimation(nextTransition, z10, enterAnim);
            if (animationOnCreateAnimation != null) {
                h0Var2 = new h0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = d0Var.onCreateAnimator(nextTransition, z10, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    h0Var2 = new h0(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iH0 = z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iH0 = z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iH0 = z10 ? f6.a.h0(context, android.R.attr.activityCloseEnterAnimation) : f6.a.h0(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iH0 = z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iH0 = -1;
                        } else {
                            iH0 = z10 ? f6.a.h0(context, android.R.attr.activityOpenEnterAnimation) : f6.a.h0(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iH0;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    h0Var = new h0(animationLoadAnimation);
                                    h0Var2 = h0Var;
                                }
                            } catch (Resources.NotFoundException e4) {
                                throw e4;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        h0Var = new h0(animatorLoadAnimator);
                                        h0Var2 = h0Var;
                                    }
                                } catch (RuntimeException e10) {
                                    if (zEquals) {
                                        throw e10;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        h0Var2 = new h0(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                h0Var = new h0(animatorLoadAnimator);
                                h0Var2 = h0Var;
                            }
                        }
                    }
                }
            }
        }
        this.f1952e = h0Var2;
        this.f1951d = true;
        return h0Var2;
    }
}
