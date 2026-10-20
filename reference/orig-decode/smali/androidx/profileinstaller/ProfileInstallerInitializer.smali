.class public Landroidx/profileinstaller/ProfileInstallerInitializer;
.super Ljava/lang/Object;

# interfaces
.implements Ld4/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld4/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lu1/i0;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0, p1}, Lu1/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ly3/g;->a(Ljava/lang/Runnable;)V

    new-instance p1, Lx9/v;

    const/16 v0, 0x14

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lx9/v;-><init>(ILjava/lang/Object;)V

    return-object p1
.end method
