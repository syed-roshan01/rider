.class public final Lp9/g0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lp9/i0;

.field public static final b:Lp9/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp9/i0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp9/i0;-><init>(I)V

    sput-object v0, Lp9/g0;->a:Lp9/i0;

    new-instance v0, Lp9/i0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp9/i0;-><init>(I)V

    sput-object v0, Lp9/g0;->b:Lp9/i0;

    return-void
.end method
