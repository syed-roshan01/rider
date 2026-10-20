.class public final Ll1/c;
.super Ljava/lang/Object;

# interfaces
.implements Ll1/b;


# instance fields
.field public final a:Lm0/n1;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll1/a;

    invoke-direct {v0, p1}, Ll1/a;-><init>(I)V

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Ll1/c;->a:Lm0/n1;

    return-void
.end method
