.class public abstract Lu9/j;
.super Ljava/lang/Object;


# static fields
.field public static final a:I

.field public static final b:Li3/u;

.field public static final c:Li3/u;

.field public static final d:Li3/u;

.field public static final e:Li3/u;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lu9/j;->a:I

    new-instance v0, Li3/u;

    const-string v1, "PERMIT"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu9/j;->b:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1, v4}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu9/j;->c:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1, v4}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu9/j;->d:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1, v4}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu9/j;->e:Li3/u;

    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v1, 0x10

    invoke-static {v0, v1, v2, v2, v3}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lu9/j;->f:I

    return-void
.end method
