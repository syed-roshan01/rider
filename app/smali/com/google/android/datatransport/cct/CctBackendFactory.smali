.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lm5/c;)Lm5/h;
    .locals 3

    new-instance v0, Lj5/d;

    move-object v1, p1

    check-cast v1, Lm5/b;

    iget-object v1, v1, Lm5/b;->a:Landroid/content/Context;

    check-cast p1, Lm5/b;

    iget-object v2, p1, Lm5/b;->b:Lt5/a;

    iget-object p1, p1, Lm5/b;->c:Lt5/a;

    invoke-direct {v0, v1, v2, p1}, Lj5/d;-><init>(Landroid/content/Context;Lt5/a;Lt5/a;)V

    return-object v0
.end method
