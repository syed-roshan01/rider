.class public final Lt9/d;
.super Lt9/g;


# static fields
.field public static final d:Lt9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lt9/d;

    sget v1, Lt9/j;->c:I

    sget v2, Lt9/j;->d:I

    sget-wide v4, Lt9/j;->e:J

    sget-object v3, Lt9/j;->a:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lt9/g;-><init>(IILjava/lang/String;J)V

    sput-object v6, Lt9/d;->d:Lt9/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
