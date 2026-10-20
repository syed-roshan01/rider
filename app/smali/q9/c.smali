.class public abstract Lq9/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:[Lu8/e;

.field public static final b:Li3/u;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Lu8/e;

    sput-object v0, Lq9/c;->a:[Lu8/e;

    new-instance v0, Li3/u;

    const-string v1, "NULL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq9/c;->b:Li3/u;

    return-void
.end method
