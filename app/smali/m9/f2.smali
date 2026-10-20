.class public final Lm9/f2;
.super Lm9/z;


# static fields
.field public static final synthetic c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/f2;

    invoke-direct {v0}, Lm9/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Lm9/j2;->b:Lm9/a0;

    invoke-interface {p1, p2}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p1

    check-cast p1, Lm9/j2;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
