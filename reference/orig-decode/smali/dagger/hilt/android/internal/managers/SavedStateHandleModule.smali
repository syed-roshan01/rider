.class abstract Ldagger/hilt/android/internal/managers/SavedStateHandleModule;
.super Ljava/lang/Object;


# annotations
.annotation build Ldagger/hilt/InstallIn;
    value = {
        Ldagger/hilt/android/components/ActivityRetainedComponent;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideSavedStateHandle(Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;)Landroidx/lifecycle/p0;
    .locals 0
    .annotation build Ldagger/hilt/android/lifecycle/ActivityRetainedSavedState;
    .end annotation

    .annotation build Ldagger/hilt/android/scopes/ActivityRetainedScoped;
    .end annotation

    invoke-virtual {p0}, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->getSavedStateHandle()Landroidx/lifecycle/p0;

    move-result-object p0

    return-object p0
.end method
