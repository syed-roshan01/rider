.class public final synthetic Lu9/g;
.super Ld9/h;

# interfaces
.implements Lc9/e;


# static fields
.field public static final p:Lu9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lu9/g;

    const/4 v1, 0x2

    const-class v2, Lu9/j;

    const-string v3, "createSegment"

    const-string v4, "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ld9/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v6, Lu9/g;->p:Lu9/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lu9/k;

    sget p1, Lu9/j;->a:I

    new-instance p1, Lu9/k;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lu9/k;-><init>(JLu9/k;I)V

    return-object p1
.end method
