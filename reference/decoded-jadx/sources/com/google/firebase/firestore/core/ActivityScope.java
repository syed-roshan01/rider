package com.google.firebase.firestore.core;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.d0;
import androidx.fragment.app.g0;
import androidx.fragment.app.x0;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import u1.i0;

/* JADX INFO: loaded from: classes.dex */
public class ActivityScope {
    private static final String FRAGMENT_TAG = "FirestoreOnStopObserverFragment";
    private static final String SUPPORT_FRAGMENT_TAG = "FirestoreOnStopObserverSupportFragment";

    public static class CallbackList {
        private final List<Runnable> callbacks;

        private CallbackList() {
            this.callbacks = new ArrayList();
        }

        public synchronized void add(Runnable runnable) {
            this.callbacks.add(runnable);
        }

        public void run() {
            for (Runnable runnable : this.callbacks) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class StopListenerFragment extends Fragment {
        CallbackList callbacks = new CallbackList();

        @Override // android.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.callbacks) {
                callbackList = this.callbacks;
                this.callbacks = new CallbackList();
            }
            callbackList.run();
        }
    }

    public static class StopListenerSupportFragment extends d0 {
        CallbackList callbacks = new CallbackList();

        @Override // androidx.fragment.app.d0
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.callbacks) {
                callbackList = this.callbacks;
                this.callbacks = new CallbackList();
            }
            callbackList.run();
        }
    }

    public static ListenerRegistration bind(Activity activity, final ListenerRegistration listenerRegistration) {
        if (activity != null) {
            if (activity instanceof g0) {
                Objects.requireNonNull(listenerRegistration);
                final int i10 = 0;
                onFragmentActivityStopCallOnce((g0) activity, new Runnable() { // from class: com.google.firebase.firestore.core.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        listenerRegistration.remove();
                    }
                });
            } else {
                Objects.requireNonNull(listenerRegistration);
                final int i11 = 1;
                onActivityStopCallOnce(activity, new Runnable() { // from class: com.google.firebase.firestore.core.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        listenerRegistration.remove();
                    }
                });
            }
        }
        return listenerRegistration;
    }

    private static <T> T castFragment(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder sbR = a7.a.r("Fragment with tag '", str, "' is a ");
            sbR.append(obj.getClass().getName());
            sbR.append(" but should be a ");
            sbR.append(cls.getName());
            throw new IllegalStateException(sbR.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityStopCallOnce$0(Activity activity, Runnable runnable) {
        StopListenerFragment stopListenerFragment = (StopListenerFragment) castFragment(StopListenerFragment.class, activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG), FRAGMENT_TAG);
        if (stopListenerFragment == null || stopListenerFragment.isRemoving()) {
            stopListenerFragment = new StopListenerFragment();
            activity.getFragmentManager().beginTransaction().add(stopListenerFragment, FRAGMENT_TAG).commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        stopListenerFragment.callbacks.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onFragmentActivityStopCallOnce$1(g0 g0Var, Runnable runnable) {
        StopListenerSupportFragment stopListenerSupportFragment = (StopListenerSupportFragment) castFragment(StopListenerSupportFragment.class, g0Var.getSupportFragmentManager().w(SUPPORT_FRAGMENT_TAG), SUPPORT_FRAGMENT_TAG);
        if (stopListenerSupportFragment == null || stopListenerSupportFragment.isRemoving()) {
            stopListenerSupportFragment = new StopListenerSupportFragment();
            x0 supportFragmentManager = g0Var.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(0, stopListenerSupportFragment, SUPPORT_FRAGMENT_TAG);
            aVar.d(true);
            x0 supportFragmentManager2 = g0Var.getSupportFragmentManager();
            supportFragmentManager2.t(true);
            supportFragmentManager2.x();
        }
        stopListenerSupportFragment.callbacks.add(runnable);
    }

    private static void onActivityStopCallOnce(Activity activity, Runnable runnable) {
        Assert.hardAssert(!(activity instanceof g0), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new i0(6, activity, runnable));
    }

    private static void onFragmentActivityStopCallOnce(g0 g0Var, Runnable runnable) {
        g0Var.runOnUiThread(new i0(7, g0Var, runnable));
    }
}
