.class public abstract Lp9/d0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Li3/u;

.field public static final b:Li3/u;

.field public static final c:Li3/u;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Li3/u;

    const-string v1, "NO_VALUE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp9/d0;->a:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "NONE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp9/d0;->b:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp9/d0;->c:Li3/u;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)Lp9/q0;
    .locals 1

    new-instance v0, Lp9/q0;

    if-nez p0, :cond_0

    sget-object p0, Lq9/c;->b:Li3/u;

    :cond_0
    invoke-direct {v0, p0}, Lp9/q0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final b([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    long-to-int p1, p1

    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    and-int/2addr p1, p2

    aput-object p3, p0, p1

    return-void
.end method
