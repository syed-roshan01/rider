.class public final Lg9/b;
.super Lg9/a;


# instance fields
.field public final c:Lu1/c1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lg9/d;-><init>()V

    new-instance v0, Lu1/c1;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lu1/c1;-><init>(I)V

    iput-object v0, p0, Lg9/b;->c:Lu1/c1;

    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lg9/b;->c:Lu1/c1;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
