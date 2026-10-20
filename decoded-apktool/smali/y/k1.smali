.class public final Ly/k1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Ly/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly/k1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Ly/k1;->a:Ly/k1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ly/e0;

    invoke-direct {v0}, Ly/e0;-><init>()V

    return-object v0
.end method
