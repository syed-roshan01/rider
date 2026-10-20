.class public final Lh5/b;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Lh5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh5/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lh5/b;->a:Lh5/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method
