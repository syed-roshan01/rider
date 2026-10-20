.class public abstract Lm9/g0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm9/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    sget v1, Lr9/v;->a:I

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lm9/m0;->a:Lt9/d;

    sget-object v0, Lr9/o;->a:Lm9/s1;

    move-object v1, v0

    check-cast v1, Ln9/d;

    iget-object v1, v1, Ln9/d;->f:Ln9/d;

    instance-of v1, v0, Lm9/j0;

    if-nez v1, :cond_1

    sget-object v0, Lm9/f0;->q:Lm9/f0;

    goto :goto_2

    :cond_1
    check-cast v0, Lm9/j0;

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v0, Lm9/f0;->q:Lm9/f0;

    :goto_2
    sput-object v0, Lm9/g0;->a:Lm9/j0;

    return-void
.end method
