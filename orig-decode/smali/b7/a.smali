.class public abstract Lb7/a;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw6/h;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    sget v0, Li7/u1;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    sget-object v0, Lb7/c;->b:Lb7/c;

    invoke-static {v0}, Lv6/q;->h(Lv6/p;)V

    sget-object v0, La7/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lw6/h;

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lv6/q;->f(Ld7/f;Z)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
