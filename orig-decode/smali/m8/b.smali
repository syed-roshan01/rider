.class public abstract Lm8/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-class v0, Lm8/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    const-string v0, "GRPC_CLIENT_CALL_REJECT_RUNNABLE"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lf6/a;->Y(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    :cond_0
    new-instance v0, Lv6/d;

    const/4 v1, 0x0

    const/16 v2, 0x8

    const-string v3, "internal-stub-type"

    invoke-direct {v0, v2, v3, v1}, Lv6/d;-><init>(ILjava/lang/Object;Ljava/io/Serializable;)V

    sput-object v0, Lm8/b;->a:Lv6/d;

    return-void
.end method
