.class public final Lg8/f2;
.super Lg8/m1;


# instance fields
.field public final a:Lg8/o0;

.field public final b:Lg8/y;


# direct methods
.method public constructor <init>(Lg8/o0;Lg8/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/f2;->a:Lg8/o0;

    iput-object p2, p0, Lg8/f2;->b:Lg8/y;

    return-void
.end method


# virtual methods
.method public final d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;
    .locals 1

    invoke-virtual {p0}, Lg8/f2;->g()Lg8/o0;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object p1

    new-instance p2, Lg8/e2;

    invoke-direct {p2, p0, p1}, Lg8/e2;-><init>(Lg8/f2;Lg8/h0;)V

    return-object p2
.end method

.method public final g()Lg8/o0;
    .locals 1

    iget-object v0, p0, Lg8/f2;->a:Lg8/o0;

    return-object v0
.end method
