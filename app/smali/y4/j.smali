.class public final Ly4/j;
.super Ly4/d;


# instance fields
.field public final a:Ly4/n;

.field public final b:Ly4/j;

.field public final c:Ld8/b;


# direct methods
.method public constructor <init>(Ly4/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Ly4/j;->b:Ly4/j;

    iput-object p1, p0, Ly4/j;->a:Ly4/n;

    new-instance p1, Ly4/i;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ld8/a;->a(Ld8/b;)Ld8/b;

    move-result-object p1

    iput-object p1, p0, Ly4/j;->c:Ld8/b;

    return-void
.end method


# virtual methods
.method public final activityComponentBuilder()Ldagger/hilt/android/internal/builders/ActivityComponentBuilder;
    .locals 3

    new-instance v0, Ll/z2;

    iget-object v1, p0, Ly4/j;->b:Ly4/j;

    iget-object v2, p0, Ly4/j;->a:Ly4/n;

    invoke-direct {v0, v2, v1}, Ll/z2;-><init>(Ly4/n;Ly4/j;)V

    return-object v0
.end method

.method public final getActivityRetainedLifecycle()Ldagger/hilt/android/ActivityRetainedLifecycle;
    .locals 1

    iget-object v0, p0, Ly4/j;->c:Ld8/b;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldagger/hilt/android/ActivityRetainedLifecycle;

    return-object v0
.end method
