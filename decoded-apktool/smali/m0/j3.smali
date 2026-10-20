.class public final Lm0/j3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Le9/a;


# instance fields
.field public final a:Lm0/n2;


# direct methods
.method public constructor <init>(Lm0/n2;Lm0/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/j3;->a:Lm0/n2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lm0/i3;

    iget-object v1, p0, Lm0/j3;->a:Lm0/n2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm0/i3;-><init>(Lm0/n2;Lm0/s0;)V

    return-object v0
.end method
