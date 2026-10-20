.class public final Lm0/p0;
.super Lm0/u1;


# instance fields
.field public final b:Lm0/z2;


# direct methods
.method public constructor <init>(Lm0/z2;Lc9/a;)V
    .locals 0

    invoke-direct {p0, p2}, Lm0/z;-><init>(Lc9/a;)V

    iput-object p1, p0, Lm0/p0;->b:Lm0/z2;

    return-void
.end method


# virtual methods
.method public final a(Lm0/l3;Ljava/lang/Object;)Lm0/l3;
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lm0/g1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm0/g1;

    invoke-interface {v0, p2}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm0/p0;->b:Lm0/z2;

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    :goto_0
    return-object p1
.end method
